//package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MapaCargado extends Mapa{

  private int[] pixeles;
  
  public MapaCargado(String ruta){
    super(ruta);
  }
  
  protected void cargarMapa(String ruta){
    BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
    
    ancho = imagen.getWidth();
    largo = imagen.getHeight();
    
    cuadrosCatalogo = new Cuadro[ancho*largo];
    pixeles = new int[ancho*largo];
    
    imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
      
    } catch (IOException e){
        e.printStackTrace();
   }
  
  protected void generarMapa(){
    for(int i=0; i< pixeles.lenght; i++){
      switch(pixeles[i]){
          case 0xffbcaffd: cuadrosCatalogo[i] = Cuadro.CITY_UP_1;
				          continue;
          case 0xff9448cb: cuadrosCatalogo[i] = Cuadro.PLANTA_OBS_VOLT_1;
                  continue;
          case 0xff860334: cuadrosCatalogo[i] = Cuadro.MOON_OBS;
                  continue;
          case 0xffe8fd4d: cuadrosCatalogo[i] = Cuadro.PLANTA_OBS_UP_1;
                  continue;
          case 0xff9125f8: cuadrosCatalogo[i] = Cuadro.CITY_UP_2;
                  continue;
          case 0xffa42ff9: cuadrosCatalogo[i] = Cuadro.PLANTA_OBS_VOLT_2;
                  continue;
          case 0xff6806c6: cuadrosCatalogo[i] = Cuadro.CITY_DOWN_1;
                  continue;
          case 0xff1eda02: cuadrosCatalogo[i] = Cuadro.PLANTA_OBS_UP_2;
                  continue;
          case 0xff5b05ad: cuadrosCatalogo[i] = Cuadro.MOON;
                  continue;
          case 0xffa807e9: cuadrosCatalogo[i] = Cuadro.PLANTA_OBS_VOLT_3;
                  continue;
          case 0xffb7069d: cuadrosCatalogo[i] = Cuadro.CITY_DOWN_2;
                  continue;
          case 0xff4e9943: cuadrosCatalogo[i] = Cuadro.PLANTA_OBS_UP_3;
                  continue;
          case 0xff3b3b3b: cuadrosCatalogo[i] = Cuadro.CITY_UP_3;
                  continue;
          case 0xffb7069d: cuadrosCatalogo[i] = Cuadro.CITY_DOWN_3;
                  continue;
          case 0xff1b048f: cuadrosCatalogo[i] = Cuadro.BLUE;
                  continue;
          case 0xfffd4d4f: cuadrosCatalogo[i] = Cuadro.PLANTA_NOR_VOLT_1;
                  continue;
          case 0xff262626: cuadrosCatalogo[i] = Cuadro.CITY_UP_4;
                  continue;
          case 0xff000000: cuadrosCatalogo[i] = Cuadro.CITY_DOWN_4;
                  continue;
          case 0xffd6d6d6: cuadrosCatalogo[i] = Cuadro.CITY_DOWN_5;
                  continue;
          case 0xffda7072: cuadrosCatalogo[i] = Cuadro.PLANTA_NOR_VOLT_2;
                  continue;
          case 0xfff825d9: cuadrosCatalogo[i] = Cuadro.CITY_UP_5;
                  continue;
          case 0xff10e5e3: cuadrosCatalogo[i] = Cuadro.SKY_LIGHT_1;
                  continue;
          case 0xff0f0255: cuadrosCatalogo[i] = Cuadro.SKY_DARK_1;
                  continue;
          case 0xffc4181a: cuadrosCatalogo[i] = Cuadro.PLANTA_NOR_VOLT_3;
                  continue;
          case 0xff0ab805: cuadrosCatalogo[i] = Cuadro.PLANTA_NOR_UP_1;
                  continue;
          case 0xff88f7f6: cuadrosCatalogo[i] = Cuadro.SKY_LIGHT_2;
                  continue;
          case 0xff4724f9: cuadrosCatalogo[i] = Cuadro.SKY_DARK_2;
                  continue;
          case 0xff036847: cuadrosCatalogo[i] = Cuadro.PLANTA_NOR_UP_2;
                  continue;
          case 0xfffd8f4d: cuadrosCatalogo[i] = Cuadro.PLANTA_NOR_UP_3;
                  continue;
          case 0xff3b0363: cuadrosCatalogo[i] = Cuadro.PURPLE;
                  continue;
          default: cuadrosCatalogo[i] = Cuadro.VACIO;//no me acuerdo si esta en minuscula vacio o no
      
      }
    }
  }

}
