package View;

import java.awt.BorderLayout;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class vPrincipal extends JFrame{
	
	public vPrincipal() {
		super("Pizzaria Delivery 1.0");

		BorderLayout border = new BorderLayout();
		
		this.setLayout(border);
		//this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener((WindowListener) this);
				
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //Janela Maximizada
		
	}

}
