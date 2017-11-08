package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.mAdicionais;
import model.mUsuario;

public class daoAdicionais extends DAOSuperClass<mAdicionais>{



	public daoAdicionais() throws Exception {
		super();

	}


	@Override
	public boolean insert(mAdicionais arg0) throws SQLException {

		String sql = "INSERT INTO adicionais(codAdicionais, aDescricao, aPreco, aStatus) VALUES (?,?,?,?,?); ";

		PreparedStatement stm = this.createPreparedStatement(sql);

		stm.setInt(1, arg0.getCodAdicionais());
		stm.setString(2, arg0.getaDescricao());
		stm.setDouble(3, arg0.getaPreco());
		stm.setString(4, arg0.getaStatus());

		boolean retorno = stm.executeUpdate() > 0;

		close(stm);
		fecha();

		return retorno;

	}

	@Override
	public boolean update(mAdicionais arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public mAdicionais select(int codigo) throws SQLException {
		String sql = "Select * from usuario where codAdicionais= ?";
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setInt(1, codigo);

		ResultSet rs = stm.executeQuery();
		mAdicionais retorno = null;

		if(rs.next()) {

			retorno = new mAdicionais();
			retorno.setCodAdicionais(rs.getInt(1));
			retorno.setaDescricao(rs.getString(2));
			retorno.setaPreco(rs.getDouble(3));
			retorno.setaStatus(rs.getString(4));			

		}

		close(rs,stm);


		return retorno;

	}

	@Override
	public List<mAdicionais> selectAll() throws SQLException {

		String sql = "SELECT * FROM adicionais";

		PreparedStatement stm = this.createPreparedStatement(sql);

		ResultSet rs = stm.executeQuery();
		List<mAdicionais> retorno = new ArrayList();

		while(rs.next()) {

			mAdicionais temp = new mAdicionais();
			temp.setCodAdicionais(rs.getInt(1));
			temp.setaDescricao(rs.getString(2));
			temp.setaPreco(rs.getDouble(3));
			temp.setaStatus(rs.getString(4));
			retorno.add(temp);
		}

		close(rs,stm);
		fecha();
		return retorno;
	}

	@Override
	public mAdicionais selectDesc(String descricao) throws SQLException {
		
	String sql = "SELECT * FROM usuario where aDescricao = ?";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setString(1, descricao);
		
		ResultSet rs = stm.executeQuery();
		mAdicionais retorno = null;
		
		if(rs.next()) {
			retorno = new mAdicionais();
			retorno.setCodAdicionais(rs.getInt(1));
			retorno.setaDescricao(rs.getString(2));
			retorno.setaPreco(rs.getDouble(3));
			retorno.setaStatus(rs.getString(4));
			
		}
		close(rs, stm);

		return retorno;
	}




}
