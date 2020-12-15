package entes;

public abstract class Ente{
  protected int x;
  protected int y;
  
  private boolean eliminado = false;
  
  protected Mapa mapa;
  
  public void actualizar(){
  }
  
  public void mostrar(){
  }
  
  public void eliminar(){
    eliminado = true;
  }
  
  public int getPosicionX(){
    return x;
  }
  
  public void modificarPosicionX(int desplazamientoX){
    x +=desplazamientoX;
  }
  
  public int getPosicionY(){
    return y;
  }
  
  public void modificarPosicionY(int desplazamientoY){
    y +=desplazamientoY;
  }
  
  public boolean estaEliminado(){
    return eliminado;
  }
  
}
