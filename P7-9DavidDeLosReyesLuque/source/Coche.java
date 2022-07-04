import javax.swing.JOptionPane;

public class Coche extends Vehiculo implements Circular, Aparcar{
	
	protected int numAirbags;
	
	protected boolean techoSolar;
	
	protected String techo;
	
	protected boolean tieneRadio;
	
	protected String radio;
	
	
	public Coche() {
		matricula = JOptionPane.showInputDialog("INTRODUZCA LA MATRÍCULA: ");
		marca = JOptionPane.showInputDialog("INTRODUZCA LA MARCA: ");
		modelo = JOptionPane.showInputDialog("INTRODUZCA EL MODELO: ");
		color = JOptionPane.showInputDialog("INTRODUZCA EL COLOR: ");
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PUERTAS: "));
		numPlazas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PLAZAS: "));
		numAirbags = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE AIRBAGS: "));
		techo = JOptionPane.showInputDialog("¿QUIERE TECHO SOLAR? INTRODUZCA SI O NO: ");
		if (techo == "SI" || techo == "si") {
			techoSolar = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR! INTRODUZCA SI O NO");
		}
		radio = JOptionPane.showInputDialog("¿QUIERE RADIO? INTRODUZCA SI O NO: ");
		if (radio == "SI" || radio == "si") {
			tieneRadio = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR! INTRODUZCA SI O NO");
		}
		numVehiculos++;
	}
	
	public Coche(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas,
			int numPlazas, int numAirbags, boolean techoSolar, boolean tieneRadio) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		matricula = "45678-KLP";
		marca = "BMW";
		modelo = "M4";
		color = "AZUL";
		kilometros = 395;
		numPuertas = 3;
		numPlazas = 4;
		numAirbags = 8;
		techoSolar = true;
		tieneRadio = true;
		numVehiculos++;

	}
	
	@Override
	public void arrancar() {

		JOptionPane.showMessageDialog(null,"El coche ha arrancado.");
	}

	@Override
	public void acelerar() {
		
		JOptionPane.showMessageDialog(null,"El coche está acelerando.");
	}

	@Override
	public void frenar() {
		
		JOptionPane.showMessageDialog(null,"El coche está frenando.");
	}
	
	@Override
	public void puedeCircular() {
		
		JOptionPane.showMessageDialog(null,"Esto es un coche y los coches pueden circular por carreteras, autovías y autopistas.");
	}
	
    public void tunear(String color) {
		
		color = JOptionPane.showInputDialog("¿DE QUÉ COLOR QUIERE PINTAR SU COCHE?: ");
		
		JOptionPane.showMessageDialog(null,"HEMOS PINTADO SU COCHE DE "+color.toUpperCase());
		//Sobrecarga el anterior, pinta el coche, cuenta a cero, pone techo solar y muestra mensaje.
	}
    
    public void aparcar() {
    	
		JOptionPane.showMessageDialog(null,"El coche está aparcando.");
    }
    
    

	@Override
	public String toString() {
		return "Coche [\n - MATRÍCULA: " + matricula + "\n - MARCA: " + marca + "\n - MODELO: "
				+ modelo + "\n - COLOR: " + color + "\n - KILÓMETROS: " + kilometros + "\n - NÚMERO DE PUERTAS: " + numPuertas
				+ "\n - NÚMERO DE PLAZAS: " + numPlazas + "\n - NÚMERO DE AIRBAGS: "+ numAirbags + "\n - TECHO SOLAR: "+ techoSolar +"\n - TIENE RADIO: "+ tieneRadio +"\n - getClass()=" + getClass() + "\n - hashCode()=" + hashCode() + "\n - toString()="
				+ super.toString() + "]";
	}

	public int getNumAirbags() {
		return numAirbags;
	}

	public void setNumAirbags(int numAirbags) {
		this.numAirbags = numAirbags;
	}

	public boolean isTechoSolar() {
		return techoSolar;
	}

	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}

	public boolean isTieneRadio() {
		return tieneRadio;
	}

	public void setTieneRadio(boolean tieneRadio) {
		this.tieneRadio = tieneRadio;
	}

	

}
