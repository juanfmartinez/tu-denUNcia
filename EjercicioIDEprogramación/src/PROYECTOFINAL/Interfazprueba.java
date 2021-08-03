package PROYECTOFINAL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfazprueba extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfazprueba frame = new Interfazprueba();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfazprueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnbotoningrso = new JButton("INGRESAR");
		btnbotoningrso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre= txtnombre.getText();
				
				JOptionPane.showMessageDialog(null,"Bienvenido "+nombre+" ¿Desea ingresar una denuncia o consultar el estado de una? ( RESPONDA CON consultar O CON denunciar ( sin espacios )) ");
			}
		});
		
		btnbotoningrso.setBounds(517, 229, 123, 21);
		contentPane.add(btnbotoningrso);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(226, 228, 265, 24);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al portal de denuncias, \r\n\r\n");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(267, 22, 352, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblimagenderechos = new JLabel("");
		lblimagenderechos.setIcon(new ImageIcon("C:\\Users\\marti\\OneDrive\\Escritorio\\Fondoderechos.png"));
		lblimagenderechos.setBounds(-18, 22, 305, 277);
		contentPane.add(lblimagenderechos);
		
		JLabel lblPorFavorIngrese = new JLabel("por favor ingrese su nombre:");
		lblPorFavorIngrese.setForeground(Color.WHITE);
		lblPorFavorIngrese.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPorFavorIngrese.setBounds(288, 39, 352, 86);
		contentPane.add(lblPorFavorIngrese);
		
		JLabel lblTituloprincipal = new JLabel("Portal de denuncias");
		lblTituloprincipal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTituloprincipal.setForeground(Color.LIGHT_GRAY);
		lblTituloprincipal.setBounds(10, -32, 493, 86);
		contentPane.add(lblTituloprincipal);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(-8, 0, 661, 361);
		lblFondo.setIcon(new ImageIcon("C:\\Users\\marti\\OneDrive\\Escritorio\\FONDOCICLO.jpg"));
		contentPane.add(lblFondo);
	}
}
