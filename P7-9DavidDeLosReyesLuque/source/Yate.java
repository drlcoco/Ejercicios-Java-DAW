import javax.swing.JOptionPane;

public class Yate extends Vehiculo implements Navegar{
	
	protected boolean tieneCocina;
	
	protected int numMotores;
	
	protected float metrosEslora;
	
	protected String cocina;
	
	public Yate() {
		matricula = JOptionPane.showInputDialog("INTRODUZCA LA MATRÍCULA: ");
		marca = JOptionPane.showInputDialog("INTRODUZCA LA MARCA: ");
		modelo = JOptionPane.showInputDialog("INTRODUZCA EL MODELO: ");
		color = JOptionPane.showInputDialog("INTRODUZCA EL COLOR: ");
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PUERTAS: "));
		numPlazas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PLAZAS: "));
		cocina = JOptionPane.showInputDialog("¿QUIERE COCINA? INTRODUZCA SI O NO: ");
		if (cocina == "SI" || cocina == "si") {
			tieneCocina = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR! INTRODUZCA SI O NO");
		}
		numMotores = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE MOTORES: "));
		metrosEslora = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS METROS DE ESLORA: "));
		numVehiculos++;
	}
	
	public Yate(String matricula, String marca, String modelo, String color, double kilometros, int numPuertas,
			int numPlazas, boolean tieneCocina, int numMotores, float metrosEslora) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		matricula = "45678-KLP";
		marca = "QUICKSILVER";
		modelo = "PHANTOM";
		color = "BLANCO";
		kilometros = 344;
		numPuertas = 3;
		numPlazas = 25;
		tieneCocina = true;
		numMotores = 4;
		metrosEslora = 12;
		numVehiculos++;

	}

	@Override
	public void arrancar() {
		
		JOptionPane.showMessageDialog(null,"El yate ha arrancado.");
	}

	@Override
	public void acelerar() {
		
		JOptionPane.showMessageDialog(null,"El yate está acelerando.");
	}

	@Override
	public void frenar() {
		JOptionPane.showMessageDialog(null,"El yate está frenando.");		
	}
	
	@Override
	public void puedeNavegar() {

		JOptionPane.showMessageDialog(null,"Esto es un yate y los yates solo pueden navegar por el mar.");
	}
	
	public void zarpar() {
		
		JOptionPane.showMessageDialog(null,"El yate está zarpando.");
	}
	
	public void atracar() {
		
		JOptionPane.showMessageDialog(null,"El yate está atracando.");
	}
	
	@Override
	public String toString() {
		return "Yate [ - TIENE COCINA: " + tieneCocina + "\n - NÚMERO MOTORES: " + numMotores + "\n - METROS ESLORA: " + metrosEslora
				+ "\n - MATRÍCULA: " + matricula + "\n - MARCA: " + marca + "\n - MODELO: " + modelo + "\n - COLOR: " + color
				+ "\n - KILÓMETROS: " + kilometros + "\n - NÚMERO PUERTAS: " + numPuertas + "\n - NÚMERO PLAZAS: " + numPlazas
				+ "\n - getClass()=" + getClass() + "\n - hashCode()=" + hashCode() + "\n - toString()=" + super.toString()
				+ "]";
	}

	public boolean isTieneCocina() {
		return tieneCocina;
	}

	public void setTieneCocina(boolean tieneCocina) {
		this.tieneCocina = tieneCocina;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

	public float getMetrosEslora() {
		return metrosEslora;
	}

	public void setMetrosEslora(float metrosEslora) {
		this.metrosEslora = metrosEslora;
	}

	

}
