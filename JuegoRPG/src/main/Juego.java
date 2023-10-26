package main;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Ente.Criaturas.Jugador;
import controlador.Teclado;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;
import mapa.MapaCargado;

public class Juego extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	
	private static final int ANCHO = 800;
	private static final int LARGO = 600;
	private static String CONTADOR_FPS = "";
	private static String CONTADOR_APS = "";
	
	private static final String NAME = "Juego";
	
	private static int aps = 0;
	private static int fps = 0;
	
	private static volatile boolean EnFuncionamiento = false;
	
	private static JFrame ventana;
	private static Thread thread;
	private static Teclado teclado;
	private static Pantalla pantalla;
	
	private static  BufferedImage imagen = new BufferedImage(ANCHO,LARGO,BufferedImage.TYPE_INT_RGB);
	private static int pixeles[] = ((DataBufferInt)imagen.getRaster().getDataBuffer()).getData();
	
	private static final ImageIcon icono = new ImageIcon(Juego.class.getResource("/Icono/logo.png"));
	
	private static Mapa mapa;
	private static Jugador jugador;
	
	
	private Juego() {
		setPreferredSize(new Dimension(ANCHO,LARGO));
		
		teclado = new Teclado();
		addKeyListener(teclado);
		mapa = new MapaCargado("/Mapas/Habitacion_1.png");
		jugador = new Jugador(teclado,224,224, Sprite.JUGADOR_FRENTE,mapa);
		pantalla = new Pantalla(ANCHO,LARGO);
		
		
		ventana = new JFrame(NAME);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setLayout(new BorderLayout());
		ventana.add(this, BorderLayout.CENTER);
		ventana.setUndecorated(true);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setIconImage(icono.getImage());
		
	}
	
	public static void main(String[] args) {
		Juego juego = new Juego();
		juego.iniciar();
	}

	private synchronized void iniciar() {
		EnFuncionamiento = true;
		thread = new Thread(this, "Graficos");
		thread.start();
	}
	private synchronized void detener() {
		EnFuncionamiento = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
 
			e.printStackTrace();
		}
	}
	
	private void actualizar() {
		teclado.actualizar();
		jugador.actualizar();
		
		if(teclado.salir) {
			System.exit(0);
		}
		
		aps++;
		
	}
	private void mostrar() {
		BufferStrategy estrategia =  getBufferStrategy();
		
		if(estrategia == null) {
			createBufferStrategy(3);
			return;
		}
		
		mapa.mostrar(jugador.posicionX()-pantalla.getAncho()/2-jugador.getSprite().getLado()/2, jugador.posicionY()-pantalla.getAlto()/2-jugador.getSprite().getLado()/2, pantalla);
		jugador.mostrar(pantalla);
		System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);
		
		
		Graphics g = estrategia.getDrawGraphics();
		
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
		
		
		
		g.setColor(Color.white);
		g.drawString(CONTADOR_APS, 10, 20);
		g.drawString(CONTADOR_FPS, 10, 35);
		g.drawString("X: "+ (jugador.posicionX()>>5), 10, 50);
		g.drawString("Y :"+ (jugador.posicionY()>>5), 10, 65);
		g.dispose();
		
		estrategia.show();
		
		fps++;
	}
	@Override
	public void run() {
		final int NS_POR_SEGUNDO = 1000000000;
		final byte APS_OBJETIVO = 60;
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO; 
		
		long referenciaActualizacion = System.nanoTime();
		long referenciaContador = System.nanoTime();
		
		double tiempoTranscurrido;
		double delta = 0;
		
		requestFocus();

		while(EnFuncionamiento) {
			final long inicioBucle = System.nanoTime();
			tiempoTranscurrido = inicioBucle - referenciaActualizacion;
			referenciaActualizacion = inicioBucle;
			
			delta+= tiempoTranscurrido /NS_POR_ACTUALIZACION;
			
			while (delta>=1) {
				actualizar();
				delta--;
			}
			
		
			mostrar();
			if(System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {
				CONTADOR_APS = "APS: " +aps;
				CONTADOR_FPS = "FPS: "+fps;
				aps = 0;
				fps = 0;
				 referenciaContador = System.nanoTime();
			}
		}
	}
}
