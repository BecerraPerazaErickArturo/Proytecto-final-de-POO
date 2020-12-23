package principal.graficos;
import javax.swing.JFrame;

public class Ventana extends JFrame{
  private static final long serialVersionUID = 59794217777239930009L;
  private String titulo;
  private final ImageIcon icono;
  
  public Ventana(final String titulo, final SuperficieDibujo sd){
    this.titulo = titulo;
    
    BufferedImage imagen = CargadorRecursos.cargarImagenCompatibleTranslucida("/imagenes/iconos/nombreIcono.png");
    this.icono = new ImageIcon(imagen);
    
    configuracionVentana(sd);
  
  }
  
  private void configurarVentana(final SuperficiDibujo sd){
    setTitle(titulo);
    setIconImage(icono.getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    //setIconImage();
    setLayout(new BorderLlayout());
    add(sd, BorderLayout.CENTER);
    //setUndecorated(true);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
