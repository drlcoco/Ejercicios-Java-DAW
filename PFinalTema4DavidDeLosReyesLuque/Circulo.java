import javax.swing.JOptionPane;
import java.lang.Math;
import java.io.*;

public class Circulo { // cumplir regla de la encapsulacion.
	
	private float radio;
	private float area;
	private float perimetro;
	
	public void setRadio(float radio) {
		this.radio = radio;
	}
	public float getRadio() {
		return radio;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getArea() { //calcula el area y devuelve el valor del area.
		this.area = (float) (Math.PI * Math.pow(this.radio,2));
		return this.area;
	}
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}	
	public float getPerimetro() { //calcula el perimetro y devuelve el valor del perimetro.
		this.perimetro = (float) (2 * Math.PI * this.radio);
		return this.perimetro;
	}
	void obtenDatos() {
		try {
			 radio = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca el Radio de la Circunferencia en metros: "));
			
		     if (radio < 0) {
				radio = Float.parseFloat(JOptionPane.showInputDialog(null,"Error 404! Debe introducir un número positivo. Introduzca de nuevo el radio de la circunferencia en metros: "));
			}
		    
		}
		catch(Exception e) {
		    
		    radio = Float.parseFloat(JOptionPane.showInputDialog(null,"Error 405! Ha introducido una letra. Introduzca de nuevo el radio de la circunferencia en metros: "));
		    
		    if (radio < 0) {
				radio = Float.parseFloat(JOptionPane.showInputDialog(null,"Error 404! Debe introducir un número positivo. Introduzca de nuevo el radio de la circunferencia en metros: "));
			}
			
		}
	}
	void muestraDatos() {
		
	    JOptionPane.showMessageDialog(null,"Radio: " +getRadio()+ "\nÁrea: " +getArea()+ "\nPerímetro: " +getPerimetro());
	}
	void fin() {
		 JOptionPane.showMessageDialog(null,"Fin ");
	}
}