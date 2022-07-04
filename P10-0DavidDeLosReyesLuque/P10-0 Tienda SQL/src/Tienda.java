import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Tienda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		JMenuItem mn_categoria = new JMenuItem("Cargar Categor\u00EDa");
		mn_categoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Connection con=null;
					String url="jdbc:mysql://localhost:3306/";
					String db="tienda";
					String driver="com.mysql.cj.jdbc.Driver";
					String user="root";
					String pass="";
					try {
						Class.forName(driver);
						con=DriverManager.getConnection(url+db, user, pass);
						if(con != null) {
							System.out.println("La conexión ha sido un éxito");
						}
						Statement st=con.createStatement();
						ResultSet res=st.executeQuery("SELECT * FROM categoria");
						textArea.append("ID"+"\t"+"NOMBRE"+"\t"+"DESCRIPCIÓN"+"\n");
						
						while(res.next()) {
							String id=res.getString("ID");
							String nombre=res.getString("nombre");
							String desc=res.getString("descrip");
							textArea.append(id+"\t"+nombre+"\t"+desc+"\n");
						}
						con.close();
						System.out.println("La conexión ha sido un éxito");
					}
					catch (ClassNotFoundException err) {
						err.printStackTrace();
						System.out.println("Error al cargar el Driver");
					}
					catch (SQLException er) {
						er.printStackTrace();
						System.out.println("Error al conectar con la base de datos");
					}
					catch (Exception ee) {
						ee.printStackTrace();
						System.out.println("Error");
					}
				}
			
		});
		
			

		mnArchivo.add(mn_categoria);
		
		JMenuItem menu_Salir = new JMenuItem("Salir");
		menu_Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArchivo.add(menu_Salir);
		
		
	}

}


