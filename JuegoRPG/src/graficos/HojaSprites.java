package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprites {
	private final int ancho;
	private final int alto;
	public final int[] pixeles;
	
	//COLECCIÓN DE HOJAS DE SPRITES
	public static HojaSprites desierto = new HojaSprites("/Texturas/Desierto.png", 320,320);
	public static HojaSprites habitacion = new HojaSprites("/Texturas/Habitacion.png",320,320);
	public static HojaSprites jugador = new HojaSprites("/Texturas/Jugador.png",320,320);
	//FIN COLECCIÓN SPRITES
	
	
	
	public HojaSprites(final String ruta, final int ancho, final int alto ) {
		this.ancho = ancho;
		this.alto = alto;
		
		pixeles = new int [ancho*alto];
		
		try {
			BufferedImage Imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
			
			Imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getAncho(){
		return ancho;
	}	
}
