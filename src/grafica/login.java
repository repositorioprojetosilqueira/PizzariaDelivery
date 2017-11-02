package grafica;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Event;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.omg.CORBA.Principal;

import View.botoes;
import View.vPrincipal;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public class login extends JDialog implements ActionListener {
	private JTextField textField;
	private JPasswordField passwordField;

	private botoes jbCancelar, jbAcessar, jbPedido ;	
	private JLabel lblAcessoPizzariaDelivery;
	private JPanel panel_1;
	
	public login() {
			
		super(); 

			
			initLayout();
			
			this.setLocationRelativeTo(null);
			this.setUndecorated(true);
			
			//this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			this.setVisible(true);
	}
	
	private void initLayout() {
		
		setBounds(100, 100, 430, 207);
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsurio.setBounds(143, 25, 66, 30);
		panel.add(lblUsurio);
		
		textField = new JTextField();
		textField.setBounds(219, 25, 181, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(143, 77, 66, 30);
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(219, 77, 181, 30);
		panel.add(passwordField);
		
		jbCancelar = new botoes("Sair", 110, 40);
		jbCancelar.setSize(101, 35);
		jbCancelar.setIcon(new ImageIcon(getClass().getResource("/imagens/exit.png")));
		jbCancelar.setLocation(174,137);
		
		
		jbAcessar = new botoes("Acessar", 110, 40);
		jbAcessar.setSize(101, 35);
		jbAcessar.setIcon(new ImageIcon(getClass().getResource("/imagens/acessar.png")));
		jbAcessar.setLocation(299,137);
		
		passwordField.setNextFocusableComponent(jbAcessar);
		
		panel.add(jbAcessar);
		panel.add(jbCancelar);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		lblAcessoPizzariaDelivery = new JLabel("Pizzaria Delivery 1.0");
		lblAcessoPizzariaDelivery.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAcessoPizzariaDelivery.setForeground(new Color(255, 255, 255));
		panel_1.add(lblAcessoPizzariaDelivery);
		


		ImageIcon im = new ImageIcon(getClass().getResource("/imagens/pedido.png"));
		
		JLabel iLogin = new JLabel(im);
		iLogin.setBounds(35,25, 110, 110);
		iLogin.setVisible(true);
		
		panel.add(iLogin);
		
		
		jbAcessar.addActionListener(this);
		jbCancelar.addActionListener(this);
	}
	
	//Teste

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==jbAcessar) {
			new vPrincipal();
			this.dispose();
		}
		if(e.getSource()==(jbCancelar))
			System.exit(0);
		
	}
}
