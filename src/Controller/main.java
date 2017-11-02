package Controller;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import grafica.login;


public class main {

	public static void main(String[] args) { 
		/*
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
       } */
		
		try {   
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;}
		        }
          }      
        catch (UnsupportedLookAndFeelException ex) {  
            ex.printStackTrace();  
       } catch (IllegalAccessException ex) {  
            ex.printStackTrace();  
       } catch (InstantiationException ex) {  
            ex.printStackTrace();  
       } catch (ClassNotFoundException ex) {  
            ex.printStackTrace();
            }
		
		
			
		new login();
				//new vPrincipal();
		}
}

