import javax.swing.JOptionPane;

public class CirculoTestDrive {
	//pedir los datos, calcular area y longitud, y mostrar los datos del circulo.
	
	public static void main(String[] args) {
		Circulo cr = new Circulo();	
		
		cr.obtenDatos();
		cr.muestraDatos();
		cr.fin();
	}
}