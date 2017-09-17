package View;



import javax.swing.JButton;

public class botoes extends JButton {
	
	public botoes(String Titulo,int lar,int alt){		
		super(Titulo);
		setSize(150, 50);
		setLocation(lar, alt);		
	}
}
 