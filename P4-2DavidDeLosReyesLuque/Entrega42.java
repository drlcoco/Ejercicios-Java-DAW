import javax.swing.JOptionPane;

public class Entrega42 {

	static int calcArea(int height, int width) {
			return height*width;
		}
	public static void main(String[] args) {
		int a =  calcArea(7, 12);
		JOptionPane.showMessageDialog(null, "int a =  calcArea(7, 12); ESTA SENTENCIA HA FUNCIONADO CORRECTAMENTE.");
		short c = 7;
		JOptionPane.showMessageDialog(null, "short c = 7; ESTA SENTENCIA HA FUNCIONADO CORRECTAMENTE.");
		calcArea(c, 15);
		JOptionPane.showMessageDialog(null, "calcArea(c, 15); ESTA SENTENCIA HA FUNCIONADO CORRECTAMENTE.");
		//int d =  calcArea(57);
		JOptionPane.showMessageDialog(null, "int d =  calcArea(57); EL ERROR DICE: El método calcArea(int, int) no es aplicable para los argumentos (int).");
		calcArea(2, 3);
		JOptionPane.showMessageDialog(null, "calcArea(2, 3); ESTA SENTENCIA HA FUNCIONADO CORRECTAMENTE.");
		long t = 42;
		JOptionPane.showMessageDialog(null, "long t = 42; ESTA SENTENCIA HA FUNCIONADO CORRECTAMENTE.");
		//int f = calcArea(t, 17);
		JOptionPane.showMessageDialog(null, "int f = calcArea(t, 17); EL ERROR DICE: El método calcArea(int, int) no es aplicable para los argumentos (long, int).");
		//int g = calcArea();
		JOptionPane.showMessageDialog(null, "int g = calcArea(); EL ERROR DICE: El método calcArea(int, int) no es aplicable para los argumentos ().");
		//calcArea();
		JOptionPane.showMessageDialog(null, "calcArea(); EL ERROR DICE: El método calcArea(int, int) no es aplicable para los argumentos ().");
		//byte h = calcArea(4, 20);
		JOptionPane.showMessageDialog(null, "byte h = calcArea(4, 20); EL ERROR DICE: Error de coincidencia de tipo: no se puede convertir de entero a byte.");
		//int j = calcArea (2, 3, 5);
		JOptionPane.showMessageDialog(null, "int j = calcArea (2, 3, 5); EL ERROR DICE: El método calcArea(int, int) no es aplicable para los argumentos (int, int, int).");
		
	}
	

}
