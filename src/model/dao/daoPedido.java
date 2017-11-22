package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.mCliente;
import model.mPedido;

public class daoPedido extends DAOSuperClass<mPedido>{



	public daoPedido() throws Exception {
		super();

	}


	@Override
	public boolean insert(mPedido arg0) throws SQLException {

		String sql = "INSERT INTO pedido (peFormaPagamento,peStatus,peTxEntrega,peVlTotal,peTotalProdutos) "
				+ "VALUES(?,?,?,?,?);";

		PreparedStatement stm = this.createPreparedStatement(sql);

		stm.setString(1, arg0.getPeFormaPagamento());
		//stm.setBoolean(2, arg0.getpeStatus());
		stm.setString(3, arg0.getPeTxEntrega());
		stm.setDouble(4, arg0.getPeVlTotal());
		stm.setInt(5, arg0.getPeTotalProdutos());

		boolean retorno = stm.executeUpdate() > 0;

		close(stm);
		fecha();

		return retorno;

	}

	@Override
	public boolean update(mPedido arg0) throws SQLException {

		String sql = "UPDATE pedido SET  peFormaPagamento = ?, peStatus =?, peTxEntrega =?, peTotalProdutos =?,"
				+ " WHERE codPedido =?; ";

		PreparedStatement stm = this.createPreparedStatement(sql);

		stm.setString(1, arg0.getPeFormaPagamento());
		//stm.setBoolean(2, arg0.getpeStatus());
		stm.setString(3, arg0.getPeTxEntrega());
		stm.setDouble(4, arg0.getPeVlTotal());
		stm.setInt(5, arg0.getPeTotalProdutos());

		boolean retorno = stm.executeUpdate() > 0;

		close(stm);
		fecha();

		return retorno;
	}

	@Override
	public boolean delete(int codigo) throws SQLException {

		String sql = "DELETE FROM pedido WHERE codPedido =?;";

		PreparedStatement stm = this.createPreparedStatement(sql);

		stm.setInt(1, codigo);

		boolean retorno = stm.executeUpdate() > 0;
		close(stm);

		return retorno;
	}

	@Override
	public mPedido select(int codigo) throws SQLException {

		String sql = "Select * from pedido where codPedido= ?";

		PreparedStatement stm = this.createPreparedStatement(sql);
		stm.setInt(1, codigo);

		ResultSet rs = stm.executeQuery();
		mPedido retorno = null;

		if(rs.next()) {

			retorno = new mPedido();
			retorno.setCodPedido(rs.getInt(1));
			retorno.setPeFormaPagamento(rs.getString(2));
			retorno.setPeStatus(rs.getBoolean(3));
			retorno.setPeTxEntrega(rs.getString(4));
			retorno.setPeVlTotal(rs.getDouble(5));
			retorno.setPeTotalProdutos(rs.getInt(6));
			retorno.setPe_codCliente(rs.getInt(7));

		}

		close(rs,stm);

		return retorno;
	}

	@Override
	public List<mPedido> selectAll() throws SQLException {

		String sql = "SELECT * FROM pedido";

		PreparedStatement stm = this.createPreparedStatement(sql);

		ResultSet rs = stm.executeQuery();
		List<mPedido> retorno = new ArrayList();
		
		while(rs.next()) {
			mPedido temp = new mPedido();
			temp.setCodPedido(rs.getInt(1));
			temp.setPeFormaPagamento(rs.getString(2));
			temp.setPeStatus(rs.getBoolean(3));
			temp.setPeTxEntrega(rs.getString(4));
			temp.setPeVlTotal(rs.getDouble(5));
			temp.setPeTotalProdutos(rs.getInt(6));
			temp.setPe_codCliente(rs.getInt(7));
			
			retorno.add(temp);
			
		}
		
		close(rs,stm);
		fecha();
		return retorno;	}

	@Override
	public mPedido selectDesc(String descricao) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}