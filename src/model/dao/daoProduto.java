package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.mCliente;
import model.mProduto;

public class daoProduto extends DAOSuperClass<mProduto>{

	public daoProduto() throws Exception {
		super();
		
		
	}

	@Override
	public boolean insert(mProduto arg0) throws SQLException {
		String sql = "INSERT INTO produto(pDescricao,pPreco,pStatus,p_CodTipoProduto) values(?,?,?,?);";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		stm.setString(1, arg0.getpDescicao());
		stm.setString(2, arg0.getpPreco());
		stm.setBoolean(3, arg0.getpStatus());
		stm.setInt(4, arg0.getP_CodTipoProduto());
		
		boolean retorno = stm.executeUpdate() > 0;
		
		close(stm);
		fecha();
		
		return retorno;
	}

	@Override
	public boolean update(mProduto arg0) throws SQLException {
		String sql = "update produto set pDescricao=? ,pPreco= ?,pStatus=? ,p_CodTipoProduto=? "
				+ "WHERE codProduto = ?";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		stm.setString(1, arg0.getpDescicao());
		stm.setString(2, arg0.getpPreco());
		stm.setBoolean(3, arg0.getpStatus());
		stm.setInt(4, arg0.getP_CodTipoProduto());
		stm.setInt(5, arg0.getCodProduto());
		
		
		boolean retorno = stm.executeUpdate() > 0;
		
		close(stm);
		fecha();
		
		return retorno;
	}

	@Override
	public boolean delete(int codigo) throws SQLException {
		String sql = "DELETE FROM produto WHERE codProduto =?;";
		
		PreparedStatement stm = this.createPreparedStatement(sql);

		stm.setInt(1, codigo);
		
		boolean retorno = stm.executeUpdate() > 0;
		close(stm);
		
		return retorno;
	}

	@Override
	public mProduto select(int codigo) throws SQLException {
		String sql = "Select * from produto where codProduto= ?";
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setInt(1, codigo);
		
		ResultSet rs = stm.executeQuery();
		mProduto retorno = null;
		
		if(rs.next()) {
			
			retorno = new mProduto();
			retorno.setCodProduto(rs.getInt(1));
			retorno.setpDescicao(rs.getString(2));
			retorno.setpPreco(rs.getString(3));
			retorno.setpStatus(rs.getBoolean(4));
			retorno.setP_CodTipoProduto(rs.getInt(5));
		}
		
		close(rs,stm);
		
		return retorno;
	}

	@Override
	public List<mProduto> selectAll() throws SQLException {
		String sql = "SELECT * FROM produto order by p_CodTipoProduto;";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		ResultSet rs = stm.executeQuery();
		List<mProduto> retorno = new ArrayList();
		
		while(rs.next()) {
			mProduto temp = new mProduto();
			temp.setCodProduto(rs.getInt(1));
			temp.setpDescicao(rs.getString(2));
			temp.setpPreco(rs.getString(3));
			temp.setpStatus(rs.getBoolean(4));
			temp.setP_CodTipoProduto(rs.getInt(5));
			
			retorno.add(temp);
			
		}
		
		close(rs,stm);
		fecha();
		return retorno;
	}

	@Override
	public mProduto selectDesc(String descricao) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
