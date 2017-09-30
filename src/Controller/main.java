package Controller;



import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import View.vPrincipal;


public class main {

	public static void main(String[] args) { 
		/*try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}*/
		
		try {   
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  
       } catch (UnsupportedLookAndFeelException ex) {  
            ex.printStackTrace();  
       } catch (IllegalAccessException ex) {  
            ex.printStackTrace();  
       } catch (InstantiationException ex) {  
            ex.printStackTrace();  
       } catch (ClassNotFoundException ex) {  
            ex.printStackTrace();  
       } 
		       new vPrincipal();
		 
		
	}
}

