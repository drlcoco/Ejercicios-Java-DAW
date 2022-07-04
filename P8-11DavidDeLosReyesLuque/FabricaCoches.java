import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FabricaCoches extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txf_matricula;
		
	static ArrayList<Coche> parqueCoches = new ArrayList<Coche>();//CREO EL ARRAYLIST
	
	Coche c = new Coche();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FabricaCoches frame = new FabricaCoches();
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
	public FabricaCoches() {
		setTitle("Fábrica de Coches Reyes S.A.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_matricula = new JLabel("Matrícula");
		lbl_matricula.setBounds(46, 41, 61, 16);
		contentPane.add(lbl_matricula);
		
		JLabel lbl_marca = new JLabel("Marca");
		lbl_marca.setBounds(46, 77, 61, 16);
		contentPane.add(lbl_marca);
		
		JLabel lbl_modelo = new JLabel("Modelo");
		lbl_modelo.setBounds(46, 114, 61, 16);
		contentPane.add(lbl_modelo);
		
		JLabel lbl_color = new JLabel("Color");
		lbl_color.setBounds(46, 152, 61, 16);
		contentPane.add(lbl_color);
		
		JLabel lbl_mensaje = new JLabel("");
		lbl_mensaje.setBounds(66, 237, 335, 16);
		contentPane.add(lbl_mensaje);
		
		txf_matricula = new JTextField();
		txf_matricula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(txf_matricula.getText().length() >= 7) {//SI INTENTA METER MÁS DE 7 CARACTERES, SONIDO BEEP.
					e.consume();
					java.awt.Toolkit.getDefaultToolkit().beep();
				}
				else {
					c.setMatricula(txf_matricula.getText());//SI SON 7 O MENOS, ESTABLECE LA MATRÍCULA.
				}
			}
		});
		txf_matricula.setBounds(119, 36, 96, 26);
		contentPane.add(txf_matricula);
		txf_matricula.setColumns(7);
		
		String [] marca = {"", "Audi", "BMW", "Seat"};//ARRAY DE MARCAS DEL COMBOBOX.
		JComboBox cmb_marca = new JComboBox(marca);
		cmb_marca.setSelectedIndex(0);
		cmb_marca.setBounds(119, 73, 96, 27);
		contentPane.add(cmb_marca);
		
		String [] modelo = {"", "A3", "A4", "A5", "320", "530", "Altea", "Toledo"};//ARRAY MODELO COMBOBOX.
		JComboBox cmb_modelo = new JComboBox(modelo);
		cmb_modelo.setSelectedIndex(0);
		cmb_modelo.setBounds(119, 110, 96, 27);
		contentPane.add(cmb_modelo);
		
		String [] color = {"", "Rojo", "Negro", "Gris", "Azul", "Blanco"};//ARRAY COLOR COMBOBOX.
		JComboBox cmb_color = new JComboBox(color);
		cmb_color.setSelectedIndex(0);
		cmb_color.setBounds(119, 148, 96, 27);
		contentPane.add(cmb_color);
		
		JButton btn_aleatoria = new JButton("Aleatoria");//BOTÓN MATRÍCULA ALEATORIA.
		btn_aleatoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbl_mensaje.setText("");//PRIMERO LIMPIO EL TEXTO.
				c.setMatricula(c.matAleatoria());//ESTABLEZCO LA MATRÍCULA LLAMANDO AL MÉTODO ALEATORIA CREADO.
				txf_matricula.setText(c.getMatricula());//MUESTRO LA MATRÍCULA ALEATORIA EN EL JTEXTFIELD.
			}
		});
		btn_aleatoria.setBounds(215, 36, 86, 29);
		contentPane.add(btn_aleatoria);
		
		JTextArea txt_mostrar = new JTextArea();
		txt_mostrar.setBounds(227, 77, 197, 132);
		contentPane.add(txt_mostrar);
		
		JButton btn_fabricar = new JButton("Fabricar Coche");//BOTÓN FABRICAR COCHE.
		btn_fabricar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				c.setMarca((cmb_marca).getSelectedItem().toString());//ESTABLEZCO LA VARIABLE MARCA CON EL TEXTO DEL ITEM SELECCIONADO EN EL COMBOBOX MARCA.
				c.setModelo((cmb_modelo).getSelectedItem().toString());//ESTABLEZCO EL MODELO CON EL TEXTO DEL ITEM SELECCIONADO EN EL COMBOBOX MODELO.
				c.setColor((cmb_color).getSelectedItem().toString());//ESTABLEZCO EL COLOR CON EL TEXTO DEL ITEM SELECCIONADO EN EL COMBOBOX COLOR.
				
				if (c.getNumCoches() < c.getMAX_VEHICULOS()) {//SI EL NÚMERO DE COCHES CREADOS ES MENOR QUE EL NÚMERO MÁXIMO DE COCHES QUE AHORA ES 5.
					parqueCoches.add(new Coche(c.getMatricula(), c.getMarca(), c.getModelo(), c.getColor()));//AÑADO UN NUEVO COCHE AL ARRAYLIST CON LOS DATOS INTRODUCIDOS POR PANTALLA.
					c.setNumCoches(c.getNumCoches() + 1);//SUMO UNO A LA VARIABLE NÚMERO DE COCHES FABRICADOS.
					lbl_mensaje.setText("Ha sido creado el coche nº "+ c.getNumCoches() +" correctamente.");//MENSAJE.
					txf_matricula.setText("");//LIMPIO EL JTEXTFIELD.
					cmb_marca.setSelectedIndex(0);
					cmb_modelo.setSelectedIndex(0);//LIMPIO LOS COMBOBOX.
					cmb_color.setSelectedIndex(0);
				}
				else {
					lbl_mensaje.setText("No es posible crear más coches, está lleno");//MENSAJE.
				}
			}
		});
		btn_fabricar.setBounds(56, 187, 117, 29);
		contentPane.add(btn_fabricar);
		
		JButton btn_mostrar = new JButton("Mostrar Parque");
		btn_mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_mostrar.setText("");
				lbl_mensaje.setText("");
				for( Coche e1: parqueCoches) {
					txt_mostrar.append(e1.toString());//MUESTRO TODOS LOS COCHES CREADOS EN EL ARRAYLIST.
        		}
				
			}
		});
		btn_mostrar.setBounds(298, 36, 133, 29);
		contentPane.add(btn_mostrar);
		
	}
	
}
