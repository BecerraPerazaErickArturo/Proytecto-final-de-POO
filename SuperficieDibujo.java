package principal.graficos;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferStrategy;
import principal.control.Teclado;

public class SuperficieDibujo extends Canvas{
  private static final long serialVersionUID = -6227038142688953660L;
  private int ancho;
  private int largo;
  private Teclado teclado;
  public SuperficieDibujo(final int ancho, final int largo){
    this.ancho = ancho;
    this.largo = largo;
    teclado = new Teclado();
    setIgnoreRepaint(true);
    setPreferredSize(new Dimension(ancho, largo));
    addKeyListener(teclado);
    setFocusable(true);
    requestFocus();
  }
  public void dibujar(final GestorEstados ge){
    BufferStrategy buffer = getBufferStrategy();
    if(buffer == null){
      createBufferStrategy(3);
      return ;
    }
    Graphics g = buffer.getDrawGraphics();
    g.setColor(Color.black);
    g.fillRect(0, 0, ancho, largo);
    ge.dibujar(g);
    Toolkit.getDefaultToolkit().sync();
    g.dispose();
    buffer.show();
  }
  public Teclado getTeclado(){
    return teclado;
  }
  public int getAncho(){
    return ancho;
  }
  public it getLargo(){
    return largo;
  }
}
