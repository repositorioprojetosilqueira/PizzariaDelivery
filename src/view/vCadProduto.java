package view;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import model.mCliente;
import model.mProduto;
import model.dao.daoCliente;
import model.dao.daoProduto;

public class vCadProduto extends vTelaPadrao{
	private JTextField jtfDescricao;
	private JTextField jtfPreco; 
	private JCheckBox checkBox;
	private JComboBox comboBox;
	
	private DefaultTableModel modelo;
	private JTable tabela;
	private int codProduto;

	public vCadProduto() {
		
		super("Produto", "/imagens/pizza.png");
		
		initLayout();
		
		criaJTable();
    	StatusTelaComponentes(false);
    	StatusBotoes(true, false, false, false, false);

	}
	
		private void initLayout() {
				setBounds(100, 100, 674, 320);
				
				JLabel label = new JLabel("Descrição:");
				label.setHorizontalAlignment(SwingConstants.RIGHT);
				label.setBounds(312, 34, 71, 14);
				jpCentro.add(label);
				
				jtfDescricao = new JTextField();
				jtfDescricao.setColumns(10);
				jtfDescricao.setBounds(393, 26, 239, 30);
				jpCentro.add(jtfDescricao);
				
				JLabel label_1 = new JLabel("Tipo:");
				label_1.setHorizontalAlignment(SwingConstants.RIGHT);
				label_1.setBounds(312, 90, 71, 14);
				jpCentro.add(label_1);
				
				comboBox = new JComboBox();
				comboBox.setBounds(393, 82, 241, 30);
				
				jpCentro.add(comboBox);
				
				JLabel label_2 = new JLabel("Preço:");
				label_2.setHorizontalAlignment(SwingConstants.RIGHT);
				label_2.setBounds(311, 146, 72, 14);
				jpCentro.add(label_2);
				
				jtfPreco = new JTextField();
				jtfPreco.setColumns(10);
				jtfPreco.setBounds(393, 138, 86, 30);
				jpCentro.add(jtfPreco);
				
				checkBox = new JCheckBox("Desativar");
				checkBox.setBounds(393, 204, 97, 23);
				jpCentro.add(checkBox);
				
				
			}
		
		@Override
		public void criaJTable() {
			
			modelo = new DefaultTableModel();

			tabela  = new  JTable(modelo){
	            public boolean isCellEditable(int rowIndex, int mColIndex) {  
	                return false;  
	            }  
	        };  
			
	        modelo.addColumn("Cd");
	        modelo.addColumn("Descrição");
			modelo.addColumn("Preço");
			
			tabela.getColumnModel().getColumn(0).setPreferredWidth(5);
			tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
			tabela.getColumnModel().getColumn(2).setPreferredWidth(90);
			
			try {
				pesquisar(modelo);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			lista(tabela,3,45,290, this.getHeight()-124);
			campoPesquisa("Pesquisar : ", 5, 8, 70,218);
			tabela.addMouseListener(this); 
			
		}
		
		public static void pesquisar(DefaultTableModel modelo) throws Exception {
			modelo.setNumRows(0);
	
			daoProduto dao = new daoProduto();

			for (mProduto m : dao.selectAll()) {
				modelo.addRow(new Object[]{m.getCodProduto(),m.getpDescicao(),m.getpPreco()});
			}
		}
		
		public void preenchetela() throws Exception {
			
			int row = tabela.getSelectedRow();
			
			daoProduto dao = new daoProduto();
			 
			 codProduto=Integer.parseInt(tabela.getModel().getValueAt(row, 0).toString());
			 
			 mProduto m = dao.select(codProduto);
			 
			 jtfDescricao.setText(m.getpDescicao());
			 jtfPreco.setText(m.getpPreco());
			 
			 
		}
		
		@Override
		public void acoes() {
			// TODO Auto-generated method stub
			
		}
		
		

		@Override
		public void StatusTelaComponentes(boolean status) {

			jtfDescricao.setEnabled(status);
			jtfPreco.setEnabled(status);
			
		}

		

		@Override
		public void limpaTela() {
			
			jtfDescricao.setText(null);
			jtfPreco.setText(null);
			
		}

		@Override
		public void actionPerformed(ActionEvent ev) {
			if(ev.getSource().equals(jbNovo)) {
				
				jtfDescricao.requestFocus();
				limpaTela();
				StatusTelaComponentes(true);
				StatusBotoes(false, true, false, true, false);
				codProduto = -1;
				
			}
			
			else if(ev.getSource().equals(jbSalvar)) {
				mProduto novoProduto = new mProduto();
				
				novoProduto.setCodProduto(codProduto);
				novoProduto.setpDescicao(jtfDescricao.getText());
				novoProduto.setpPreco(jtfPreco.getText());
				
				
				daoProduto dProduto;
				
				try {
					dProduto = new daoProduto();
					if(codProduto!=-1) 
					dProduto.update(novoProduto);
					
					else
						dProduto.insert(novoProduto);
					
					
					
					limpaTela();
					StatusTelaComponentes(false);
					StatusBotoes(true, false, false, false, false);
					pesquisar(modelo);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			else if(ev.getSource().equals(jbEditar)) {
				jtfDescricao.requestFocus();
				StatusBotoes(false, true, false, true, true);
				StatusTelaComponentes(true);
				
			}
			
			else if(ev.getSource().equals(jbCancelar)) {
				
				limpaTela();
				StatusTelaComponentes(false);
				StatusBotoes(true, false, false, false, false);
			}
			
			else if(ev.getSource().equals(jbExcluir)) {
				
				daoProduto dExcProduto;
				
				int i =JOptionPane.showConfirmDialog(null,"Desejar Excluir o Cliente?","Atenção!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(i==0) {
				try {
					dExcProduto = new daoProduto();
					dExcProduto.delete(codProduto);
					pesquisar(modelo);
				} catch (Exception e1) {
				
					e1.printStackTrace();
				}
				
				limpaTela();
				StatusTelaComponentes(false);
				StatusBotoes(true, false, false, false, false);
							
				}
				
			}
			
		}

		@Override
		public void mouseClicked(MouseEvent ev) {
			if (ev.getSource().equals(tabela)) {
				if (ev.getClickCount() == 2) {
	                try {
						preenchetela();
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
	            StatusBotoes(true, false, true, false, false);
	            
				}
	        }
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
		
}
