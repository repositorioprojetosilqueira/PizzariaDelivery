package grafica;

import javax.swing.JTextField;
import View.vTelaPadrao;
import javax.swing.JLabel;

import javax.swing.JButton;


public class gMovPedido extends vTelaPadrao {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	
	public gMovPedido() {
		
		super("Pedido", "/imagens/pedido16x16.png");
		
		jpCentro.setLayout(null);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 8, 61, 14);
		jpCentro.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(10, 22, 86, 20);
		jpCentro.add(textField);
		textField.setColumns(10);
		
		JButton btnBusca = new JButton("Busca");
		btnBusca.setBounds(106, 21, 76, 23);
		jpCentro.add(btnBusca);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 42, 46, 14);
		jpCentro.add(lblCliente);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 56, 162, 20);
		jpCentro.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 104, 86, 20);
		jpCentro.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 104, 98, 20);
		jpCentro.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTelefone_1 = new JLabel("Telefone");
		lblTelefone_1.setBounds(10, 87, 61, 14);
		jpCentro.add(lblTelefone_1);
		
		JLabel label = new JLabel("Telefone");
		label.setBounds(130, 87, 61, 14);
		jpCentro.add(label);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 145, 218, 20);
		jpCentro.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 130, 61, 14);
		jpCentro.add(lblEndereo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 186, 218, 20);
		jpCentro.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 169, 46, 14);
		jpCentro.add(lblBairro);
		
		JLabel lblReferncia = new JLabel("Refer\u00EAncia:");
		lblReferncia.setBounds(10, 209, 76, 14);
		jpCentro.add(lblReferncia);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 224, 218, 20);
		jpCentro.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(352, 22, 218, 20);
		jpCentro.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(352, 8, 61, 14);
		jpCentro.add(lblDescrio);
		
		JButton btnBusca_1 = new JButton("Busca");
		btnBusca_1.setBounds(580, 21, 76, 23);
		jpCentro.add(btnBusca_1);
		
		JLabel lblQtde = new JLabel("Qtde");
		lblQtde.setBounds(278, 8, 46, 14);
		jpCentro.add(lblQtde);
		
		textField_8 = new JTextField();
		textField_8.setBounds(278, 22, 54, 20);
		jpCentro.add(textField_8);
		textField_8.setColumns(10);	
		
	}

}
