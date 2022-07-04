import javax.swing.JOptionPane;

public class Alumnos {
     int numeroAlumnos = 0 & 20;
     int numero = 1;
     String nombre;
	 float nota = 0 & 10;
	 
	 void presentación() {
		 JOptionPane.showMessageDialog(null, "PFinalTema2 desarrollada por David de los Reyes Luque.");
	 }
	void estudiantes() {
		numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de alumnos: "));
	}
		void solicitarDatos() {
		nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno" + numero);
		nota = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota de " + nombre));
	}
		
	void felicitar() {
		JOptionPane.showMessageDialog(null, "Enhorabuena " + nombre );
	}
	void animar() {
		JOptionPane.showMessageDialog(null, "Sigue estudiando, ánimo " + nombre);
	}
	void fin() {
		JOptionPane.showMessageDialog(null, "Fin");
	}
}
