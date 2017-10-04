package grafica;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import View.vTelaPadrao;
import javax.swing.JTextField;
import java.awt.Font;


public class gCaixa extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblQuantidadeDePedidos;
	private JTextField textField_4;
	private JLabel label;


	
	public gCaixa() {
		
		super("Caixa - Recebimento","/imagens/caixa16x16.png");	
		
		inilayout();
		
		listagem();
		listagemCaixa();
		
	}
	
	private void inilayout() {
		JLabel lblNewLabel = new JLabel("Dinheiro:");
		lblNewLabel.setBounds(542, 291, 93, 14);
		jpCentro.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(645, 276, 86, 32);
		jpCentro.add(textField);
		textField.setColumns(10);
		
		JLabel lblCartoDeDbito = new JLabel("Cart\u00E3o de D\u00E9bito:");
		lblCartoDeDbito.setBounds(513, 322, 121, 14);
		jpCentro.add(lblCartoDeDbito);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(645, 307, 86, 32);
		jpCentro.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCartoDeCrdito = new JLabel("Cart\u00E3o de Cr\u00E9dito:");
		lblCartoDeCrdito.setBounds(513, 353, 122, 14);
		jpCentro.add(lblCartoDeCrdito);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(645, 338, 86, 32);
		jpCentro.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorTotal.setBounds(542, 382, 93, 32);
		jpCentro.add(lblValorTotal);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(645, 378, 111, 36);
		jpCentro.add(textField_3);
		textField_3.setColumns(10);
		
		lblQuantidadeDePedidos = new JLabel("Quantidade de Pedidos:");
		lblQuantidadeDePedidos.setBounds(243, 291, 136, 14);
		jpCentro.add(lblQuantidadeDePedidos);
		
		textField_4 = new JTextField();
		textField_4.setBounds(385, 288, 30, 20);
		jpCentro.add(textField_4);
		textField_4.setColumns(10);
		
		label = new JLabel("");
		label.setBounds(243, 347, 46, 14);
		jpCentro.add(label);
		
		JButton btnFecharCaixaf = new JButton("Fechar Caixa(F12)");
		btnFecharCaixaf.setBounds(243, 328, 149, 39);
		jpCentro.add(btnFecharCaixaf);

		
	}
	
	private void listagemCaixa() {
		String[] colunas = {"Pedido","Produto", "Cliente","Forma de Pagamento","Valor"};
		Object[][] FonteDeDados= {
			{"01", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
			{"01", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
			{"01", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
			{"01", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
			{"01", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
			{"01", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
			{"01", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
		};
		//243, 11, 488, 241
		lista(colunas, FonteDeDados,270,40,500, 230,30);
	}
	
	
	private void listagem() {
		
		String[] colunas = {"Data", "Total"};
		Object[][] FonteDeDados= {
		{"01/09/2017", "R$ 800,00"},
		{"02/09/2017", "R$ 980,00"},
		{"03/09/2017", "R$ 923,80"},
		{"04/09/2017", "R$ 1550,10"},
		{"05/09/2017", "R$ 1454,00"},
		{"06/09/2017", "R$ 768,00"},
		{"07/09/2017", "R$ 923,00"}			
		};
		
		lista(colunas, FonteDeDados,3,45,230, this.getHeight()-124,105);
		campoPesquisa("Data : ", 10, 8, 50,158);
		
	}
	

}
