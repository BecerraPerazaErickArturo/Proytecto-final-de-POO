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
    
    ancho = imagen.getWidth();
    largo = imagen.getHeight();
    
    cuadrosCatalogo = new Cuadro[ancho*largo];
    pixeles = new int[ancho*largo];
    
    imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
      
    } catch (IOException e){
        e.printStackTrace();
   }
  
  protected void generarMapa(){
    for(int i=0; i< pixeles.lenght; i++){
      
    }
  }

}
