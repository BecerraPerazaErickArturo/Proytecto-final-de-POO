//package control;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener{
  
  ///Cambio de nombre a "numeroTeclas" a todo mayusculas pero lo hizo con refactor para que se cambiara por atomatico en cada llamada
  private final static int numeroTeclas = 256;
  private final boolean[] teclas = new boolean[numeroTeclas];
  
  private boolean arriba;
  private boolean abajo;
  private boolean izquierda;
  private boolean derecha;
  private boolean correr;
  private boolean salir;

  public void actualizar(){
    arriba = teclas[KeyEvent.VK_W];
    abajo = teclas[KeyEvent.VK_S];
    izquierda = teclas[KeyEvent.VK_A];
    derecha = teclas[KeyEvent.VK_D];
    correr = teclas[KeyEvent.VK_SHIFT];
    salir=teclas[KeyEvent.VK_ESCAPE];
  }
  
  public void KeyPressed(KeyEvent e){
    teclas[e.getKeyCode()] = true;
  }
  
  public void keyReleased(KeyEvent e){
    teclas[e.getKeyCode()] = false;
  }
  
  public void KeyTyped(KeyEvent e){
    
  }
  public boolean pulsadoArriba(){
    return arriba;
  }
  public boolean pulsadoAbajo(){
    return abajo;
  }
  public boolean pulsadoIzquierda(){
    return izquierda;
  }
  public boolean pulsadoDerecha(){
    return derecha;
  }
  public boolean pulsadoCorrer(){
    return correr;
  }
  public boolean pulsadoSalir(){
    return salir;
  }
}
