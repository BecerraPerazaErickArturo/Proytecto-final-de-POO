//video 16
//package mapa.cuadro

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro{
  public int x;
  public int y;
  
  public Sprite sprite;
  public static final int LADO = 32;
  
  //coleccion de cuadros
  public static final Cuadro VACIO = new CuadroVacio(Sprite.VACIO);
  
  public static final Cuadro CITY_UP_1 = new Cuadro(Sprite.CITY_UP_1); 
  public static final Cuadro CITY_UP_2 = new Cuadro(Sprite.CITY_UP_2);
  public static final Cuadro CITY_UP_3 = new Cuadro(Sprite.CITY_UP_3);
  public static final Cuadro CITY_UP_4 = new Cuadro(Sprite.CITY_UP_4);    
  public static final Cuadro CITY_UP_5 = new Cuadro(Sprite.CITY_UP_5);  
  public static final Cuadro MOON = new Cuadro(Sprite.MOON);
  
  public static final Cuadro CITY_DOWN_1 = new Cuadro(Sprite.CITY_DOWN_1);  
  public static final Cuadro CITY_DOWN_2 = new Cuadro(Sprite.CITY_DOWN_2);
  public static final Cuadro CITY_DOWN_3  = new Cuadro(Sprite.CITY_DOWN_3);
  public static final Cuadro CITY_DOWN_4  = new Cuadro(Sprite.CITY_DOWN_4);
  public static final Cuadro CITY_DOWN_5 = new Cuadro(Sprite.CITY_DOWN_5);
  public static final Cuadro MOON_OBS = new Cuadro(Sprite.MOON_OBS);
  
  public static final Cuadro PLANTA_OBS_VOLT_1 = new Cuadro(Sprite.PLANTA_OBS_VOLT_1);
  public static final Cuadro PLANTA_OBS_VOLT_2  = new Cuadro(Sprite.PLANTA_OBS_VOLT_2);
  public static final Cuadro PLANTA_OBS_VOLT_3 = new Cuadro(Sprite.PLANTA_OBS_VOLT_3);
  
  public static final Cuadro PLANTA_OBS_UP_1 = new Cuadro(Sprite.PLANTA_OBS_UP_1);
  public static final Cuadro PLANTA_OBS_UP_2 = new Cuadro(Sprite.PLANTA_OBS_UP_2);
  public static final Cuadro PLANTA_OBS_UP_3 = new Cuadro(Sprite.PLANTA_OBS_UP_3);
  
  public static final Cuadro PLANTA_NOR_VOLT_1 = new Cuadro(Sprite.PLANTA_NOR_VOLT_1);
  public static final Cuadro PLANTA_NOR_VOLT_2 = new Cuadro(Sprite.PLANTA_NOR_VOLT_2);
  public static final Cuadro PLANTA_NOR_VOLT_3 = new Cuadro(Sprite.PLANTA_NOR_VOLT_3);

  public static final Cuadro SKY_LIGHT_1  = new Cuadro(Sprite.SKY_LIGHT_1);
  public static final Cuadro SKY_LIGHT_2  = new Cuadro(Sprite.SKY_LIGHT_2);
  
  public static final Cuadro SKY_DARK_1 = new Cuadro(Sprite.SKY_DARK_1);
  public static final Cuadro SKY_DARK_2 = new Cuadro(Sprite.SKY_DARK_2);
  
  public static final Cuadro PLANTA_NOR_UP_1 = new Cuadro(Sprite.PLANTA_NOR_UP_1);
  public static final Cuadro PLANTA_NOR_UP_2 = new Cuadro(Sprite.PLANTA_NOR_UP_2);
  public static final Cuadro PLANTA_NOR_UP_3  = new Cuadro(Sprite.PLANTA_NOR_UP_3);
  
  public static final Cuadro PURPLE = new Cuadro(Sprite.PURPLE);  
  public static final Cuadro BLUE = new Cuadro(Sprite.BLUE);
  //fin coleccion
  
  public Cuadro(Sprite sprite){
    this.sprite=sprite;
  }
  
  public void mostrar(int x, int y, Pantalla pantalla){
    pantalla.mostrarCuadro(x << 5, y << 5, this);
  }
  
  public boolean solido(){
    return false;
  }
  
}
