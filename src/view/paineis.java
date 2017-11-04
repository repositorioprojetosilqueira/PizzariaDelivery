package view;

import java.awt.Color;

import javax.swing.BorderFactory;

import javax.swing.JPanel;
import javax.swing.border.Border;


public class paineis extends JPanel{
	
	public paineis(int x, int y){
		super();
		setSize(x,y);
		Border borda = BorderFactory.createLineBorder(Color.LIGHT_GRAY,1);
		setBorder(borda);
		setVisible(true);
		
		
	}
	

}
