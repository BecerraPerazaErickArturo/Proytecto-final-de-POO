import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MapaCargado extends Mapa {

	private int[] pixeles;

	public MapaCargado(String ruta) {
		super(ruta);
	}

	protected void cargarMapa(String ruta) {
		try {
			BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));

			ancho = imagen.getWidth();
			alto = imagen.getHeight();

			cuadrosCatalogo = new Cuadro[ancho * alto];
			pixeles = new int[ancho * alto];

			imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void generarMapa() {
		for (int i = 0; i < pixeles.length; i++) {
			switch (pixeles[i]) {
				//PRIMERA COLUMNA DE BASE GRAFICOS
				case 0xff88f7f6: cuadrosCatalogo[i] = Cuadro.SKY_1;
				  continue;
				case 0xff60f7f6: cuadrosCatalogo[i] = Cuadro.SKY_2;
				  continue;
				case 0xff33f7f6: cuadrosCatalogo[i] = Cuadro.SKY_3;
				  continue;
				case 0xff00f7f6: cuadrosCatalogo[i] = Cuadro.SKY_4;
				  continue;
				case 0xfff825d9: cuadrosCatalogo[i] = Cuadro.CITY_1;
				  continue;
				case 0xffd225d9: cuadrosCatalogo[i] = Cuadro.CITY_2;
				  continue;
				case 0xffb425d9: cuadrosCatalogo[i] = Cuadro.CITY_3;
				  continue;
				case 0xff8125d9: cuadrosCatalogo[i] = Cuadro.CITY_4;
				  continue;
				case 0xff6325d9: cuadrosCatalogo[i] = Cuadro.CITY_5;
				  continue;
				case 0xff3f25d9: cuadrosCatalogo[i] = Cuadro.CIRCLE_SKY_1;
				  continue;
				case 0xff1e25d9: cuadrosCatalogo[i] = Cuadro.CIRCLE_SKY_2;
				  continue;
				case 0xff0025d9: cuadrosCatalogo[i] = Cuadro.CIRCLE_SKY_3;
				  continue;
				case 0xff0018d9: cuadrosCatalogo[i] = Cuadro.CIRCLE_SKY_4;
				  continue;
				case 0xff0018c3: cuadrosCatalogo[i] = Cuadro.SKY;
				  continue;
				case 0xff3b0363: cuadrosCatalogo[i] = Cuadro.PURPLE;
				  continue;

				//SEGUNDA COLUMNA DE BASE GRAFICOS
				case 0xff036847: cuadrosCatalogo[i] = Cuadro.ESQUINA_DARK_1;
				  continue;
				case 0xff1e6847: cuadrosCatalogo[i] = Cuadro.ESQUINA_DARK_2;
				  continue;
				case 0xff4e6847: cuadrosCatalogo[i] = Cuadro.ESQUINA_DARK_3;
				  continue;
				case 0xff726847: cuadrosCatalogo[i] = Cuadro.ESQUINA_LIGHT_1;
				  continue;
				case 0xff9f6847: cuadrosCatalogo[i] = Cuadro.ESQUINA_LIGHT_2;
				  continue;
				case 0xffc66847: cuadrosCatalogo[i] = Cuadro.ESQUINA_LIGHT_3;
				  continue;
				case 0xffe16847: cuadrosCatalogo[i] = Cuadro.ESQUINA_LIGHT_MOR_1;
				  continue;
				case 0xffff6847: cuadrosCatalogo[i] = Cuadro.ESQUINA_LIGHT_MOR_2;
				  continue;
				case 0xffff4247: cuadrosCatalogo[i] = Cuadro.ESQUINA_LIGHT_MOR_3;
				  continue;
				case 0xffe74247: cuadrosCatalogo[i] = Cuadro.ESQUINA_DARK_AZ_1;
				  continue;
				case 0xffd24247: cuadrosCatalogo[i] = Cuadro.ESQUINA_DARK_AZ_2;
				  continue;
				case 0xffbd4247: cuadrosCatalogo[i] = Cuadro.ESQUINA_DARK_AZ_3;
				  continue;

				//TERCERA COLUMNA DE BASE GRAFICOS
				case 0xffbd2147: cuadrosCatalogo[i] = Cuadro.LADO_DARK_1;
				  continue;
				case 0xffbd0047: cuadrosCatalogo[i] = Cuadro.LADO_DARK_2;
				  continue;
				case 0xffbd0057: cuadrosCatalogo[i] = Cuadro.LADO_LIGHT;
				  continue;
				case 0xffbd0072: cuadrosCatalogo[i] = Cuadro.LADO_LIGHT_MOR_1;
				  continue;
				case 0xffbd0096: cuadrosCatalogo[i] = Cuadro.LADO_LIGHT_MOR_2;
				  continue;
				case 0xffbd00c3: cuadrosCatalogo[i] = Cuadro.LADO_DARK_AZ;
				  continue;
				default :
					cuadrosCatalogo[i] = Cuadro.VACIO;
			}
		}
	}

}
