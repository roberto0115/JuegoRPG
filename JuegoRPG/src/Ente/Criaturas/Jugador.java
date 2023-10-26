package Ente.Criaturas;

import controlador.Teclado;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;

public class Jugador extends Criatura {

	private Teclado teclado;
	private int animacion;
	public Jugador(Teclado teclado, Sprite sprite,Mapa mapa) {
		this.teclado = teclado;
		this.sprite = sprite;
		this.mapa = mapa;
	}
	public Jugador(Teclado teclado, int posicionX, int posicionY,Sprite sprite,Mapa mapa) {
		this.teclado = teclado;
		this.x = posicionX;
		this.y = posicionY;
		this.sprite = sprite;
		this.mapa = mapa;
	}
	public void actualizar() {
		int DX = 0;
		int DY = 0;
		
		int velocidadMovimiento = 1;
		
		if(animacion <32767) {
		animacion++;
		}else {
		animacion = 0;
		}
		if(teclado.shift) {
			velocidadMovimiento = 2;
		}
		
		if(teclado.arriba) {
			DY-=velocidadMovimiento;
			
		}
		if(teclado.abajo) {
			DY+=velocidadMovimiento;
			
		}
		if(teclado.derecha &&!teclado.arriba &&!teclado.abajo) {
			DX+=velocidadMovimiento;
			
		}
		if(teclado.izquierda&&!teclado.arriba &&!teclado.abajo) {
			DX-=velocidadMovimiento;
			
		}
		
		if(DX!=0 || DY!=0 ) {
			
			mover(DX,DY);
			enMovimiento = true;
		}else {
			enMovimiento = false;
		}
		if(direccion == 'n') {
			SetSprite(Sprite.JUGADOR_ATRAS);
			if(enMovimiento) {
				if(animacion%30>15) {
					sprite = Sprite.J_CAMINANDO_ATRAS_1;
				} else {
					sprite = Sprite.J_CAMINANDO_ATRAS_2;
				}
			}
		}
		if(direccion == 's') {
			SetSprite(Sprite.JUGADOR_FRENTE);
			if(enMovimiento) {
			if(animacion%30>15) {
				sprite = Sprite.J_CAMINANDO_FRENTE_1;
			} else {
				sprite = Sprite.J_CAMINANDO_FRENTE_2;
			}
			}
		}
		if(direccion == 'w') {
			SetSprite(Sprite.JUGADOR_LADO_I);
			if(enMovimiento) {
			if(animacion%30>15) {
				sprite = Sprite.J_CAMINANDO_LADO_I_1;
			} else {
				sprite = Sprite.J_CAMINANDO_LADO_I_2;
			}
			}
		}
		if(direccion == 'e') {
			SetSprite(Sprite.JUGADOR_LADO_D);
			if(enMovimiento) {
				if(animacion%30>15) {
					sprite = Sprite.J_CAMINANDO_LADO_D_1;
				} else {
					sprite = Sprite.J_CAMINANDO_LADO_D_2;
				}
			}
		}
	}
	public void mostrar(Pantalla pantalla) {
		pantalla.mostrarJugador(x, y, this);
	}
	/*
	 * int resto = animacion%30;
				if(resto >10 && resto <= 20) {
					sprite = Sprite.J_CAMINANDO_FRENTE_1;
				} else if(resto>20) {
					sprite = Sprite.JUGADOR_FRENTE;
				} else {
					sprite = Sprite.J_CAMINANDO_FRENTE_2;
				}
	 */
}
