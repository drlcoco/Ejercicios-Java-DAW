import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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

public class Juego extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int contador = 0;
	
	String line = null;
	
	
	String guardarTexto = "";
	String mostrarPregunta = "";
	String mostrarRespuesta = "";
	
	CreadorCartas cre = new CreadorCartas();
	
	Carta ju = new Carta();
	
	ArrayList<Carta> listaCartas2 = new ArrayList<Carta>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		
		setTitle("JUEGO DE PREGUNTAS Y RESPUESTAS");
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
		lbl_pregunta.setBounds(200, 74, 291, 16);
		panel.add(lbl_pregunta);
		
		JLabel lbl_respuesta = new JLabel("Respuesta:");
		lbl_respuesta.setBounds(200, 200, 291, 16);
		panel.add(lbl_respuesta);
		
		JLabel lbl_respuestaMostrar = new JLabel("");
		lbl_respuestaMostrar.setBounds(200, 220, 291, 16);
		panel.add(lbl_respuestaMostrar);
		
		JLabel txa_preguntaJugar = new JLabel("");
		txa_preguntaJugar.setBounds(200, 79, 239, 100);
		//txa_preguntaJugar.setEnabled(false);
		panel.add(txa_preguntaJugar);
		
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
				
			}
		});
		btn_siguiente.setBounds(169, 332, 117, 29);
		panel.add(btn_siguiente);
		
		JMenuItem menu_jugar = new JMenuItem("Jugar");
		menu_jugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JFileChooser explorador = new JFileChooser();
					explorador.setDialogTitle("Abrir documento");
					int seleccion = explorador.showDialog(null, "Abrir!");
					switch(seleccion) {
					case JFileChooser.APPROVE_OPTION:
					 //seleccionó abrir
					 break;

					case JFileChooser.CANCEL_OPTION:
					 //dio click en cancelar o cerro la ventana
					 break;

					case JFileChooser.ERROR_OPTION:
					 //llega aqui si sucede un error
					 break;
					}
					
					File archivo2 = explorador.getSelectedFile();
					
					BufferedReader reader = new BufferedReader(new FileReader(archivo2));
					
					while((line = reader.readLine()) != null) {
						String toTest = line;
						String[] result = toTest.split("*");
						for(String token:result) {
							System.out.println(line);
							//txa_preguntaJugar.setText(line);
						}
						mostrarPregunta = result[0];
						mostrarRespuesta = result[1];
						listaCartas2.add(new Carta(mostrarPregunta, mostrarRespuesta));
						//txa_preguntaJugar.setText(line);
						//txa_preguntaJugar.setText(token);
					}
					/*for(int i=0; i<listaCartas2.size(); i++) {
						txa_preguntaJugar.setText(line);
					}*/
										
					
					
					
				}catch(Exception exception) {
					exception.getMessage();
				 }
				
					txa_preguntaJugar.setText(line);
				
			}
		});
		menu_jugar.setBounds(0, 0, 97, 19);
		panel.add(menu_jugar);
		
		JButton btn_verRespuesta = new JButton("Ver Respuesta");
		btn_verRespuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*for(int i=0; i<listaCartas2.size(); i++) {
					lbl_respuestaMostrar.setText(line);
				}*/
				
				lbl_respuestaMostrar.setText(line);
				
				
				/*try {
					File archivo2 = explorador.getSelectedFile();

					
					FileReader fileReader2 = new FileReader(archivo2);
					BufferedReader reader2 = new BufferedReader(fileReader2);
					String line2 = null;
					String[] result2 = {};
					while((line2 = reader2.readLine()) != null) {
						result2 = line2.split("*");
					}
					for(String token:result2) {
						lbl_respuestaMostrar.setText(token);
					}
					
					reader2.close();
					
				}catch(Exception exception) {
					exception.getMessage();
				 }*/  
			}
		});
		btn_verRespuesta.setBounds(39, 332, 117, 29);
		panel.add(btn_verRespuesta);
		
		
	}
}

