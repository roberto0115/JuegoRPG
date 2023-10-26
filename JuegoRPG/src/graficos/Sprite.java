package graficos;

public final class Sprite {

	private final int lado;
	
	private int x;
	private int y;
	
	public int[] pixeles;
	private HojaSprites hoja;
	
	//COLECCION DE SPRITES DEL PERSONAJE
	public static final Sprite JUGADOR_FRENTE = new Sprite(0,32,0,0,HojaSprites.jugador);
	public static final Sprite JUGADOR_ATRAS = new Sprite(0,32,1,0,HojaSprites.jugador);
	public static final Sprite JUGADOR_LADO_D = new Sprite(0,32,2,0,HojaSprites.jugador);
	public static final Sprite JUGADOR_LADO_I = new Sprite(0,32,3,0,HojaSprites.jugador);
	
	public static final Sprite J_CAMINANDO_FRENTE_1 =  new Sprite(0,32,0,1,HojaSprites.jugador);
	public static final Sprite J_CAMINANDO_FRENTE_2 = new Sprite(0,32,0,2,HojaSprites.jugador);
	public static final Sprite J_CAMINANDO_ATRAS_1 = new Sprite(0,32,1,1,HojaSprites.jugador);
	public static final Sprite J_CAMINANDO_ATRAS_2 =  new Sprite(0,32,1,2,HojaSprites.jugador);
	public static final Sprite J_CAMINANDO_LADO_D_1 =  new Sprite(0,32,2,1,HojaSprites.jugador);
	public static final Sprite J_CAMINANDO_LADO_D_2 =  new Sprite(0,32,2,2,HojaSprites.jugador);
	public static final Sprite J_CAMINANDO_LADO_I_1 =  new Sprite(0,32,3,1,HojaSprites.jugador);
	public static final Sprite J_CAMINANDO_LADO_I_2 =  new Sprite(0,32,3,2,HojaSprites.jugador);
	//FIN DE LA COLECCION
	
	//COLECCIÓN DE SPRITES HABITACION
	public static final Sprite SUELO_GRIS = new Sprite(0,32,4,0,HojaSprites.habitacion);
	public static final Sprite SUELO_GRIS_GRIETA = new Sprite(0,32,8,0,HojaSprites.habitacion);
	public static final Sprite PARED_ESQUINA_AGUJERO_I = new Sprite(0,32,3,0,HojaSprites.habitacion);
	public static final Sprite PUERTA =  new Sprite(0,32,1,0,HojaSprites.habitacion);
	public static final Sprite PARED =  new Sprite(0,32,0,1,HojaSprites.habitacion);
	public static final Sprite PARED_CUADRO =  new Sprite(0,32,1,1,HojaSprites.habitacion);
	public static final Sprite PARED_CHIP =  new Sprite(0,32,2,1,HojaSprites.habitacion);
	public static final Sprite PARED_GRIETA =  new Sprite(0,32,7,1,HojaSprites.habitacion);
	public static final Sprite PARED_ESQUINA_D =  new Sprite(0,32,2,0,HojaSprites.habitacion);
	public static final Sprite PARED_ESQUINA_I =  new Sprite(1,32,2,0,HojaSprites.habitacion);
	public static final Sprite SUELO_GRIS_I =  new Sprite(0,32,5,0,HojaSprites.habitacion);
	public static final Sprite SUELO_GRIS_D =  new Sprite(1,32,5,0,HojaSprites.habitacion);
	public static final Sprite SUELO_GRIS_90G_I =  new Sprite(4,32,5,0,HojaSprites.habitacion);
	public static final Sprite SUELO_GRIS_90G_D =  new Sprite(5,32,5,0,HojaSprites.habitacion);
	public static final Sprite ESQUINA_I =  new Sprite(0,32,6,0,HojaSprites.habitacion);
	public static final Sprite ESQUINA_D =  new Sprite(1,32,6,0,HojaSprites.habitacion);
	//public static final Sprite ESQUINA_90G_I =  new Sprite(5,32,6,0,HojaSprites.desierto);
	public static final Sprite ESQUINA_90G_D =  new Sprite(3,32,6,0,HojaSprites.habitacion);
	public static final Sprite ESQUINA_INTERIOR = new Sprite(0,32,7,0,HojaSprites.habitacion);
	public static final Sprite MACETA_ESQUINA_I_ARBOL = new Sprite(0,32,3,1,HojaSprites.habitacion);
	public static final Sprite MACETA_CENTRO = new Sprite(0,32,4,1,HojaSprites.habitacion);
	public static final Sprite MACETA_CENTRO_90G = new Sprite(2,32,4,1,HojaSprites.habitacion);
	public static final Sprite MACETA_CENTRO_ARBOL = new Sprite(0,32,5,1,HojaSprites.habitacion);
	public static final Sprite MACETA_ESQUINA_D= new Sprite(0,32,6,1,HojaSprites.habitacion);
	public static final Sprite MACETA_ESQUINA_90G_D= new Sprite(2,32,6,1,HojaSprites.habitacion);
	public static final Sprite MACETA_ESQUINA_90G_I= new Sprite(0,32,8,1,HojaSprites.habitacion);
	
	
	
