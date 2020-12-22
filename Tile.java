package principal.mapas;
import principal.sprites.Sprite2;

public class Tile{
  private final Sprite sprites;
  private final int id;
  private boolean solido;
  public Tile(final Sprite sprite, final int id){
    this.sprite = sprite;
    this.id = id;
    solido = false;
  }
  public Tile(final Sprite sprite, final int id, final boolean solido){
    this.sprite = sprite;
    this.id = id;
    this.solido = solido;
  }
  public Sprite getSprite(){
    return sprite;
  }
  public int obtenerId(){
    return id;
  }
  public void establecerSolidos(final boolean solido){
    this.solido = solido;
  }
  public Rectangle getLimites(final in x, final int y){
    return new Rectangle(x, y, sprite.getAncho(), sprite.getLargo());
  }
}
