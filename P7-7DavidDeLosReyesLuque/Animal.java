
public abstract class Animal extends SerVivo{

	protected int numPatas;
	
	public Animal(String nombre, int numPatas) {
		super(nombre);
		this.numPatas = numPatas;
	}

	public abstract void cantar();
	
	public abstract void alimentacion();
	
	public abstract void caracteristicas();
	
	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

}