	//FIN DE LA COLECCION
	
	//COLECCIÓN DE SPRITES DESIERTO
	public static final Sprite ASFALTO = new Sprite(0,32,0,0, HojaSprites.desierto);
	public static final Sprite ARENA = new Sprite(0,32,1,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_BORDE_I =  new Sprite(0,32,2,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_BORDE_D =  new Sprite(1,32,2,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_BORDE_90G_I =  new Sprite(5,32,2,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_BORDE_90G_D =  new Sprite(4,32,2,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_CENTRO = new Sprite(0,32,3,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_CENTRO_90G = new Sprite(4,32,3,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_ESQUINA_I = new Sprite(0,32,4,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_ESQUINA_D = new Sprite(1,32,4,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_ESQUINA_90G_I = new Sprite(5,32,4,0,HojaSprites.desierto);
	public static final Sprite CARRETERA_ESQUINA_90G_D = new Sprite(6,32,4,0,HojaSprites.desierto);
	public static final Sprite PARED_PIEDRA = new Sprite(0,32,5,0,HojaSprites.desierto);
	public static final Sprite PARED_PIEDRA_SUELO = new Sprite(0,32,6,0,HojaSprites.desierto);
	public static final Sprite PARED_PIEDRA_SUELO_CARRETERA_BORDE_I = new Sprite(0,32,6,1,HojaSprites.desierto);
	public static final Sprite PARED_PIEDRA_SUELO_CARRETERA_BORDE_D = new Sprite(1,32,6,1,HojaSprites.desierto);
	public static final Sprite PUERTA_CENTRO_SUPERIOR = new Sprite(0,32,7,0,HojaSprites.desierto);
	public static final Sprite PUERTA_ESQUINA_INFERIOR_IZQUIERDA = new Sprite(0,32,7,1,HojaSprites.desierto);
	public static final Sprite PUERTA_ESQUINA_INFERIOR_DERECHA = new Sprite(1,32,7,1,HojaSprites.desierto);
	public static final Sprite PUERTA_ESQUINA_SUPERIOR_IZQUIERDA = new Sprite(0,32,8,0,HojaSprites.desierto);
	public static final Sprite PUERTA_ESQUINA_SUPERIOR_DERECHA = new Sprite(1,32,8,0,HojaSprites.desierto);
	public static final Sprite PUERTA_CENTRO  = new Sprite(0,32,9,0,HojaSprites.desierto);
	public static final Sprite PUERTA_CARRETERA  = new Sprite(0,32,9,1,HojaSprites.desierto);
	

	
	
	
	
	public static final Sprite VACIO = new Sprite(32,0);
	
	//FIN COLECCIÓN SPRITES
	
	
	public Sprite (final int version,final int lado, final int columna, final int fila, final HojaSprites hoja){
		this.lado = lado;
		this.hoja = hoja;
		pixeles = new int[lado * lado];
		
		this.x = columna*lado;
		this.y = fila*lado;
		
		cargarSprite(version);
	}
	public Sprite(final int lado, final int color) {
		this.lado = lado;
		pixeles = new int[lado*lado];
		for(int i = 0; i<pixeles.length; i++) {
			pixeles[i] = color;
		}
				
	}
	public int getLado() {
		return lado;
	}
	
	
	public void cargarSprite(int version) {
		if(version == 0) {
			CargaNormal();
		}else {
			cargaManipulada(version);
		}
	}
	
	public void CargaNormal() {
		for(int y = 0; y<lado; y++) {
			for(int x = 0; x<lado; x++) {
				pixeles[x+y*lado] = hoja.pixeles[(x+this.x)+(y+this.y) * hoja.getAncho()];
			}
		}
	}
	public void cargaManipulada(int version) {
		int [] pixelestemporales = iniciarpixelestemporales();
		switch(version) {
			case 1:
				invertirX(pixelestemporales);
				break;
			case 2:
				invertirY(pixelestemporales);
				break;
			case 3:
				invertirXY(pixelestemporales);
				break;
			case 4:
				rotar90I(pixelestemporales);
				break;
			case 5:
				rotar90D(pixelestemporales);
				break;
			case 6:
				rotar90IYInvertido(pixelestemporales);
				break;
			case 7:
				rotar90DYInvertido(pixelestemporales);
				break;
			default:
				CargaNormal();
		}
	}
	public int[] iniciarpixelestemporales() {
		int [] pixelestemporales = new int[lado*lado];
		for(int y = 0; y<lado; y++) {
			for(int x = 0; x<lado; x++) {
				pixelestemporales[x+y*lado] = hoja.pixeles[(x+this.x)+(y+this.y) * hoja.getAncho()];
			}
		}
		return pixelestemporales;
	}
	
	//1
	private void invertirX(int[] pixelestemporales) {
		int i = 0;
		for(int y = 0; y<lado; y++) {
			for(int x = lado-1; x>-1; x--) {
				pixeles[i] = pixelestemporales[x+y*lado];
				i++;
			}
		}
	}
	//2
	private void invertirY(int[] pixelestemporales) {
		int i = 0;
		for(int y = lado-1; y>-1; y--) {
			for(int x = 0; x<lado; x++) {
				pixeles[i] = pixelestemporales[x+y*lado];
				i++;
			}
		}
	}
	//3
	private void invertirXY(int[] pixelestemporales) {
		for(int i = 0; i< pixeles.length; i++) {
			pixeles[i] = pixelestemporales[pixelestemporales.length-1-i];
		}
	}
	//4
	private void rotar90I(int[] pixelestemporales) {
		int i = 0;
		for(int x = lado-1; x>-1; x--) {
			for(int y = 0; y<lado; y++) {
				pixeles[i] = pixelestemporales[x+y*lado];
				i++;
			}
		}
	}
	//5
	private void rotar90D(int[] pixelestemporales) {
		int i = 0;
		for(int x = 0; x<lado; x++) {
			for(int y = lado-1; y>-1; y--) {
				pixeles[i] = pixelestemporales[x+y*lado];
				i++;
			}
		}
	}
	//6
	private void rotar90IYInvertido(int[] pixelestemporales) {
		int i = 0;
		for(int x = 0; x<lado; x++) {
			for(int y = 0; y<lado; y++) {
				pixeles[i] = pixelestemporales[x+y*lado];
				i++;
			}
		}
	}
	//7
	private void rotar90DYInvertido(int[] pixelestemporales) {
		int i = 0;
		for(int x = lado-1; x>-1; x--) {
			for(int y = lado-1; y>-1; y--) {
				pixeles[i] = pixelestemporales[x+y*lado];
				i++;
			}
		}
	}
}
