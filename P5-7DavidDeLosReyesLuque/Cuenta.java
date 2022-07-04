import java.io.IOException;

import javax.swing.JOptionPane;

public class Cuenta {
	private String usuario = "";
	private double saldo = 0;
	private double cantidad = 0;
	private int numeroOperacion = 0;
	public int x=0;

	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public int getNumeroOperacion() {
		return numeroOperacion;
	}
	public void setNumeroOperacion(int numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}
	
	
	void bienvenida() {
		usuario=JOptionPane.showInputDialog("BIENVENIDO A SU CUENTA BANCARIA\nINTRODUZCA SU NOMBRE DE USUARIO.");
	}
	void operacion() {
		try {
			if(numeroOperacion<5 && numeroOperacion>=0) {
				numeroOperacion=Integer.parseInt(JOptionPane.showInputDialog("BUENOS DÍAS "+usuario.toUpperCase()+"\nPARA VER SU SALDO PULSE 1\nPARA INGRESAR DINERO PULSE 2\nPARA SACAR DINERO PULSE 3\nPARA SALIR PULSE 4"));
			}
		}
		catch(Exception e) {
			if(numeroOperacion < 0 || numeroOperacion > 5) {
				JOptionPane.showMessageDialog(null, "FATAL ERROR 404! DEBE INTRODUCIR UN NÚMERO DE OPERACIÓN CORRECTO");
			}
		}
	}
	void solicitaCantidad() {
		cantidad=Float.parseFloat(JOptionPane.showInputDialog(usuario.toUpperCase()+" INTRODUZCA LA CANTIDAD EN EUROS"));
	}
	void ingresar() {
		JOptionPane.showMessageDialog(null,"HA ELEGIDO LA OPCIÓN DE INGRESAR DINERO");
		solicitaCantidad();
		JOptionPane.showMessageDialog(null,"HA INGRESADO EN SU CUENTA LA CANTIDAD DE "+cantidad+" € CON ÉXITO\nGRACIAS");
		saldo=saldo+cantidad;
	}
	void extraer() {
		JOptionPane.showMessageDialog(null,"HA ELEGIDO LA OPCIÓN DE EXTRAER DINERO");
		solicitaCantidad();
		JOptionPane.showMessageDialog(null,"HA EXTRAIDO DE SU CUENTA LA CANTIDAD DE "+cantidad+" € CON ÉXITO\nGRACIAS");
		saldo=saldo-cantidad;

	}
	void obtenerSaldo() {
		JOptionPane.showMessageDialog(null,"SU SALDO ACTUAL ES DE "+saldo+" €");
	}
	void salir() {
		x=8;
	}
	void fin() {
		JOptionPane.showMessageDialog(null,"HASTA PRONTO "+usuario.toUpperCase());
	}

}
