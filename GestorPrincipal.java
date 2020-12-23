package principal;
public class GestorPrincipal{

  private boolean enFuncionamiento = false;
  private String titulo;
  private int ancho;
  private int largo; //alto
  
  private SuperficieDibujo sd;
  private Ventana ventana;
  private GestorEstados ge;
    
  private GestorPrincipal(final String titulo, final int ancho, final in largo){
    this.titulo = titulo;
    this.ancho = ancho;
    this.largo = largo;
    
  }
  
  public static void main(String[] args){
    GestorPrincipal gp = new GestorPrincipal("Math or Die", 640,360);
    
    gp.iniciarJuego();
    gp.iniciarBuclePrincipal();
  }
  
  private void iniciarJuego(){
    enFuncionamiento = true;
    inicializar();
  }
  
  private void inicializar(){
    sd = new SuperficieDibujo(ancho, largo);
    ventana = new Ventana(titulo, sd);
    ge = new GestorEstados();
  }
  
  private void iniciarBuclePrincipal(){
    int aps = 0;
    int fps = 0;
    final int NSxS = 1000000000;
    final int APS_OBJETIVO = 60;
    final double NSxAPS = NSxS/APS_OBJETIVO;
    
    long referenciaActualizacion = System.nanoTime();
    long referenciaContador = System.nanoTime();
    
    double tiempoTranscurrido;
    double delta = 0;
    
    
    while(enFuncionamiento){
      final long inicioBucle = System.nanoTime();
      tiempoTranscurrido = inicioBucle - referenciaActualizacion;
      referenciaActualizacion = inicioBucle;
      delta += tiempoTranscurrido/NSxAPS;
      while(delta >= 1){
        actualizar();
        aps++;
        delta--;
      }
      dibujar();
      fps++;
      if(System.nanoTime() - referenciaContador > NSxS){
        System.out.println("FPS: "+fps+"APS: "+aps);
        ventana.setTitle(NOMBRE + " || APS: " + aps + " || FPS: " + fps);
        aps = 0;
        fps = 0;
        referenciaContador = System.nanoTime();
      }
    }
  }
  
  private void actualizar(){
    GestorControles.teclado.actualizar();
    ge.actualizar();
  }
  
  private void dibujar(){
    sd.dibujar(ge);
  }
}
