import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        
        int base, altura;
        int baseIzquierda, baseDerecha, alturaIzquierda, alturaDerecha;

        while (true) {
        	
        	System.out.println("Introduzca el vértice de la base izquierda del rectángulo: ");
            baseIzquierda = datos.nextInt();
            
        	System.out.println("Introduzca el vértice de la altura izquierda del rectángulo: ");
            alturaIzquierda = datos.nextInt();
            
        	System.out.println("Introduzca el vértice de la base derecha del rectángulo: ");
            baseDerecha = datos.nextInt();
            
        	System.out.println("Introduzca el vértice de la altura derecha del rectángulo: ");
            alturaDerecha = datos.nextInt();

            base   = baseDerecha - baseIzquierda;
            altura = alturaDerecha - alturaIzquierda;

            if (base < 0 || altura < 0) break;
            System.out.println("El Área del rectángulo es: "+base * altura );
        }
        
	}

}
