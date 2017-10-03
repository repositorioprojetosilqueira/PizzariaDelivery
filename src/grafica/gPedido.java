package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import View.vTelaPadrao;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class gPedido extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;


	public gPedido() {
		super("Pedido", "/imagens/pedido16x16.png");
		setBounds(100, 100, 809, 415);
		jpCentro.setLayout(null);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 11, 46, 14);
		jpCentro.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 86, 20);
		jpCentro.add(textField);
		textField.setColumns(10);
		
		JButton btnBusca = new JButton("Busca");
		btnBusca.setBounds(167, 7, 61, 23);
		jpCentro.add(btnBusca);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 42, 46, 14);
		jpCentro.add(lblCliente);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 39, 162, 20);
		jpCentro.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 84, 86, 20);
		jpCentro.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(117, 84, 86, 20);
		jpCentro.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTelefone_1 = new JLabel("Telefone");
		lblTelefone_1.setBounds(10, 67, 46, 14);
		jpCentro.add(lblTelefone_1);
		
		JLabel label = new JLabel("Telefone");
		label.setBounds(120, 67, 46, 14);
		jpCentro.add(label);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 125, 218, 20);
		jpCentro.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 110, 61, 14);
		jpCentro.add(lblEndereo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 166, 218, 20);
		jpCentro.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 149, 46, 14);
		jpCentro.add(lblBairro);
		
		JLabel lblReferncia = new JLabel("Refer\u00EAncia:");
		lblReferncia.setBounds(10, 189, 61, 14);
		jpCentro.add(lblReferncia);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 204, 218, 20);
		jpCentro.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(420, 8, 201, 20);
		jpCentro.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(349, 11, 61, 14);
		jpCentro.add(lblDescrio);
		
		JButton btnBusca_1 = new JButton("Busca");
		btnBusca_1.setBounds(650, 7, 76, 23);
		jpCentro.add(btnBusca_1);

	}
}
