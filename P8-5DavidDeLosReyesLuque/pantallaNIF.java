import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pantallaNIF extends JFrame {

	private JPanel contentPane;
	private JTextField txf_nombre;
	private JTextField txf_dni;
	
	Persona persona = new Persona();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantallaNIF frame = new pantallaNIF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pantallaNIF() {
		setTitle("Cálculo del NIF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(49, 40, 61, 16);
		contentPane.add(lbl_nombre);
		
		JLabel lbl_dni = new JLabel("DNI");
		lbl_dni.setBounds(49, 96, 61, 16);
		contentPane.add(lbl_dni);
		
		JLabel lbl_eResult = new JLabel("");
		lbl_eResult.setBounds(178, 153, 255, 16);
		contentPane.add(lbl_eResult);
		
		JButton btn_calc = new JButton("Calcula NIF");
		btn_calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				persona.setNombre(txf_nombre.getText());
				persona.setDni(Integer.parseInt(txf_dni.getText()));
				lbl_eResult.setText(persona.calculaNif());
			}

		});
		btn_calc.setBounds(49, 148, 117, 29);
		contentPane.add(btn_calc);
		
		JButton btn_borr = new JButton("Borrar datos");
		btn_borr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_nombre.setText("");
				txf_dni.setText("");
				lbl_eResult.setText("");
			}
		});
		btn_borr.setBounds(49, 205, 117, 29);
		contentPane.add(btn_borr);
		
		txf_nombre = new JTextField();
		txf_nombre.setBounds(178, 35, 130, 26);
		contentPane.add(txf_nombre);
		txf_nombre.setColumns(10);
		
		txf_dni = new JTextField();
		txf_dni.setBounds(178, 91, 255, 26);
		contentPane.add(txf_dni);
		txf_dni.setColumns(10);
		
	}
}
