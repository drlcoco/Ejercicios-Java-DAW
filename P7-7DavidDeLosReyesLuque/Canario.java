
public class Canario extends Animal implements PuedeCantar{

	protected double peso;
	
	public Canario(String nombre, int numPatas, double peso) {
		super(nombre, numPatas);
		this.peso = peso;
	}
	
	String piolin = " - Piolín está cantando el canto del canario.";
		
	public void cantar() {
		
		System.out.println(piolin);
	}
	
	public void alimentacion() {
		
		System.out.println(" - El canario se alimenta de alpiste.");
	}

	@Override
	public void caracteristicas() {

		System.out.println(" - NOMBRE: "+ getNombre() +"\n - NÚMERO DE PATAS: "+ getNumPatas() +"\n - PESO: "+ getPeso());
		System.out.println(" - PERTENECE A LA CLASE: "+ toString());
		alimentacion();
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
