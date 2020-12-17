package entes.criaturas;

import entes.Ente;

public abstract class Criatura extends Ente{
  protected Sprite sprite;
  protected char direccion = 'n'; //norte
  protected boolean enMovimiento = false;
  
  public void actualizar(){
  }

  public void mostrar(){
  }
  
  public void mover(int desplazamientoX, int desplazamientoY){
    if(desplazamientoX > 0){
      direccion ='e'; //este
    }
    if(desplazamientoX < 0){
      direccion ='o'; //oeste
    }
    if(desplazamientoY > 0){
      direccion ='s'; //sur
    }
    if(desplazamientoY < 0){
      direccion ='n'; //norte
    }
    if(!estaEliminado()){
      if(!enColision(desplazamientoX, 0)){
        modificarPosicionX(desplazamientoX);
      }
      if(!enColision(0, desplazamientoY)){
        modificarPosicionY(desplazamientoY);
      }
    }
  }
  
  private boolean enColision(int desplazamientoX, int desplazamientoY){
    boolean colision = false;
    int posicionX = x + desplazamientoX;
    int posicionY = y + desplazamientoY;
    int margenIzquierdo = -6;//Depende de cada personajo, en nuestro caso seria prueba y error
    int margenDerecho = 18;
    int margenSuperior = -4;
    int margenInferior = 31;
    int bordeIzquierdo = (posicionX + margenDerecho)/sprite.getLado();
    int bordeDerecho = (posicionX + margenDerecho + margenIzquierdo)/sprite.getLado();
    int bordeSuperior = (posicionY + margenInferior)/sprite.getLlado();
    int bordeInferior = (posicionY + margenInferior + margenSuperior)/sprite.getLado();
    if(mapa.getCuadroCatalogo(bordeIquierdo + bordeSuperior * mapa.getAncho()).esSolido()){
      colision = true;
    }
    if(mapa.getCuadroCatalogo(bordeIquierdo + bordeInferior * mapa.getAncho()).esSolido()){
      colision = true;
    }
    if(mapa.getCuadroCatalogo(bordeDerecho + bordeSuperior * mapa.getAncho()).esSolido()){
      colision = true;
    }
    if(mapa.getCuadroCatalogo(bordeDerecho + bordeInferior * mapa.getAncho()).esSolido()){
      colision = true;
    }
    return colision;
  }
  
  public Sprite getSprite(){
    return sprite;
  }
}
