
public class Cantante extends Persona implements PuedeCantar {
	
	String carreras = "El cantante está cantando Do, Re, Mi, Fa, Sol, La, Si, Do";
	
	public void cantar() {
		
		System.out.println(carreras);
	}

}
