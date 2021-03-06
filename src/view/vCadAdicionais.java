package view;

import javax.print.PrintException;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.event.*;
import java.io.IOException;
import java.util.List;
import java.awt.*;

import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import model.mAdicionais;
import model.mTipoAdicionais;
import model.mTipoProduto;

import model.dao.daoAdicionais;
import model.dao.daoTipoAdicionais;
import model.dao.daoTipoProduto;
import relatorios.PrintTextFile;




public class vCadAdicionais extends vTelaPadrao {  

	private JTextField jtfDesc;
	//private JTextField jtfPreco;
	private JCheckBox jcbstatus;
	//private JComboBox comboBox;

	private DefaultTableModel modelo;
	private JTable tabela;
	
	private int codAdicionais;

	private adicionaisTabelaProdutos model;
	private List<mTipoAdicionais> lista;
	private JTable tabelaTipoProd;

	public vCadAdicionais() {
		super("Cadastro Adicionais","/imagens/adicionais32x32.png");

		initLayout();

		criaJTableAdicionais();
		criaJTable();
		StatusTelaComponentes(false);
		StatusBotoes(true, false, false, false, false);

	}

	private void initLayout() {
		jbRelatorio.setVisible(true);
		setSize(674, 350);
	
		JLabel label = new JLabel("Descri��o:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(312, 8, 71, 20);
		jpCentro.add(label);

		jtfDesc = new JTextField();
		jtfDesc.setColumns(10);
		jtfDesc.setBounds(393, 8, 239, 30);
		jpCentro.add(jtfDesc);

		/*
		JLabel label_1 = new JLabel("Tipo:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(312, 90, 71, 20);
		jpCentro.add(label_1);

		comboBox = new JComboBox();
		comboBox.setBounds(393, 82, 241, 30);
		jpCentro.add(comboBox);

		JLabel label_2 = new JLabel("Pre�o:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(311, 146, 72, 20);
		jpCentro.add(label_2);

		jtfPreco = new JTextField();
		jtfPreco.setColumns(10);
		jtfPreco.setBounds(393, 138, 86, 30);
		jpCentro.add(jtfPreco);
		*/
		
		jcbstatus = new JCheckBox("Ativo");
		jcbstatus.setBounds(580, 225, 97, 30);
		jpCentro.add(jcbstatus);
		
		
		
	}

	public void criaJTableAdicionais() {
		
		//tabela de adicionais
		modelo = new DefaultTableModel();

		tabela  = new  JTable(modelo){
			public boolean isCellEditable(int rowIndex, int mColIndex) {  
				return false;  
			}  
		};  

		modelo.addColumn("Cdg:");
		modelo.addColumn("Descri��o");
		modelo.addColumn("Pre�o");

		tabela.getColumnModel().getColumn(0).setPreferredWidth(1);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(25);
		
		tabela.getTableHeader().setReorderingAllowed(false); 

		try {
			pesquisar(modelo);

		} catch (Exception e) {
			e.printStackTrace();
		}

		lista(tabela,3,45,260, this.getHeight()-124);
		campoPesquisa("Pesquisar : ", 5, 8, 70,187);
		tabela.addMouseListener(this); 

	}

	public static void pesquisar(DefaultTableModel modelo) throws Exception {
		modelo.setNumRows(0);

		daoAdicionais dao = new daoAdicionais();

		for (mAdicionais m : dao.selectAll()) {
			modelo.addRow(new Object[]{m.getCodAdicionais(),m.getaDescricao(),m.getaPreco()});
		}

	}
	/*public void preencheCombox() throws Exception {
		
		daoTipoProduto daoTproduto= new daoTipoProduto();

		 comboBox.removeAllItems();
		 for (mTipoProduto mt1 : daoTproduto.selectAll()) {
			 comboBox.addItem(mt1.gettDescTipo());
			 }
		 comboBox.setSelectedItem(null);
	}*/
	
	public void criaJTable() {
		tabelaTipoProd = new JTable(model);
		pesquisar();

	}

	private void pesquisar() {
		
		daoTipoAdicionais dao;
		try {
			
			dao = new daoTipoAdicionais();
			preencherAdicionais(lista = dao.selectTipoProd());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void preencherAdicionais(List lista) {
		
		model = new  adicionaisTabelaProdutos(lista);
		tabelaTipoProd.setModel(model);      
		
		tabelaTipoProd.setFillsViewportHeight(true);
		tabelaTipoProd.setRowSelectionInterval(0,0);
		
		DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
		direita.setHorizontalAlignment(SwingConstants.RIGHT);
		
		DefaultTableCellRenderer centro= new DefaultTableCellRenderer();
		centro.setHorizontalAlignment(SwingConstants.CENTER);
		
		tabelaTipoProd.getColumnModel().getColumn(0).setCellRenderer(centro);
		tabelaTipoProd.getColumnModel().getColumn(2).setCellRenderer(direita);
		
		
		tabelaTipoProd.getColumnModel().getColumn(0).setPreferredWidth(10);
		tabelaTipoProd.getColumnModel().getColumn(1).setPreferredWidth(120);
		tabelaTipoProd.getColumnModel().getColumn(2).setPreferredWidth(40);
		tabelaTipoProd.getColumnModel().getColumn(3).setPreferredWidth(15);
	
		tabelaTipoProd.getTableHeader().setReorderingAllowed(false); 
		
		
		JScrollPane scrollPaneT= new JScrollPane(tabelaTipoProd);
		scrollPaneT.setBounds(320, 45, 313, 180);
		 
		
		
		jpCentro.add(scrollPaneT);
		
	}

	
	
	public void preenchetela() throws Exception { 

		int row = tabela.getSelectedRow();

		daoAdicionais dao = new daoAdicionais();
		
		daoTipoAdicionais daTAdicionais = new daoTipoAdicionais();
		
		
		codAdicionais =Integer.parseInt(tabela.getModel().getValueAt(row, 0).toString());

		mAdicionais m = dao.select(codAdicionais);
		mAdicionais mtProduto = dao.selectCodAdTipoProd(codAdicionais);
		
		List<mTipoAdicionais> mt =daTAdicionais.selectAdicTipoProd(codAdicionais);
		lista = mt;
		preencherAdicionais(lista);
		
		
/*		comboBox.removeAllItems();
		 for (mTipoProduto mt1 : daoTProduto.selectAll()) {
			 comboBox.addItem(mt1.gettDescTipo());
			 }
		 */
		
		
		
		jtfDesc.setText(m.getaDescricao());
		//jtfPreco.setText(m.getaPreco());
		jcbstatus.setSelected(m.getaStatus());
		//comboBox.setSelectedIndex(mtProduto.getadictipoprod()-1);



	}

	@Override
	public void acoes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void StatusTelaComponentes(boolean status) {

		jtfDesc.setEnabled(status);
		//jtfPreco.setEnabled(status);
		//comboBox.setEnabled(status);
		jcbstatus.setEnabled(status);


	}

	@Override
	public void limpaTela() {

		jtfDesc.setText(null);
		//jtfPreco.setText(null);
		jcbstatus.setSelected(false);
		//comboBox.setSelectedItem(null);
		//model.removeTudoTipoAdicionais();
		//tabelaTipoProd.setEnabled(false);

	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		if(ev.getSource().equals(jbNovo)) {
			StatusBotoes(false, true, false, true, false);
			limpaTela();
			StatusTelaComponentes(true);
			
			jtfDesc.requestFocus();
			jcbstatus.setSelected(true);
			codAdicionais = -1;
			
			
			/*try {
				preencheCombox();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

		}

		else if(ev.getSource().equals(jbSalvar)) {

			mAdicionais novoAdicionais = new mAdicionais();
			mAdicionais novoAdicTipo = new mAdicionais();
			
			//int codTipProduto =comboBox.getSelectedIndex() + 1;

			novoAdicionais.setCodAdicionais(codAdicionais);
			novoAdicionais.setaDescricao(jtfDesc.getText());
			//novoAdicionais.setaPreco(jtfPreco.getText());
			novoAdicionais.setaStatus(jcbstatus.isSelected());
			//novoAdicTipo.setCodTipoProduto(codTipProduto);
			novoAdicTipo.setadictipoprod(codAdicionais);

			daoAdicionais dAdicionais;

			try {
				dAdicionais = new daoAdicionais();
				if(codAdicionais!=-1) 
					dAdicionais.update(novoAdicionais);

				else
					dAdicionais.insert(novoAdicionais);
					dAdicionais.insertAdicTipo(novoAdicTipo);

				limpaTela();
				StatusTelaComponentes(false);
				StatusBotoes(true, false, false, false, false);
				pesquisar(modelo);



			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else if(ev.getSource().equals(jbEditar)) {
			jtfDesc.requestFocus();
			StatusBotoes(false, true, false, true, true);
			StatusTelaComponentes(true);

		}

		else if(ev.getSource().equals(jbCancelar)) {

			limpaTela();
			StatusTelaComponentes(false);
			StatusBotoes(true, false, false, false, false);
		}

		else if(ev.getSource().equals(jbExcluir)) {

			daoAdicionais dExcAdicionais;

			int i =JOptionPane.showConfirmDialog(null,"Confirma Exclus�o do Adicional?","Aten��o!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(i==0) {
				try {
					dExcAdicionais = new daoAdicionais();
					dExcAdicionais.delete(codAdicionais);
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
			texto ="SISTEMA PIZZARIA DELIVERY \n\n CADASTRO ADICIONAIS\n\n\n"+
			"DESCRI��O ADICIONAL:"+ jtfDesc.getText()+"\n"
			+"PRE�O: + jtfPreco.getText()+ "+"--\n"
			+"TIPO:  comboBox.getSelectedItem().toString()"+"\n"
			+"STATUS: "+jcbstatus.isSelected();
			
			
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
	public void mouseClicked(MouseEvent e) {

		if (e.getSource().equals(tabela)&&jtfDesc.isEnabled()==false) {
			if (e.getClickCount() == 2) {
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
