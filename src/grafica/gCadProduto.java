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

public class gCadProduto extends vTelaPadrao {
	private JTextField txtDescricao;
	private JTextField txtPreco;


	public gCadProduto() {
		super("Produto", "/imagens/pizza.png");
		
		initLayout();
		
		listagem();

	}
	
		private void initLayout() {
				setBounds(100, 100, 674, 320);
				
				JLabel lbDescricao = new JLabel("Descrição:");
				lbDescricao.setHorizontalAlignment(SwingConstants.RIGHT);
				lbDescricao.setBounds(312, 34, 71, 14);
				jpCentro.add(lbDescricao);
				
				txtDescricao = new JTextField();
				txtDescricao.setColumns(10);
				txtDescricao.setBounds(393, 26, 239, 30);
				jpCentro.add(txtDescricao);
				
				JLabel lbTipo = new JLabel("Tipo:");
				lbTipo.setHorizontalAlignment(SwingConstants.RIGHT);
				lbTipo.setBounds(312, 90, 71, 14);
				jpCentro.add(lbTipo);
				
				JComboBox comboboxTipo = new JComboBox();
				comboboxTipo.setBounds(393, 82, 241, 30);
				jpCentro.add(comboboxTipo);
				
				JLabel lbPreco = new JLabel("Preço:");
				lbPreco.setHorizontalAlignment(SwingConstants.RIGHT);
				lbPreco.setBounds(311, 146, 72, 14);
				jpCentro.add(lbPreco);
				
				txtPreco = new JTextField();
				txtPreco.setColumns(10);
				txtPreco.setBounds(393, 138, 86, 30);
				jpCentro.add(txtPreco);
				
				JCheckBox checkboxDesativar = new JCheckBox("Desativar");
				checkboxDesativar.setBounds(393, 204, 97, 23);
				jpCentro.add(checkboxDesativar);
				
				
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
