package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.mProduto;
import model.mTipoProduto;

public class daoTipoProduto extends DAOSuperClass<mTipoProduto> {

	public daoTipoProduto() throws Exception {
		super();
		
	}

	@Override
	public boolean insert(mTipoProduto arg0) throws SQLException {
		return false;
	}

	@Override
	public boolean update(mTipoProduto arg0) throws SQLException {
		return false;
	}

	@Override
	public boolean delete(int codigo) throws SQLException {
		return false;
	}

	@Override
	public mTipoProduto select(int codigo) throws SQLException {
		String sql = "Select * from TipoProduto where codTipoProduto= ?";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setInt(1, codigo);
		
		ResultSet rs = stm.executeQuery();
		mTipoProduto retorno = null;
		
		if(rs.next()) {
			
			retorno = new mTipoProduto();
			retorno.setCodTipoProduto(rs.getInt(1));
			retorno.settDescTipo(rs.getString(2));
		}
		
		close(rs,stm);
		
		return retorno;
	}

	@Override
	public List<mTipoProduto> selectAll() throws SQLException {
		
		String sql = "SELECT * FROM TipoProduto";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		ResultSet rs = stm.executeQuery();
		List<mTipoProduto> retorno = new ArrayList();
		
		while(rs.next()) {
			mTipoProduto temp = new mTipoProduto();
			temp.setCodTipoProduto(rs.getInt(1));
			temp.settDescTipo(rs.getString(2));
			
			retorno.add(temp);
			
		}
		
		close(rs,stm);
		fecha();
		return retorno;

	}

	@Override
	public mTipoProduto selectDesc(String descricao) throws SQLException {
		String sql = "Select * from TipoProduto where tDescTipo= ?";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setString(1, descricao);
		
		ResultSet rs = stm.executeQuery();
		mTipoProduto retorno = null;
		
		if(rs.next()) {
			
			retorno = new mTipoProduto();
			retorno.setCodTipoProduto(rs.getInt(1));
			retorno.settDescTipo(rs.getString(2));
		}
		
		close(rs,stm);
		
		return retorno;
	}
	
}
	