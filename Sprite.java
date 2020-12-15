//package graficos;

public final class Sprite{
  private final int lado;
  private int x;
  private int y;
  public int[] pixeles;
  private HojaSprites hoja;
  
  //Coleccion de Sprites del personaje
  public static final Sprite MAGO_FRENTE_1 = new Sprite(32, 0, 0, 0, HojaSprites.jugador);
  public static final Sprite MAGO_FRENTE_2 = new Sprite(32, 0, 1, 0, HojaSprites.jugador);
  public static final Sprite MAGO_FRENTE_3 = new Sprite(32, 0, 2, 0, HojaSprites.jugador);
  
  public static final Sprite MAGO_ATRAS_1 = new Sprite(32, 1, 0, 0, HojaSprites.jugador);
  public static final Sprite MAGO_ATRAS_2 = new Sprite(32, 1, 1, 0, HojaSprites.jugador);
  public static final Sprite MAGO_ATRAS_3 = new Sprite(32, 1, 2, 0, HojaSprites.jugador);
  
  public static final Sprite MAGO_DER_1 = new Sprite(32, 2, 0, 0, HojaSprites.jugador);
  public static final Sprite MAGO_DER_2 = new Sprite(32, 2, 1, 0, HojaSprites.jugador);
  public static final Sprite MAGO_DER_3 = new Sprite(32, 2, 2, 0, HojaSprites.jugador);
  
  public static final Sprite MAGO_IZ_1 = new Sprite(32, 3, 0, 0, HojaSprites.jugador);
  public static final Sprite MAGO_IZ_2 = new Sprite(32, 3, 1, 0, HojaSprites.jugador);
  public static final Sprite MAGO_IZ_3 = new Sprite(32, 3, 2, 0, HojaSprites.jugador);
  //fin de coleccion del personaje
  
