package View;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;

public class vCadCliente extends vTelaPadrao {  
	 
	    public vCadCliente() {
	        super("Cadastro Cliente");  
	        this.setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/cliente16x16.png")));
	    }
	 }
 