public abstract class Mapa{
    protected int ancho;
    protected int alto;
    protected int[] cuadros;
    protected Cuadro[] cuadrosCatalogo;
    public Mapa(int ancho, int alto){
	this.ancho = ancho;
	this.alto = alto;
	cuadros = new int[ancho * alto];
	generarMapa();
    }
    public Mapa(String ruta){
	cargarMapa(ruta);
	generarMapa();
    }
    protected void generarMapa(){
	    
    }

    protected void cargarMapa(String ruta){
	    
    }

    public void actualizar(){

    }
    public void mostrar(final int compensacionX, final int compensacionY, final Pantalla pantalla) {
	pantalla.estableceDiferencia(compensacionX, compensacionY);
	int o = compensacionX >> 5;
	int e = (compensacionX + pantalla.getAncho() + Cuadro.LADO) >> 5;
	int n = compensacionY >> 5;
	int s = (compensacionY + pantalla.getAlto() + Cuadro.LADO) >> 5;
	for(int y = n; y < s; y++){
	    for(int x = o; x < e; x++){
		if(x < 0 || y < 0 || x >= ancho || y >= alto){
		    Cuadro.VACIO.mostrar(x, y, pantalla);
		}else{
		    cuadrosCatalogo[x + y * ancho].mostrar(x, y, pantalla);
		}
	    }
	}
    }
    public Cuadro getCuadro(final int x, final int y){
	if(x < 0 || y < 0 || x >= ancho || y >= alto){
	    return Cuadro.VACIO;
	}
	switch (cuadros[x + y * ancho]){
	case 0: return Cuadro.SKY_1;
	case 1: return Cuadro.SKY_2;
	case 2: return Cuadro.SKY_3;
	case 3: return Cuadro.SKY_4;
	case 4: return Cuadro.CITY_1;
	case 5: return Cuadro.CITY_2;
	case 6: return Cuadro.CITY_3;
	case 7: return Cuadro.CITY_4;
	case 8: return Cuadro.CITY_5;
	case 9: return Cuadro.CIRCLE_SKY_1;
	case 10: return Cuadro.CIRCLE_SKY_2;
	case 11: return Cuadro.CIRCLE_SKY_3;
	case 12: return Cuadro.CIRCLE_SKY_4;
	case 13: return Cuadro.SKY;
	case 14: return Cuadro.PURPLE;
	case 15: return Cuadro.ESQUINA_DARK_1;
	case 16: return Cuadro.ESQUINA_DARK_2;
	case 17: return Cuadro.ESQUINA_DARK_3;
	case 18: return Cuadro.ESQUINA_LIGHT_1;
	case 19: return Cuadro.ESQUINA_LIGHT_2;
	case 20: return Cuadro.ESQUINA_LIGHT_3;
	case 21: return Cuadro.ESQUINA_LIGHT_MOR_1;
	case 22: return Cuadro.ESQUINA_LIGHT_MOR_2;
	case 23: return Cuadro.ESQUINA_LIGHT_MOR_3;
	case 24: return Cuadro.ESQUINA_DARK_AZ_1;
	case 25: return Cuadro.ESQUINA_DARK_AZ_2;
	case 26: return Cuadro.ESQUINA_DARK_AZ_3;
	case 27: return Cuadro.LADO_DARK_1;
	case 28: return Cuadro.LADO_DARK_2;
	case 29: return Cuadro.LADO_LIGHT;
	case 30: return Cuadro.LADO_LIGHT_MOR_1;
	case 31: return Cuadro.LADO_LIGHT_MOR_2;
	case 32: return Cuadro.LADO_DARK_AZ;
	default: return Cuadro.VACIO;
	}
    }
}
