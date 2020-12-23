package principal.entes;

public class Jugador{
  private double posicionX;
  private double posicionY;
  private char direccion;
  private HojaSprites hs;
  private BufferedImage imagenActual;
  public Jugador(double posicionX, double posicionY){
    this.posicionX = posicionX;
    this.posicionY = posicionY;
    direccion = 's';
    hs = new HojaSprites("ruta", Constantes.LADO_SPRITE, false);
    imagenActual = hs.getSsprite(0).getImagen();
  }
  public void actualizar(){
    ///Al restar se vuleve mas lento y al sumar mas rapido en esta serie de If's
    if(GestorControl.teclado.pulsadoArriba()){
      direccion = 'n';
      animar();
      posicionY -= 1;
    }
    if(GestorControl.teclado.pulsadoAbajo()){
      direccion = 's';
      animar();
      posicionY += 1;
    }
    if(GestorControl.teclado.pulsadoIzquierda()){
      direccion = 'w';
      animar();
      posicionX -= 1;
    }
    if(GestorControl.teclado.pulsadoIzquierda()){
      direccion = 'e';
      animar();
      posicionX += 1;
    }
  }
  public void animar(){
    switch(direccion){
      case 'n':
        imagenActual = hs.getSprite(1, 0).getImagen();
        break;
      case 's':
        imagenActual = hs.getSprite(0, 0).getImagen();
        break;
      case 'w':
        imagenActual = hs.getSprite(3, 0).getImagen();
        break;
      case 'e':
        imagenActual = hs.getSprite(2, 0).getImagen();
        break;
      default:
    }
  }
  public void dibujar(Graphics g){
    final int centroX = Constantes.ANCHO_PANTALLA / 2 - Constantes.LADO_SPRITE / 2;
    final int centroY = Constantes.LARGO_PANTALLA / 2 - Constantes.LADO_SPRITE / 2;
    g.setColor(Color.green);
    g.drawImage(imagenActual, centroX, centroY, null);
    //Afinar el cuadrado a los margenes del personaje
    g.drawRect(centroX, centroY, 18, 32);
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
