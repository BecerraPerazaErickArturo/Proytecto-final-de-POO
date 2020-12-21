package principal.herramientas;

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
}
