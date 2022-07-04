import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Persona extends JFrame{
	
	private String nombre = "";	
	private int dni;
		
	public Persona(String nombre, int dni) {
		
		this.nombre = nombre;
		this.dni = dni;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	public char letra (int numerodni){
		
		String letra;
		
		int resto;
		
		resto = numerodni % 23;
		
		letra = "TRWAGMYFPDXBNJZSQVHLCKE";
	    
	    return (letra.charAt(resto));
	    
	}

	

	public String calculaNif() {
		
		return "EL NIF DE "+ nombre.toUpperCase() +" ES: "  + dni + letra(dni);
	
		
	}

}
