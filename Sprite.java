//package graficos;

public final class Sprite{
  private final int lado;
  private int x;
  private int y;
  public int[] pixeles;
  private HojaSprites hoja;
  
  ///Coleccion de Sprites
  public static final Sprite VACIO = new Sprite(32, 0);
  //                                                    x  y
  public static final Sprite CITY_UP_1 = new Sprite(32, 0, 0, HojaSprites.mapa); //este se llamaba nom antes
  public static final Sprite PLANTA_OBS_VOLT_1 = new Sprite(32, 2, 0, HojaSprites.mapa);
  public static final Sprite MOON_OBS = new Sprite(32, 4, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_UP_1 = new Sprite(32, 6, 0, HojaSprites.mapa);
  
  public static final Sprite CITY_UP_2 = new Sprite(32, 0, 2, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_VOLT_2  = new Sprite(32, 2, 2, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_1 = new Sprite(32, 4, 2, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_UP_2 = new Sprite(32, 6, 2, HojaSprites.mapa);
  
  public static final Sprite MOON = new Sprite(32, 0, 4, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_VOLT_3 = new Sprite(32, 2, 4, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_2 = new Sprite(32, 4, 4, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_UP_3 = new Sprite(32, 6, 4, HojaSprites.mapa);
  
  public static final Sprite CITY_UP_2 = new Sprite(32, 0, 6, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_VOLT_2  = new Sprite(32, 2, 6, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_1 = new Sprite(32, 4, 6, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_UP_2 = new Sprite(32, 6, 6, HojaSprites.mapa);
  
  ///Fin de la coleccion
  
  public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja){
    this.lado = lado;
    pixeles = new int[lado * lado];
    this.x = columna * lado;
    this.y = fila * lado;
    this.hoja = hoja;
    for(int y = 0; y < lado; y++){
      for(int x = 0; x < lado; x++){
        pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
      }
    }
  }
  public Sprite(final int lado, final int color){
    thi.lado = lado;
    pixeles = new int[lado * lado];
    for(int i =0; i < pixeles.length; i++){
      pixeles[i] = color;
    }
  }
  
  public int getLado(){
    return lado;
  }
  
}
