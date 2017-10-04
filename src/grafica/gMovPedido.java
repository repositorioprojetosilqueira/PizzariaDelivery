package grafica;

import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import View.vTelaPadrao;
import javax.swing.JLabel;

import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;


public class gMovPedido extends vTelaPadrao {
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;

	public gMovPedido() {

		super("Pedido", "/imagens/pedido32x32.png");

		initiLayout();
		
		listagem();
		
	}


	private void initiLayout() {
		setSize(950, 540);

		jpCentro.setLayout(null);

		textField_7 = new JTextField();
		textField_7.setBounds(84, 25, 218, 29);
		jpCentro.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblDescrio = new JLabel("Descrição:");
		lblDescrio.setBounds(84, 11, 61, 14);
		jpCentro.add(lblDescrio);

		JButton btnBusca_1 = new JButton("Busca");
		btnBusca_1.setBounds(312, 24, 76, 30);
		jpCentro.add(btnBusca_1);

		JLabel lblQtde = new JLabel("Qtde");
		lblQtde.setBounds(10, 11, 46, 14);
		jpCentro.add(lblQtde);

		textField_8 = new JTextField();
		textField_8.setBounds(10, 25, 54, 29);
		jpCentro.add(textField_8);
		textField_8.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBounds(467, 11, 457, 419);
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
		btnBuscar.setBounds(357, 8, 89, 23);
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
		textField_2.setBounds(322, 51, 124, 32);
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
		textField_9.setBounds(332, 101, 114, 32);
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

		JLabel lblReferncia_1 = new JLabel("ReferêAncia de Entrega:");
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

		JLabel label_1 = new JLabel("Qtde");
		label_1.setBounds(10, 56, 46, 14);
		jpCentro.add(label_1);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(10, 70, 54, 29);
		jpCentro.add(textField_14);

		JLabel lblAdicionais = new JLabel("Adicionais:");
		lblAdicionais.setBounds(84, 56, 61, 14);
		jpCentro.add(lblAdicionais);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(84, 70, 218, 29);
		jpCentro.add(textField_15);

		JButton button = new JButton("Busca");
		button.setBounds(312, 69, 76, 29);
		jpCentro.add(button);

		JButton btnLanar = new JButton("Lançar");
		btnLanar.setBounds(312, 103, 76, 29);
		jpCentro.add(btnLanar);




		
		
		/*table = new JTable();
		table.setBorder(null);
		DefaultTableModel model = new DefaultTableModel (dados, colunas);
		
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"2", "Mussarela","R$ 3,20"},
					{"1", "Cebola Picada","R$ 1,10"},
					{" ", " "},	
					{" ", " "},	

				},
				new String[] {
						"Quantidade","Produto", "Preço"
				}
				) {
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(181);
		table.getColumnModel().getColumn(1).setMinWidth(17);
		panel_1.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		panel_1.add(scrollBar);*/
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(13, 304, 132, 23);
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
		lblFormaDePagamento.setBounds(10, 338, 135, 14);
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
		
	}
	private void listagem() {
		String[] colunas = {"Quantidade","Produto", "Preço"};
		Object[][] FonteDeDados= {
				{"2", "Mussarela","R$ 3,20"},
				{"1", "Cebola Picada","R$ 1,10"},
				{" ", " "},	
				{" ", " "},	

				};
		lista(colunas, FonteDeDados, 10,135,380,140,30);
		
		}
	}	
		

