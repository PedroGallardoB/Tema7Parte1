package ejercicio3;

public class Punto {
	// Atributos del punto
	private int coordX;
	private int coordY;

	public Punto(int coordX, int coordY) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public void imprime() {
		System.out.println(coordX + "," + coordY);
	}

	public void setXY(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public void desplaza(int añadirX, int añadirY) {
		coordX += añadirX;
		coordY += añadirY;
	}

	public Punto distancia(Punto p) {
		int difX = p.coordX - coordX;
		int difY = p.coordX - coordY;
		Punto puntoRes = new Punto(difX, difY);
		return puntoRes;
	}

}
