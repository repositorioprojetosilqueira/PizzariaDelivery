package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.mCliente;
import model.mUsuario;

public class daoCliente extends DAOSuperClass<mCliente>{
	
	public daoCliente() throws Exception {
		super();
		
	}

	@Override
	public boolean insert(mCliente arg0) throws SQLException {
		
		String sql = "INSERT INTO cliente (cNome,cTelefone1,cTelefone2,cRua,cNumero,cBairro,cComplemento,cRefEntrega,cHistCompras) "
				+ "VALUES(?,?,?,?,?,?,?,?,?);";
	
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		stm.setString(1, arg0.getcNome());
		stm.setString(2, arg0.getcTelefone1());
		stm.setString(3, arg0.getcTelefone2());
		stm.setString(4, arg0.getcRua());
		stm.setString(5, arg0.getcNumero());
		stm.setString(6, arg0.getcBairro());
		stm.setString(7, arg0.getcComplemento());
		stm.setString(8, arg0.getcRefEntrega());
		stm.setString(9, arg0.getcHistCompras());
		
		boolean retorno = stm.executeUpdate() > 0;
		
		close(stm);
		fecha();
		
		return retorno;
	}

	@Override
	public boolean update(mCliente arg0) throws SQLException {
		String sql = "UPDATE cliente SET  cNome = ?, cTelefone1 =?, cTelefone2 =?, cRua =?, cNumero =?, cBairro =?, cComplemento =?,"
				+ "cRefEntrega =?, cHistCompras =? WHERE codCliente =?; ";

		PreparedStatement stm = this.createPreparedStatement(sql);
		
		stm.setString(1, arg0.getcNome());
		stm.setString(2, arg0.getcTelefone1());
		stm.setString(3, arg0.getcTelefone2());
		stm.setString(4, arg0.getcRua());
		stm.setString(5, arg0.getcNumero());
		stm.setString(6, arg0.getcBairro());
		stm.setString(7, arg0.getcComplemento());
		stm.setString(8, arg0.getcRefEntrega());
		stm.setString(9, arg0.getcHistCompras());
		stm.setInt(10, arg0.getCodCliente());
		
		boolean retorno = stm.executeUpdate() > 0;
		
		close(stm);
		fecha();
		
		return retorno;
	}

	@Override
	public boolean delete(int codigo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public mCliente select(int codigo) throws SQLException {
		String sql = "Select * from cliente where codCliente= ?";
		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setInt(1, codigo);
		
		ResultSet rs = stm.executeQuery();
		mCliente retorno = null;
		
		if(rs.next()) {
			
			retorno = new mCliente();
			retorno.setCodCliente(rs.getInt(1));
			retorno.setcNome(rs.getString(2));
			retorno.setcTelefone1(rs.getString(3));
			retorno.setcTelefone2(rs.getString(4));
			retorno.setcRua(rs.getString(5));
			retorno.setcNumero(rs.getString(6));
			retorno.setcBairro(rs.getString(7));
			retorno.setcComplemento(rs.getString(8));
			retorno.setcRefEntrega(rs.getString(9));
			retorno.setcHistCompras(rs.getString(10));
			
		}
		
		close(rs,stm);
		
		return retorno;
		
	}

	@Override
	public List<mCliente> selectAll() throws SQLException {
		String sql = "SELECT * FROM cliente";
		
		PreparedStatement stm = this.createPreparedStatement(sql);
		
		ResultSet rs = stm.executeQuery();
		List<mCliente> retorno = new ArrayList();
		
		while(rs.next()) {
			mCliente temp = new mCliente();
			temp.setCodCliente(rs.getInt(1));
			temp.setcNome(rs.getString(2));
			temp.setcTelefone1(rs.getString(3));
			temp.setcTelefone2(rs.getString(4));
			temp.setcRua(rs.getString(5));
			temp.setcNumero(rs.getString(6));
			temp.setcBairro(rs.getString(7));
			temp.setcComplemento(rs.getString(8));
			temp.setcRefEntrega(rs.getString(9));
			temp.setcHistCompras(rs.getString(10));
			
			retorno.add(temp);
			
		}
		
		close(rs,stm);
		fecha();
		return retorno;
	}

	@Override
	public mCliente selectDesc(String descricao) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
