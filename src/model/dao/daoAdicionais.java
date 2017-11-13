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

		String sql = "INSERT INTO adicionais(aDescricao, aPreco, aStatus) VALUES (?,?,?,?,?); ";

		PreparedStatement stm = this.createPreparedStatement(sql);

		stm.setString(1, arg0.getaDescricao());
		stm.setDouble(2, arg0.getaPreco());
		stm.setString(3, arg0.getaStatus());

		boolean retorno = stm.executeUpdate() > 0;

		close(stm);
		fecha();

		return retorno;

	}

	@Override
	public boolean update(mAdicionais arg0) throws SQLException {

		String sql = "UPDATE adicionais SET aDescricao= ?, aPreco= ?, aStatus= ? WHERE codAdicionais= ?; ";

		PreparedStatement stm = this.createPreparedStatement(sql);

		stm.setString(1, arg0.getaDescricao());
		stm.setDouble(2, arg0.getaPreco());
		stm.setString(3, arg0.getaStatus());
		stm.setInt(4, arg0.getCodAdicionais());

		boolean retorno = stm.executeUpdate() > 0;

		close(stm);
		fecha();

		return retorno;

	}

	@Override
	public boolean delete(int codigo) throws SQLException {

		String sql = "DELETE FROM adicionais WHERE codAdicionais =?;";

		PreparedStatement stm = this.createPreparedStatement(sql);

		stm.setInt(1, codigo);

		boolean retorno = stm.executeUpdate() > 0;

		close(stm);

		return retorno;

	}

	@Override
	public mAdicionais select(int codigo) throws SQLException {
		String sql = "Select * from adicionais where codAdicionais= ?";
		
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

		String sql = "SELECT * FROM adicionais where aDescricao = ?";

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
