package principal.sprites;
import java.awt.image.BufferedImage;

public class HojaSprites2{
  final private int anchoHojaEnPixeles;
  final private int largoHojaEnPixeles;
  final private int anchoHojaEnSprites;
  final private int largoHojaEnSprites;
  final private int anchoSprites;
  final private int largoSprites;
  final private Sprite[] sprites;
  
  public HojaSprites2(final String ruta, final int tamanoSprites, final boolea hojaOpaca){
    BufferedImage imagen;
    if(hojaOpaca){
      imagen = CargadorRecursos.cargarImagenCompatibleOpaca(ruta);
    }else{
      imagen = CargadorRecursos.cargarImagenCompatibleTraslucida(ruta);
    }
    anchoHojaEnPixeles = imagen.getWidth();
    largoHojaEnPixeles = imagen.getHeight();
    anchoHojaEnSprites = anchoHojaEnPixeles / tamanoSprites;
    largoHojaEnSprites = largoHojaEnPixeles / tamanoSprites;
    anchoSprites = tamanoSprites;
    largoSprites = tamanoSprites;
    sprites = new Sprite[anchoHojaEnSprites * largoHojaEnSprites];
    rellenarSpritesDesdeImagen(imagen);
  }
  public HojaSprites2(final String ruta, final int anchoSprites, final int largoSprites, final boolea hojaOpaca){
    BufferedImage imagen;
    if(hojaOpaca){
      imagen = CargadorRecursos.cargarImagenCompatibleOpaca(ruta);
    }else{
      imagen = CargadorRecursos.cargarImagenCompatibleTraslucida(ruta);
    }
    anchoHojaEnPixeles = imagen.getWidth();
    largoHojaEnPixeles = imagen.getHeight();
    anchoHojaEnSprites = anchoHojaEnPixeles / anchoSprites;
    largoHojaEnSprites = largoHojaEnPixeles / largoSprites;
    this.anchoSprites = tamanoSprites;
    this.largoSprites = tamanoSprites;
    sprites = new Sprite[anchoHojaEnSprites * largoHojaEnSprites];
    rellenarSpritesDesdeImagen(imagen);
  }
  private void rellenarSpritesDesdeImagen(final BufferedImage imagen){
    for(int y = 0; y < largoHojaEnSprites; y++){
      for(int x = 0; x < anchoHojaEnSprites; x++){
        final int posicionX = x * anchoSprites;
        final int posicionY = y * largoSprites;
        sprites[x + y *anchoHojaEnSprites] = new Sprite(imagen.getSubimage(posicionX, posicionY, anchoSprites, largoSprites));
      }
    }
  }
  public Sprite getSprite(final int indice){
    return sprites[indice];
  }
  public Sprite getSprite(final int x, final int y){
    return sprites[x + y *anchoSprites];
  }
}
