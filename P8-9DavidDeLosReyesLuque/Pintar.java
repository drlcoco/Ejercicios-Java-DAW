import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Pintar extends JPanel{
	
	 private int R = 0;
	 private int G = 0;
	 private int B = 0;
	
	

	public int getR() {
		return R;
	}

	public void setR(int R) {
		this.R = R;
	}

	public int getG() {
		return G;
	}

	public void setG(int G) {
		this.G = G;
	}

	public int getB() {
		return B;
	}

	public void setB(int B) {
		this.B = B;
	}

	public Pintar() {
		
	}
	 
	 public void paintComponent(Graphics g){
	  super.paintComponents(g);
	  g.setColor(new Color(R, G, B));
	  g.fillRect(0, 0, 500, 500);
	 }

}
