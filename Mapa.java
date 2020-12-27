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
	int e = (compensacionX + pantalla.obtenAncho() + Cuadro.LADO) >> 5;
	int n = compensacionY >> 5;
	int s = (compensacionY + pantalla.obtenAlto() + Cuadro.LADO) >> 5;
	for (int y = n; y < s; y++){
	    for (int x = o; x < e; x++){
		if (x < 0 || y < 0 || x >= ancho || y >= alto){
		    Cuadro.VACIO.mostrar(x, y, pantalla);
		}else{
		    cuadrosCatalogo[x + y * ancho].mostrar(x, y, pantalla);
		}
	    }
	}
    }
    public Cuadro obtenCuadro(final int x, final int y){
	if (x < 0 || y < 0 || x >= ancho || y >= alto){
	    return Cuadro.VACIO;
	}
	switch (cuadros[x + y * ancho]){
	case 0:
		return Cuadro.SKY_1;
		break;
	case 1:
		return Cuadro.SKY_2;
		break;
	case 2:
		return Cuadro.SKY_3;
		break;
	case 3:
		return Cuadro.SKY_4;
		break;
	case 4:
		return Cuadro.CITY_1;
		break;
	case 5:
		return Cuadro.CITY_2;
		break;
	case 6:
		return Cuadro.CITY_3;
		break;
	case 7:
		return Cuadro.CITY_4;
		break;
	case 8:
		return Cuadro.CITY_5;
		break;
	case 9:
		return Cuadro.CIRCLE_SKY_1;
		break;
	case 10:
		return Cuadro.CIRCLE_SKY_2;
		break;
	case 11:
		return Cuadro.CIRCLE_SKY_3;
		break;
	case 12:
		return Cuadro.CIRCLE_SKY_4;
		break;
	case 13: 
		return SKY;
		break;
	case 14: 
		return PURPLE;
		break;
	case 15: 
		return ESQUINA_DARK_1;
		break;
	case 16: 
		return ESQUINA_DARK_2;
		break;
	case 17: 
		return ESQUINA_DARK_3;
		break;
	case 18: 
		return ESQUINA_LIGHT_1;
		break;
	case 19: 
		return ESQUINA_LIGHT_2;
		break;
	case 20: 
		return ESQUINA_LIGHT_3;
		break;
	case 21: 
		return ESQUINA_LIGHT_MOR_1;
		break;
	case 22: 
		return ESQUINA_LIGHT_MOR_2;
		break;
	case 23: 
		return ESQUINA_LIGHT_MOR_3;
		break;
	case 24: 
		return ESQUINA_DARK_AZ_1;
		break;
	case 25: 
		return ESQUINA_DARK_AZ_2;
		break;
	case 26: 
		return ESQUINA_DARK_AZ_3;
		break;
	case 27: 
		return LADO_DARK_1;
		break;
	case 28: 
		return LADO_DARK_2;
		break;
	case 29: 
		return LADO_LIGHT;
		break;
	case 30: 
		return LADO_LIGHT_MOR_1;
		break;
	case 31: 
		return LADO_LIGHT_MOR_2;
		break;
	case 32: 
		return LADO_DARK_AZ;
		break;
	default:
	    return Cuadro.VACIO;
	}
    }
}