  ///Coleccion de Sprites del mapa desértico
  public static final Sprite VACIO = new Sprite(32, 0);
  //                                                    x  y (version de carga del sprite)
  public static final Sprite CITY_UP_1 = new Sprite(32, 0, 0, 0, HojaSprites.mapa); //este se llamaba nom antes
  public static final Sprite PLANTA_OBS_VOLT_1 = new Sprite(32, 2, 0, 0, HojaSprites.mapa);
  public static final Sprite MOON_OBS = new Sprite(32, 4, 0, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_UP_1 = new Sprite(32, 6, 0, 0, HojaSprites.mapa);
  
  public static final Sprite CITY_UP_2 = new Sprite(32, 0, 2, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_VOLT_2  = new Sprite(32, 2, 2, 0, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_1 = new Sprite(32, 4, 2, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_UP_2 = new Sprite(32, 6, 2, 0, HojaSprites.mapa);
  
  public static final Sprite MOON = new Sprite(32, 0, 4, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_VOLT_3 = new Sprite(32, 2, 4, 0, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_2 = new Sprite(32, 4, 4, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_OBS_UP_3 = new Sprite(32, 6, 4, 0, HojaSprites.mapa);
  
  public static final Sprite CITY_UP_3 = new Sprite(32, 0, 6, 0, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_3  = new Sprite(32, 2, 6, 0, HojaSprites.mapa);
  public static final Sprite BLUE = new Sprite(32, 4, 6, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_NOR_VOLT_1 = new Sprite(32, 6, 6, 0, HojaSprites.mapa);
  
  public static final Sprite CITY_UP_4 = new Sprite(32, 0, 8, 0, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_4  = new Sprite(32, 2, 8, 0, HojaSprites.mapa);
  public static final Sprite CITY_DOWN_5 = new Sprite(32, 4, 8, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_NOR_VOLT_2 = new Sprite(32, 6, 8, 0, HojaSprites.mapa);
    
  public static final Sprite CITY_UP_5 = new Sprite(32, 0, 10, 0, HojaSprites.mapa);
  public static final Sprite SKY_LIGHT_1  = new Sprite(32, 2, 10, 0, HojaSprites.mapa);
  public static final Sprite SKY_DARK_1 = new Sprite(32, 4, 10, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_NOR_VOLT_3 = new Sprite(32, 6, 10, 0, HojaSprites.mapa);
  
  public static final Sprite PLANTA_NOR_UP_1 = new Sprite(32, 0, 12, 0, HojaSprites.mapa);
  public static final Sprite SKY_LIGHT_2  = new Sprite(32, 2, 12, 0, HojaSprites.mapa);
  public static final Sprite SKY_DARK_2 = new Sprite(32, 4, 12, 0, HojaSprites.mapa);
    
  public static final Sprite PLANTA_NOR_UP_2 = new Sprite(32, 0, 14, 0, HojaSprites.mapa);
  public static final Sprite PLANTA_NOR_UP_3  = new Sprite(32, 2, 14, 0, HojaSprites.mapa);
  public static final Sprite PURPLE = new Sprite(32, 4, 14, 0, HojaSprites.mapa);
  ///Fin de la coleccion
  
  public Sprite(final int lado, final int columna, final int fila, final int version, final HojaSprites hoja){
    this.lado = lado;
    pixeles = new int[lado * lado];
    this.x = columna * lado;
    this.y = fila * lado;
    this.hoja = hoja;
    cargarSprite(version);
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
  
  private void cargarSprite(int version){
    if(Version == 0){
      cargaNormal();
    }else{
      cargaManipulada(version);
    }
  }
  
  private void cargaNormal(){
    for(int y = 0; y < lado; y++){
      for(int x = 0; x < lado; x++){
        pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
      }
    }
  }
  
  private void cargaManipulada(int version){
    int[] pixelesTemporales = iniciarPixelesTemporales();
    switch(version){
      case 1: invertirX(pixelesTemporales);
              break;
      case 2: invertirY(pixelesTemporales);
              break;
      case 3: invertirXY(pixelesTemporales);
              break;
      case 4: rotar90I(pixelesTemporales);
              break;
      case 5: rotar90D(pixelesTemporales);
              break;
      case 6: rotarI90InvertirY(pixelesTemporales);
              break;
      case 7: rotarD90InvertirY(pixelesTemporales);
              break;
      default: cargaNormal();
    }
  }
  
  private int[] iniciarPixelesTemporales(){
    int[] pixelesTemporales = new int[lado * lado];
     for(int y = 0; y < lado; y++){
      for(int x = 0; x < lado; x++){
        pixelesTemporales[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
      }
    }
    return pixelesTemporales;
  }
  
  //Caso 1
  private void invertirX(int[] pixelesTemporales){
    int i = 0;
    for(int y = 0; y < lado; y++){
      for(int x = lado - 1; x > -1; x--){
        pixeles[i] = pixelesTemporales[x + y * lado];
        i++;
      }
    }
  }
  
  //Caso 2
  private void invertirY(int[] pixelesTemporales){
    int i = 0;
    for(int y = lado - 1; y > -1; y--){
      for(int x = 0; x < lado; x++){
        pixeles[i] = pixelesTemporales[x + y * lado];
        i++;
      }
    }
  }
  
  //Caso 3
  private void invertirXY(int[] pixelesTemporales){
    for(int i = 0; i < pixeles.length; i++){
      pixeles[i] = pixelesTemporales[pixelesTemporales.length - 1 - i];
    }
  }
  
  //Caso 4
  private void rotar90I(int[] pixelesTemporales){
    int i = 0;
    for(int x = lado - 1; x > -1; x--){
      for(int y = 0; y < lado; y++){
        pixeles[i] = pixelesTemporales[x + y * lado];
        i++;
      }
    }
  }
  
  //Caso 5
  private void rotar90D(int[] pixelesTemporales){
    int i = 0;
    for(int x = 0; x < lado; x++){
      for(int y = lado -1; y > -1; y--){
        pixeles[i] = pixelesTemporales[x + y * lado];
        i++;
      }
    }
  }
  
  //Caso 6
  private void rotarI90InvertirY(int[] pixelesTemporales){
    int i = 0;
    for(int x = 0; x < lado; x++){
      for(int y = 0; y < lado; y++){
        pixeles[i] = pixelesTemporales[x + y * lado];
        i++;
      }
    }
  }
  
  //caso 7
  private void rotarD90InvertirY(int[] pixelesTemporales){
    int i = 0;
    for(int x = lado -1; x > -1; x--){
      for(int y = lado -1; y > -1; y--){
        pixeles[i] = pixelesTemporales[x + y * lado];
        i++;
      }
    }
  }
}
