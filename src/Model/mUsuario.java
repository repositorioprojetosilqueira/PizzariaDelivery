package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import View.vCadUsuario;

public class mUsuario extends vCadUsuario implements ActionListener{
	
	private PreparedStatement stm;
	
	public mUsuario() {
		jbNovo.addActionListener(this);
		jbSalvar.addActionListener(this);
		
		
	}
	
	public void gravar(){
		
		try {
		
		stm.setString(1,jtfNome.getText());
		//stm.setString(2, jtf);
		
		
		
		
		
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.equals(jbNovo))
			gravar();
		
	}
	
}

	