package grafica;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import View.botoes;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class login extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	private botoes jbCancelar, jbAcessar;	
	
	public login() {
			
		super("Pizzaria Delivery"); 

		//this.setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/pedido.png")));
			initLayout();
			this.setVisible(true);
	}
	
	private void initLayout() {
		
		setBounds(100, 100, 452, 243);
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsurio.setBounds(151, 49, 66, 30);
		panel.add(lblUsurio);
		
		textField = new JTextField();
		textField.setBounds(227, 49, 181, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(151, 112, 66, 30);
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(227, 112, 181, 30);
		panel.add(passwordField);
		
		jbCancelar = new botoes("Sair", 110, 40);
		jbCancelar.setIcon(new ImageIcon(getClass().getResource("/imagens/exit.png")));
		jbCancelar.setLocation(170,160);
		
		
		jbAcessar = new botoes("Acessar", 110, 40);
		jbAcessar.setIcon(new ImageIcon(getClass().getResource("/imagens/acessar.png")));
		jbAcessar.setLocation(300,160);
		
		panel.add(jbAcessar);
		panel.add(jbCancelar);
	}
}
