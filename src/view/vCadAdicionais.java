package view;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class vCadAdicionais extends vTelaPadrao {

	private JTextField jtfDesc;
	private JTextField jtfPreco;
	
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
				
				jtfDesc = new JTextField();
				jtfDesc.setColumns(10);
				jtfDesc.setBounds(393, 26, 239, 30);
				jpCentro.add(jtfDesc);
				
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
				
				jtfPreco = new JTextField();
				jtfPreco.setColumns(10);
				jtfPreco.setBounds(393, 138, 86, 30);
				jpCentro.add(jtfPreco);
				
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
				
				//lista(FonteDeDados,3,45,290, this.getHeight()-124,105);
				campoPesquisa("Pesquisar : ", 5, 8, 70,218);
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

