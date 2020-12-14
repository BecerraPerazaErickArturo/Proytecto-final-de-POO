//package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MapaCargado extends Mapa{

  private int[] pixeles;
  
  public MapaCargado(String ruta){
    super(ruta);
  }
  
  protected void cargarMapa(String ruta){
    BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
    
    ancho =
  } catch (IOException e){
      e.printStackTrace();
  }

}
