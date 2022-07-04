import javax.swing.JOptionPane;

public class Autobus extends Vehiculo implements Circular, Aparcar{
	
	protected String tipoRecorrido;
	
	protected boolean esEscolar;
	
	protected String escolar;
	
	public Autobus() {
		matricula = JOptionPane.showInputDialog("INTRODUZCA LA MATRÍCULA: ");
		marca = JOptionPane.showInputDialog("INTRODUZCA LA MARCA: ");
		modelo = JOptionPane.showInputDialog("INTRODUZCA EL MODELO: ");
		color = JOptionPane.showInputDialog("INTRODUZCA EL COLOR: ");
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PUERTAS: "));
		numPlazas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PLAZAS: "));
		tipoRecorrido = JOptionPane.showInputDialog("INTRODUZCA EL TIPO DE RECORRIDO: ");
		escolar = JOptionPane.showInputDialog("¿EL AUTOBÚS ES ESCOLAR? INTRODUZCA SI O NO: ");
		if (escolar == "SI" || escolar == "si") {
			esEscolar = true;
		}		
		else {
			JOptionPane.showMessageDialog(null, "ERROR! INTRODUZCA SI O NO");
		}
		numVehiculos++;
	}

	public Autobus(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas,
			int numPlazas, String tipoRecorrido, boolean esEscolar) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		matricula = "54321-KLP";
		marca = "SCANIA";
		modelo = "BULLER";
		color = "BLANCO";
		kilometros = 2357;
		numPuertas = 2;
		numPlazas = 55;
		tipoRecorrido = "CORTO";
		esEscolar = true;
		numVehiculos++;

	}

	@Override
	public void arrancar() {

		JOptionPane.showMessageDialog(null,"El autobús ha arrancado.");
	}

	@Override
	public void acelerar() {

		JOptionPane.showMessageDialog(null,"El autobús está acelerando.");
	}

	@Override
	public void frenar() {

		JOptionPane.showMessageDialog(null,"El coche está frenando.");
	}
	
	@Override
	public void puedeCircular() {
		
		JOptionPane.showMessageDialog(null,"Esto es una autobús y los autobuses pueden circular por carreteras, autovías y autopistas.");
	}
	
	public void abrirPuertas() {
		
		JOptionPane.showMessageDialog(null,"El autobús está abriendo las puertas.");
	}
	
	@Override
	public void aparcar() {
		
		JOptionPane.showMessageDialog(null,"El autobús está aparcando.");
	}
	
	@Override
	public String toString() {
		return "Autobus [\n - MATRÍCULA: " + matricula + "\n - MARCA: " + marca + "\n - MODELO: "
				+ modelo + "\n - COLOR: " + color + "\n - KILÓMETROS: " + kilometros + "\n - NÚMERO DE PUERTAS: " + numPuertas
				+ "\n - NÚMERO DE PLAZAS: " + numPlazas + "\n - TIPO RECORRIDO: "+ tipoRecorrido +"\n - ES ESCOLAR: "+ esEscolar +"\n - getClass()=" + getClass() + "\n - hashCode()=" + hashCode() + "\n - toString()="
				+ super.toString() + "]";
	}

	public String getTipoRecorrido() {
		return tipoRecorrido;
	}

	public void setTipoRecorrido(String tipoRecorrido) {
		this.tipoRecorrido = tipoRecorrido;
	}

	public boolean isEsEscolar() {
		return esEscolar;
	}

	public void setEsEscolar(boolean esEscolar) {
		this.esEscolar = esEscolar;
	}

	

	

}
