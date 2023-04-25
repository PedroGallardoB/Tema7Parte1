package ejercicio1;

/**
 * @author Rexil
 */
public class CuentaCorriente {
	/**
	 * DNI del propietario 
	 */
	private String DNI;
	/**
	 * Nombre del propietario
	 */
	private String nombre;
	/**
	 * Saldo del propietario
	 */
	private double saldo;
	/**
	 *Almacena el sexo del propietario
	 */
	private enum Sexo{
		hombre,//Es hombre
		mujer;//Es mujer
	}
	/**
	 *Creamos el enum de tipo Sexo
	 */
	 private Sexo sexo;

	/**
	 * Constructor de la cuenta corriente
	 * @param DNI Almacena el DNI del usuario
	 * @param nombre Almacena el nombre del usuario
	 * @param saldo Almacena el saldo del usuario
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		
	}
/**
 * Constructor de la cuenta corriente con sexo
 * @param DNI Almacena el DNI del usuario
 * @param nombre Almacena el nombre del usuario
 * @param saldo Almacena el saldo del usuario
 * @param SexoStr Almacena el sexo del usuario
 */
	public CuentaCorriente(String DNI, String nombre, double saldo, String SexoStr) {
		super();
		this.DNI = DNI;
		this.saldo = saldo;
		this.sexo = Sexo.valueOf(SexoStr);
		this.nombre=nombre;
	
	}
/**
 * Método para sacar dinero
 * @param cantidad Cantidad a sacar
 * @return Devuelve la cantidad de dinero actualizada
 */
	public boolean SacarDinero(double cantidad) {
if(saldo>cantidad) {
	saldo -= cantidad;
}
		return ((saldo - cantidad) > 0);

	}
/**
 * Método para ingresar dinero
 * @param cantidad Cantidad a ingresar
 */
	public void IngresarDinero(double cantidad) {

		saldo += cantidad;

	}
	
	public void MostrarInfo() {

	System.out.println("La cuenta corriente de propietario con DNI " + DNI + " tiene " + saldo + "€, es " + sexo + " y se llama " + nombre);

	}
/**
 * Da información del saldo al main
 * @return Devuelve el saldo
 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Permite modificar el valor de saldo 
	 * @param saldo Guarda el saldo del usuario
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}