import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P83 extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P83 frame = new P83();
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
	public P83() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Práctica P8-3: Suma de dos números");
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel label1 = new JLabel("Introduce el primer nº");
		GridBagConstraints gbc_label1 = new GridBagConstraints();
		gbc_label1.insets = new Insets(0, 0, 5, 5);
		gbc_label1.gridx = 1;
		gbc_label1.gridy = 2;
		contentPane.add(label1, gbc_label1);
		
		num1 = new JTextField();
		GridBagConstraints gbc_num1 = new GridBagConstraints();
		gbc_num1.insets = new Insets(0, 0, 5, 5);
		gbc_num1.fill = GridBagConstraints.HORIZONTAL;
		gbc_num1.gridx = 3;
		gbc_num1.gridy = 2;
		contentPane.add(num1, gbc_num1);
		num1.setColumns(10);
		
		JLabel label2 = new JLabel("   Introduce el segundo nº");
		GridBagConstraints gbc_label2 = new GridBagConstraints();
		gbc_label2.insets = new Insets(0, 0, 5, 5);
		gbc_label2.gridx = 1;
		gbc_label2.gridy = 4;
		contentPane.add(label2, gbc_label2);
		
		num2 = new JTextField();
		GridBagConstraints gbc_num2 = new GridBagConstraints();
		gbc_num2.insets = new Insets(0, 0, 5, 5);
		gbc_num2.fill = GridBagConstraints.HORIZONTAL;
		gbc_num2.gridx = 3;
		gbc_num2.gridy = 4;
		contentPane.add(num2, gbc_num2);
		num2.setColumns(10);
		
		JLabel eResult = new JLabel("");
		GridBagConstraints gbc_eResult = new GridBagConstraints();
		gbc_eResult.anchor = GridBagConstraints.WEST;
		gbc_eResult.insets = new Insets(0, 0, 5, 0);
		gbc_eResult.gridx = 4;
		gbc_eResult.gridy = 6;
		contentPane.add(eResult, gbc_eResult);
		
		JButton bSumar = new JButton("Sumar");
		bSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int suma = 0;
				int numero1 = 0;
				int numero2 = 0;
				numero1 = Integer.parseInt(num1.getText());
				numero2 = Integer.parseInt(num2.getText());
				suma = numero1 + numero2;
				eResult.setText(String.valueOf("Suma: "+ suma));
			}
		});
		
		GridBagConstraints gbc_bSumar = new GridBagConstraints();
		gbc_bSumar.anchor = GridBagConstraints.WEST;
		gbc_bSumar.insets = new Insets(0, 0, 5, 5);
		gbc_bSumar.gridx = 3;
		gbc_bSumar.gridy = 6;
		contentPane.add(bSumar, gbc_bSumar);
	}

}
