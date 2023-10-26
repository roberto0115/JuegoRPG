package Ente.Criaturas;

import Ente.Ente;
import graficos.Sprite;

public abstract class Criatura extends Ente {

	protected Sprite sprite;
	protected char direccion = 'n';
	protected boolean enMovimiento = false;
	public void actualizar() {
		
	}
	public void mostrar() {
		
	}
	public void mover(int desplazamientoX, int desplazamientoY) {
		if(desplazamientoX>0) {
			direccion = 'e';
		}
		if (desplazamientoX<0) {
			direccion = 'w';
		}
		if(desplazamientoY>0) {
			direccion = 's';
		}
		if(desplazamientoY<0) {
			direccion = 'n';
		}
		if(getEliminado() == false) {
			if(!EnColision(desplazamientoX,0)) {
				SetX(desplazamientoX);
			}
			if(!EnColision(0,desplazamientoY)) {
				SetY(desplazamientoY);
			}
		}
	}
	private boolean EnColision(int desplazamientoX,int desplazamientoY) {
		
		boolean colision = false;
		
		int posicionX = x+desplazamientoX;
		int posicionY = y+desplazamientoY;
		
		int margenIz = 4;
		int margenD = 26;
		int margenS = 32;
		int margenIn = 26;
		
		int bordeIzquierdo = (posicionX + margenD) / sprite.getLado();
		int bordeDerecho = (posicionX + margenIz) / sprite.getLado();
		int bordeSuperior = (posicionY + margenIn) / sprite.getLado();
		int bordeInferior = (posicionY + margenS) / sprite.getLado();
		
		if(mapa.getCuadrocatalogo(bordeIzquierdo+bordeSuperior * mapa.getAncho()).solido()) {
			colision = true;
		}
		if(mapa.getCuadrocatalogo(bordeIzquierdo+bordeInferior * mapa.getAncho()).solido()) {
			colision = true;
		}
		if(mapa.getCuadrocatalogo(bordeDerecho+bordeSuperior * mapa.getAncho()).solido()) {
			colision = true;
		}
		if(mapa.getCuadrocatalogo(bordeDerecho+bordeInferior * mapa.getAncho()).solido()) {
			colision = true;
		}
		
		return colision;
	}
	public Sprite getSprite() {
		return sprite;
	}
	public void SetSprite(Sprite sprite) {
		this.sprite = sprite;
	}
}
