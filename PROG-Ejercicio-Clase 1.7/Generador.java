import java.util.Scanner;
public class Generador {
	public static void main (String[] args) {
		
    	int x = 0;
		
		while (x < 100000) {
    	
    	    int numero; //Declaro entero número
    		char letra; //Declaro char letra
    		boolean vocal; //
    		boolean consonante;
    		
    	    numero=(int)(Math.random()*26+97);
    		letra = (char)numero;
    		vocal = ((letra=='a') || (letra=='e') || (letra=='i') || (letra=='o') || (letra=='u'));
    		consonante = (!vocal);
    		
               if (vocal) {
    			   System.out.println("La letra obtenida al azar es la " + letra + ", que es una vocal");
    		   }	
    		   else {
    			   System.out.println("La letra obtenida al azar es la " + letra + ", que es una consonante");
    		   }
               System.out.println("¿Desea que vuelva a generar otra letra? " );
     		   Scanner teclado = new Scanner (System.in);
    		   String respuesta1;
    		   String respuesta2;
      		   respuesta1 = "si";
               respuesta2 = "no";
               respuesta1 = teclado.nextLine();
               x = x + 1;
        }
     }
}

		
		