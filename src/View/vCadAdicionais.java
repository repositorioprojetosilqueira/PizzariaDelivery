package View;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class vCadAdicionais extends vTelaPadrao {

	private JTextField textField;
	private JTextField textField_1;
	
	public vCadAdicionais() {
		
		super("Adicionais", "/imagens/cliente16x16.png");
		
		initLayout();
		
		listagem();

	}
	
		private void initLayout() {
				setSize(674, 320);
				
				JLabel label = new JLabel("Descrição:");
				label.setHorizontalAlignment(SwingConstants.RIGHT);
				label.setBounds(312, 34, 71, 20);
				jpCentro.add(label);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(393, 26, 239, 30);
				jpCentro.add(textField);
				
				JLabel label_1 = new JLabel("Tipo:");
				label_1.setHorizontalAlignment(SwingConstants.RIGHT);
				label_1.setBounds(312, 90, 71, 20);
				jpCentro.add(label_1);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(393, 82, 241, 30);
				jpCentro.add(comboBox);
				
				JLabel label_2 = new JLabel("Preço:");
				label_2.setHorizontalAlignment(SwingConstants.RIGHT);
				label_2.setBounds(311, 146, 72, 20);
				jpCentro.add(label_2);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(393, 138, 86, 30);
				jpCentro.add(textField_1);
				
				JCheckBox checkBox = new JCheckBox("Desativar");
				checkBox.setBounds(393, 204, 97, 30);
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
				
				lista(colunas, FonteDeDados,3,45,290, this.getHeight()-124,105);
				campoPesquisa("Pesquisar : ", 5, 8, 70,218);
			}
}

