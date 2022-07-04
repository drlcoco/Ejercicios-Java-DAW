
import java.util.Scanner; //Librería de java para poder utilizar Scanner e introducir datos.

public class Circunferencia { //La Clase de mi programa.

	public static void main(String[] args) { //El método main de mi programa.
		
		Scanner datos = new Scanner (System.in) ; //El Scanner para poder introducir datos.
		
		double radio; //Declaro double llamado radio para que acepte decimales.
		
		double area;  //Declaro double llamado área.
		
		double longitud; //Declaro double llamado longitud.
		
		
		
		System.out.print("Indica aquí el Radio de la Circunferencia en metros: ");//Aquí introduzco nº.
		
		radio = datos.nextDouble(); //Almaceno los datos en la variable Radio.
		
		area = Math.PI * Math.pow(radio,2); //Declaro la fórmula del Radio.
		
		longitud = 2 * Math.PI * radio; //Declaro la fórmula de la longitud.
		
		System.out.println("El Área es: "+area); //Imprimo el resultado del area.
		
		System.out.println("La Longitud es: "+longitud); //Imprimo el resultado de la longitud.
		
		

	}

}
