package principal.maquinaestado.estados.juego;
import java.awt.Graphics;

public class GestorJuego implements EstadoJuego{
  private GestorMapa gestorMapa;
  //String texto = CargadorRecursos.LeerArchivoTexto("Aqui va la liga del texto en carpetas");
  Mapa mapa = new Mapa("\\Ruta");
  
  public void actualizar(){
  }
  public void dibujar(Graphics g){
    mapa.dibujar(g);
  }
}
