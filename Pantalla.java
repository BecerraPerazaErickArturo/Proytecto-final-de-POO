import cuadro;

public final class Pantalla{
  private final int ancho;
  private final int largo;
  private inr diferenciaX;
  private int diferenciaY;
  public final int[] pixeles;
  public Pantalla(final int ancho, final int largo){
    this.ancho = ancho;
    this.largo = largo;
    pixeles = new int[ancho * largo];
  }
  public void limpiar(){
    for(int i = 0; i < pixeles.length; i++){
      pixeles[i] = 0;
    }
  }
  public void mostrarCuadro(int compensacionX, in compensacionY, Cuadro cuadro){
    compensacionX -= diferenciaX;
    compensacionY -= diferenciaY;
    for(int y = 0; y < cuadro.sprite.getLado(); y++){
      int posicionY = y + compensacionY;
      for(int x = 0; x < cuadro.sprite.getLado(); x++){
        int posicionX = x + compensacionX;
        if(posicionX < -cuadro.sprite.getLado() || posicionX >= ancho || posicionY < 0 || posicionY >= largo ){
          break;
        }
        if(posicionX < 0){
          posicionX = 0;
        }
        pixeles[posicionX + posicionY * ancho] = cuadro.sprite.pixeles[x +y * cuadro.sprite.getLado()];
      }
    }
  }
  public void estableceDiferencia(final int diferenciaX, final int diferenciaY){
    this.diferenciaX = diferenciaX;
    this.diferenciaY = diferenciaY;
  }
  public int getAncho(){
    return ancho;
  }
  public inr getLargo(){
    return largo;
  }
}
