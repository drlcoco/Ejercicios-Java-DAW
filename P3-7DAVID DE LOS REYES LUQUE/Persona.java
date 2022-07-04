import javax.swing.JOptionPane;

public class Persona {
	
	String nombre = "";
	
	int numero;
	
public static char letra (int numerodni){
		
		String letra;
		
		int resto;
		
		resto = numerodni % 23;
		
		letra = "TRWAGMYFPDXBNJZSQVHLCKE";
	    
	    return (letra.charAt(resto));
	    
	}
		
       
	    
	    
	

	public void obtenDatos() {
		
		nombre = JOptionPane.showInputDialog("Bienvenido, introduzca su nombre: ");
			
		}

	public void obtenDatos2() {
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Hola " + nombre + ", Introduzca su número de DNI: "));
		
	}

	public void muestraDatos() {
		
		JOptionPane.showMessageDialog(null, "Su NIF es "  + numero + letra(numero));
	
		
	}

}
