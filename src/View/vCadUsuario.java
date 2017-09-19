package View;
import javax.swing.JInternalFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;
 
public class vCadUsuario extends JInternalFrame {  
 
    public vCadUsuario() {
        super("Cadastro Usuário",
              false, //resizable
               true, //closable
              false, //maximizable
               false);//iconifiable  
        
        
        setSize(800,500);  
 
     }
 }