package controller;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import view.vCadCliente;
import view.vLogin;
import view.vPrincipal;


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
            ex.printStackTrace();   Teste 
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
		
		
 
		//new vLogin();
		new vPrincipal();
		}
}

