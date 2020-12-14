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
  
  public static final Sprite CITY_UP_3 = new Sprite(32, 0, 6, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_3  = new Sprite(32, 2, 6, HojaSprites.mapa);
  public static final Sprite BLUE = new Sprite(32, 4, 6, HojaSprites.mapa);
  public static final Sprite PLANTA_NOR_VOLT_1 = new Sprite(32, 6, 6, HojaSprites.mapa);
  
  public static final Sprite CITY_UP_4 = new Sprite(32, 0, 8, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_4  = new Sprite(32, 2, 8, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_5 = new Sprite(32, 4, 8, HojaSprites.mapa);
  public static final Sprite PLANTA_NOR_VOLT_2 = new Sprite(32, 6, 8, HojaSprites.mapa);
    
  public static final Sprite CITY_UP_5 = new Sprite(32, 0, 10, HojaSprites.mapa);
  public static final Sprite SKY_LIGHT_1  = new Sprite(32, 2, 10, HojaSprites.mapa);
  public static final Sprite SKY_DARK_1 = new Sprite(32, 4, 10, HojaSprites.mapa);
  public static final Sprite PLANTA_NOR_VOLT_3 = new Sprite(32, 6, 10, HojaSprites.mapa);
  
  public static final Sprite PLANTA_NOR_UP_1 = new Sprite(32, 0, 12, HojaSprites.mapa);
  public static final Sprite SKY_LIGHT_2  = new Sprite(32, 2, 12, HojaSprites.mapa);
  public static final Sprite SKY_DARK_2 = new Sprite(32, 4, 12, HojaSprites.mapa);
    
  public static final Sprite PLANTA_NOR_UP_2 = new Sprite(32, 0, 14, HojaSprites.mapa);
  public static final Sprite PLANTA_NOR_UP_3  = new Sprite(32, 2, 14, HojaSprites.mapa);
  public static final Sprite PURPLE = new Sprite(32, 4, 14, HojaSprites.mapa);
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
