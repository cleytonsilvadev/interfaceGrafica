package view;

import javax.swing.JOptionPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class viewPrimeiraTela {

	private JFrame frame;
	private JTextField txtUsuario;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewPrimeiraTela window = new viewPrimeiraTela();
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
	public viewPrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBackground(Color.LIGHT_GRAY);
		lblUsuario.setBounds(71, 45, 50, 27);
		frame.getContentPane().add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setBackground(Color.LIGHT_GRAY);
		txtUsuario.setBounds(151, 48, 181, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		JButton btnMotrar = new JButton("Entrar");
		btnMotrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Usuario "+txtUsuario.getText()+ " logado com sucesso"  );

			}
		});
		btnMotrar.setBounds(186, 168, 89, 23);
		frame.getContentPane().add(btnMotrar);

		JLabel txtSenha = new JLabel("Senha");
		txtSenha.setBackground(Color.LIGHT_GRAY);
		txtSenha.setBounds(71, 102, 50, 17);
		frame.getContentPane().add(txtSenha);

		textSenha = new JTextField();
		textSenha.setBackground(Color.LIGHT_GRAY);
		textSenha.setBounds(151, 99, 181, 20);
		frame.getContentPane().add(textSenha);
		textSenha.setColumns(10);
	}
}
