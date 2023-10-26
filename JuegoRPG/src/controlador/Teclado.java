package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener {

	private final static int numTeclas = 120;
	private final boolean[] teclas = new boolean[numTeclas];
	
	
	public boolean arriba;
	public boolean abajo;
	public boolean izquierda;
	public boolean derecha;
	
	public boolean salir;
	public boolean shift;
	
	public void actualizar() {
		arriba = teclas[KeyEvent.VK_W];
		abajo  = teclas[KeyEvent.VK_S];
		derecha = teclas[KeyEvent.VK_D];
		izquierda = teclas[KeyEvent.VK_A];
		
		salir = teclas[KeyEvent.VK_ESCAPE];
		shift = teclas[KeyEvent.VK_SHIFT];
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	public void keyPressed(KeyEvent e) {
		teclas[e.getKeyCode()] = true;
	}
	public void keyReleased(KeyEvent e) {
		teclas[e.getKeyCode()] = false;
	}

}
