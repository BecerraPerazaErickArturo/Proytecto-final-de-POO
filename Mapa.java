//este es del video 15 
//package mapa;

public abstract class Mapa{
  protected int ancho;
  protected int largo; //alto
  protected int[] cuadros; 
  protected Cuadro[] cuadrosCatalogo;
  
  public Mapa(int ancho, int largo){
    this.ancho=ancho;
    this.largo=largo;  
    cuadros = new int[ancho*largo];
    generarMapa();
  }
  
  public Mapa(String ruta){
    cargarMapa(ruta);
    generarMapa();
  }
  
  protected void generarMapa(){
  }
  
  protected void cargarMapa(String ruta){
  }
  
  public void actualizar(){
  }
  
  public void mostrar(final int compensacionX, final int compensacionY, final Pantalla pantalla){
    pantalla.establecerDiferencia(compensacionX, compensacionY);
    int o = compensacionX >> 5;
    int e = (compensacionX + pantalla.getAncho() + Cuadro.LADO) >> 5;
    int n = compensacionY >> 5;
    int s = (compensacionY + pantalla.getLargo() + Cuadro.LADO) >> 5;
    for(int y = n; y < s; y++){
      for(int x = o; x < e; x++){
      //  getCuadro(x, y).mostrar(x, y, pantalla);
        if( x<0 || y<0 || x>=ancho || y>=alto ){
          Cuadro.VACIO.mostrar(x,y,pantalla);
        }else{
          cuadrosCatalogo[x+y*ancho].mostrar(x,y, pantalla);
        }
      }
    }
  }
  public Cuadro getCuadroCatalogo(int posicion){
    return cuadrosCatalogo[posicion];
  }
  public int getAncho(){
    return ancho;
  }
  public Cuadro getCuadro(final int x, final int y){
    if(x < 0 || y < 0 || x >= ancho || y >= largo){
      return Cuadro.VACIO;
  }
    switch(cuadros[x + y * ancho]){
      case 0: return Cuadro.CITY_UP_1;
      case 1: return Cuadro.CITY_UP_2;
      case 2: return Cuadro.CITY_UP_3;
      case 3: return Cuadro.CITY_UP_4;
      case 4: return Cuadro.CITY_UP_5;
      case 5: return Cuadro.MOON;
      case 6: return Cuadro.CITY_DOWN_1;
      case 7: return Cuadro.CITY_DOWN_2;
      case 8: return Cuadro.CITY_DOWN_3;
      case 9: return Cuadro.CITY_DOWN_4;
      case 10: return Cuadro.CITY_DOWN_5;
      case 11: return  Cuadro.MOON_OBS;
      case 12: return  Cuadro.PLANTA_OBS_VOLT_1;
      case 13: return  Cuadro.PLANTA_OBS_VOLT_2;
      case 14: return  Cuadro.PLANTA_OBS_VOLT_3;
      case 15: return  Cuadro.PLANTA_OBS_UP_1;
      case 16: return  Cuadro.PLANTA_OBS_UP_2;
      case 17: return  Cuadro.PLANTA_OBS_UP_3;
      case 18: return  Cuadro.PLANTA_NOR_VOLT_1;
      case 19: return  Cuadro.PLANTA_NOR_VOLT_2;
      case 20: return  Cuadro.PLANTA_NOR_VOLT_3;
      case 21: return  Cuadro.SKY_LIGHT_1;
      case 22: return  Cuadro.SKY_LIGHT_2;
      case 23: return  Cuadro.SKY_DARK_1;
      case 24: return  Cuadro.SKY_DARK_2;
      case 25: return  Cuadro.PLANTA_NOR_UP_1;
      case 26: return  Cuadro.PLANTA_NOR_UP_2;
      case 27: return  Cuadro.PLANTA_NOR_UP_3;
      case 28: return  Cuadro.PURPLE;
      case 29: return  Cuadro.BLUE;
      default: return Cuadro.VACIO;
    }
  }
}
