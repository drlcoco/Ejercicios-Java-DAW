import javax.swing.JOptionPane;

public abstract class Vehiculo {
	
	protected String matricula;
	
	protected String marca;
	
	protected String modelo;
	
	protected String color;
	
	protected double kilometros;
	
	protected int numPuertas;
	
	protected int numPlazas;
	
	protected static int numVehiculos;
	
	protected static final int MAX_VEHICULOS = 5;
	
	public abstract void arrancar();
	
	public abstract void acelerar();
	
	public abstract void frenar();
	
	public Vehiculo() {}
	
	public Vehiculo(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas,
			int numPlazas) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.kilometros = kilometros;
		this.numPuertas = numPuertas;
		this.numPlazas = numPlazas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public static int getNumVehiculos() {
		return numVehiculos;
	}

	public static void setNumVehiculos(int numVehiculos) {
		Vehiculo.numVehiculos = numVehiculos;
	}

	public static int getMaxVehiculos() {
		return MAX_VEHICULOS;
	}
	
	

}
