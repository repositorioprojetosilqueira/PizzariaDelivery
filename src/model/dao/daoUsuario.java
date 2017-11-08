package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.mUsuario;

public class daoUsuario extends DAOSuperClass<mUsuario>{

	public daoUsuario() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean insert(mUsuario arg0) throws SQLException {
		
		String sql = "INSERT INTO usuario(uNome,uFuncao,uEmail,uTelefone,uLogin,uSenha,uStatus) VALUES (?,?,?,?,?,?,?);";
	
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		stm.setString(1, arg0.getuNome());
		stm.setString(2, arg0.getuFuncao());
		stm.setString(3, arg0.getuEmail());
		stm.setString(4, arg0.getuTelefone());
		stm.setString(5, arg0.getuLogin());
		stm.setString(6, arg0.getuSenha());
		stm.setBoolean(7, arg0.getuStatus());

		boolean retorno = stm.executeUpdate() > 0;
		
		close(stm);
		fecha();
		
		return retorno;
	}

	@Override
	public boolean update(mUsuario arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public mUsuario select(int codigo) throws SQLException {
		String sql = "Select * from usuario where codUsuario= ?";
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setInt(1, codigo);
		
		ResultSet rs = stm.executeQuery();
		mUsuario retorno = null;
		
		if(rs.next()) {
			
			retorno = new mUsuario();
			retorno.setCodUsuario(rs.getInt(1));
			retorno.setuNome(rs.getString(2));
			retorno.setuFuncao(rs.getString(3));
			retorno.setuEmail(rs.getString(4));
			retorno.setuTelefone(rs.getString(5));
			retorno.setuLogin(rs.getString(6));
			retorno.setuSenha(rs.getString(7));
			retorno.setuStatus(rs.getBoolean(8));
			
		}
		
		close(rs,stm);
		
		
		return retorno;
		
	}

	@Override
	public List<mUsuario> selectAll() throws SQLException {
		
		String sql = "SELECT * FROM usuario";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		ResultSet rs = stm.executeQuery();
		List<mUsuario> retorno = new ArrayList();
		
		while(rs.next()) {
			
			mUsuario temp = new mUsuario();
			temp.setCodUsuario(rs.getInt(1));
			temp.setuNome(rs.getString(2));
			temp.setuFuncao(rs.getString(3));
			temp.setuEmail(rs.getString(4));
			temp.setuTelefone(rs.getString(5));
			temp.setuLogin(rs.getString(6));
			temp.setuSenha(rs.getString(7));
			temp.setuStatus(rs.getBoolean(8));
			retorno.add(temp);
		}
		
		close(rs,stm);
		fecha();
		return retorno;
		
	}

	@Override
	public mUsuario selectDesc(String descricao) throws SQLException {
		
		String sql = "SELECT * FROM usuario where uLogin = ?";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setString(1, descricao);
		
		ResultSet rs = stm.executeQuery();
		mUsuario retorno = null;
		
		if(rs.next()) {
			retorno = new mUsuario();
			retorno.setCodUsuario(rs.getInt(1));
			retorno.setuNome(rs.getString(2));
			retorno.setuFuncao(rs.getString(3));
			retorno.setuEmail(rs.getString(4));
			retorno.setuTelefone(rs.getString(5));
			retorno.setuLogin(rs.getString(6));
			retorno.setuSenha(rs.getString(7));
			retorno.setuStatus(rs.getBoolean(8));
			
		}
		close(rs, stm);

		return retorno;
		
	}

}
