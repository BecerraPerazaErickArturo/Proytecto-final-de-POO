import java.util.*;

public class MapaGenerado extends Mapa{
  private final Random aleatorio = new Random();
  public MapaGenerado(int ancho, int largo){
    super(ancho, largo);
   }
   protected void generarMapa(){
      for(int y = 0; y < largo; y++){
        for(int x = 0; x < ancho; x++){
          cuadros[x + y * ancho] = aleatorio.nextInt(3);
        }
      }
    }
}
