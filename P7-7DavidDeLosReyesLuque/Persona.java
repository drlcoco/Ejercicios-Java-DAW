
public abstract class Persona extends SerVivo{

	protected int edad;
	
	public Persona(String nombre, int edad) {
		super(nombre);
		this.edad = edad;
		
	}

	public abstract void cantar();
	
	public void alimentacion() {
		
		System.out.println(" - Las personas se pueden alimentar de alimentos de origen animal y de origen vegetal.");
	}
	
	public abstract void caracteristicas();
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
