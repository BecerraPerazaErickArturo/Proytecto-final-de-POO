package principal.mapas;
omport principal.herramientas.CargadorRecursos;

public class Mapa{
  private int ancho;
  private int largo;
  private String[] partes;
  public Mapa(final String ruta){
    String contenido = CargadorRecursos.LeerArchivoTexto(ruta);
    partes = contenido.split("*");
  }
  public void escribirArray(){
    for(int i = 0; i < partes.length; i++){
      System.out.println(partes[i]);
    }
  }
}
