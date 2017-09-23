package View;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;

public class vCadCliente extends vTelaPadrao {  
	 private botoes teste = new botoes("teste");
	 private botoes teste2 = new botoes("teste2");
	 
	 private paineis jpCentro= new paineis(150, 150);
	 
	    public vCadCliente() {
	        super("Cadastro Cliente");  
	        this.setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/cliente16x16.png")));
	        this.setVisible(true);
	       
	        componentes();
	        
	    }
	    private void componentes() {
	    	FlowLayout fl = new FlowLayout();
	    	jpCentro.setLayout(fl);
	    	fl.setAlignment(fl.LEFT);
	    	
	    	
	    	teste.setBounds(150, 150, 150, 50);
	    	jpCentro.add(teste2);
	    	jpCentro.add(teste);
	    	
	    	jpCentro.setLocation(50,50);
	    	this.add(jpCentro);
	    	
	    	
	    	
	    	
	    	
	    }
	 }
 