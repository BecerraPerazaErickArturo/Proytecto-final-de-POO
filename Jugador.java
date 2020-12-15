package entes.criaturas;

import entes.Ente; 

public class Jugador extends Criatura{
  private Teclado teclado;
  
  public Jugador(Teclado teclado){
    this.teclado = teclado;
  }
  
  public Jugador(Teclado teclado, int posicionX, int posicionY){
    this.teclado = teclado;
    this.x = posicionX;
    this.y = posicionY;
  }
}
