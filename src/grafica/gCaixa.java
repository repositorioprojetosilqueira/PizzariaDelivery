package grafica;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

import view.vTelaPadrao;

import java.awt.Font;


public class gCaixa extends vTelaPadrao {
	private JTextField txtDinheiro;
	private JTextField txtCartaoD;
	private JTextField txtCartaoC;
	private JTextField txtValorT;
	private JLabel lbQntP;
	private JTextField txtQntP;
	private JLabel label;


	
	public gCaixa() {
		
		super("Caixa - Recebimento","/imagens/caixa16x16.png");	
		
		inilayout();
		
		listagem();
		listagemCaixa();
		
	}
	
	private void inilayout() {
		JLabel lbDinheiro = new JLabel("Dinheiro:");
		lbDinheiro.setBounds(542, 291, 93, 14);
		jpCentro.add(lbDinheiro);
		
		txtDinheiro = new JTextField();
		txtDinheiro.setEditable(false);
		txtDinheiro.setBounds(645, 276, 86, 32);
		jpCentro.add(txtDinheiro);
		txtDinheiro.setColumns(10);
		
		JLabel lbCartaoD = new JLabel("Cart\u00E3o de D\u00E9bito:");
		lbCartaoD.setBounds(513, 322, 121, 14);
		jpCentro.add(lbCartaoD);
		
		txtCartaoD = new JTextField();
		txtCartaoD.setEditable(false);
		txtCartaoD.setBounds(645, 307, 86, 32);
		jpCentro.add(txtCartaoD);
		txtCartaoD.setColumns(10);
		
		JLabel lbCartaoC = new JLabel("Cart\u00E3o de Cr\u00E9dito:");
		lbCartaoC.setBounds(513, 353, 122, 14);
		jpCentro.add(lbCartaoC);
		
		txtCartaoC = new JTextField();
		txtCartaoC.setEditable(false);
		txtCartaoC.setBounds(645, 338, 86, 32);
		jpCentro.add(txtCartaoC);
		txtCartaoC.setColumns(10);
		
		JLabel lbValorT = new JLabel("Valor Total:");
		lbValorT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbValorT.setBounds(542, 382, 93, 32);
		jpCentro.add(lbValorT);
		
		txtValorT = new JTextField();
		txtValorT.setEditable(false);
		txtValorT.setBounds(645, 378, 111, 36);
		jpCentro.add(txtValorT);
		txtValorT.setColumns(10);
		
		lbQntP = new JLabel("Quantidade de Pedidos:");
		lbQntP.setBounds(243, 291, 136, 14);
		jpCentro.add(lbQntP);
		
		txtQntP = new JTextField();
		txtQntP.setBounds(385, 288, 30, 20);
		jpCentro.add(txtQntP);
		txtQntP.setColumns(10);
		
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
