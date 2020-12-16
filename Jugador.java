package entes.criaturas;

import graficos.Sprites;
import control.Teclado;

public class Jugador extends Criatura{
  
  private Teclado teclado;
  private int aimacion;
  
  public Jugador(Teclado teclado, Sprite sprite){
    this.teclado = teclado;
    this.sprite = sprite;
  }
  
  public Jugador(Teclado teclado, Sprite sprite, int posicionX, int posicionY){
    this.teclado = teclado;
    this.sprite = sprite;
    this.x = posicionX;
    this.y = posicionY;
  }
  
  public void actualizar(){
    int desplazamientoX = 0;
    int desplazamientoY = 0;
  
    if(animacion < 32767){
      animacion++;
    }else {
      animacion=0;
    }
    
    if (teclado.arriba) desplazamientoY--; 
    if (teclado.abajo) desplazamientoY++; 
    if (teclado.izquierda) desplazamientoX--; 
    if (teclado.derecha) desplazamientoX++; 
    
    if (desplazamientoX !=0 || desplazamientoY !=0 ){
      mover(desplazamientoX, desplazamientoY);
      enMovimiento = true;
    }else{
      enMovimiento = false;
    }
    
      if(direccion == 'n'){
        sprite = Sprite.MAGO_ATRAS_1;
        if(enMovimiento){
          if(animacion % 30 > 15){ //esto es la rapidez de la animacion, para mas lento incremente su numero proporcional
            sprite = Sprite.MAGO_ATRAS_1;
        }else{
          sprite = Sprite.MAGO_ATRAS_2;
        }
      }
      if(direccion == 's'){
        sprite = Sprite.MAGO_FRENTE_1;
        if(enMovimiento){
          if(animacion % 30 > 15){ //esto es la rapidez de la animacion, para mas lento incremente su numero proporcional
            sprite = Sprite.MAGO_FRENTE_1;
        }else{
          sprite = Sprite.MAGO_FRENTE_2;
        }
      }
      if(direccion == 'o'){
        sprite = Sprite.MAGO_IZ_1;
        if(enMovimiento){
          if(animacion % 30 > 15){ //esto es la rapidez de la animacion, para mas lento incremente su numero proporcional
            sprite = Sprite.MAGO_IZ_1;
        }else{
          sprite = Sprite.MAGO_IZ_2;
        }
      }
      if(direccion == 'e'){
        sprite = Sprite.MAGO_DER_1;        
        if(enMovimiento){
          if(animacion % 30 > 15){ //esto es la rapidez de la animacion, para mas lento incremente su numero proporcional
            sprite = Sprite.MAGO_DER_1;
        }else{
          sprite = Sprite.MAGO_DER_2;
        
      }
    
  }
  
  public void mostrar(Pantalla pantalla){
    pantalla.mostrarJugador(x,y, this);
  }
  
}
