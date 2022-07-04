import java.awt.Button;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class SimpleGui1 {
	
	JFrame frame = new JFrame();
	
	JButton button = new JButton("Click me");
	
	JPanel panelRojo = new JPanel();
	
	JFrame ventana = new JFrame ("Prueba en rojo");
	
	Container contentPane = ventana.getContentPane();
	
	public SimpleGui1() {
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane() .add(button);
		
		frame.setSize(300,300);
		
		frame.setVisible(true);
				
		panelRojo.setBackground(Color.RED);
		
		panelRojo.setSize(300, 300);
		
		ventana.setLocation(100, 100);
		
		ventana.setSize(300, 300);
		
		ventana.setVisible(true);
				
		contentPane.add(panelRojo);
		
		contentPane.add(panelRojo);
		
		panelRojo.add(button);
	}
	
	public static void main(String[] args) throws Exception{
		
		SimpleGui1 p = new SimpleGui1();
		
		p.cambiaTexto();
		
	}

	public void cambiaTexto() {
		
		button.setText("He sido expulsado");
	}
	
	
}
