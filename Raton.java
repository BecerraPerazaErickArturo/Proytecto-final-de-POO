package principal.control;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import principal.herramientas.CargadorRecursos;

public class Raton{
  
  private final Cursor cursor;
  
  public Raton(){
    Toolkit configuracion = Toolkit.getDefaultToolKit();
    
    BufferedImage icono = CargadorRecursos.cargarImagenCompatibleTranslucida("");
    
    Point punta = new Point(0,0);
    this.cursor = configuracion.createCustomCursor(icono,punta,"Cursor por defecto");
  }
}
