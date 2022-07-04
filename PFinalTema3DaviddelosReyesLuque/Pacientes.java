import javax.swing.JOptionPane;

public class Pacientes {
	int numeroPacientes;
	String nombre;
	int edad;
	float peso;
	float estatura;
	float peMedio;
	float estMedia;
	int edMaxima;
	int edMinima;
	double imc;
	int numero = 1;
	void bienvenida() {
		JOptionPane.showMessageDialog(null, "BIENVENIDO A CLÍNICAS DE LOS REYES, PULSE OK PARA EMPEZAR.");
	}
	void pacientes() {
		numeroPacientes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de pacientes: "));
	}
	void obtenDatos() {
		nombre = JOptionPane.showInputDialog("Introduzca el nombre del paciente ");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad de " + nombre));
		peso = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el peso en Kg de " + nombre));
		estatura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la estatura en metros de " + nombre));
	}
	void calculaIMC() {
		imc = peso/(estatura *  estatura);
	}
	void calculaEstado() {
			if (imc < 16) {
				JOptionPane.showMessageDialog(null, nombre + " tiene desnutrición grado 3.");
			}
			else if (imc >= 16 && imc < 17) {
				JOptionPane.showMessageDialog(null, nombre + " tiene desnutrición grado 2.");
			}
			else if (imc >= 17 && imc < 18.5) {
				JOptionPane.showMessageDialog(null, nombre + " tiene desnutrición grado 1.");
			}
			else if (imc >= 18.5 && imc < 25) {
				JOptionPane.showMessageDialog(null, nombre + " su IMC es normal.");
			}
			else if (imc >= 25 && imc < 30) {
				JOptionPane.showMessageDialog(null, nombre + " tiene sobrepeso grado 1.");
			}
			else if (imc >= 30 && imc < 40) {
				JOptionPane.showMessageDialog(null, nombre + " tiene sobrepeso grado 2.");
			}
			else if (imc >= 40) {
				JOptionPane.showMessageDialog(null, nombre + " tiene sobrepeso grado 3.");
			}
	}
	void muestraDatos() {
	    JOptionPane.showMessageDialog(null,"El IMC de " + nombre + " es: " + imc);
    }
	
	
	void edadMaxima() {
		JOptionPane.showMessageDialog(null, "La edad máxima de los pacientes es: " + edMaxima  );
	}
	void edadMinima() {
		JOptionPane.showMessageDialog(null, "La edad mínima es: " + edMinima );
	}
	void pesoMedio() {
		JOptionPane.showMessageDialog(null, "El peso medio es " + peMedio + " Kg.");
	}
	void estaturaMedia() {
		JOptionPane.showMessageDialog(null, "La estatura media es " + estMedia + " metros.");
	}
	void fin() {
		 JOptionPane.showMessageDialog(null,"Fin ");
	}
	

}




