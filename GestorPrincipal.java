//package principal;

public class GestorPrincipal{

  private boolean enFuncionamiento = false;
  private String titulo;
  private int ancho;
  private int largo; //alto
  
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
  
  private gp.iniciarBuclePrincipal(){
  }
  
}
