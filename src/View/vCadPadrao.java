package View;

import javax.swing.JInternalFrame;

public class vCadPadrao extends JInternalFrame {  
 
    public vCadPadrao(String titulo) {
        super(titulo);
        	this.setResizable(false);
            this.setClosable(true);
            this.setMaximizable(false);
            this.setIconifiable(false);  
        
        
        setSize(800,500);  
 
     }
}