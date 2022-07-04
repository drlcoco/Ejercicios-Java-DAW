import javax.swing.JOptionPane;

public class Avioneta extends Vehiculo implements Volar, Circular{
	
	protected String aeropuerto;
	
	protected float maxKilogramos;
	
	public Avioneta() {
		matricula = JOptionPane.showInputDialog("INTRODUZCA LA MATRÍCULA: ");
		marca = JOptionPane.showInputDialog("INTRODUZCA LA MARCA: ");
		modelo = JOptionPane.showInputDialog("INTRODUZCA EL MODELO: ");
		color = JOptionPane.showInputDialog("INTRODUZCA EL COLOR: ");
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PUERTAS: "));
		numPlazas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PLAZAS: "));
		aeropuerto = JOptionPane.showInputDialog("INTRODUZCA EL NOMBRE DEL AEROPUERTO: ");
		maxKilogramos = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL MÁXIMO DE KILOGRAMOS QUE SOPORTA LA AVIONETA: "));
		numVehiculos++;
	}
	
	public Avioneta(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas,
			int numPlazas, String aeropuerto, int maxKilogramos) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		matricula = "11765-KGP";
		marca = "AEROFIGHTER";
		modelo = "F-18";
		color = "VERDE";
		kilometros = 250;
		numPuertas = 2;
		numPlazas = 4;
		aeropuerto = "BARAJAS";
		maxKilogramos = 25000;
		numVehiculos++;

	}

	@Override
	public void arrancar() {
		
		JOptionPane.showMessageDialog(null,"La avioneta ha arrancado.");
	}

	@Override
	public void acelerar() {
		
		JOptionPane.showMessageDialog(null,"La avioneta está acelerando.");
	}

	@Override
	public void frenar() {
		
		JOptionPane.showMessageDialog(null,"La avioneta está frenando.");
	}
	
	@Override
	public void puedeCircular() {

		JOptionPane.showMessageDialog(null,"Esto es una avioneta y las avionetas solo pueden circular dentro de los aeropuertos.");

	}

	@Override
	public void puedeVolar() {

		JOptionPane.showMessageDialog(null,"Esto es una avioneta y las avionetas pueden volar por todo el territorio permitido.");
	}
	
	public void despegar() {
		
		JOptionPane.showMessageDialog(null,"La avioneta está despegando.");
	}
	
	public void aterrizar() {
		
		JOptionPane.showMessageDialog(null,"La avioneta está aterrizando.");
	}
	
	@Override
	public String toString() {
		return "Avioneta [ - AEROPUERTO: " + aeropuerto + "\n - MÁXIMO KILOGRAMOS: " + maxKilogramos + "\n - MATRÍCULA: " + matricula
				+ "\n - MARCA: " + marca + "\n - MODELO: " + modelo + "\n - COLOR:" + color + "\n - KILÓMETROS: " + kilometros
				+ "\n - NÚMERO DE PUERTAS: " + numPuertas + "\n - NÚMERO DE PLAZAS" + numPlazas +
				"\n - getClass()=" + getClass() + "\n - hashCode()=" + hashCode() + "\n - toString()=" + super.toString()
				+ "]";
	}


	public String getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public float getMaxKilogramos() {
		return maxKilogramos;
	}

	public void setMaxKilogramos(float maxKilogramos) {
		this.maxKilogramos = maxKilogramos;
	}

	

}
