package ejercicio2;

public class Libro {

	String autor;
	String titulo;
	int ejemplares;
	int prestados; 
	
	enum Genero{
		Narrativo,
		Lírico,
		Dramático,
		Didáctico,
		Poético
	};
	
	Genero genero;
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Libro(String autor, String titulo, int prestados, int ejemplares, String genero) {
		super();
		this.autor=autor;
		this.titulo=titulo;
		this.ejemplares=ejemplares;
		this.prestados=prestados;
		this.genero=Genero.valueOf(genero);
		
	}
	
	public boolean prestamo() {
		boolean concedido = false;
		if(ejemplares>prestados) {
			prestados++;
			concedido=true;
		}
		return concedido;
	}
	
	public void devolverPrestamo() {
		if(prestados>0&&prestados<=ejemplares) {
			prestados--;
		
		}
	}


	public int getEjemplares() {
		return ejemplares;
	}



	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}



	public int getPrestados() {
		return prestados;
	}



	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}



	public Genero getGenero() {
		return genero;
	}



	public void setGenero(Genero genero) {
		this.genero = genero;
	}



	@Override
	public String toString() {
		return "->Título: " + titulo + " Autor: " + autor + " Ejemplares: "
				+ ejemplares + " Prestados: " + prestados + " Género: " + genero;
	}
	
	
}
