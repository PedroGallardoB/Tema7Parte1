package ejercicio1;

import java.util.Scanner;

public class Main {
	/**
	 * Guarda el nombre del propietario de la cuenta
	 */
	private static String nombre = "";
	/**
	 * Devuelve el DNI del propietario de la cuenta
	 */
	private static String DNI = "";
	/**
	 * Almacena como string el sexo de la persona
	 */
	private static String sexoStr = "";
	/**
	 * Almacena el saldo de la persona
	 */
	private static double saldo = 0;
	/**
	 * Declaración del objeto scanner
	 */
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion; //Guarda la opción del menú
		double cantidad = 0; //Guarda la cantidad que quieres modificar 
		boolean salir = false;//Controla el bucle del menú 
		CuentaCorriente cuenta = null; //Inicializamos vacía la cuenta

		while (!salir) {//Bucle que contiene el menú y sus funciones
			mostrarMenu();//Muestra el menú
			opcion = sc.nextInt();//Opción elegida del CRUD
			switch (opcion) {//Elige la opción que pide el usuario
			case 1://OPCIÓN 1:
				if (cuenta == null) {//Si no hay cuenta crea una
					cuenta = crearCuenta();
				} else {
					System.out.println("Ya se ha creado una cuenta corriente");//Si ya hay, se comunica al usuario
				}
				break;
			case 2://OPCIÓN 2:
				if (cuenta != null) {//Si hay alguna cuenta muestra su información
					cuenta.MostrarInfo();
				} else {
					System.out.println("No se ha creado ninguna cuenta corriente todavía");// Si no, la creanis
				}
				break;
			case 3://OPCIÓN 3:
				if (cuenta != null) {//Si hay cuenta corriente...
					System.out.println("Introduzca una cantidad");//Pedimos y leemos la cantidad a ingresar
					cantidad=sc.nextDouble();
					cuenta.IngresarDinero(cantidad);//La añadimos
				} else {//De lo contrario indicamos el error
					System.out.println("No se ha creado ninguna cuenta corriente todavía");
				}
				break;
			case 4://OPCIÓN 4:
				if (cuenta != null) {
					System.out.println("Introduzca una cantidad");//Si hay cuenta corriente...
					cantidad=sc.nextDouble();//Pedimos y leemos la cantidad a ingresar
					cuenta.SacarDinero(cantidad);//La sacamos
				} else {//De lo contrario indicamos el error
					System.out.println("No se ha creado ninguna cuenta corriente todavía");
				}
				break;
			case 5://OPCIÓN 5:
				if (cuenta != null) {//Si hay cuenta corriente...
					System.out.println("Introduzca una cantidad");
					cantidad=sc.nextDouble();//Pedimos y leemos la cantidad a actualizar como saldo
					cuenta.setSaldo(cantidad);
				} else {//De lo contrario indicamos el error
					System.out.println("No se ha creado ninguna cuenta corriente todavía");
				}
				break;
			case 6://OPCIÓN 6:
				if (cuenta != null) {//Si hay cuenta corriente...
					cuenta = null;//La borramos y lo indicamos
					System.out.println("Cuenta corriente eliminada exitosamente");
				} else {//De lo contrario indicamos que no podemos borrarla
					System.out.println("No se ha creado ninguna cuenta corriente todavía");
				}
				break;
			case 7://OPCIÓN 7:
				System.out.println("Fin del programa");//Indicamos el fin del programa
				salir = true;//Salimos del bucle
				break;
			default:
				System.out.println("Opción inválida");//Si la opción no se contempla indicamos el error
				break;
			}

		}
		sc.close();
	}

	/**
	 * Menú con las opciones
	 */
	static void mostrarMenu() {
		System.out.println("GESTIONA TU CUENTA");
		System.out.println("1) Crear cuenta corriente");
		System.out.println("2) Mostrar información de la cuenta");
		System.out.println("3) Ingresar dinero");
		System.out.println("4) Sacar dinero");
		System.out.println("5) Actualizar saldo");
		System.out.println("6) Eliminar cuenta corriente");
		System.out.println("7) Salir");
	}

//Construye la cuenta
	static CuentaCorriente crearCuenta() {
		System.out.print("Ingrese DNI del propietario de la cuenta: ");
		DNI = sc.next();
		System.out.print("Ingrese nombre del propietario de la cuenta: ");
		nombre = sc.next();
		System.out.print("Ingrese saldo inicial: ");
		saldo = sc.nextDouble();
		System.out.print("Ingrese sexo del propietario de la cuenta (hombre/mujer): ");
		sexoStr = sc.next();
		CuentaCorriente cuenta = new CuentaCorriente(DNI, nombre, saldo, sexoStr);
		System.out.println("Cuenta corriente creada exitosamente.");
		return cuenta;
	}
}
