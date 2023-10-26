package mapa.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro {

	public int x;
	public int y;
	
	public Sprite sprite;
	private boolean solido;
	public static final int LADO = 32;
	
	//COLECCIÓN DE CUADROS
	public static final Cuadro ASFALTO = new Cuadro(Sprite.ASFALTO);
	public static final Cuadro ARENA = new Cuadro(Sprite.ARENA);
	public static final Cuadro CARRETERA_BORDE_I = new Cuadro(Sprite.CARRETERA_BORDE_I);
	public static final Cuadro CARRETERA_BORDE_D = new Cuadro(Sprite.CARRETERA_BORDE_D);
	public static final Cuadro CARRETERA_BORDE_90G_I =  new Cuadro(Sprite.CARRETERA_BORDE_90G_I);
	public static final Cuadro CARRETERA_BORDE_90G_D =  new Cuadro(Sprite.CARRETERA_BORDE_90G_D);
	public static final Cuadro CARRETERA_CENTRO = new Cuadro(Sprite.CARRETERA_CENTRO);
	public static final Cuadro CARRETERA_CENTRO_90G = new Cuadro(Sprite.CARRETERA_CENTRO_90G);
	public static final Cuadro CARRETERA_ESQUINA_I = new Cuadro(Sprite.CARRETERA_ESQUINA_I);
	public static final Cuadro CARRETERA_ESQUINA_D = new Cuadro(Sprite.CARRETERA_ESQUINA_D);
	public static final Cuadro CARRETERA_ESQUINA_90G_I = new Cuadro(Sprite.CARRETERA_ESQUINA_90G_I);
	public static final Cuadro CARRETERA_ESQUINA_90G_D = new Cuadro(Sprite.CARRETERA_ESQUINA_90G_D);
	public static final Cuadro PARED_PIEDRA = new Cuadro(Sprite.PARED_PIEDRA);
	public static final Cuadro PARED_PIEDRA_SUELO = new Cuadro(Sprite.PARED_PIEDRA_SUELO);
	public static final Cuadro PARED_PIEDRA_SUELO_CARRETERA_BORDE_I = new Cuadro(Sprite.PARED_PIEDRA_SUELO_CARRETERA_BORDE_I);
	public static final Cuadro PARED_PIEDRA_SUELO_CARRETERA_BORDE_D = new Cuadro(Sprite.PARED_PIEDRA_SUELO_CARRETERA_BORDE_D);
	public static final Cuadro PUERTA_CENTRO_SUPERIOR = new Cuadro(Sprite.PUERTA_CENTRO_SUPERIOR);
	public static final Cuadro PUERTA_ESQUINA_INFERIOR_I = new Cuadro(Sprite.PUERTA_ESQUINA_INFERIOR_IZQUIERDA);
	public static final Cuadro PUERTA_ESQUINA_SUPERIOR_I = new Cuadro(Sprite.PUERTA_ESQUINA_SUPERIOR_IZQUIERDA);
	public static final Cuadro PUERTA_ESQUINA_INFERIOR_D = new Cuadro(Sprite.PUERTA_ESQUINA_INFERIOR_DERECHA);
	public static final Cuadro PUERTA_ESQUINA_SUPERIOR_D = new Cuadro(Sprite.PUERTA_ESQUINA_SUPERIOR_DERECHA);
	public static final Cuadro PUERTA_CENTRO  = new Cuadro(Sprite.PUERTA_CENTRO);
	public static final Cuadro PUERTA_CARRETERA  = new Cuadro(Sprite.PUERTA_CARRETERA);
	
	public static final Cuadro VACIO = new Cuadro(Sprite.VACIO,true);
	//Fin de la colección de cuadros
	
	//COLECCION DE CUADROS HABITACION
	
	public static final Cuadro SUELO_GRIS = new Cuadro(Sprite.SUELO_GRIS);
	public static final Cuadro SUELO_GRIS_GRIETA = new Cuadro(Sprite.SUELO_GRIS_GRIETA);
	public static final Cuadro PARED_ESQUINA_AGUJERO_I = new Cuadro(Sprite.PARED_ESQUINA_AGUJERO_I,true);
	public static final Cuadro PUERTA =  new Cuadro(Sprite.PUERTA,true);
	public static final Cuadro PARED = new Cuadro(Sprite.PARED,true);
	public static final Cuadro PARED_CUADRO =  new Cuadro(Sprite.PARED_CUADRO,true);
	public static final Cuadro PARED_CHIP = new Cuadro(Sprite.PARED_CHIP,true);
	public static final Cuadro PARED_GRIETA = new Cuadro(Sprite.PARED_GRIETA,true);
	public static final Cuadro PARED_ESQUINA_D =  new Cuadro(Sprite.PARED_ESQUINA_D,true);
	public static final Cuadro PARED_ESQUINA_I =  new Cuadro(Sprite.PARED_ESQUINA_I,true);
	public static final Cuadro SUELO_GRIS_I =  new Cuadro(Sprite.SUELO_GRIS_I);
	public static final Cuadro SUELO_GRIS_D =  new Cuadro(Sprite.SUELO_GRIS_D);
	public static final Cuadro SUELO_GRIS_90G_I =  new Cuadro(Sprite.SUELO_GRIS_90G_I);
	public static final Cuadro SUELO_GRIS_90G_D = new Cuadro(Sprite.SUELO_GRIS_90G_D);
	public static final Cuadro ESQUINA_I =  new Cuadro(Sprite.ESQUINA_I);
	public static final Cuadro ESQUINA_D =  new Cuadro(Sprite.ESQUINA_D);
	//public static final Sprite ESQUINA_90G_I =  new Sprite(5,32,6,0,HojaSprites.desierto);
	public static final Cuadro ESQUINA_90G_D =  new Cuadro(Sprite.ESQUINA_90G_D);
	public static final Cuadro ESQUINA_INTERIOR = new Cuadro(Sprite.ESQUINA_INTERIOR);
	public static final Cuadro MACETA_ESQUINA_I_ARBOL = new Cuadro(Sprite.MACETA_ESQUINA_I_ARBOL,true);
	public static final Cuadro MACETA_CENTRO = new Cuadro(Sprite.MACETA_CENTRO,true);
	public static final Cuadro MACETA_CENTRO_90G = new Cuadro(Sprite.MACETA_CENTRO_90G,true);
	public static final Cuadro MACETA_CENTRO_ARBOL = new Cuadro(Sprite.MACETA_CENTRO_ARBOL,true);
	public static final Cuadro MACETA_ESQUINA_D= new Cuadro(Sprite.MACETA_ESQUINA_D,true);
	public static final Cuadro MACETA_ESQUINA_90G_D= new Cuadro(Sprite.MACETA_ESQUINA_90G_D,true);
	public static final Cuadro MACETA_ESQUINA_90G_I= new Cuadro(Sprite.MACETA_ESQUINA_90G_I,true);
	
	
	
	public Cuadro(Sprite sprite) {
		this.sprite = sprite;
		solido = false;
	}
	public Cuadro(Sprite sprite,boolean solido) {
		this.sprite = sprite;
		this.solido = solido;
	}
	public void mostrar(int x, int y, Pantalla pantalla ) {
		pantalla.mostrarcuadro(x << 5, y << 5, this);
	}
	
	public boolean solido() {
		return solido;
	}

}
