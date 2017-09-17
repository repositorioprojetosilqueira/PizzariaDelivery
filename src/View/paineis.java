package View;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class paineis extends JPanel{
	
	public paineis(int x, int y){
		super();
		setSize(x,y);
		Border borda = BorderFactory.createLineBorder(Color.gray,2);
		setBorder(borda);
		setVisible(true);
		setLocation(null);
		
	}
	

}
