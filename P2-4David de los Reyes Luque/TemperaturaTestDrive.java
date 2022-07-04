
import java.util.Scanner;

public class TemperaturaTestDrive {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in) ;
		System.out.println("Indica aquí los grados Ceslius: ");
		Temperatura t = new Temperatura();
		t.celsius = datos.nextDouble();
		t.farenheit = (t.celsius * 1.8) + 32;
		t.convertir();
		System.out.println("Los grados en Farenheit son: " +t.farenheit);
		

	}

}
