
import java.util.Scanner;

public class Dni {

	public static char letra (int numerodni){
		
		String letra;
		
		int resto;
		
		resto = numerodni % 23;
		
		letra = "TRWAGMYFPDXBNJZSQVHLCKE";
	    
	    return (letra.charAt(resto));
	    
	}
	    
	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
        int numerodni;
		
	    System.out.println("Introduzca su número de DNI: ");
		
		numerodni = datos.nextInt();
		
		System.out.println("La letra de su DNI es: " + letra(numerodni));

    }

}
