import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Miventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miventana window = new Miventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Miventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 12));
		frame.getContentPane().setForeground(SystemColor.control);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(50, 59, 324, 144);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Código del departamento:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 36, 141, 15);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del departamento:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 62, 141, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad departamento:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 88, 141, 15);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(Color.MAGENTA);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setBounds(161, 33, 50, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_1.setBounds(161, 59, 96, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_2.setBounds(161, 85, 96, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DATOS DEL DEPARTAMENTO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setBounds(108, 11, 215, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnInsertarDatos = new JButton("Insertar Datos");
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInsertarDatos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnInsertarDatos.setBounds(76, 215, 121, 23);
		frame.getContentPane().add(btnInsertarDatos);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(" SE HA PULSADO EL BOTON LIMPIAR");
				JTextField caja;
				for(int i = 0; i < panel.getComponentCount(); i++) 
				{
					if (panel.getComponent(i).getClass().getName().equals("javax.swing.JTextField"))
					{
						caja = (JTextField)panel.getComponent(i);
						caja.setText("");
					}
				}
				/*	textField_2.setText(null);
				 *	textField_1.setText(null);
				 *	textField.setText(null);	*/
			}
		});
		btnLimpiarDatos.setBounds(234, 215, 121, 23);
		frame.getContentPane().add(btnLimpiarDatos);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
