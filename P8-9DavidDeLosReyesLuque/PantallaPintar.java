import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PantallaPintar extends JFrame implements ChangeListener{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txf_color;	
	Pintar pintura = new Pintar();
	
	public static void main(String[] args) {
		PantallaPintar p = new PantallaPintar();
		p.go();
		
	}
	
	public void go() {
		PantallaPintar frame = new PantallaPintar();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane() .add(pintura);
		frame.setSize(500, 270);
		frame.setVisible(true);
		
		try {
			Thread.sleep(50);
		}catch(Exception ex) {}
		
	}
		
	public PantallaPintar() {
		setTitle("Vamos a pintar!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 325);
		JPanel panel = new JPanel();//PANEL
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		getContentPane().setLayout(null);
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txf_color.getBackground() != Color.RED) {
					txf_color.setBackground(Color.RED);
				}
				else {
					txf_color.setBackground(Color.BLACK);
				}
			}
		});
		btnRojo.setBounds(6, 56, 117, 29);
		getContentPane().add(btnRojo);
		
		JButton btnVerde = new JButton("Verde");
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txf_color.getBackground() != Color.GREEN) {
					txf_color.setBackground(Color.GREEN);
				}
				else {
					txf_color.setBackground(Color.BLACK);
				}
			}
		});
		btnVerde.setBounds(6, 97, 117, 29);
		getContentPane().add(btnVerde);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txf_color.getBackground() != Color.BLUE) {
					txf_color.setBackground(Color.BLUE);
				}
				else {
					txf_color.setBackground(Color.BLACK);
				}
				
			}
		});
		btnAzul.setBounds(6, 138, 117, 29);
		getContentPane().add(btnAzul);
		
		txf_color = new JTextField();
		txf_color.setBackground(new Color(pintura.getR(), pintura.getG(), pintura.getB()));
		txf_color.setBounds(346, 56, 130, 111);
		getContentPane().add(txf_color);
		txf_color.setColumns(10);
		
		JSlider sld_rojo = new JSlider(0, 255, 0);
		sld_rojo.setBounds(135, 56, 190, 29);
		getContentPane().add(sld_rojo);
		
		JSlider sld_verde = new JSlider(0, 255, 0);
		sld_verde.setBounds(135, 97, 190, 29);
		getContentPane().add(sld_verde);
		
		JSlider sld_azul = new JSlider(0, 255, 0);
		sld_azul.setBounds(135, 138, 190, 29);
		getContentPane().add(sld_azul);
		
		JButton btnColorea = new JButton("Colorea");
		btnColorea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sld_rojo.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {	
						pintura.setR(sld_rojo.getValue());
						txf_color.repaint();
						txf_color.setBackground(new Color(pintura.getR(), pintura.getG(), pintura.getB()));	
					}
					
				});
				
				sld_verde.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						pintura.setG(sld_verde.getValue());
						txf_color.repaint();
						txf_color.setBackground(new Color(pintura.getR(), pintura.getG(), pintura.getB()));
					}
					
				});
				
				sld_azul.addChangeListener(new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						pintura.setB(sld_azul.getValue());
						txf_color.repaint();
						txf_color.setBackground(new Color(pintura.getR(), pintura.getG(), pintura.getB()));
					}
					
				});
				
			}

			
		});
		btnColorea.setBounds(171, 200, 117, 29);
		getContentPane().add(btnColorea);
		
	}
	
	

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		
		txf_color.repaint();
		repaint();
	}
	
}
