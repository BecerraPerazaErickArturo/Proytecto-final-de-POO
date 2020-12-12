public final class Pantalla{
  private final int ancho;
  private final int largo;
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
  public void mostrar(final int compX, final int compY){
    for(y = 0; y < largo; y++){
      int posicionY = y + compY;
      if(posicionY < 0 || posicionY >= largo){
        continue;
      }
      for(int x = 0; x < ancho; x++){
        int posicionX = x + compX;
        if(posicionX < 0 || posicionX >= ancho){
          continue;
        }
        \\\pixeles[posicionX + posicionY * ancho] = Sprite.nom.pixeles[];
      }
    }
  }
}
