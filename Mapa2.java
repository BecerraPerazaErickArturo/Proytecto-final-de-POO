package principal.mapas;
omport principal.herramientas.CargadorRecursos;

public class Mapa{
  private String[] partes;
  private final int ancho;
  private final int largo;
  private final Sprite[] paleta;
  private final boolean[] colisiones;
  private final int[] sprites;
  public Mapa(final String ruta){
    String contenido = CargadorRecursos.LeerArchivoTexto(ruta);
    partes = contenido.split("\\*");
    ancho = Integer.parseInt(partes[0]);
    largo = Integer.parseInt(partes[1]);
    String hojasUtilizadas = partes[2];
    String[] hojasSeparadas = hojasUtilizadas.split(",");
    String paletaEntera = partes[3];
    String partesPaleta = paletaEntera.split("#");
    paleta = asignarSprites(partesPaleta, hojasSeparadas);
    String colisionesEnteras = partes[4];
    colisiones = extraerColisiones(colisionesEnetras);
    String spritesEnteros = partes[5];
    String cadenasSprites = spritesEneteros.split(" ");
    sprites = extraerSprites(cadenaSprites);
  }
  private Sprite[] asignarSprites(final String[] partesPaleta, final String[] hojasSeparadas){
    Sprite[] paleta = new Sprite[partesPaleta.length];
    HojaSprites hoja = new HojaSprites("ruta" + HojasSeparadas[0] + ".png", 32, false);
    for(int i = 0; i < partesPaleta.length; i++){
      String spriteTemporal = partesPaleta[i];
      String[] partesSprite = spriteTemporal.split("-");
      int indicePaleta = Integer.parseInt(partesSprite[0]);
      int indiceSpriteHoja = Integer.parseInt(partesSprite[2]);
      paleta[indicePaleta] = hoja.getSprite(indiceSpriteHoja);
    }
    return paleta;
  }
  private boolean[] extraerColisiones(final String cadenaColisiones){
    boolean[] colisiones = new boolean[cadenaColisiones.length()];
    for(int i = 0; i < colisiones.length(); i++){
      if(cadenaColisiones.charAt(i) == '0'){
        colisiones[i] = false;
      }else{
        colisiones[i] = true;
      }
      return colisiones;
    }
  }
  private int[] extraerSprites(final String[] cadenaSprites){
    ArrayList<Integer> sprites = new ArrayList<Integer>();
    for(int i = 0; i < cadenaSprites.length; i++){
      if(cadenaSsprites[i].lengt() == 2){
        sprites.add(Integer.parseInt(cadenaSprites[i]));
    }else{
      String uno = "";
      String dos = "";
      String error = cadenaSprites[i];
      uno += error.charAt(0);
      uno += error.charAt(1);
      dos += error.charAt(0);
      dos += error.charAt(1);
      sprites.add(Integer.parseInt(uno));
      sprites.add(Integer.parseInt(dos));
      }
    }
    int[] vectorSprites = new int[sprites.size()];
    for(int i = ; i < sprites.size(); i++){
      vectorSprites[i] = sprites.get(i);
    }
    return vectorSprites;
  }
}
