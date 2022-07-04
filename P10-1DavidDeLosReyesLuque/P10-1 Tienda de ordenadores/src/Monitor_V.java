


import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
public class Monitor_V extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ArrayList<MonitorClase> mon;
	private JTextField txt_id;
	private JTextField txt_serie;
	private JTextField txt_tipo;
	private JTextField txt_pulg;
	private JTextField txt_precio;
	private int elem;

	
	public Monitor_V(ArrayList<MonitorClase> a) {
		mon=new ArrayList<MonitorClase>();	
		mon=a;
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		setModal(true);
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(null);
		
		//Pongo el formulario en el centro de la pantalla.
		this.setLocationRelativeTo(null);
		
		JLabel lbl_Elec = new JLabel("Elige Monitor");
		lbl_Elec.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Elec.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_Elec.setBounds(33, 11, 80, 14);
		getContentPane().add(lbl_Elec);
		
		JComboBox <String> Combo_Mon = new JComboBox <String>();
		Combo_Mon.setBounds(32, 36, 146, 22);
		getContentPane().add(Combo_Mon);
		for(MonitorClase mn:mon) {
			Combo_Mon.addItem(mn.getNumSerie());
		}	
				
		JPanel panel = new JPanel();
		panel.setBounds(42, 86, 349, 190);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_id = new JLabel("Identificador");
		lbl_id.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_id.setBounds(34, 15, 80, 14);
		panel.add(lbl_id);
		
		JLabel lbl_serie = new JLabel("N\u00BA de Serie");
		lbl_serie.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_serie.setBounds(34, 44, 80, 14);
		panel.add(lbl_serie);
		
		JLabel lbl_tipoMon = new JLabel("Tipo");
		lbl_tipoMon.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_tipoMon.setBounds(34, 73, 80, 14);
		panel.add(lbl_tipoMon);
		
		JLabel lbl_pulgada = new JLabel("Pulgadas");
		lbl_pulgada.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_pulgada.setBounds(34, 102, 80, 14);
		panel.add(lbl_pulgada);
		
		JLabel lbl_Precio = new JLabel("Precio");
		lbl_Precio.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_Precio.setBounds(34, 131, 80, 14);
		panel.add(lbl_Precio);
		
		txt_id = new JTextField();
		txt_id.setEditable(false);
		txt_id.setBounds(161, 12, 148, 20);
		panel.add(txt_id);
		txt_id.setColumns(10);
		
		txt_serie = new JTextField();
		txt_serie.setEditable(false);
		txt_serie.setColumns(10);
		txt_serie.setBounds(161, 41, 148, 20);
		panel.add(txt_serie);
		
		txt_tipo = new JTextField();
		txt_tipo.setColumns(10);
		txt_tipo.setBounds(161, 70, 148, 20);
		panel.add(txt_tipo);
		
		txt_pulg = new JTextField();
		txt_pulg.setColumns(10);
		txt_pulg.setBounds(161, 99, 148, 20);
		panel.add(txt_pulg);
		
		txt_precio = new JTextField();
		txt_precio.setColumns(10);
		txt_precio.setBounds(161, 128, 148, 20);
		panel.add(txt_precio);
			
		JButton btn_Ver = new JButton("Visualizar");
		btn_Ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				elem=Combo_Mon.getSelectedIndex();
				txt_id.setText(mon.get(elem).getIdent());
				txt_serie.setText(mon.get(elem).getNumSerie());
				txt_tipo.setText(mon.get(elem).getTipo());
				txt_pulg.setText(Integer.toString(mon.get(elem).getPulg()));
				txt_precio.setText(Float.toString(mon.get(elem).getPrecio()));
			}
		});
		btn_Ver.setFont(new Font("Arial", Font.BOLD, 12));
		btn_Ver.setBounds(265, 36, 110, 23);
		getContentPane().add(btn_Ver);
		
		JButton btn_Mod = new JButton("Modificar");
		btn_Mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=null;
				
				String url="jdbc:sqlite:/Users/davidrl/Desktop/SQLite/tienda2;";
				String db="tienda";
				String driver="sqlite.jdbc.Driver";
				String user="root";
				String pass="";
				try {
					
					con=DriverManager.getConnection(url);
					
					PreparedStatement ps=con.prepareStatement("UPDATE monitor set tipo= ?, pulgadas= ?, precio= ? where id=?");
					ps.setString(1,txt_tipo.getText());
					ps.setInt(2, Integer.parseInt(txt_pulg.getText()));
					ps.setFloat(3, Float.parseFloat(txt_precio.getText()));
					ps.setString(4, txt_id.getText());
					ps.executeUpdate();
					
					con.close();
				}
				
				catch (SQLException er) {
					er.printStackTrace();
				}
				catch (Exception er) {
					er.printStackTrace();
				}
				elem=Combo_Mon.getSelectedIndex();
				mon.get(elem).setPrecio(Float.parseFloat(txt_precio.getText()));
				mon.get(elem).setPulg(Integer.parseInt(txt_pulg.getText()));
				mon.get(elem).setTipo(txt_tipo.getText());
			}
		});
		btn_Mod.setFont(new Font("Arial", Font.BOLD, 12));
		btn_Mod.setBounds(42, 305, 89, 23);
		getContentPane().add(btn_Mod);
	}
}
