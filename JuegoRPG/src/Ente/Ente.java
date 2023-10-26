package Ente;

import mapa.Mapa;

public abstract class Ente {

	protected int x;
	protected int y;
	
	private boolean eliminado = false;
	
	protected Mapa mapa;
	
	public void actualizar() {
		
	}
	public void mostrar() {
		
	}
	public void eliminar() {
		eliminado = true;
	}
	public int posicionX() {
		return x;
	}
	public int posicionY() {
		return y;
	}
	public boolean getEliminado() {
		return eliminado;
	}
	public void SetX(int desplazaminetoX) {
		x+=desplazaminetoX;
	}
	public void SetY(int desplazaminetoY) {
		y+=desplazaminetoY;
	}
}
