
public class Gallo extends Animal implements PuedeCantar{

	protected String color;
	
	public Gallo(String nombre, int numPatas, String color) {
		super(nombre, numPatas);
		this.color = color;
	}

	public void cantar() {
		
		System.out.println(" - El gallo está cantando el canto del gallo.");
		
	}
	
	public void alimentacion() {
		
		System.out.println(" - El gallo se alimenta de maíz y harina de soja.");
	}

	@Override
	public void caracteristicas() {

		System.out.println(" - NOMBRE: "+ getNombre() +"\n - NÚMERO DE PATAS: "+ getNumPatas() +"\n - COLOR: "+ getColor());
		System.out.println(" - PERTENECE A LA CLASE: "+ toString());
		alimentacion();
	}
		
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
