//este es del video 15 
//package mapa;

public abstract class Mapa{
  protected int ancho;
  protected int largo; //alto
  protected int[] cuadros; 
  
  public Mapa(int ancho, int largo){
    this.ancho=ancho;
    this.largo=largo;  
    cuadros = new int[ancho*largo];
    generarMapa();
  }
  
  public Mapa(String ruta){
    cargarMapa(ruta);
  }
  
  protected void generarMapa(){
  
  }
  
  private void cargarMapa(String ruta){
  
  }
  
  public void actualizar(){
  
  }
  
  public void mostrar(final int compensacionX, final int compensacionY, final Pantalla pantalla){
    int o = compensacionX >> 5;
    int e = (compensacionX + pantalla.getAncho()) >> 5;
    int n = compensacionY >> 5;
    int s = (compensacionY + pantalla.getLargo()) >> 5;
  }
  public Cuadro getCuadro(final int x, final int y){
    switch(cuadros[x + y * ancho]){
      case 0: return Cuadro.ASFALTO;
      case 1: ;
      default: return null;
    }
  }
}
