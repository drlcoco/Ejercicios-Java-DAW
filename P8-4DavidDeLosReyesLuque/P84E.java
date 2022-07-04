import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class P84E extends JFrame{
	
	public static void main(String[] args) {
		
		P84E p = new P84E();
		p.go();
				
	}

	public void go() {		//CÓDIGO DE LA VENTANA B
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("Tesuji");
		JButton button2 = new JButton("Watari");
		frame.getContentPane() .add(BorderLayout.SOUTH, panel);
		panel.add(button2);
		frame.getContentPane() .add(BorderLayout.NORTH, button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	
	}

}
