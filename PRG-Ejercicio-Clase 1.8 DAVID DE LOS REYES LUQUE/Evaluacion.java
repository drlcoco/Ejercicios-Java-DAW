import java.util.Scanner;
public class Evaluacion {
    public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int aprobados = 0;
		int suspensos = 0;
		int condicionados = 0;
		float notas;
		int numero = 1;
		int numeroAlumnos = 0;
		int totalSuspensos = 0;
		char respuesta;
		do {
			System.out.println("Introduzca a continuación el número de alumnos ");
		    numeroAlumnos = entrada.nextInt();
		for (int i = 1; i <= numeroAlumnos; i++) {
			do {
				totalSuspensos = suspensos + condicionados;
			    System.out.println("Introduzca a continuación las notas del alumno " +numero);
			    notas = entrada.nextFloat();
				numero++;
			} while (notas < 0 || notas > 10);
			if (notas >= 5) {
				 aprobados++;
			}
			else if (notas >= 4 && notas <= 4.9) {
				condicionados++;
			}
			else { suspensos++; 
			}
		}
		System.out.println("El número de aprobados es " +aprobados);
		System.out.println("El número de condicionados es " +condicionados);
		System.out.println("El número de suspensos es " +totalSuspensos);
		System.out.println("Para empezar de nuevo escriba y ; Para finalizar escriba n " );
		respuesta = entrada.next().charAt(0);
		aprobados = 0;
	    suspensos = 0;
		condicionados = 0;
		numero = 1;
		numeroAlumnos = 0;
		totalSuspensos = 0;
		} while ( respuesta ==  'y'); 
		    while (respuesta != 'n'); 
		    System.out.println("Fin");
    }
}
