
public class Cantante extends Persona implements PuedeCantar {
	
	public Cantante(String nombre, int edad) {
		super(nombre, edad);
		
	}

	String canto = "El cantante está cantando Do, Re, Mi, Fa, Sol, La, Si, Do";
	
	public void cantar() {
		
		System.out.println(canto);
	}

	@Override
	public void caracteristicas() {

		System.out.println(" - NOMBRE: "+ getNombre() +"\n - EDAD: "+ getEdad());
		System.out.println(" - PERTENECE A LA CLASE: "+ toString());
		alimentacion();
	}

}
