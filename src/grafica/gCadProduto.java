package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import View.vTelaPadrao;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class gCadProduto extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;


	public gCadProduto() {
		super("Produto", "/imagens/pizza.png");
		
		initLayout();
		
		listagem();

	}
	
		private void initLayout() {
				setBounds(100, 100, 674, 320);
				
				JLabel label = new JLabel("Descrição:");
				label.setHorizontalAlignment(SwingConstants.RIGHT);
				label.setBounds(312, 34, 71, 14);
				jpCentro.add(label);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(393, 26, 239, 30);
				jpCentro.add(textField);
				
				JLabel label_1 = new JLabel("Tipo:");
				label_1.setHorizontalAlignment(SwingConstants.RIGHT);
				label_1.setBounds(312, 90, 71, 14);
				jpCentro.add(label_1);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(393, 82, 241, 30);
				jpCentro.add(comboBox);
				
				JLabel label_2 = new JLabel("Preço:");
				label_2.setHorizontalAlignment(SwingConstants.RIGHT);
				label_2.setBounds(311, 146, 72, 14);
				jpCentro.add(label_2);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(393, 138, 86, 30);
				jpCentro.add(textField_1);
				
				JCheckBox checkBox = new JCheckBox("Desativar");
				checkBox.setBounds(393, 204, 97, 23);
				jpCentro.add(checkBox);
				
				
			}
		
		private void listagem() {
				
				String[] colunas = {"Descrição", "Preço"};
				Object[][] FonteDeDados= {
				{"Coca Lata", "R$ 3,00"},
				{"Pizza Mussarela", "R$ 22,99"},
				{"Pizza Vegetariana", "R$ 20,00"},
				{"Suco Lata", "R$ 2,50"},
				{"Pizza Portuguesa", "R$ 22,00"},
				{"Pizza Palmito", "R$22,00"},
				{" ", " "}			
				};
				
				lista(colunas, FonteDeDados,3,45,290, this.getHeight()-124,105);
				campoPesquisa("Pesquisar : ", 5, 8, 70,218);
			}
}
