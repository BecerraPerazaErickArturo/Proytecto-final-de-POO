package principal.maquinaestado.estados.juego;
import java.awt.Graphics;

public class GestorJuego implements EstadoJuego{
  private GestorMapa gestorMapa;
  String texto = CargadorRecursos.LeerArchivoTexto("Aqui va la liga del texto en carpetas");
  public void actualizar(){
  }
  public void dibujar(Graphics g){
    g.setColor(Color.white);
    g.drawString(texto, 10, 10);
  }
}
