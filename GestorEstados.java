//package principal.maquinaestado;

import java.awt.Graphics;
import principal.maquinaestado.estados.juego.GestorJuego;

public class GestorEstados{
  
  private EstadoJuego[] estados;
  private EstadoJuego estadoActual;
  
  public GestorEstados(){
    iniciarEstados();
    iniciarEstadoActual();
    
  }
  
  private void iniciarEstados(){
    estados = new EstadoJuego[1];
    estados[0] = new GestorJuego();
  }
  
  private void iniciarEstadoActual(){
    estadoActual = estados[0];
  }

  private void actualizar(){
    estadoActual.actualizar();
  }
  
  private void dibujar(final Graphics g){
    estadoActual.dibujar(g);
  }
  
  public void cambiarEstadoActual(final int nuevoEstado){
    estadoActual = estado[nuevoEstado];
  }
  
  public EstadoJuego obtenerEstadoActual(){
    return estadoActual;
  }
  
}
