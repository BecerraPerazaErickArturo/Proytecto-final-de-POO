package principal.herramientas;
import java.awt.Graphics;

public class CargadorRecursos{
  public static BufferedImage cargarImageCompatibleOpaca(final String ruta){
    Image imagen = null;
    try{
      image = ImageIO.read(ClassLoader.class.getResource(ruta));
    }catch(IOException e){
      e.printStackTrace();
    }
    GraphicsConfiguration gc = GraphicsEnviroment.getLocalGraphicsEnviroment().getDefaultScreenDevice().getDefaultConfiguration();
    BufferedImage imagenAcelerada = gc.createCompatibleImage(imagen.getWidth(null), image.getHeight(null), Transparency.OPAQUE);
    Graphics g = imagenAcelerada.getGraphics();
    g.drawImage(imagen, 0, 0, null);
    g.dispose();
    return imagenAcelerada;
  }
  
  public static BufferedImage cargarImagenCompatibleTranslucida(final string ruta){
    Image imagen = null;
    try{
      image = ImageIO.read(ClassLoader.class.getResource(ruta));
    }catch(IOException e){
      e.printStackTrace();
    }
    GraphicsConfiguration gc = GraphicsEnviroment.getLocalGraphicsEnviroment().getDefaultScreenDevice().getDefaultConfiguration();
    BufferedImage imagenAcelerada = gc.createCompatibleImage(imagen.getWidth(null), image.getHeight(null), Transparency.TRANSLUCENT);
    Graphics g = imagenAcelerada.getGraphics();
    g.drawImage(imagen, 0, 0, null);
    g.dispose();
    return imagenAcelerada;
  }
  public static String leerArchivoTexto(final String ruta){
    String contenido = "";
    InputStream entradaBytes = ClassLoader.class.getResourceAsStream(ruta);
    BufferedReader lector = new BufferedReader(new ImputStreamReader(entradaBytes));
    String linea;
    try{
      while((linea = lector.readLine()) != null){
        contenido += linea;
      }
    }catch(IOException e){
      e.printStackTrace();
    }finally{
      try{
        if(entradaBytes != null){
          entradaBytes.close();
        }
        if(lector != null){
          lector.close();
        }
      }catch(IOException ex){
        ex.printStackTrace();
      }
    }
    return contenido;
  }
}
