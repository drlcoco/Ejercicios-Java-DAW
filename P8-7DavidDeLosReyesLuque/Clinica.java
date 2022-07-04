import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clinica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField txf_nombre;

	Pacientes p = new Pacientes();//SE CREA EL OBJETO DE TIPO PACIENTE.
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clinica frame = new Clinica();
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
	public Clinica() {
		setTitle("CLÍNICA DE LOS REYES S.A.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 465);
		JPanel panel = new JPanel();//PANEL
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lbl_nombre = new JLabel("* Nombre");//LABEL NOMBRE
		lbl_nombre.setBounds(22, 25, 61, 16);
		panel.add(lbl_nombre);
		
		JLabel lbl_edad = new JLabel("* Edad");//LABEL EDAD
		lbl_edad.setBounds(22, 53, 61, 16);
		panel.add(lbl_edad);
		
		JLabel lbl_peso = new JLabel("* Peso");//LABEL PESO
		lbl_peso.setBounds(22, 81, 61, 16);
		panel.add(lbl_peso);
		
		JLabel lbl_estatura = new JLabel("* Estatura");//LABEL ESTATURA
		lbl_estatura.setBounds(22, 109, 61, 16);
		panel.add(lbl_estatura);
		
		txf_nombre = new JTextField();//TEXFIELD NOMBRE
		txf_nombre.setBounds(112, 20, 332, 26);
		panel.add(txf_nombre);
		txf_nombre.setColumns(10);
		
		JLabel lbl_provincia = new JLabel("  Provincia");//LABEL PROVINCIA
		lbl_provincia.setBounds(231, 53, 79, 16);
		panel.add(lbl_provincia);
		
		String [] ciudades = {"", "Alicante", "Castellón", "Valencia"};
		JComboBox cmb_provincia = new JComboBox(ciudades);//COMBOBOX PROVINCIA
		cmb_provincia.setSelectedIndex(0);
		cmb_provincia.setBounds(313, 49, 131, 27);
		panel.add(cmb_provincia);
		
		JTextArea txt_mostrar = new JTextArea();//TEXTAREA MOSTRAR DATOS
		txt_mostrar.setEditable(false);
		txt_mostrar.setBounds(83, 265, 302, 154);
		panel.add(txt_mostrar);
		
		JRadioButton rbt_hombre = new JRadioButton("Hombre");
		rbt_hombre.setBounds(213, 75, 88, 23);
		panel.add(rbt_hombre);
		rbt_hombre.setSelected(false);
		
		JRadioButton rbt_mujer = new JRadioButton("Mujer");//RADIOBUTTON MUJER
		rbt_mujer.setBounds(213, 104, 141, 23);
		panel.add(rbt_mujer);
		rbt_mujer.setSelected(false);
		
		ButtonGroup btg_sexo = new ButtonGroup();//SE CREA UN GRUPO DE RADIOBOTONES HOMBRE Y MUJER
		btg_sexo.add(rbt_hombre);
		btg_sexo.add(rbt_mujer);
		
		JSpinner spn_edad = new JSpinner(new SpinnerNumberModel(0, 0, 120, 1));//SPINNER EDAD
		spn_edad.setBounds(112, 48, 79, 26);
		panel.add(spn_edad);
		
		JSpinner spn_peso = new JSpinner(new SpinnerNumberModel(0.0, 0.0, 300.0, 0.5));//SPINNER PESO
		spn_peso.setBounds(112, 76, 79, 26);
		panel.add(spn_peso);
		
		JSpinner spn_estatura = new JSpinner(new SpinnerNumberModel(0.00, 0.00, 2.30, 0.01));//SPINNER ESTATURA
		spn_estatura.setBounds(112, 104, 79, 26);
		panel.add(spn_estatura);
		
		JCheckBox cbx_dieta = new JCheckBox("Ha hecho dieta alguna vez ");//CHECKBOX DIETA
		cbx_dieta.setBounds(213, 133, 156, 23);
		panel.add(cbx_dieta);
		
		JButton btn_estado = new JButton("Calcular estado");//BOTÓN ESTADO
		btn_estado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setNombre(txf_nombre.getText());
				p.setEdad((spn_edad).getValue().toString());
				p.setPeso(Float.parseFloat((spn_peso).getValue().toString()));
				p.setEstatura(Float.parseFloat((spn_estatura).getValue().toString()));
				p.calculaIMC();
				p.calculaEstado();
				p.setProvincia((cmb_provincia).getSelectedItem().toString());
				if(rbt_hombre.isSelected()) {
					p.setSexo(rbt_hombre.getText());
				}
				else {
					p.setSexo(rbt_mujer.getText());
				}
				if(cbx_dieta.isSelected()){
					p.setDieta("Ha realizado dieta alguna vez");
				}
				else {
					p.setDieta("No ha realizado dieta nunca");
				}
				txt_mostrar.setText(p.mostrarDatos());//USO ESTE MÉTODO PARA MOSTRAR DATOS PORQUE EL TOSTRING() LO TENGO CREADO Y SE QUEDA FATAL
			}
		});
		btn_estado.setBounds(139, 168, 196, 40);
		panel.add(btn_estado);
		
		JButton btn_borrar = new JButton("Borrar datos");//BOTÓN BORRAR
		btn_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txf_nombre.setText("");//MÉTODO QUE BORRA TODOS LOS DATOS DEL PACIENTE.
				spn_edad.setValue(0);
				spn_peso.setValue(0.0);
				spn_estatura.setValue(0.00);
				cmb_provincia.setSelectedIndex(0);
				txt_mostrar.setText("");
				btg_sexo.clearSelection();
				cbx_dieta.setSelected(false);
			}
		});
		btn_borrar.setBounds(139, 213, 196, 40);
		panel.add(btn_borrar);
		
	}
}
