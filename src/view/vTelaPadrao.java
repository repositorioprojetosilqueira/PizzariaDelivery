package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import grafica.painelCliente;
import model.mCliente;
import model.dao.daoCliente;

public abstract class vTelaPadrao extends JInternalFrame {  
		private paineis jpTop;
		public paineis jpCentro;
		public painelCliente pCliente;
		
		public botoes jbNovo, jbSalvar, jbEditar, jbExcluir, jbCancelar;
		private JLabel jlPesquisa;
		
		private JTextField jtPesquisar;
		
    public vTelaPadrao(String titulo, String IconeTela) {
        super(titulo);
	        
        BorderLayout border = new BorderLayout();
        	  
        	this.setSize(800,500);
        	
        	this.setLayout(border);
        	
        	this.setResizable(false);
        	
        	this.setFrameIcon(new ImageIcon(this.getClass().getResource(IconeTela)));
            this.setClosable(true);
            this.setMaximizable(false);
            this.setIconifiable(false);  
                     
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            componentes();
            this.setVisible(true);
            this.requestFocus();
            
                       
     }
    
		    private void componentes() {
				
			jpTop = new paineis(150, 150);

			jpCentro = new paineis(50,50);
			jpCentro.setLayout(null);
			
		
			jbNovo = new botoes("Novo");
			jbSalvar = new botoes("Salvar");
			jbEditar = new botoes("Editar");
			jbExcluir = new botoes("Excluir");
			jbCancelar = new botoes("Cancelar");
			
			
			jbNovo.setIcon(new ImageIcon(getClass().getResource("/imagens/save_new.png")));
			jbSalvar.setIcon(new ImageIcon(getClass().getResource("/imagens/save_data.png")));
			jbEditar.setIcon(new ImageIcon(getClass().getResource("/imagens/edit_button.png")));
			jbExcluir.setIcon(new ImageIcon(getClass().getResource("/imagens/delete.png")));
			jbCancelar.setIcon(new ImageIcon(getClass().getResource("/imagens/cancel.png")));
					
			jbSalvar.setEnabled(false);
			jbEditar.setEnabled(false);
			jbCancelar.setEnabled(false);
			jbExcluir.setEnabled(false);
			
			jpTop.add(jbNovo);
			jpTop.add(jbSalvar);
			jpTop.add(jbEditar);
			jpTop.add(jbCancelar);
			jpTop.add(jbExcluir);
			
			
			this.add(jpTop, BorderLayout.NORTH);
			this.add(jpCentro, BorderLayout.CENTER);
		}
		    
		    
	    
		    public void lista(String[] col, Object[][] fonte, int x, int y, int width, int height,int tamL1) {
		    	
		    	
		    	String[] colunas = col;
				Object[][] FonteDeDados= fonte;
				
				
			    
			    	
			    
				JTable tabela  = new  JTable(new DefaultTableModel(FonteDeDados, colunas){
		            public boolean isCellEditable(int rowIndex, int mColIndex) {  
		                return false;  
		            }  
		        });  
				
				
			    
				
				tabela.getColumnModel().getColumn(0).setPreferredWidth(tamL1);
				//tabela.getColumnModel().getColumn(0).setPreferredWidth(105);
				//tabela.getColumnModel().getColumn(1).setPreferredWidth(20);
				
				//tabela.getColumnModel().getColumn(2).setPreferredWidth(20);
				
				JScrollPane scrollPane= new JScrollPane(tabela);
				
				tabela.setFillsViewportHeight(true);
				tabela.setRowSelectionInterval(0,0);
				
				
				//scrollPane.setBounds(5,40, width, height);
				scrollPane.setBounds(x,y, width, height);
				 
				jpCentro.add(scrollPane);
				
				
		    }
		    public void campoPesquisa(String nomeCampo, int x, int y, int w, int wP) {
		    
		    	jlPesquisa = new JLabel(nomeCampo);
				jlPesquisa.setBounds(x,y, w, 30);
				
				jtPesquisar = new JTextField();
				jtPesquisar.setBounds(x + w, y+3, wP, 30);
				
				jpCentro.add(jtPesquisar);
				jpCentro.add(jlPesquisa);
				
		    	
		    }
		
		    
		    public abstract void acoes();
		    
		    public abstract void StatusTelaComponentes(boolean status);
		    
		    public abstract void StatusBotoes(boolean status, boolean sEdit_Exc);
		   
		    public abstract void limpaTela();
		    
		    
		    
		    

		    
}