package ejercicio4;

public class Articulo {
	private String nombre;
	private double precio;
	private int cantidad;
	public final static double IVA = 0.21;
	enum Departamento{
		Alimentación,
		Electrónica,
		Droguería
	}
	
	Departamento departamento;

	public Articulo(String nombre, double precio, int cantidad, String departamento) {
		if (!nombre.isEmpty() && nombre != null) {
			this.nombre = nombre;
		} else {
			System.out.println("El nombre introducido no es válido");
		}

		if (precio > 0) {
			this.precio = precio;
		} else {
			System.out.println("El precio introducido no es válido");
		}

		if (cantidad >= 0) {
			this.cantidad = cantidad;
		} else {
			System.out.println("La cantidad introducida no es válida");
		}
		
		this.departamento=Departamento.valueOf(departamento);
	}

	public Articulo(Articulo a) {
		this.nombre = a.nombre;
		this.precio = a.precio;
		this.cantidad = a.cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (!nombre.isEmpty() && nombre != null) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if (cantidad >= 0) {
			this.cantidad = cantidad;
		}
	}


	@Override
	public String toString() {
		return "Articulo: nombre :" + nombre + ", precio: " + precio + ", cantidad: " + cantidad + ", departamento: "
				+ departamento ;
	}

	public double getPVP() {
		double precioIVA = (this.precio * IVA) + this.precio;
		return precioIVA;
	}

	public double getPVPDescuento(double descuento) {
		double precioIVA = getPVP();
		double precioFinal = precioIVA - (precioIVA * descuento);
		return precioFinal;
	}

	public boolean vender(int cantidad) {
		boolean venta = false;
		if (this.cantidad >= cantidad) {
			venta = true;
			this.cantidad -= cantidad;
		}
		return venta;
	}

	public void almacenar(int cantidad) {
		this.cantidad += cantidad;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = Departamento.valueOf(departamento);
	}
	
}
