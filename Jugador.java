public class Jugador extends Criatura{
	private Teclado teclado;
	private int animacion;
	public Jugador(Teclado teclado, Sprite sprite){
		this.teclado = teclado;
		this.sprite = sprite;
	}
	public Jugador(Teclado teclado, Sprite sprite, int posicionX, int posicionY){
		this.teclado = teclado;
		this.sprite = sprite;
		this.x = posicionX;
		this.y = posicionY;
	}
	public void actualizar(){
		int desplazamientoX = 0;
		int desplazamientoY = 0;
		int velocidadMovimiento = 1;
		if (animacion < 32767){
			animacion++;
		}else{
			animacion = 0;
		}
		if(teclado.correr){
			velocidadMovimiento = 2;
		}
		if(teclado.arriba){
			desplazamientoY -= velocidadMovimiento;
		}
		if(teclado.abajo){
			desplazamientoY += velocidadMovimiento;
		}
		if(teclado.izquierda){
			desplazamientoX -= velocidadMovimiento;
		}
		if(teclado.derecha){
			desplazamientoX += velocidadMovimiento;
		}
		if(desplazamientoX != 0 || desplazamientoY != 0){
			mover(desplazamientoX, desplazamientoY);
			enMovimiento = true;
		}else{
			enMovimiento = false;
		}
		int resto = animacion % 40;
		if(direccion == 'n'){
			sprite = Sprite.MAGO_ATRAS_1;
			if(enMovimiento){
				if(resto > 10 && resto <= 20){
					sprite = Sprite.MAGO_ATRAS_2;
				}else if(resto > 20 && resto <= 30){
					sprite = Sprite.MAGO_ATRAS_1;
				}else if(resto > 30){
					sprite = Sprite.MAGO_ATRAS_3;
				}else{
					sprite = sprite.MAGO_ATRAS_1;
				}
			}
		}
		if(direccion == 's'){
			sprite = Sprite.MAGO_FRENTE_1;
			if(enMovimiento){
				if(resto > 10 && resto <= 20){
					sprite = Sprite.MAGO_FRENTE_2;
				}else if(resto > 20 && resto <= 30){
					sprite = Sprite.MAGO_FRENTE_1;
				}else if(resto > 30){
					sprite = Sprite.MAGO_FRENTE_3;
				}else{
					sprite = sprite.MAGO_FRENTE_1;
				}
			}
		}
		if(direccion == 'o'){
			sprite = Sprite.MAGO_IZ_1;
			if(enMovimiento){
				if(resto > 10 && resto <= 20){
					sprite = Sprite.MAGO_IZ_2;
				}else if(resto > 20 && resto <= 30){
					sprite = Sprite.MAGO_IZ_1;
				}else if(resto > 30){
					sprite = Sprite.MAGO_IZ_3;
				}else{
					sprite = sprite.MAGO_IZ_1;
				}
			}
		}
		if(direccion == 'e'){
			sprite = Sprite.MAGO_DER_1;
			if(enMovimiento){
				if(resto > 10 && resto <= 20){
					sprite = Sprite.MAGO_DER_2;
				}else if(resto > 20 && resto <= 30){
					sprite = Sprite.MAGO_DER_1;
				}else if(resto > 30){
					sprite = Sprite.MAGO_DER_3;
				}else{
					sprite = sprite.MAGO_DER_1;
				}
			}
		}
	}
	public void mostrar(Pantalla pantalla){
		pantalla.mostrarJugador(x, y, this);
	}
}