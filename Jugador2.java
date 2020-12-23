package principal.entes;

public class Jugador2{
  private double posicionX;
  private double posicionY;
  private Sprite sprite;
  public Jugador(double posicionX, double posicionY){
    this.posicionX = posicionX;
    this.posicionY = posicionY;
  }
  public void dibujar(Graphics g){
    final int centroX = Constantes.ANCHO_PANTALLA / 2 - Constantes.LADO_SPRITE / 2;
    final int centroY = Constantes.LARGO_PANTALLA / 2 - Constantes.LADO_SPRITE / 2;
    g.setColor(Color.white);
    g.fillRect(centroX, centroY, Constantes.LADO_SPRITE, Constantes.LADO_SPRITE);
  }
  public void establecerPosicionX(double posicionX){
    this.posicionX = posicionX;
  }
  public void establecerPosicionY(double posicionY){
    this.posicionY = posicionY;
  }
  public double getPosicionX(){
    return posicionX;
  }
  public double getPosicionY(){
    return posicionY;
  }
}
