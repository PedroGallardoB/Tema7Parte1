package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nuevaCoordX;
		int nuevaCoordY;
		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		Punto punto = new Punto(1, 3);
		Punto puntoComparado = new Punto(0, 0);
		Punto puntoRes;

		while (opcion != 5) {

			System.out.println("PUNTOS:");
			System.out.println("1)IMPRIMIR EL PUNTO");
			System.out.println("2)MODIFICAR EL PUNTO");
			System.out.println("3)MOVER EL PUNTO");
			System.out.println("4)DISTANCIA A OTRO PUNTO");
			System.out.println("5)FIN DEL PROGRAMA");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1 -> {
				System.out.print("Coordenadas del punto: ");
				punto.imprime();

			}

			case 2 -> {
				System.out.println("Introduzca la nueva coordenada X");
				nuevaCoordX = sc.nextInt();
				System.out.println("Introduzca la nueva coordenada Y");
				nuevaCoordY = sc.nextInt();
				punto.setXY(nuevaCoordX, nuevaCoordY);
			}

			case 3 -> {
				System.out.println("Introduzca las unidades a mover de X");
				nuevaCoordX = sc.nextInt();
				System.out.println("Introduzca las unidades a mover de Y");
				nuevaCoordY = sc.nextInt();
				punto.desplaza(nuevaCoordX, nuevaCoordY);
			}

			case 4 -> {
				System.out.println("Introduzca la coordenada X del punto a comparar");
				nuevaCoordX = sc.nextInt();
				System.out.println("Introduzca la coordenada Y del punto a comparar");
				nuevaCoordY = sc.nextInt();
				puntoComparado.setXY(nuevaCoordX, nuevaCoordY);
				puntoRes = punto.distancia(puntoComparado);
				System.out.print("La distancia resultado es " + " ");
				puntoRes.imprime();
			}

			case 5 -> {
				System.out.println("Fin del programa");
			}

			default -> {
				System.out.println("Opción no válida");
			}

			}

		}

		sc.close();

	}

}
