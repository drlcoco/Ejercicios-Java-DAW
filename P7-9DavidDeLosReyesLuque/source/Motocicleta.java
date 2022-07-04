import javax.swing.JOptionPane;

public class Motocicleta extends Vehiculo implements Circular, Aparcar{
	
	protected float potenciaMotor;
	
	protected boolean tieneMaletero;
	
	protected String maletero;
	
	public Motocicleta() {
		matricula = JOptionPane.showInputDialog("INTRODUZCA LA MATRÍCULA: ");
		marca = JOptionPane.showInputDialog("INTRODUZCA LA MARCA: ");
		modelo = JOptionPane.showInputDialog("INTRODUZCA EL MODELO: ");
		color = JOptionPane.showInputDialog("INTRODUZCA EL COLOR: ");
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PUERTAS: "));
		numPlazas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PLAZAS: "));
		potenciaMotor = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LA POTENCIA DEL MOTOR: "));
		maletero = JOptionPane.showInputDialog("¿QUIERE MALETERO? INTRODUZCA SI O NO: ");
		if (maletero == "SI" || maletero == "si") {
			tieneMaletero = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR! INTRODUZCA SI O NO");
		}
		numVehiculos++;
	}
	
	public Motocicleta(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas,
			int numPlazas, float potenciaMotor, boolean tieneMaletero) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		matricula = "45678-KJH";
		marca = "YAMAHA";
		modelo = "YZF-R1";
		color = "ROJA";
		kilometros = 00037;
		numPuertas = 1;
		numPlazas = 2;
		potenciaMotor = 1000;
		tieneMaletero = true;
		numVehiculos++;

	}

	@Override
	public void arrancar() {
		JOptionPane.showMessageDialog(null,"La motocicleta está arrancando.");
		
	}

	@Override
	public void acelerar() {
		JOptionPane.showMessageDialog(null,"La motocicleta está acelerando.");
		
	}

	@Override
	public void frenar() {
		JOptionPane.showMessageDialog(null,"La motocicleta está frenando.");
		
	}
	
	@Override
	public void puedeCircular() {
		
		JOptionPane.showMessageDialog(null,"Esto es una motocileta y las motocicletas pueden circular por carreteras, autovías y autopistas.");
	}
	
	@Override
	public void aparcar() {
		
		JOptionPane.showMessageDialog(null,"La motocicleta está aparcando.");
	}
	
	public void brincar() {
		
		JOptionPane.showMessageDialog(null,"La motocicleta está brincando.");
	}
	
	@Override
	public String toString() {
		return "Motocicleta [ - POTENCIA MOTOR: " + potenciaMotor + "\n - TIENE MALETERO: " + tieneMaletero + "\n - MATRÍCULA: " + matricula + "\n - MARCA: " + marca + "\n - MODELO: " + modelo + "\n - COLOR: " + color
				+ "\n - KILÓMETROS: " + kilometros + "\n - NÚMERO DE PUERTAS: " + numPuertas + "\n - NÚMERO DE PLAZAS: " + numPlazas
				+ "\n - getClass()=" + getClass()
				+ "\n - hashCode()=" + hashCode() + "\n - toString()=" + super.toString() + "]";
	}

	public float getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(float potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public boolean isTieneMaletero() {
		return tieneMaletero;
	}

	public void setTieneMaletero(boolean tieneMaletero) {
		this.tieneMaletero = tieneMaletero;
	}

	

	

}
