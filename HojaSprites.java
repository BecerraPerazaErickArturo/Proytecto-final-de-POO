//package graficos;

import java.awt.image.BufferedImage;

public class HojaSprites{
  private final int ancho;
  private final int largo;
  public final int[] pixeles;
  
  ///Coleccion de hojas de sprites
  public static HojaSprites mapa = new HojaSprites("///RUTA DE IMAGEN PNG///, 320, 320");
  public static HojaSprites jugador = new HojaSprites("///RUTA DE IMAGEN jugador PNG///, 320, 320");
  ///Fin de la coleccion
  
  public HojaSprites(final String ruta, final int ancho, final int largo){
    this.ancho = ancho;
    this.largo = largo;
    pixeles = new int[ancho * largo];
    BufferedImage imagen;
    
    try{
      BufferedImage imagen = imageIO.read(HojaSprites.class.getResource(ruta));
      imagen.getRGB(0, 0, ancho, largo, pixeles, 0, ancho);
    }catch(IOException e){
      e.printStackTrace();
    }
  }
  public int getAncho(){
    return ancho;
  }
}
