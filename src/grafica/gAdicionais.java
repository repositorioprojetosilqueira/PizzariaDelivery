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

public class gAdicionais extends vTelaPadrao {
	private JTextField textField;
	private JTextField textField_1;


	public gAdicionais() {
		super("Adicionais", "");
		
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
				
				String[] colunas = {"Descrição","Tipo", "Preço"};
				Object[][] FonteDeDados= {
				{"Alho Frito", "Pizza","R$ 0,00"},
				{"Berinjela Milanesa", "Pizza","R$ 3,20"},
				{"Cebola Picada", "Pizza","R$ 1,10"},
				{"Cebolinha Picadinha", "Pizza","R$ 0,70"},
				{"Parmesão", "Estrogonofe","R$ 3,20"},
				{"Milho Verde", "Estrogonofe","R$ 0,00"},
				{" ", " "}			
				};
				
				lista(colunas, FonteDeDados,300, this.getHeight()-124);
			}
}
