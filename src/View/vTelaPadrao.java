package View;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import grafica.painelCliente;

public class vTelaPadrao extends JInternalFrame {  
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
            
            //this.setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/pedido.png")));
 
            
            
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            
            componentes();
            this.setVisible(true);
           
            
     }
    
		    private void componentes() {
		
			
			jpTop = new paineis(150, 150);

			jpCentro = new paineis(50,50);
			//jpCentro.setBackground(Color.BLUE);
			//jpCentro.setLocation(200,10);
			jpCentro.setLayout(null);
			//jpCentro.setBackground(Color.black);
			
		
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
					
			
			jpTop.add(jbNovo);
			jpTop.add(jbSalvar);
			jpTop.add(jbEditar);
			jpTop.add(jbExcluir);
			jpTop.add(jbCancelar);
			
			
			
			//lista();
			
			this.add(jpTop, BorderLayout.NORTH);
			this.add(jpCentro, BorderLayout.CENTER);
		}
		    
		    
		    public void lista(String[] col, Object[][] fonte, int width, int height) {
		    	
		    	
		    	String[] colunas = col;
				Object[][] FonteDeDados= fonte;
				
				
			    JTable tabela  = new  JTable(new DefaultTableModel(FonteDeDados, colunas){  
		            public boolean isCellEditable(int rowIndex, int mColIndex) {  
		                return false;  
		            }  
		        });  
			    
				
				tabela.getColumnModel().getColumn(0).setPreferredWidth(105);
				
				//tabela.getColumnModel().getColumn(1).setPreferredWidth(20);
				
				//tabela.getColumnModel().getColumn(2).setPreferredWidth(20);
				
				JScrollPane scrollPane= new JScrollPane(tabela);
				
				tabela.setFillsViewportHeight(true);
				tabela.setRowSelectionInterval(0,0);
				
				scrollPane.setBounds(5,40, width, height);
				 
				jpCentro.add(scrollPane);
				
				jlPesquisa = new JLabel("Pesquisa:");
				jlPesquisa.setBounds(10,5, 75,30);
				
				jtPesquisar = new JTextField();
				jtPesquisar.setBounds(70, 8, width - 65, 30);
				
				jpCentro.add(jtPesquisar);
				jpCentro.add(jlPesquisa);
				//((DefaultTableModel)tabela.getModel()).addRow(new Vector()); //linha vazia
				//((DefaultTableModel)tabela.getModel()).addRow( new Object[]{"005", "Raulivan","Matriculado"});
				//Mais
		    }
		    
		    
}