package model.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.ConectionFactory;

public abstract class DAOSuperClass<T> {

	private Connection conexao;
	
	public Connection getConexao() {
		return conexao;
	}

	public DAOSuperClass() throws Exception {
		conexao = ConectionFactory.getConnection("MYSQL");
	}
	
	protected PreparedStatement createPreparedStatement(String sql) throws SQLException {
		return this.conexao.prepareStatement(sql);
	}
	
	public void close(PreparedStatement arg0) throws SQLException {
		ConectionFactory.Dispose(arg0);
		
	}
	
	public void close(ResultSet arg0, PreparedStatement arg1) throws SQLException {
		ConectionFactory.Dispose(arg1,arg0);
		
	}
	public void fecha() throws SQLException {
		ConectionFactory.Close();
	}

	
	public abstract boolean insert(T arg0) throws SQLException;
	
	public abstract boolean update(T arg0) throws SQLException;
	
	public abstract boolean delete(int codigo) throws SQLException;
	
	public abstract T select(int codigo) throws SQLException;
	
	public abstract List<T> selectAll() throws SQLException;
	
	
}
