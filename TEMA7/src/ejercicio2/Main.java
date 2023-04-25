package ejercicio2;

import java.util.Scanner;

import ejercicio2.Libro.Genero;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String generoLibro1;
		String generoLibro2;
		Libro libroElegido= new Libro();
		System.out.println("GÉNEROS:"
				+ "	Narrativo,\r\n"
				+ "		Lírico,\r\n"
				+ "		Dramático,\r\n"
				+ "		Didáctico,\r\n"
				+ "		Poético");
		System.out.println();
		System.out.println("Elige género para el libro 1:");
		generoLibro1=sc.nextLine();
		Libro libro1 = new Libro("Antonia", "La Macarena", 5, 9, generoLibro1);
		System.out.println(libro1.toString());
		System.out.println("Elige género para el libro 2:");
		generoLibro2=sc.nextLine();
		Libro libro2 = new Libro("Morgan Freeman", "La Biblia", 2, 5, generoLibro2);
		System.out.println(libro2.toString());
		int opcion = 0;
	
		System.out.println("///ELIJA UNO DE LOS LIBROS///");
		System.out.println("1" + libro1.toString());
		System.out.println("2" + libro2.toString());
	
		opcion = sc.nextInt();
		switch (opcion) {
		case 1 -> {
			libroElegido = libro1;
		}
		case 2 -> {
			libroElegido = libro2;
		}
		default -> {
			System.err.println("OPCIÓN NO VÁLIDA");
		}
		}

		opcion = 0;

		while (opcion != 3) {
			System.out.println("///ELIJA 1 PARA DEVOLVER, 2 PARA PEDIR PRESTADO, 3 para salir///");

			opcion = sc.nextInt();
			switch (opcion) {
			case 1 -> {
				libroElegido.devolverPrestamo();
				System.out.println("Hay " + libroElegido.getEjemplares() + " ejemplares y "
						+ libroElegido.getPrestados() + " prestados.");
			}
			case 2 -> {
				libroElegido.prestamo();
				System.out.println("Hay " + libroElegido.getEjemplares() + " ejemplares y "
						+ libroElegido.getPrestados() + " prestados.");
			}

			case 3 -> {
				System.out.println("FIN DEL PROGRAMA");
			}

			default -> {
				System.err.println("OPCIÓN NO VÁLIDA");
			}
			}
		}

		sc.close();
	}
}
