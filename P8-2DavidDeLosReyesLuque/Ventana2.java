import javax.swing.*;

public class Ventana2 extends JFrame{

	JPanel panel;
	JLabel texto;
	JButton boton;
	
	public Ventana2() {
		
		panel = new JPanel();
		texto = new JLabel();
		boton = new JButton();
		
		this.add(panel);
		panel.add(texto);
		panel.add(boton);
		
		texto.setText("Hola Mundo");
		boton.setText("Púlsame");
	}
}
