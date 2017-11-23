package view;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.print.PrintException;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import model.mProduto;
import model.mTipoProduto;
import model.dao.daoProduto;
import model.dao.daoTipoProduto;
import relatorios.PrintTextFile;


public class vCadProduto extends vTelaPadrao{
	private JTextField jtfDescricao;
	private JTextField jtfPreco; 
	private JCheckBox jcbStatus;
	private JComboBox jcbTipo;
	
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
				jbRelatorio.setVisible(true);
				setBounds(100, 100, 674, 320);
				
				JLabel lbDescricao = new JLabel("Descrição:");
				lbDescricao.setHorizontalAlignment(SwingConstants.RIGHT);
				lbDescricao.setBounds(312, 34, 71, 14);
				jpCentro.add(lbDescricao);
				
				jtfDescricao = new JTextField();
				jtfDescricao.setColumns(10);
				jtfDescricao.setBounds(393, 26, 239, 30);
				jtfDescricao.setText(null);
				jpCentro.add(jtfDescricao);
				
				JLabel lbTipo = new JLabel("Tipo:");
				lbTipo.setHorizontalAlignment(SwingConstants.RIGHT);
				lbTipo.setBounds(312, 90, 71, 14);
				jpCentro.add(lbTipo);
				
				jcbTipo = new JComboBox();
				jcbTipo.setBounds(393, 82, 241, 30);
				
				jpCentro.add(jcbTipo);
				
				JLabel lbPreco = new JLabel("Preço:");
				lbPreco.setHorizontalAlignment(SwingConstants.RIGHT);
				lbPreco.setBounds(311, 146, 72, 14);
				jpCentro.add(lbPreco);
				
				jtfPreco = new JTextField();
				jtfPreco.setColumns(10);
				jtfPreco.setBounds(393, 138, 86, 30);
				jpCentro.add(jtfPreco);
				
				jcbStatus = new JCheckBox("Ativo");
				jcbStatus.setBounds(393, 204, 97, 23);
				jpCentro.add(jcbStatus);
				
				
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
	        modelo.addColumn("Tp");
	        modelo.addColumn("Descrição");
			modelo.addColumn("Preço");
			
			tabela.getColumnModel().getColumn(0).setPreferredWidth(7);
			tabela.getColumnModel().getColumn(1).setPreferredWidth(7);
			tabela.getColumnModel().getColumn(2).setPreferredWidth(130);
			tabela.getColumnModel().getColumn(3).setPreferredWidth(60);
			
			tabela.getTableHeader().setReorderingAllowed(false); 
		
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
				modelo.addRow(new Object[]{m.getCodProduto(),m.getP_CodTipoProduto(),m.getpDescicao(),m.getpPreco()});
			}
		}
		public void preencheCombox() throws Exception {
			
			daoTipoProduto daoTproduto= new daoTipoProduto();

			 jcbTipo.removeAllItems();
			 for (mTipoProduto mt1 : daoTproduto.selectAll()) {
				 jcbTipo.addItem(mt1.gettDescTipo());
				 }
			 jcbTipo.setSelectedItem(null);
		}
		
		public void preenchetela() throws Exception {
			
			int row = tabela.getSelectedRow();
			
			daoProduto dao = new daoProduto();
			daoTipoProduto daoTproduto= new daoTipoProduto();
			
			 codProduto=Integer.parseInt(tabela.getModel().getValueAt(row, 0).toString());
			  
			 mProduto m = dao.select(codProduto);
			 
			 jcbTipo.removeAllItems();
			 for (mTipoProduto mt1 : daoTproduto.selectAll()) {
				 jcbTipo.addItem(mt1.gettDescTipo());
				 }
			 
			 jtfDescricao.setText(m.getpDescicao());
			 jtfPreco.setText(m.getpPreco());
			 jcbTipo.setSelectedIndex(m.getP_CodTipoProduto()-1);
			 jcbStatus.setSelected(m.getpStatus());

		}
		
		@Override
		public void acoes() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void StatusTelaComponentes(boolean status) {

			jtfDescricao.setEnabled(status);
			jtfPreco.setEnabled(status);
			jcbTipo.setEnabled(status);
			jcbStatus.setEnabled(status);
			
		}
		
		@Override
		public void limpaTela() {
			
			jtfDescricao.setText(null);
			jtfPreco.setText(null);
			jcbStatus.setSelected(false);
			jcbTipo.setSelectedItem(null);
			
		}

		@Override
		public void actionPerformed(ActionEvent ev) {
			if(ev.getSource().equals(jbNovo)) {
				limpaTela();
				StatusTelaComponentes(true);
				StatusBotoes(false, true, false, true, false);
				
				jtfDescricao.requestFocus();
				jcbStatus.setSelected(true);
				codProduto = -1;
				
				try {
					preencheCombox();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(ev.getSource().equals(jbSalvar)) {
				
				mProduto novoProduto = new mProduto();
				
				int codTipProduto =jcbTipo.getSelectedIndex() + 1;
				
				novoProduto.setCodProduto(codProduto);
				novoProduto.setpDescicao(jtfDescricao.getText());
				novoProduto.setpPreco(jtfPreco.getText());
				novoProduto.setP_CodTipoProduto(codTipProduto);
				novoProduto.setpStatus(jcbStatus.isSelected());
				
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
				
				int i =JOptionPane.showConfirmDialog(null,"Confirma Exclusão do Produto?","Atenção!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
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
			else if(ev.getSource().equals(jbRelatorio)) {
				
				String texto;
				texto ="SISTEMA PIZZARIA DELIVERY \n\n CADASTRO PRODUTO\n\n\n"+
				"PRODUTO:"+ jtfDescricao.getText()+"\n"
				+"PREÇO: "+ jtfPreco.getText()+ "--\n"
				+"STATUS: "+jcbStatus.isSelected()+"\n"
				+"TIPO: "+ jcbTipo.getSelectedItem().toString();
				
				PrintTextFile f = new PrintTextFile();
				try {
					f.imprimindo(texto);
				} catch (PrintException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

		@Override
		public void mouseClicked(MouseEvent ev) {
			
			if (ev.getSource().equals(tabela)&&jtfDescricao.isEnabled()==false) {
				if (ev.getClickCount() == 2) {
					try {
						preenchetela();
						StatusBotoes(true, false, true, false, false);
						jbRelatorio.setEnabled(true);
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
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
