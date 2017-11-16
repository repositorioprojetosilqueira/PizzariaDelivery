package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
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

import org.w3c.dom.events.MouseEvent;

import grafica.painelCliente;
import model.mCliente;
import model.dao.daoCliente;

public abstract class vTelaPadrao extends JInternalFrame implements ActionListener, MouseListener{  

		private paineis jpTop, jpEspacolivre;
		public paineis jpCentro;
		public painelCliente pCliente;
		
		public botoes jbNovo, jbSalvar, jbEditar, jbExcluir, jbCancelar, jbRelatorio;
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

            
                       
     }
    
		    private void componentes() {
				
			jpTop = new paineis(150, 150);
			
			jpEspacolivre = new paineis(0, 0);
			jpEspacolivre.setBorder(null);
			
			jpCentro = new paineis(50,50);
			jpCentro.setLayout(null);
			
			
			jbNovo = new botoes("Novo");
			jbSalvar = new botoes("Salvar");
			jbEditar = new botoes("Editar");
			jbExcluir = new botoes("Excluir");
			jbCancelar = new botoes("Cancelar");
			jbRelatorio = new botoes("Imprimir");
			
			jbNovo.setIcon(new ImageIcon(getClass().getResource("/imagens/save_new.png")));
			jbSalvar.setIcon(new ImageIcon(getClass().getResource("/imagens/save_data.png")));
			jbEditar.setIcon(new ImageIcon(getClass().getResource("/imagens/edit_button.png")));
			jbExcluir.setIcon(new ImageIcon(getClass().getResource("/imagens/delete.png")));
			jbCancelar.setIcon(new ImageIcon(getClass().getResource("/imagens/cancel.png")));
			
			jbRelatorio.setIcon(new ImageIcon(getClass().getResource("/imagens/impressora24x24.png")));
			jbRelatorio.setVisible(false);
			
			
			jbSalvar.setEnabled(false);
			jbEditar.setEnabled(false);
			jbCancelar.setEnabled(false);
			jbExcluir.setEnabled(false);
			jbRelatorio.setEnabled(false);
			
			jpTop.add(jbNovo);
			jpTop.add(jbSalvar);
			jpTop.add(jbEditar);
			jpTop.add(jbCancelar);
			jpTop.add(jbExcluir);
			
			jpTop.add(jpEspacolivre);
			jpTop.add(jbRelatorio);
			
			
			jbNovo.addActionListener(this);
			jbSalvar.addActionListener(this);
			jbEditar.addActionListener(this);
			jbCancelar.addActionListener(this);
			jbExcluir.addActionListener(this);
			jbRelatorio.addActionListener(this);
			
			this.add(jpTop, BorderLayout.NORTH);
			this.add(jpCentro, BorderLayout.CENTER);
		}
		    
		    
		    
		    public void lista(JTable tab, int x, int y, int width, int height) {
		    	
		    	
				JScrollPane scrollPane= new JScrollPane(tab);
				
				tab.setFillsViewportHeight(true);
				tab.setRowSelectionInterval(0,0);
				
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
			
			
			public void StatusBotoes(boolean novo, boolean salvar, boolean editar, boolean cancelar,boolean excluir) {
				
				jbNovo.setEnabled(novo);
				jbSalvar.setEnabled(salvar);
				jbEditar.setEnabled(editar);
				jbCancelar.setEnabled(cancelar);
				jbExcluir.setEnabled(excluir);
						
			}
			
			public abstract void criaJTable(); 
			
		    public abstract void acoes();
		    
		    public abstract void StatusTelaComponentes(boolean status);
		    public abstract void limpaTela();
		    
		    
}