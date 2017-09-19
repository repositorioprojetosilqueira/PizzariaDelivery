package View;
import javax.swing.JInternalFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;
 
public class InternalFrameUm extends JInternalFrame {  
 
    public InternalFrameUm() {
        super("Internal Frame Um",
              true, //resizable
               true, //closable
              true, //maximizable
               true);//iconifiable  
        
        
        setSize(300,300);  
 
     }
 }