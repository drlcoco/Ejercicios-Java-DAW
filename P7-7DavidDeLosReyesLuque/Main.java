
public class Main {

	public static void main(String[] args) {
		
		SerVivo cant = new Cantante("Carreras", 66);
		
		SerVivo ga = new Gallo("Claudio", 2, "Blanco");
		
		SerVivo cana = new Canario("Piolín", 2, 15.5);
				
		cant.caracteristicas();
		
		ga.caracteristicas();
		
		cana.caracteristicas();

	}

}
