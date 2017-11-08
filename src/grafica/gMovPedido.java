package grafica;

import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import view.vTelaPadrao;

import javax.swing.JLabel;

import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;


public class gMovPedido extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public gMovPedido() {

		super("Pedido", "/imagens/pedido32x32.png");

		initiLayout();

	}


	private void initiLayout() {
		setSize(950, 540);

		jpCentro.setLayout(null);

		JLabel lblDescrio = new JLabel("Produto:");
		lblDescrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescrio.setBounds(13, 31, 76, 25);
		jpCentro.add(lblDescrio);

		JPanel panel = new JPanel();
		panel.setBounds(467, 11, 467, 447);
		jpCentro.add(panel);
		panel.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 12, 43, 14);
		panel.add(lblNome);

		textField = new JTextField();
		textField.setBounds(63, 8, 284, 32);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(368, 6, 89, 37);
		panel.add(btnBuscar);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 62, 55, 14);
		panel.add(lblTelefone);

		textField_1 = new JTextField();
		textField_1.setBounds(63, 53, 124, 32);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel label = new JLabel("Telefone:");
		label.setBounds(259, 62, 59, 14);
		panel.add(label);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(308, 51, 114, 32);
		panel.add(textField_2);

		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 110, 46, 14);
		panel.add(lblRua);

		textField_3 = new JTextField();
		textField_3.setBounds(63, 107, 183, 32);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setBounds(259, 110, 57, 14);
		panel.add(lblNmero);

		textField_9 = new JTextField();
		textField_9.setBounds(308, 101, 114, 32);
		panel.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblBairro_1 = new JLabel("Bairro:");
		lblBairro_1.setBounds(10, 168, 46, 14);
		panel.add(lblBairro_1);

		textField_10 = new JTextField();
		textField_10.setBounds(63, 159, 187, 32);
		panel.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(259, 168, 88, 14);
		panel.add(lblComplemento);

		textField_11 = new JTextField();
		textField_11.setBounds(339, 159, 107, 32);
		panel.add(textField_11);
		textField_11.setColumns(10);

		JLabel lblReferncia_1 = new JLabel("Referência de Entrega:");
		lblReferncia_1.setBounds(10, 202, 124, 14);
		panel.add(lblReferncia_1);

		textField_12 = new JTextField();
		textField_12.setBounds(10, 227, 436, 76);
		panel.add(textField_12);
		textField_12.setColumns(10);

		JLabel lblHistricoDeCompras = new JLabel("Histórico de Compras:");
		lblHistricoDeCompras.setBounds(10, 313, 113, 14);
		panel.add(lblHistricoDeCompras);

		textField_13 = new JTextField();
		textField_13.setBounds(10, 338, 436, 70);
		panel.add(textField_13);
		textField_13.setColumns(10);

		JButton btnAdd = new JButton("Add");
	
		btnAdd.setBounds(348, 80, 76, 29);
		jpCentro.add(btnAdd);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(13, 297, 132, 30);
		jpCentro.add(comboBox);
	
		JLabel lblEntregador = new JLabel("Entregador:");
		lblEntregador.setBounds(13, 279, 76, 14);
		jpCentro.add(lblEntregador);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar:");
		lblTotalAPagar.setBounds(293, 279, 95, 14);
		jpCentro.add(lblTotalAPagar);
		
		textField_4 = new JTextField();
		textField_4.setBounds(293, 305, 95, 30);
		jpCentro.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFormaDePagamento = new JLabel("Forma de Pagamento:");
		lblFormaDePagamento.setBounds(10, 346, 135, 14);
		jpCentro.add(lblFormaDePagamento);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 363, 135, 29);
		jpCentro.add(comboBox_1);
		
		JLabel lblTaxaEntrega = new JLabel("Taxa Entrega:");
		lblTaxaEntrega.setBounds(293, 346, 76, 14);
		jpCentro.add(lblTaxaEntrega);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(293, 367, 95, 30);
		jpCentro.add(textField_5);
		
		JCheckBox chckbxEntregue = new JCheckBox("Entregue");
		chckbxEntregue.setBounds(6, 407, 97, 23);
		jpCentro.add(chckbxEntregue);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(90, 28, 212, 30);
		jpCentro.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(90, 79, 212, 30);
		jpCentro.add(comboBox_3);
		
		JLabel lblAdicional = new JLabel("Adicional:");
		lblAdicional.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdicional.setBounds(13, 82, 76, 25);
		jpCentro.add(lblAdicional);
		
		textField_6 = new JTextField();
		textField_6.setBounds(312, 29, 34, 29);
		jpCentro.add(textField_6);
		textField_6.setColumns(10);
		
	}
/*	private void listagem() {
		String[] colunas = {"Quantidade","Produto", "Preço"};
		Object[][] FonteDeDados= {
				{"2", "Mussarela","R$ 3,20"},
				{"1", "Cebola Picada","R$ 1,10"},
				{" ", " "},	
				{" ", " "},	

				};
		lista(colunas, FonteDeDados, 10,135,380,140,30);
		
		}

*/


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
		

