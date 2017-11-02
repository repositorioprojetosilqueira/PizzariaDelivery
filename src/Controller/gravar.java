package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.ConectionFactory;

public class gravar {

	public gravar(String sql, PreparedStatement stm) {
	
	System.out.println("vamos começar!");

	try {
		
	Connection cnn = ConectionFactory.getConnection("MYSQL");
	stm = cnn.prepareStatement(sql);

	boolean faz = stm.execute();
	
	if(faz == false) 
		System.out.println("Salvo com Sucessos");
	else
		System.out.println("Deu Erro");
	
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	
	}

}
	
