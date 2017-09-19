package View;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.border.TitledBorder;

public class vCadPadrao extends JInternalFrame {  
		private paineis jpTop, jpCentro;
		
		private botoes jbNovo, jbSalvar, jbEditar, jbExcluir, jbCancelar;
	 
    public vCadPadrao(String titulo) {
        super(titulo);
	        
        BorderLayout border = new BorderLayout();

	        this.setLayout(border);
        	this.setResizable(false);
            this.setClosable(true);
            this.setMaximizable(false);
            this.setIconifiable(false);  
            
            this.setSize(800,500); 
            
        	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        	componentes();
 
     }
    
		    private void componentes() {
		
			
			jpTop = new paineis(150, 150);
			jpCentro = new paineis(50,50);
			jpCentro.setLocation(10,10);
			//jpCentro.setBackground(Color.gray);
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
					
			
			jpTop.add(jbNovo);
			jpTop.add(jbSalvar);
			jpTop.add(jbEditar);
			jpTop.add(jbExcluir);
			jpTop.add(jbCancelar);
			this.add(jpTop, BorderLayout.NORTH);
			this.add(jpCentro, BorderLayout.CENTER);
		}
}