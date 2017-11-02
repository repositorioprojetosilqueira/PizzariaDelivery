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
	private JTextField txtDesc;
	private JTextField txtPreco;


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
				
				txtDesc = new JTextField();
				txtDesc.setColumns(10);
				txtDesc.setBounds(393, 11, 239, 30);
				jpCentro.add(txtDesc);
				
				JLabel lbPreco = new JLabel("Preço:");
				lbPreco.setHorizontalAlignment(SwingConstants.RIGHT);
				lbPreco.setBounds(357, 205, 72, 20);
				jpCentro.add(lbPreco);
				
				txtPreco = new JTextField();
				txtPreco.setColumns(10);
				txtPreco.setBounds(439, 200, 91, 30);
				jpCentro.add(txtPreco);
				
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
		
		
		
}
