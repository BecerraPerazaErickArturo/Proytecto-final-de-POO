package principal.mapas;
omport principal.herramientas.CargadorRecursos;

public class Mapa{
  String contenido;
  public Mapa(final String ruta){
    this.contenido = CargadorRecursos.LeerArchivoTexto(ruta);
  }
}
