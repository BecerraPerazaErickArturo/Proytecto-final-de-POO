package principal.maquinaestado.estados.juego;
import java.awt.Graphics;

public class GestorJuego implements EstadoJuego{
  Mapa mapa = new Mapa("\\Ruta");
  Jugador jugador = new jugador(1, 1);
  BufferedImage logo = CargadorRecursos.cargarImagenCompatibleTranslucida("\\Ruta");
  public void actualizar(){
  }
  public void actualizar(){
    ///Al restar se vuleve mas lento y al sumar mas rapido en esta serie de If's
    if(GestorControl.teclado.pulsadoArriba()){
      jugador.establecerPosicionY(jugador.getPosicionY() - 1);
    }
    if(GestorControl.teclado.pulsadoAbajo()){
      jugador.establecerPosicionY(jugador.getPosicionY() + 1);
    }
    if(GestorControl.teclado.pulsadoIzquierda()){
      jugador.establecerPosicionX(jugador.getPosicionX() - 1);
    }
    if(GestorControl.teclado.pulsadoIzquierda()){
      jugador.establecerPosicionX(jugador.getPosicionX() + 1);
    }
  }
  public void dibujar(Graphics g){
    mapa.dibujar(g, (int)jugador.getPosicionX(), (int)jugador.getPosicionY());
    jugador.dibujar(g);
    g.drawImage(logo, 640 - logo.getWidth()- 5, 360 - logo.getHeight() - 5, null);
    g.setColor(Color.red);
    g.drawString("X = " + jugador.getPosicionX(), 20, 20);
    g.drawString("Y = " + jugador.getPosicionY(), 20, 30);
  }
}
