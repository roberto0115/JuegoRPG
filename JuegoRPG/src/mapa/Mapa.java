package mapa;

import graficos.Pantalla;
import mapa.cuadro.Cuadro;

public abstract class Mapa {
	protected int ancho;
	protected int alto;
	
	protected int[] cuadros;
	protected Cuadro[] CatalogoCuadros;
	
	public Mapa(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
		
		cuadros   = new int [ancho*alto];
		generarMapa();
	}
	protected void generarMapa() {
		
	}
	public Mapa(String ruta) {
		cargarMapa(ruta);
		generarMapa();
	}
	protected void cargarMapa(String ruta) {
		
	}
	public void actualizar() {
		
	}
	public void mostrar(final int compensacionX,final int compensacionY, final Pantalla pantalla) {
		pantalla.establezerDiferencia(compensacionX, compensacionY);
		int o = compensacionX >>5;
		int e  = (compensacionX+pantalla.getAncho()+ Cuadro.LADO )>>5;
		int n = compensacionY >> 5;
		int s = (compensacionY+pantalla.getAlto()+ Cuadro.LADO)>>5;
		
		
		
		for(int y = n; y < s; y++) {
			for(int x = o; x < e; x++) {
	
				if(x<0 || y<0 || x>=ancho || y>=alto ) {
					Cuadro.VACIO.mostrar(x, y, pantalla);
				}else {
				
					CatalogoCuadros[x + y * ancho].mostrar(x, y, pantalla);
				}
				
			}
		}
	}
	public Cuadro getCuadro(final int x, final int y) {
		if(x<0 || y<0 || x>=ancho || y>= alto) {
			return Cuadro.VACIO;
		}
		switch(cuadros[x + y * ancho]) {
			case 0:
				return Cuadro.ASFALTO;
			case 1:
				return Cuadro.ARENA;
			case 2:
				return Cuadro.CARRETERA_BORDE_I;
			case 3:
				return Cuadro.CARRETERA_CENTRO;
			case 4:
				return Cuadro.CARRETERA_ESQUINA_I;
			case 5:
				return Cuadro.PARED_PIEDRA;
			case 6:
				return Cuadro.PARED_PIEDRA_SUELO;
			case 7:
				return Cuadro.PARED_PIEDRA_SUELO_CARRETERA_BORDE_I;
			case 8:
				return Cuadro.PUERTA_CARRETERA;
			case 9:
				return Cuadro.PUERTA_CENTRO;
			case 10:
				return Cuadro.PUERTA_CENTRO_SUPERIOR;
			case 11:
				return Cuadro.PUERTA_ESQUINA_INFERIOR_I;
			case 12:
				return Cuadro.PUERTA_ESQUINA_SUPERIOR_I;
			default:
				return Cuadro.VACIO;		
		}
		
	}
	public Cuadro getCuadrocatalogo(int posicion) {
		return CatalogoCuadros[posicion];
		
	}
	public int getAncho() {
		return ancho;
	}
}
