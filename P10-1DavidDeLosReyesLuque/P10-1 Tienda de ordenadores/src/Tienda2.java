import java.awt.EventQueue;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;
import java.util.ArrayList;

public class Tienda2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<MonitorClase> mc;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda2 vent1 = new Tienda2();
					vent1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda2() {
		setTitle("Tienda de Ordenadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		
		//Pongo el formulario en el centro de la pantalla.
				this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 10, 10);
		setContentPane(panel);
		panel.setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(8, 11, 720, 317);
		panel.add(textArea);		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem Menu_cat = new JMenuItem("Cargar Categor\u00EDa");
		Menu_cat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con=null;
				
				String url="jdbc:sqlite:/Users/davidrl/Desktop/SQLite/tienda2;";
				String db="tienda";
				String driver="sqlite.jdbc.Driver";
				String user="root";
				String pass="";
				try {
					
					con=DriverManager.getConnection(url);
					if(con != null) {
						JOptionPane.showMessageDialog(null,  "La conexión ha sido un éxito.");
					}
						Statement st=con.createStatement();
						ResultSet res=st.executeQuery("SELECT * FROM categoria;");
						textArea.append("ID"+"\t"+"NOMBRE"+"\t"+"DESCRIPCI�N"+"\n");
						
						while(res.next()) {
							String id=res.getString("ID");
							String nombre=res.getString("nombre");
							String desc=res.getString("descrip");
							textArea.append(id+"\t"+nombre+"\t"+desc+"\n");
						}
						con.close();
					}
					catch (SQLException er) {
						er.printStackTrace();
					}
					catch (Exception ee) {
						ee.printStackTrace();
					}
				}
			
		});
		
			

		mnArchivo.add(Menu_cat);
		
		JMenuItem menu_Salir = new JMenuItem("Salir");
		menu_Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArchivo.add(menu_Salir);
		
		JMenu mnComponentes = new JMenu("Componentes");
		menuBar.add(mnComponentes);
		
		JMenuItem menu_Mon = new JMenuItem("Monitor");
		menu_Mon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mc=new ArrayList<MonitorClase>();
				Connection con=null;
				
				String url="jdbc:sqlite:/Users/davidrl/Desktop/SQLite/tienda2;";
				String db="tienda";
				String driver="sqlite.jdbc.Driver";
				String user="root";
				String pass="";
				try {
					
					con=DriverManager.getConnection(url);
					if(con != null) {
						JOptionPane.showMessageDialog(null,  "La conexión ha sido un éxito.");
					}
					
					Statement st=con.createStatement();
					ResultSet res=st.executeQuery("SELECT * FROM monitor");
					while (res.next()) {
						MonitorClase mcc=new MonitorClase();
						mcc.setNumSerie(res.getString("numSerie"));
						mcc.setPrecio(res.getFloat("precio"));
						mcc.setPulg(res.getInt("pulgadas"));
						mcc.setIdent(res.getString("ID"));
						mcc.setTipo(res.getString("tipo"));
						mc.add(mcc);
					}
					con.close();
			
				}
				
				catch (SQLException er) {
					er.printStackTrace();
				}
				catch(Exception ae) {
					ae.printStackTrace();
				}
				new Monitor_V(mc);
			}
		});
		mnComponentes.add(menu_Mon);
		
		JMenuItem menu_ord = new JMenuItem("Ordenador");
		mnComponentes.add(menu_ord);
		
		JMenuItem menu_Tec = new JMenuItem("Teclado");
		mnComponentes.add(menu_Tec);
		
		JMenuItem menu_Rat = new JMenuItem("Ratón");
		mnComponentes.add(menu_Rat);
		
		
		
	}
}