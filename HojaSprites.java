import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class HojaSprites{
	private final int ancho;
	private final int alto;
	public final int[] pixeles;

	// Rutas de hojas de sprites, en la ruta se pone un \ cuando hay otro \ devido a que es un caracter especial, de esa froma se indica que hace referencia al caracter
	public static HojaSprites mapa = new HojaSprites("C:/Users/hp1/Desktop/Proyecto-main/BaseGgraficos.png", 320, 320);
	public static HojaSprites jugador = new HojaSprites("C:/Users/hp1/Desktop/Proyecto-main/jugador.png", 320, 320);
	//--------------------------
	
	public HojaSprites(final String ruta, final int ancho, final int alto){
		this.ancho = ancho;
		this.alto = alto;
		pixeles = new int[ancho * alto];
		BufferedImage imagen;
		try{
			imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
			imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public int obtenAncho(){
		return ancho;
	}
}
