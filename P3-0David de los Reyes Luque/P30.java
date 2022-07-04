import javax.swing.JOptionPane;

public class P30 {

	public static void main(String[] args) {
		 JOptionPane.showMessageDialog(null, "int x = 34.5; // Aquí da un error porque debería ser una variable tipo double.");
		 JOptionPane.showMessageDialog(null, "boolean boo = x; // Aquí debería devolver un true or false" );
	     JOptionPane.showMessageDialog(null, "int g = 17; // Declara una variable llamada g con valor 17" );
		 JOptionPane.showMessageDialog(null, "int y = g; // Declara un entero llamado y, y lo iguala al valor de g" );
		 JOptionPane.showMessageDialog(null, "y = y + 10; // Incrementa el valor de y en 10" );
		 JOptionPane.showMessageDialog(null, "short s; // Declara una variable tipo short llamada s" );
		 JOptionPane.showMessageDialog(null, "s = y ; // Da error porque está igualando un int a un short" );
		 JOptionPane.showMessageDialog(null, "byte b = 3; // Declara variable llamada b con valor 3" );
		 JOptionPane.showMessageDialog(null, "byte v = b; // Declara variable llamada v y le da el valor de b" );
		 JOptionPane.showMessageDialog(null, "short n = 12; // Declara variable n con valor 12" );
		 JOptionPane.showMessageDialog(null, "v = n; // Da error porque iguala un byte a un short" );
	     JOptionPane.showMessageDialog(null, "byte k = 128; // Da error porque el byte solo llega hasta el 127" );
				
	}

}
