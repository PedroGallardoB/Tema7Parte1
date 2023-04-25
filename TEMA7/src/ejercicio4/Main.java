package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eleccion;
		Articulo articulo = new Articulo("Cafetera", 20, 40, "Electrónica");
		System.out.println(articulo.getPVP());
		System.out.println(articulo.getPVPDescuento(0.3));
		articulo.almacenar(50);
		articulo.vender(40);
		System.out.println("Cantidad: " + articulo.getCantidad());
		System.out.println(articulo.toString());
		System.out.println("Cambia el departamento:");
		System.out.println("Alimentación, Electrónica o Droguería, elige uno");
		eleccion=sc.nextLine();
		articulo.setDepartamento(eleccion);
		System.out.println(articulo.toString());
		sc.close();
	}

}