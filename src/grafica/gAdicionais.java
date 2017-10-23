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
		super("Adicionais", "/imagens/cliente16x16.png");
		
		initLayout();
		
		listagem();
		listagemTipo();

	}
	
		private void initLayout() {
				setSize(674, 320);
				
				JLabel label = new JLabel("Descrição:");
				label.setHorizontalAlignment(SwingConstants.RIGHT);
				label.setBounds(312, 16, 71, 20);
				jpCentro.add(label);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(393, 11, 239, 30);
				jpCentro.add(textField);
				
				JLabel label_2 = new JLabel("Preço:");
				label_2.setHorizontalAlignment(SwingConstants.RIGHT);
				label_2.setBounds(357, 205, 72, 20);
				jpCentro.add(label_2);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(439, 200, 91, 30);
				jpCentro.add(textField_1);
				
				JCheckBox checkBox = new JCheckBox("Desativar");
				checkBox.setHorizontalAlignment(SwingConstants.RIGHT);
				checkBox.setBounds(536, 200, 88, 30);
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
				campoPesquisa("Pesquisar : ", 5, 12, 70,218);
			}
		
		
		
		private void listagemTipo() {
			
				JCheckBox jc = new JCheckBox();
			
				String[] colunas = {"Tipo", "Ativo"};
				Object[][] FonteDeDados= {
				{"Pizza"," "},
				{"Sanduiche"," "},
				{"Refrigerante", " "},
				{"Estrogonof", " "},
				{" ", " "}			
				};
				
				lista(colunas, FonteDeDados,393,45,240, this.getHeight()-180,200);
				
				
		}
		
		
		
}
