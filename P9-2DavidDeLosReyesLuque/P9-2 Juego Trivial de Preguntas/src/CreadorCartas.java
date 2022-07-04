import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class CreadorCartas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int contador = 0;
	String rutaFichero;
	
	Carta ca = new Carta();
	
	ArrayList<Carta> listaCartas = new ArrayList<Carta>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreadorCartas frame = new CreadorCartas();
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
	public CreadorCartas() {
		
		setTitle("CREADOR DE CARTAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 465);
		JPanel panel = new JPanel();//PANEL
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Juego");
		menuBar.add(mnNewMenu);
		
		JLabel lbl_pregunta = new JLabel("Pregunta:");
		lbl_pregunta.setBounds(74, 74, 61, 16);
		panel.add(lbl_pregunta);
		
		JLabel lbl_respuesta = new JLabel("Respuesta:");
		lbl_respuesta.setBounds(74, 196, 82, 16);
		panel.add(lbl_respuesta);
		
		JTextArea txa_pregunta = new JTextArea();
		txa_pregunta.setBounds(169, 74, 239, 100);
		panel.add(txa_pregunta);
		
		JTextArea txa_respuesta = new JTextArea();
		txa_respuesta.setBounds(169, 196, 239, 100);
		panel.add(txa_respuesta);
		
		JMenuItem menu_salir = new JMenuItem("Salir");
		menu_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menu_salir.setBounds(0, 19, 97, 19);
		panel.add(menu_salir);
		
		JButton btn_siguiente = new JButton("Siguiente");
		btn_siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador += 1;
				
				if(contador > listaCartas.size()) {            //GUARDO PREGUNTA Y RESPUESTA EN EL ARRAYLIST.
					ca.setPregunta(txa_pregunta.getText());
					ca.setRespuesta(txa_respuesta.getText());
					listaCartas.add(new Carta(ca.getPregunta(), ca.getRespuesta()));
					txa_pregunta.setText("");
					txa_respuesta.setText("");
				}
			}
		});
		btn_siguiente.setBounds(169, 332, 117, 29);
		panel.add(btn_siguiente);
		
		JMenuItem menu_guardar = new JMenuItem("Guardar");
		menu_guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser guardarComo = new JFileChooser();
				guardarComo.setApproveButtonText("Guardar");
				guardarComo.showSaveDialog(null);
				File archivo = new File(guardarComo.getSelectedFile()+ ".txt");
				try {
					
					BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
					for( Carta e1: listaCartas) {
						salida.write(e1.getPregunta()+ "*" +e1.getRespuesta());
						salida.newLine();
					}
					rutaFichero = archivo.getAbsolutePath(); //GUARDO EL PATH EN LA VARIABLE PARA ACCEDER A EL.
					salida.close();
					
				}catch(Exception exception) {
					exception.getMessage();
				}                                 			}
		});
		menu_guardar.setBounds(0, 0, 97, 19);
		panel.add(menu_guardar);
		
		
	}
}
