package grafica;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

import javax.swing.JLabel;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.mUsuario;
import model.dao.daoUsuario;
import view.botoes;
import view.vPrincipal;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

import java.awt.Font;

public class login extends JDialog implements ActionListener {
	private JTextField jtfUsuario;
	private JPasswordField jpfSenha;

	private botoes jbCancelar, jbAcessar, jbPedido ;	
	private JLabel lblAcessoPizzariaDelivery, lblMensagemAcesso;
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
		
		setBounds(100, 100, 415, 208);
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsurio.setBounds(143, 25, 66, 30);
		panel.add(lblUsurio);
		
		jtfUsuario = new JTextField();
		jtfUsuario.setBounds(219, 25, 181, 30);
		panel.add(jtfUsuario);
		jtfUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(143, 77, 66, 30);
		panel.add(lblSenha);
		
		jpfSenha = new JPasswordField();
		jpfSenha.setBounds(219, 77, 181, 30);
		panel.add(jpfSenha);
		
		jbCancelar = new botoes("Sair", 110, 40);
		jbCancelar.setSize(101, 35);
		jbCancelar.setIcon(new ImageIcon(getClass().getResource("/imagens/exit.png")));
		jbCancelar.setLocation(155,128);
		
		
		jbAcessar = new botoes("Acessar", 110, 40);
		jbAcessar.setSize(101, 35);
		jbAcessar.setIcon(new ImageIcon(getClass().getResource("/imagens/acessar.png")));
		jbAcessar.setLocation(299,128);
		
		jpfSenha.setNextFocusableComponent(jbAcessar);
		
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
		
		lblMensagemAcesso = new JLabel("");
		lblMensagemAcesso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMensagemAcesso.setForeground(Color.RED);
		lblMensagemAcesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagemAcesso.setBounds(10, 0, 391, 21);
		panel.add(lblMensagemAcesso);
		
		
		jbAcessar.addActionListener(this);
		jbCancelar.addActionListener(this);
	}
	
	//Testeddd

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==jbAcessar) {
			validaUsuario();
			
			
		}
		if(e.getSource()==(jbCancelar))
			System.exit(0);
		
	}
	
	public void validaUsuario() {

		try {

			daoUsuario dUsuario = new daoUsuario();
			mUsuario ia = dUsuario.selectDesc(jtfUsuario.getText());

			if(ia.getuSenha().equals(jpfSenha.getText())) { 
				
				lblMensagemAcesso.setText("Acesso Liberado!");

				new vPrincipal();
				dispose();

			}
			
		}catch (Exception e) {
			
				lblMensagemAcesso.setText("Acesso Negado. Tente Novamente!");
				jtfUsuario.setText(null);
				jpfSenha.setText(null);
				jtfUsuario.requestFocus();
				
				System.out.println(e);
			}
		
	}
	
}
