package principal.sprites;
import.awt.image.BufferedImage;

public class Sprite{
  private final BufferedImage imagen;
  private final int ancho;
  private final int largo;
  public Sprite(BufferedImage imagen){
    this.imagen = imagen;
    ancho = imagen.getWith();
    largo = imagen.getHeight();
  }
  public BufferedImage getImagen(){
    return imagen;
  }
  public int getAncho(){
    return ancho;
  }
  public int getLargo(){
    return largo;
  }
}
