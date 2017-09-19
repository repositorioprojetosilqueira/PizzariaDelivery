package View;



import javax.swing.JButton;

public class botoes extends JButton {
	
	public botoes(String Titulo,int lar,int alt){		
		super(Titulo);
		setSize(50, 50);
		setLocation(lar, alt);		
	}
	public botoes(int lar,int alt){		
		super();
		//setSize(50, 50);
		setLocation(lar, alt);		
	}
	public botoes(String titulo) {
		super(titulo);
	}
}
 