package view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class vMovCaixa extends vTelaPadrao{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblQuantidadeDePedidos;
	private JTextField textField_4;
	private JLabel label;
							
	  public vMovCaixa(){
		  super("Caixa - Recebimento","/imagens/caixa16x16.png");	
			
			inilayout();
			
			listagem();
			listagemCaixa();
			
		}
		
	private void inilayout() {
	
			JLabel lblNewLabel = new JLabel("Dinheiro:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(243, 292, 80, 14);
			jpCentro.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.RIGHT);
			textField.setText("350,00");
			textField.setEditable(false);
			textField.setBounds(333, 284, 70, 30);
			jpCentro.add(textField);
			textField.setColumns(10);
			
			JLabel lblCartoDeDbito = new JLabel("Cart\u00E3o de D\u00E9bito:");
			lblCartoDeDbito.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCartoDeDbito.setBounds(413, 292, 96, 14);
			jpCentro.add(lblCartoDeDbito);
			
			textField_1 = new JTextField();
			textField_1.setText("290,00");
			textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_1.setEditable(false);
			textField_1.setBounds(519, 284, 70, 30);
			jpCentro.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblCartoDeCrdito = new JLabel("Cart\u00E3o de Cr\u00E9dito:");
			lblCartoDeCrdito.setHorizontalAlignment(SwingConstants.RIGHT);
			lblCartoDeCrdito.setBounds(589, 292, 102, 14);
			jpCentro.add(lblCartoDeCrdito);
			
			textField_2 = new JTextField();
			textField_2.setText("451,00");
			textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_2.setEditable(false);
			textField_2.setBounds(701, 284, 70, 30);
			jpCentro.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblValorTotal = new JLabel("Valor Total:");
			lblValorTotal.setHorizontalAlignment(SwingConstants.RIGHT);
			lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblValorTotal.setBounds(537, 328, 113, 32);
			jpCentro.add(lblValorTotal);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.BOLD, 13));
			textField_3.setText("1.350,30");
			textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_3.setEditable(false);
			textField_3.setBounds(660, 331, 111, 35);
			jpCentro.add(textField_3);
			textField_3.setColumns(10);
			
			lblQuantidadeDePedidos = new JLabel("Quantidade de Pedidos:");
			lblQuantidadeDePedidos.setHorizontalAlignment(SwingConstants.RIGHT);
			lblQuantidadeDePedidos.setBounds(331, 336, 156, 20);
			jpCentro.add(lblQuantidadeDePedidos);
			
			textField_4 = new JTextField();
			textField_4.setText("32");
			textField_4.setEditable(false);
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			textField_4.setBounds(497, 331, 30, 30);
			jpCentro.add(textField_4);
			textField_4.setColumns(10);
			
			label = new JLabel("");
			label.setBounds(243, 347, 46, 14);
			jpCentro.add(label);
			
			JButton btnFecharCaixaf = new JButton("Fechar Caixa(F12)");
			btnFecharCaixaf.setBounds(622, 371, 149, 39);
			jpCentro.add(btnFecharCaixaf);
	
			
		}
		
		private void listagemCaixa() {
			String[] colunas = {"Pedido","Produto", "Cliente","Forma de Pagamento","Valor"};
			Object[][] FonteDeDados= {
				{"01", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
				{"02", "Pizza Tropeiro", "Jessica", "Dinheiro", "17,90"},
				{"03", "Pizza Calabresa", "Jessica", "Cartão Débito", "17,90"},
				{"04", "Pizza Queijo", "Jessica", "Dinheiro", "17,90"},
				{"05", "Pizza Provolone", "Fernanda", "Cartão Débito", "17,90"},
				{"06", "Pizza Chocolate", "Jessica", "Cartão de Crédito", "17,90"},
				{"07", "Pizza Banana", "Jessica", "Dinheiro", "17,90"},
				{"08", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
				{"09", "Pizza Frango", "Mateus", "Cartão de Crédito", "17,90"},
				{"10", "Pizza Calabresa", "Jessica", "Cartão Débito", "17,90"},
				{"11", "Pizza Portugues", "Jessica", "Dinheiro", "17,90"},
				{"12", "Pizza Da Casa", "Jessica", "Cartão Débito", "17,90"},
				{"13", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
				{"14", "Pizza Frango", "Jessica", "Dinheiro", "17,90"},
				{"15", "Pizza Calabresa", "Jessica", "Cartão Débito", "17,90"},
				{"16", "Pizza Catupi", "Jessica", "Dinheiro", "17,90"},
				{"17", "Pizza Calabresa", "Jessica", "Dinheiro", "17,90"},
				{"18", "Pizza Cheddar", "Jessica", "Dinheiro", "17,90"},
				{"19", "Pizza Calabresa", "Jessica", "Cartão Débito", "17,90"},
				{"20", "Pizza Bacon", "Jessica", "Dinheiro", "17,90"},
				{"21", "Pizza Calabresa", "Jessica", "Cartão de Crédito", "17,90"},
			};
			//243, 11, 488, 241
			//lista(colunas, FonteDeDados,270,40,500, 230,30);
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
			
			//lista(colunas, FonteDeDados,3,45,230, this.getHeight()-124,105);
			campoPesquisa("Data : ", 10, 8, 50,158);
			
		}

		@Override
		public void acoes() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void StatusTelaComponentes(boolean status) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void StatusBotoes(boolean status, boolean sEdit_Exc) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void limpaTela() {
			// TODO Auto-generated method stub
			
		}
		

}
