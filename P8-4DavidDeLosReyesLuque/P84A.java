import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class P84A extends JFrame{
	
	public static void main(String[] args) {
		
		P84A p = new P84A();
		p.go();
				
}

	public void go() {		//CÓDIGO DE LA VENTANA B
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("Tesuji");
		JButton button2 = new JButton("Watari");
		panel.add(button);
		frame.getContentPane() .add(BorderLayout.NORTH, button2);
		frame.getContentPane() .add(BorderLayout.EAST, panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	
	}

}
