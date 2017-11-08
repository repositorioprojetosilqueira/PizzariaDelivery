package grafica;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import view.vTelaPadrao;

	public class gMovCaixa extends vTelaPadrao {
		
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JLabel lblQuantidadeDePedidos;
		private JTextField textField_4;
		private JLabel label;
										
		
		
		public gMovCaixa() {
			super("Caixa - Recebimento","/imagens/caixa16x16.png");	
			
			inilayout();
			
			//listagem();
			//listagemCaixa();
			
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	public void limpaTela() {
		// TODO Auto-generated method stub
		
	}
		
	

}
