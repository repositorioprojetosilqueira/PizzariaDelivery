package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import View.vTelaPadrao;


public class gCadCliente extends vTelaPadrao {

	public gCadCliente() {
	super("Cadastro Cliente","/imagens/cliente.png");
	
	initLayoutCliente(303, 11);
	
	
	listagem();
	
	}
	
	public void initLayoutCliente(int x, int y) {
		
		JPanel jpCliente = new JPanel();
		
		jpCliente.setSize(483,406);
		jpCliente.setLocation(x,y);
		jpCliente.setLayout(null);
		//800x500
		
		JLabel lbNome = new JLabel("Nome: ");
		lbNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNome.setBounds(0, 19, 67, 14);
		jpCliente.add(lbNome);
		
		JLabel lbTelefone1 = new JLabel("Telefone: ");
		lbTelefone1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTelefone1.setBounds(0, 66, 67, 14);
		jpCliente.add(lbTelefone1);
		
		JLabel lbTelefone2 = new JLabel("Telefone:");
		lbTelefone2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTelefone2.setBounds(247, 66, 73, 14);
		jpCliente.add(lbTelefone2);
		
		JLabel lbRua = new JLabel("Rua:");
		lbRua.setHorizontalAlignment(SwingConstants.RIGHT);
		lbRua.setBounds(8, 119, 59, 14);
		jpCliente.add(lbRua);
		
		JLabel lbNumero = new JLabel("N\u00BA:");
		lbNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lbNumero.setBounds(342, 119, 38, 14);
		jpCliente.add(lbNumero);
		
		JLabel lbComplemento = new JLabel("Complemento:");
		lbComplemento.setHorizontalAlignment(SwingConstants.RIGHT);
		lbComplemento.setBounds(247, 168, 86, 14);
		jpCliente.add(lbComplemento);
		
		JLabel lbBairro = new JLabel("Bairro:");
		lbBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lbBairro.setBounds(9, 168, 58, 14);
		jpCliente.add(lbBairro);
		
		JLabel lbReferencia = new JLabel("Refer\u00EAncia de Entrega:");
		lbReferencia.setBounds(34, 214, 173, 14);
		jpCliente.add(lbReferencia);
		
		JLabel lbHistorico = new JLabel("Historico de Compras: ");
		lbHistorico.setBounds(34, 323, 175, 14);
		jpCliente.add(lbHistorico);
		
		JTextField txtNome;
		JTextField txtRua;

		JTextField txtNumero;
		JTextField txtComplemento;
		JTextField txtBairro;

		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(77, 11, 395, 30);
		
		
		JFormattedTextField txtTelefone1 = new JFormattedTextField();
		txtTelefone1.setBounds(77, 58, 142, 30);
		
		
		JFormattedTextField txtTelefone2 = new JFormattedTextField();
		txtTelefone2.setBounds(330, 58, 142, 30);
		
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		txtRua.setBounds(77, 111, 256, 30);
		
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(390, 111, 82, 30);
		
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(335, 160, 137, 30);
		
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(77, 160, 173, 30);
		
		
		JTextArea txtReferencia = new JTextArea();
		txtReferencia.setWrapStyleWord(true);
		txtReferencia.setLineWrap(true);
		txtReferencia.setBounds(32, 239, 440, 73);
		
		
		JTextArea textHistorico = new JTextArea();
		textHistorico.setWrapStyleWord(true);
		textHistorico.setLineWrap(true);
		textHistorico.setBounds(32, 348, 440, 48);
		
		
		jpCliente.add(txtNome);
		jpCliente.add(txtTelefone1);
		jpCliente.add(txtTelefone2);
		jpCliente.add(txtRua);
		jpCliente.add(txtNumero);
		jpCliente.add(txtComplemento);
		jpCliente.add(txtBairro);
		jpCliente.add(txtReferencia);
		jpCliente.add(textHistorico);
		
		txtNome.setNextFocusableComponent(txtTelefone1);
		
		jpCentro.add(jpCliente);
	}
	
private void listagem() {
		
		String[] colunas = {"Nome","Telefone1","Telefone2"};
		Object[][] FonteDeDados= {
		{"Bruna Gomes", "3222-9908","9 9988-0001"},
		{"Denise Pacheco", "3232-9901","9 9988-0001"},
		{"Everaldo Junior", "3222-9908","9 9988-0001"},
		{"Fernanda Pacheco", "3222-9908","9 9988-0001"},
		{"Gabriela Xavier", "3222-9908","9 9988-0001"},
		{"Geovanna Antunes", "3222-9908","9 9988-0001"},
		{" ", " "}			
		};
		
		lista(colunas, FonteDeDados,3,45,290, this.getHeight()-124,105);
		campoPesquisa("Pesquisar : ", 5, 8, 70,218);
	}

}
