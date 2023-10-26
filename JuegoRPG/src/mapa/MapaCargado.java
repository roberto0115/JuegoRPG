package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import mapa.cuadro.Cuadro;

public class MapaCargado extends Mapa{
	private int[] pixeles;
	public MapaCargado(String ruta) {
		super(ruta);
	}
	protected void cargarMapa(String ruta) {
		try {
			BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
			
			ancho =imagen.getWidth();
			alto = imagen.getHeight();
			
			CatalogoCuadros = new Cuadro[ancho*alto];
			pixeles = new int[ancho*alto];
			
			imagen.getRGB(0,0,ancho,alto,pixeles,0,ancho);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void generarMapa() {
		for(int i = 0; i<pixeles.length; i++) {
		
			switch(pixeles[i]) {
			case 0xff515151:
				CatalogoCuadros[i] = Cuadro.ASFALTO;
				continue;
			case 0xfffad982:
				CatalogoCuadros[i] = Cuadro.ARENA;
				continue;
			case 0xffbb9228:
				CatalogoCuadros[i] = Cuadro.CARRETERA_BORDE_I;
				continue;
			case 0xff92c4c6:
				CatalogoCuadros[i] = Cuadro.CARRETERA_BORDE_D;
				continue;
			case 0xffc60707:
				CatalogoCuadros[i] = Cuadro.CARRETERA_BORDE_90G_I;
				continue;
			case 0xff2700ff:
				CatalogoCuadros[i] = Cuadro.CARRETERA_BORDE_90G_D;
				continue;
			case 0xff6e6e6e:
				CatalogoCuadros[i] = Cuadro.CARRETERA_CENTRO;
				continue;
			case 0xff791a1a:
				CatalogoCuadros[i] = Cuadro.CARRETERA_ESQUINA_I;
				continue;
			case 0xff1e5456:
				CatalogoCuadros[i] = Cuadro.CARRETERA_ESQUINA_D;
				continue;
			case 0xff55ff00:
				CatalogoCuadros[i] = Cuadro.CARRETERA_ESQUINA_90G_I;
				continue;
			case 0xffff8b00:
				CatalogoCuadros[i] = Cuadro.CARRETERA_ESQUINA_90G_D;
				continue;
			case 0xff975353:
				CatalogoCuadros[i] = Cuadro.PARED_PIEDRA;
				continue;
			case 0xffc69292:
				CatalogoCuadros[i] = Cuadro.PARED_PIEDRA_SUELO_CARRETERA_BORDE_I;
				continue;
			case 0xff131a14:
				CatalogoCuadros[i] = Cuadro.PARED_PIEDRA_SUELO_CARRETERA_BORDE_D;
				continue;
			case 0xff92acc6:
				CatalogoCuadros[i] = Cuadro.PARED_PIEDRA_SUELO;
				continue;
			case 0xff92c692:
				CatalogoCuadros[i] = Cuadro.PUERTA_CENTRO_SUPERIOR;
				continue;
			case 0xffc6b392:
				CatalogoCuadros[i] = Cuadro.PUERTA_ESQUINA_INFERIOR_I;
				continue;
			case 0xffc592c6:
				CatalogoCuadros[i] = Cuadro.PUERTA_ESQUINA_SUPERIOR_I;
				continue;
			case 0xff9c92c6:
				CatalogoCuadros[i] = Cuadro.PUERTA_CENTRO;
				continue;
			case 0xff22155a:
				CatalogoCuadros[i] = Cuadro.PUERTA_CARRETERA;
				continue;
			case 0xff12430d:
				CatalogoCuadros[i] = Cuadro.PUERTA_ESQUINA_SUPERIOR_D;
				continue;
			case 0xff0d2e43:
				CatalogoCuadros[i] = Cuadro.PUERTA_ESQUINA_INFERIOR_D;
				continue;
			case 0xff00b2ff:
				CatalogoCuadros[i] = Cuadro.CARRETERA_CENTRO_90G;
				continue;
			case 0xff181818:
				CatalogoCuadros[i] = Cuadro.VACIO;
				continue;
			case 0xfffff700:
				CatalogoCuadros[i] = Cuadro.PARED_ESQUINA_AGUJERO_I;
				continue;
			case 0xff00ff1f:
				CatalogoCuadros[i] = Cuadro.PUERTA;
				continue;
			case 0xff930000:
				CatalogoCuadros[i] = Cuadro.PARED_ESQUINA_D;
				continue;
			case 0xff009381:
				CatalogoCuadros[i] = Cuadro.SUELO_GRIS_I;
				continue;
			case 0xff878787:
				CatalogoCuadros[i] = Cuadro.SUELO_GRIS;
				continue;
			case 0xfff1fe70:
				CatalogoCuadros[i] = Cuadro.SUELO_GRIS_D;
				continue;
			case 0xff464638:
				CatalogoCuadros[i] = Cuadro.SUELO_GRIS_GRIETA;
				continue;
			case 0xff0a4c1a:
				CatalogoCuadros[i] = Cuadro.ESQUINA_I;
				continue;
			case 0xff46ff73:
				CatalogoCuadros[i] = Cuadro.ESQUINA_D;
				continue;
			case 0xffccffd8:
				CatalogoCuadros[i] = Cuadro.ESQUINA_90G_D;
				continue;
			case 0xffa546ff:
				CatalogoCuadros[i] = Cuadro.ESQUINA_INTERIOR;
				continue;
			case 0xfffc00de:
				CatalogoCuadros[i] = Cuadro.SUELO_GRIS_90G_I;
				continue;
			case 0xff00fcde:
				CatalogoCuadros[i] = Cuadro.SUELO_GRIS_90G_D;
				continue;
			case 0xfffff7d9:
				CatalogoCuadros[i] = Cuadro.MACETA_ESQUINA_I_ARBOL;
				continue;
			case 0xff8a7a41:
				CatalogoCuadros[i] = Cuadro.MACETA_CENTRO;
				continue;
			case 0xff876b00:
				CatalogoCuadros[i] = Cuadro.MACETA_CENTRO_90G;
				continue;
			case 0xfffac500:
				CatalogoCuadros[i] = Cuadro.MACETA_CENTRO_ARBOL;
				continue;
			case 0xff3a2f07:
				CatalogoCuadros[i] = Cuadro.MACETA_ESQUINA_D;
				continue;
			case 0xff3a372e:
				CatalogoCuadros[i] = Cuadro.MACETA_ESQUINA_90G_D;
				continue;
			case 0xfffff4cd:
				CatalogoCuadros[i] = Cuadro.MACETA_ESQUINA_90G_I;
				continue;
			case 0xff000d93:
				CatalogoCuadros[i] = Cuadro.PARED_ESQUINA_I;
				continue;
			case 0xff935d00:
				CatalogoCuadros[i] = Cuadro.PARED_CUADRO;
				continue;
			case 0xff009316:
				CatalogoCuadros[i] = Cuadro.PARED;
				continue;
			case 0xff8e0093:
				CatalogoCuadros[i] = Cuadro.PARED_CHIP;
				continue;
			case 0xff008193:
				CatalogoCuadros[i] = Cuadro.PARED_GRIETA;
				continue;
				
				
			default:
				CatalogoCuadros[i] = Cuadro.VACIO;
				continue;
			
			
			}
		}
	}
}
