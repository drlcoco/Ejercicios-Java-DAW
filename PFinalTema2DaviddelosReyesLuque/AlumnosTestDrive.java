
public class AlumnosTestDrive {

	public static void main(String[] args) {

		Alumnos a = new Alumnos();
		a.numeroAlumnos = 0;
		a.presentación();
		a.estudiantes();
		 while (a.numeroAlumnos >= a.numero ) {
			 a.solicitarDatos();
			if (a.nota >= 5) {
				a.felicitar();
				
			}
			else if (a.nota < 5) {
			    a.animar();
			}
			a.numero ++;
		 }
		 a.fin();

	}

}
