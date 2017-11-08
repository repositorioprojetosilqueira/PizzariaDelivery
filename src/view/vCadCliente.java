package view;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFormattedTextField;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import model.mCliente;
import model.dao.daoCliente;

public class vCadCliente extends vTelaPadrao {  
	private JTextField jtfNome;
	
	private JFormattedTextField jftTelefone1;
	private JFormattedTextField jftTelefone2;
	
	private JTextField jtfRua;

	private JTextField jtfNumero;
	private JTextField jtfComplemento;
	private JTextField jtfBairro;
	
	private JTextArea jtaReferencia;
	private JTextArea jtaHistorico;
	
	private DefaultTableModel modelo;
	private JTable tabela;
	private int codCliente;
	
	public vCadCliente() {
	           
	    	super("Cadastro Cliente","/imagens/cliente.png");
	    	
	    	initLayoutCliente(303, 11);
	    	
	    	acoes();
	    	criaJTable();
	    	StatusTelaComponentes(false);
	    	StatusBotoes(true, false, false, false, false);
	    	
	}
	    	
	public void initLayoutCliente(int x, int y) {
			
			JPanel jpCliente = new JPanel();
			
			jpCliente.setSize(483,406);
			jpCliente.setLocation(x,y);
			jpCliente.setLayout(null);
			//800x500
			
			JLabel lbNome = new JLabel("Nome: ");
			lbNome.setHorizontalAlignment(SwingConstants.RIGHT);
			lbNome.setBounds(0, 19, 67, 14);
			jpCliente.add(lbNome);
			
			JLabel lbTelefone1 = new JLabel("Telefone: ");
			lbTelefone1.setHorizontalAlignment(SwingConstants.RIGHT);
			lbTelefone1.setBounds(0, 66, 67, 14);
			jpCliente.add(lbTelefone1);
			
			JLabel lbTelefone2 = new JLabel("Telefone:");
			lbTelefone2.setHorizontalAlignment(SwingConstants.RIGHT);
			lbTelefone2.setBounds(247, 66, 73, 14);
			jpCliente.add(lbTelefone2);
			
			JLabel lbRua = new JLabel("Rua:");
			lbRua.setHorizontalAlignment(SwingConstants.RIGHT);
			lbRua.setBounds(8, 119, 59, 14);
			jpCliente.add(lbRua);
			
			JLabel lbNumero = new JLabel("N\u00BA:");
			lbNumero.setHorizontalAlignment(SwingConstants.RIGHT);
			lbNumero.setBounds(342, 119, 38, 14);
			jpCliente.add(lbNumero);
			
			JLabel lbComplemento = new JLabel("Complemento:");
			lbComplemento.setHorizontalAlignment(SwingConstants.RIGHT);
			lbComplemento.setBounds(247, 168, 86, 14);
			jpCliente.add(lbComplemento);
			
			JLabel lbBairro = new JLabel("Bairro:");
			lbBairro.setHorizontalAlignment(SwingConstants.RIGHT);
			lbBairro.setBounds(9, 168, 58, 14);
			jpCliente.add(lbBairro);
			
			JLabel lbReferencia = new JLabel("Refer\u00EAncia de Entrega:");
			lbReferencia.setBounds(34, 214, 173, 14);
			jpCliente.add(lbReferencia);
			
			JLabel lbHistorico = new JLabel("Historico de Compras: ");
			lbHistorico.setBounds(34, 323, 175, 14);
			jpCliente.add(lbHistorico);
			

			
			
			jtfNome = new JTextField();
			jtfNome.setColumns(10);
			jtfNome.setBounds(77, 11, 395, 30);
			
			
			
			jftTelefone1 = new JFormattedTextField();
			jftTelefone1.setBounds(77, 58, 142, 30);
			
			
			jftTelefone2 = new JFormattedTextField();
			jftTelefone2.setBounds(330, 58, 142, 30);
			
			
			jtfRua = new JTextField();
			jtfRua.setColumns(10);
			jtfRua.setBounds(77, 111, 256, 30);
			
			
			jtfNumero = new JTextField();
			jtfNumero.setColumns(10);
			jtfNumero.setBounds(390, 111, 82, 30);
			
			
			jtfComplemento = new JTextField();
			jtfComplemento.setColumns(10);
			jtfComplemento.setBounds(335, 160, 137, 30);
			
			
			jtfBairro = new JTextField();
			jtfBairro.setColumns(10);
			jtfBairro.setBounds(77, 160, 173, 30);
			
			
			jtaReferencia = new JTextArea();
			jtaReferencia.setWrapStyleWord(true);
			jtaReferencia.setLineWrap(true);
			jtaReferencia.setBounds(32, 239, 440, 73);
			
			
			jtaHistorico = new JTextArea();
			jtaHistorico.setWrapStyleWord(true);
			jtaHistorico.setLineWrap(true);
			jtaHistorico.setBounds(32, 348, 440, 48);
			
			
			jpCliente.add(jtfNome);
			jpCliente.add(jftTelefone1);
			jpCliente.add(jftTelefone2);
			jpCliente.add(jtfRua);
			jpCliente.add(jtfNumero);
			jpCliente.add(jtfComplemento);
			jpCliente.add(jtfBairro);
			jpCliente.add(jtaReferencia);
			jpCliente.add(jtaHistorico);
			
			jtfNome.setNextFocusableComponent(jftTelefone1);
			
			
			jpCentro.add(jpCliente);
		}

