package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.mAdicionais;
import model.mTipoAdicionais;

public class daoTipoAdicionais extends DAOSuperClass<mTipoAdicionais> {

	public daoTipoAdicionais() throws Exception {
		super();
		
	}


	@Override
	public boolean delete(int codigo) throws SQLException {
		return false;
	}

	@Override
	public mTipoAdicionais select(int codigo) throws SQLException {
		String sql = "Select * from TipoAdicionais where adictipoprod= ?";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setInt(1, codigo);
		
		ResultSet rs = stm.executeQuery();
		mTipoAdicionais retorno = null;
		
		if(rs.next()) {
			
			retorno = new mTipoAdicionais();
			retorno.setCodTipoProduto(rs.getInt(1));
			retorno.setadictipoprod(rs.getInt(2));
		}
		
		close(rs,stm);
		
		return retorno;
	}

	@Override
	public List<mTipoAdicionais> selectAll() throws SQLException {
		
		String sql = "SELECT * FROM adictipoprod";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		ResultSet rs = stm.executeQuery();
		List<mTipoAdicionais> retorno = new ArrayList();
		
		while(rs.next()) {
			mTipoAdicionais temp = new mTipoAdicionais();
			temp.setCodTipoProduto(rs.getInt(1));
			temp.setadictipoprod(rs.getInt(2));
			
			retorno.add(temp);
			
		}
		
		close(rs,stm);
		fecha();
		return retorno;

	}

	@Override
	public mTipoAdicionais selectDesc(String descricao) throws SQLException {
		String sql = "Select * from adictipoprod where tDescTipo= ?";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setString(1, descricao);
		
		ResultSet rs = stm.executeQuery();
		mTipoAdicionais retorno = null;
		
		if(rs.next()) {
			
			retorno = new mTipoAdicionais();
			retorno.setCodTipoProduto(rs.getInt(1));
			retorno.setadictipoprod(rs.getInt(2));
		}
		
		close(rs,stm);
		
		return retorno;
	}

	@Override
	public boolean insert(mTipoAdicionais arg0) throws SQLException {
		
		return false;
	}

	@Override
	public boolean update(mTipoAdicionais arg0) throws SQLException {
		
		return false;
	}
	
}
	