package principal.maquinaestado.estados.juego;
import java.awt.Graphics;

public class GestorJuego implements EstadoJuego{
  Mapa mapa = new Mapa("\\Ruta");
  BufferedImage logo = CargadorRecursos.cargarImagenCompatibleTranslucida("\\Ruta");
  public void actualizar(){
  }
  public void actualizar(){
  
  }
  public void dibujar(Graphics g){
    mapa.dibujar(g);
    g.drawImage(logo, 640 - logo.getWidth()- 5, 360 - logo.getHeight() - 5, null);
  }
}
