package principal.maquinaestado.estados.juego;
import java.awt.Graphics;

public class GestorJuego implements EstadoJuego{
  Mapa mapa = new Mapa("\\Ruta");
  Jugador jugador = new jugador(1, 1);
  BufferedImage logo = CargadorRecursos.cargarImagenCompatibleTranslucida("\\Ruta");
  public void actualizar(){
  }
  public void actualizar(){
    if(GestorControl.teclado.pulsadoArriba()){
      jugador.establecerPosicionX(jugador.getPosicionY() - 1);
    }
    if(GestorControl.teclado.pulsadoAbajo()){
      jugador.establecerPosicionX(jugador.getPosicionY() + 1);
    }
    if(GestorControl.teclado.pulsadoIzquierda()){
      jugador.establecerPosicionY(jugador.getPosicionY() - 1);
    }
    if(GestorControl.teclado.pulsadoIzquierda()){
      jugador.establecerPosicionY(jugador.getPosicionY() + 1);
    }
  }
  public void dibujar(Graphics g){
    mapa.dibujar(g);
    jugador.dibujar(g);
    g.drawImage(logo, 640 - logo.getWidth()- 5, 360 - logo.getHeight() - 5, null);
    g.setColor(Color.red);
    g.drawString("X = " + jugador.getPosicionX(), 20, 20);
    g.drawString("Y = " + jugador.getPosicionY(), 20, 30);
  }
}
