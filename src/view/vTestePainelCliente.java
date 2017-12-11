package view;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import grafica.painelCliente;
import model.mProduto;
import model.mTipoAdicionais;
import model.mTipoProduto;
import model.dao.daoProduto;
import model.dao.daoTipoAdicionais;
import model.dao.daoTipoProduto;

public class vTestePainelCliente extends vTelaPadrao{
	private adicionaisTabelaProdutos model;
	private List<mTipoAdicionais> lista;
	private JTable tabela;
	
	
	public vTestePainelCliente() {
		super("Teste Painel Cliente", "/imagens/cliente.png");
		
		jpCentro.setLayout(null);
		
		/*painelCliente e = new painelCliente(0, 0);
		e.setVisible(true);
		
		jpCentro.add(e);
			*/
		
		criaJTable();
		this.add(jpCentro);
		
	}

	@Override
	public void criaJTable() {
		tabela = new JTable(model);
		pesquisar();

	}

	private void pesquisar() {
		int codAdicional = 10;
		daoTipoAdicionais dao;
		try {
			
			dao = new daoTipoAdicionais();
			lista = dao.selectAdicTipoProd(codAdicional);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		model = new  adicionaisTabelaProdutos(lista);
		tabela.setModel(model);      
		
		JScrollPane scrollPane= new JScrollPane(tabela);
		
		tabela.setFillsViewportHeight(true);
		tabela.setRowSelectionInterval(0,0);
		
		scrollPane.setBounds(30, 30, 500, 200);
		 
		jpCentro.add(scrollPane);
		

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
	public void limpaTela() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
