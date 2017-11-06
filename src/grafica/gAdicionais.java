package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

import view.vTelaPadrao;

import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class gAdicionais extends vTelaPadrao {
	private JTextField jtfDesc;
	private JTextField jtfPreco;


	public gAdicionais() {
		super("Adicionais", "/imagens/cliente16x16.png");
		
		initLayout();
		
		listagem();
		listagemTipo();

	}
	
		private void initLayout() {
				setSize(674, 320);
				
				JLabel lbDesc = new JLabel("Descrição:");
				lbDesc.setHorizontalAlignment(SwingConstants.RIGHT);
				lbDesc.setBounds(312, 16, 71, 20);
				jpCentro.add(lbDesc);
				
				jtfDesc = new JTextField();
				jtfDesc.setColumns(10);
				jtfDesc.setBounds(393, 11, 239, 30);
				jpCentro.add(jtfDesc);
				
				JLabel lbPreco = new JLabel("Preço:");
				lbPreco.setHorizontalAlignment(SwingConstants.RIGHT);
				lbPreco.setBounds(357, 205, 72, 20);
				jpCentro.add(lbPreco);
				
				jtfPreco = new JTextField();
				jtfPreco.setColumns(10);
				jtfPreco.setBounds(439, 200, 91, 30);
				jpCentro.add(jtfPreco);
				
				JCheckBox cbDesativar = new JCheckBox("Desativar");
				cbDesativar.setHorizontalAlignment(SwingConstants.RIGHT);
				cbDesativar.setBounds(536, 200, 88, 30);
				jpCentro.add(cbDesativar);
				
				
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
