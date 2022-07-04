import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txf_mostrar;
	
	private float num1 = 0;
	private float num2 = 0;
	private float resultado = 0;
	private String operaciones = "";

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public String getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}
	
	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	public String decimales(float resultado) {
		String decimal = "";
		decimal = Float.toString(resultado);
		
		if(resultado % 1 == 0) {
			decimal = decimal.substring(0, decimal.length() -2);
		}
		return decimal;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txf_mostrar = new JTextField();
		txf_mostrar.setHorizontalAlignment(SwingConstants.RIGHT);
		txf_mostrar.setEditable(false);
		txf_mostrar.setBounds(24, 24, 372, 26);
		contentPane.add(txf_mostrar);
		txf_mostrar.setColumns(10);
		
		JButton btn_uno = new JButton("1");
		btn_uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "1");
			}
		});
		btn_uno.setBounds(24, 62, 39, 29);
		contentPane.add(btn_uno);
		
		JButton btn_cuatro = new JButton("4");
		btn_cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "4");
			}
		});
		btn_cuatro.setBounds(24, 103, 39, 29);
		contentPane.add(btn_cuatro);
		
		JButton btn_siete = new JButton("7");
		btn_siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "7");
			}
		});
		btn_siete.setBounds(24, 143, 39, 29);
		contentPane.add(btn_siete);
		
		JButton btn_punto = new JButton(".");
		btn_punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!(txf_mostrar.getText().contains("."))) {
					
					txf_mostrar.setText(txf_mostrar.getText()+ ".");
				}
			}
		});
		btn_punto.setBounds(24, 184, 39, 29);
		contentPane.add(btn_punto);
		
		JButton btn_dos = new JButton("2");
		btn_dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "2");
			}
		});
		btn_dos.setBounds(75, 62, 39, 29);
		contentPane.add(btn_dos);
		
		JButton btn_cinco = new JButton("5");
		btn_cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "5");
			}
		});
		btn_cinco.setBounds(75, 103, 39, 29);
		contentPane.add(btn_cinco);
		
		JButton btn_ocho = new JButton("8");
		btn_ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "8");
			}
		});
		btn_ocho.setBounds(75, 143, 39, 29);
		contentPane.add(btn_ocho);
		
		JButton btn_cero = new JButton("0");
		btn_cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "0");
			}
		});
		btn_cero.setBounds(75, 184, 39, 29);
		contentPane.add(btn_cero);
		
		JButton btn_tres = new JButton("3");
		btn_tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "3");
			}
		});
		btn_tres.setBounds(126, 62, 39, 29);
		contentPane.add(btn_tres);
		
		JButton btn_seis = new JButton("6");
		btn_seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "6");
			}
		});
		btn_seis.setBounds(126, 103, 39, 29);
		contentPane.add(btn_seis);
		
		JButton btn_nueve = new JButton("9");
		btn_nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText(txf_mostrar.getText()+ "9");
			}
		});
		btn_nueve.setBounds(126, 143, 39, 29);
		contentPane.add(btn_nueve);
		
		JButton btn_igual = new JButton("=");
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = Float.parseFloat(txf_mostrar.getText());
				
				switch(operaciones) {
	            
	                case "+"://SUMA
	                	resultado = num1 + num2;
	                	txf_mostrar.setText(decimales(getNum1() + getNum2()));
	                	break;
	                	
	                case "-"://RESTA
	                	resultado = num1 - num2;
	                	txf_mostrar.setText(decimales(getNum1() - getNum2()));
	                	break;
	                	
	                case "*"://MULTIPLICACIÓN
	                	resultado = num1 * num2;
	                	txf_mostrar.setText(decimales(getNum1() * getNum2()));
	                	break;
	                	
	                case "/"://DIVISIÓN
	                	if(num2 == 0) {
	                		txf_mostrar.setText("Error");
	                	}
	                	else {
		                	resultado = num1 / num1;
		                	txf_mostrar.setText(decimales(getNum1() / getNum2()));
	                	}
	                	break;
				}
			}
		});
                
			
		btn_igual.setBounds(126, 184, 39, 29);
		contentPane.add(btn_igual);
		
		JButton btn_mas = new JButton("+");
		btn_mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Float.parseFloat(txf_mostrar.getText());
				txf_mostrar.setText("+");
				operaciones = txf_mostrar.getText();
				txf_mostrar.setText("");
			}
		});
		btn_mas.setBounds(199, 62, 39, 29);
		contentPane.add(btn_mas);
		
		JButton btn_menos = new JButton("-");
		btn_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Float.parseFloat(txf_mostrar.getText());
				txf_mostrar.setText("-");
				operaciones = txf_mostrar.getText();
				txf_mostrar.setText("");
			}
		});
		btn_menos.setBounds(199, 103, 39, 29);
		contentPane.add(btn_menos);
		
		JButton btn_multiplicar = new JButton("*");
		btn_multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Float.parseFloat(txf_mostrar.getText());
				txf_mostrar.setText("*");
				operaciones = txf_mostrar.getText();
				txf_mostrar.setText("");
			}
		});
		btn_multiplicar.setBounds(199, 143, 39, 29);
		contentPane.add(btn_multiplicar);
		
		JButton btn_dividir = new JButton("/");
		btn_dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Float.parseFloat(txf_mostrar.getText());
				txf_mostrar.setText("/");
				operaciones = txf_mostrar.getText();
				txf_mostrar.setText("");
			}
		});
		btn_dividir.setBounds(199, 184, 39, 29);
		contentPane.add(btn_dividir);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txf_mostrar.setText("");
				num1 = 0;
				num2 = 0;
			}
		});
		btn_clear.setBounds(261, 62, 39, 29);
		contentPane.add(btn_clear);
	}

}
