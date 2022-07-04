import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class P84D extends JFrame{
	
	public static void main(String[] args) {
		
		P84D p = new P84D();
		p.go();
				
	}
	
	public void go() {		//CÓDIGO DE LA VENTANA D
	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("Tesuji");
		JButton button2 = new JButton("Watari");
		frame.getContentPane() .add(BorderLayout.NORTH, panel);
		panel.add(button2);
		frame.getContentPane() .add(BorderLayout.CENTER, button);
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	
	}
	
		
}
