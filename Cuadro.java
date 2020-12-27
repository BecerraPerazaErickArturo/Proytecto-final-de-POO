public class Cuadro {
	public int x;
	public int y;

	public Sprite sprite;

	public static final int LADO = 32;

	// Colección de cuadros
	public static final Cuadro  SKY_1 = new Cuadro(Sprite.SKY_1);
	public static final Cuadro  SKY_2= new Cuadro(Sprite.SKY_2);
	public static final Cuadro  SKY_3= new Cuadro(Sprite.SKY_3);
	public static final Cuadro  SKY_4= new Cuadro(Sprite.SKY_4);

	public static final Cuadro  CITY_1= new Cuadro(Sprite.CITY_1);
	public static final Cuadro  CITY_2= new Cuadro(Sprite.CITY_2);
	public static final Cuadro  CITY_3= new Cuadro(Sprite.CITY_3);
	public static final Cuadro  CITY_4= new Cuadro(Sprite.CITY_4);
	public static final Cuadro  CITY_5= new Cuadro(Sprite.CITY_5);

	public static final Cuadro  CIRCLE_SKY_1= new Cuadro(Sprite.CIRCLE_SKY_1);
	public static final Cuadro  CIRCLE_SKY_2= new Cuadro(Sprite.CIRCLE_SKY_2);
	public static final Cuadro  CIRCLE_SKY_3= new Cuadro(Sprite.CIRCLE_SKY_3);
	public static final Cuadro  CIRCLE_SKY_4= new Cuadro(Sprite.CIRCLE_SKY_4);

	public static final Cuadro  SKY= new Cuadro(Sprite.SKY);
	public static final Cuadro  PURPLE= new Cuadro(Sprite.PURPLE);

	public static final Cuadro  ESQUINA_DARK_1= new Cuadro(Sprite.ESQUINA_DARK_1);
	public static final Cuadro  ESQUINA_DARK_2= new Cuadro(Sprite.ESQUINA_DARK_2);
	public static final Cuadro  ESQUINA_DARK_3= new Cuadro(Sprite.ESQUINA_DARK_3);

	public static final Cuadro  ESQUINA_LIGHT_1= new Cuadro(Sprite.ESQUINA_LIGHT_1);
	public static final Cuadro  ESQUINA_LIGHT_2= new Cuadro(Sprite.ESQUINA_LIGHT_2);
	public static final Cuadro  ESQUINA_LIGHT_3= new Cuadro(Sprite.ESQUINA_LIGHT_3);

	public static final Cuadro  ESQUINA_LIGHT_MOR_1= new Cuadro(Sprite.ESQUINA_LIGHT_MOR_1);
	public static final Cuadro  ESQUINA_LIGHT_MOR_2= new Cuadro(Sprite.ESQUINA_LIGHT_MOR_2);
	public static final Cuadro  ESQUINA_LIGHT_MOR_3= new Cuadro(Sprite.ESQUINA_LIGHT_MOR_3);

	public static final Cuadro  ESQUINA_DARK_AZ_1= new Cuadro(Sprite.ESQUINA_DARK_AZ_1);
	public static final Cuadro  ESQUINA_DARK_AZ_2= new Cuadro(Sprite.ESQUINA_DARK_AZ_2);
	public static final Cuadro  ESQUINA_DARK_AZ_3= new Cuadro(Sprite.ESQUINA_DARK_AZ_3);

	public static final Cuadro  LADO_DARK_1= new Cuadro(Sprite.LADO_DARK_1);
	public static final Cuadro  LADO_DARK_2= new Cuadro(Sprite.LADO_DARK_2);

	public static final Cuadro  LADO_LIGHT= new Cuadro(Sprite.LADO_LIGHT);

	public static final Cuadro  LADO_LIGHT_MOR_1= new Cuadro(Sprite.LADO_LIGHT_MOR_1);
	public static final Cuadro  LADO_LIGHT_MOR_2= new Cuadro(Sprite.LADO_LIGHT_MOR_2);

	public static final Cuadro  LADO_DARK_AZ= new Cuadro(Sprite.LADO_DARK_AZ);

	// Fin de la colección de cuadros

	public Cuadro(Sprite sprite) {
		this.sprite = sprite;
	}

	public void mostrar(int x, int y, Pantalla pantalla) {
		pantalla.mostrarCuadro(x << 5, y << 5, this);
	}

	public boolean solido() {
		return false;
	}
}