			private void criaJTable() {
				modelo = new DefaultTableModel();

				tabela  = new  JTable(modelo){
		            public boolean isCellEditable(int rowIndex, int mColIndex) {  
		                return false;  
		            }  
		        };  
				
		        modelo.addColumn("Cd");
		        modelo.addColumn("Nome");
				modelo.addColumn("Telefone");
				
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
		
				daoCliente dao = new daoCliente();

				for (mCliente m : dao.selectAll()) {
					modelo.addRow(new Object[]{m.getCodCliente(),m.getcNome(), m.getcTelefone1(),m.getcTelefone2()});
				}
			}

	
	public void acoes(){
	
	        
		
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource().equals(jbNovo)) {
			jtfNome.requestFocus();
			limpaTela();
			StatusTelaComponentes(true);
			StatusBotoes(false, true, false, true, false);
			codCliente = -1;
			
		}
		
		else if(ev.getSource().equals(jbSalvar)) {
			mCliente novoCliente = new mCliente();
			
			novoCliente.setCodCliente(codCliente);
			novoCliente.setcNome(jtfNome.getText());
			novoCliente.setcTelefone1(jftTelefone1.getText());
			novoCliente.setcTelefone2(jftTelefone2.getText());
			novoCliente.setcRua(jtfRua.getText());
			novoCliente.setcNumero(jtfNumero.getText());
			novoCliente.setcBairro(jtfBairro.getText());
			novoCliente.setcComplemento(jtfComplemento.getText());
			novoCliente.setcRefEntrega(jtaReferencia.getText());
			novoCliente.setcHistCompras(jtaHistorico.getText());
			
			daoCliente dCliente;
			
			try {
				dCliente = new daoCliente();
				if(codCliente!=-1) 
				dCliente.update(novoCliente);
				
				else
					dCliente.insert(novoCliente);
				
				
				
				limpaTela();
				StatusTelaComponentes(false);
				StatusBotoes(true, false, false, false, false);
				pesquisar(modelo);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		else if(ev.getSource().equals(jbEditar)) {
			jtfNome.requestFocus();
			StatusBotoes(false, true, false, true, true);
			StatusTelaComponentes(true);
			
		}
		
		else if(ev.getSource().equals(jbCancelar)) {
			
			limpaTela();
			StatusTelaComponentes(false);
			StatusBotoes(true, false, false, false, false);
		}
		
		else if(ev.getSource().equals(jbExcluir)) {
			
			daoCliente dExcCliente;
			
			int i =JOptionPane.showConfirmDialog(null,"Desejar Excluir o Cliente?","Atenção!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(i==0) {
			try {
				dExcCliente = new daoCliente();
				dExcCliente.delete(codCliente);
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
	public void StatusTelaComponentes(boolean status) {
		
		jtfNome.setEnabled(status);
		jftTelefone1.setEnabled(status);
		jftTelefone2.setEnabled(status);
		jtfRua.setEnabled(status);
		jtfNumero.setEnabled(status);
		jtfBairro.setEnabled(status);
		jtfComplemento.setEnabled(status);
		jtaReferencia.setEnabled(status);
		jtaHistorico.setEnabled(status);
	}

	@Override
	public void limpaTela() {
		
		jtfNome.setText(null);
		jftTelefone1.setText(null);
		jftTelefone2.setText(null);
		jtfRua.setText(null);
		jtfNumero.setText(null);
		jtfBairro.setText(null);
		jtfComplemento.setText(null);
		jtaReferencia.setText(null);
		jtaHistorico.setText(null);
	}

	

	public void preenchetela() throws Exception {
		
		int row = tabela.getSelectedRow();
		
		daoCliente dao = new daoCliente();
		 
		 codCliente =Integer.parseInt(tabela.getModel().getValueAt(row, 0).toString());
		 
		 mCliente m = dao.select(codCliente);
		 
		 jtfNome.setText(m.getcNome());
		 jftTelefone1.setText(m.getcTelefone1());
		 jftTelefone2.setText(m.getcTelefone2());
		 jtfRua.setText(m.getcRua());
		 jtfNumero.setText(m.getcNumero());
		 jtfBairro.setText(m.getcBairro());
		 jtfComplemento.setText(m.getcComplemento());
		 jtaReferencia.setText(m.getcRefEntrega());
		 jtaHistorico.setText(m.getcHistCompras());
		 
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource().equals(tabela)) {
			if (e.getClickCount() == 2) {
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
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	



}

	    	
	    


			
	    	
	    	
	    

