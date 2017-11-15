package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectionFactory {

		private static Connection conexao;
		
		/**
		 * Metodo que retorna conexão com o banco de dados
		 * @param sgbd (MMSQL para SQL Server, MySql para Mysql)
		 * @return um objeto Connection
		 * @throws Exception de banco não encontrado
		 */
		
	
		
			public static Connection getConnection(String sgbd) throws Exception {
				
				if((conexao != null) && (!conexao.isClosed())) 
					return conexao;
				
				if(sgbd.equalsIgnoreCase("MSSQL"))
					sqlServer();
			
				else if(sgbd.equalsIgnoreCase("MYSQL"))
					MySql();
				
				else
					throw new Exception("Tipo de SGBD invalido, Informe MMSQL ou MySQL");
				
				
				return conexao;
				
			}
			
			private static void sqlServer() throws SQLException {
				String banco = "agenda";
				String usuario = "sa";
				String senha = "SUA_SENHA";

				String servidor = "SILQUEIRAPC\\SQLEXPRESS";
				
				conexao = DriverManager.getConnection("jdbc:sqlserver://"
				+ servidor + ";databaseName="+ banco, usuario, senha);
				
				
			} 
			
			
			private static void MySql() throws SQLException {
				String banco = "delivery";
				String usuario = "root";
				String senha = "321crazy";
				
				String servidor = "silqueirapc";
				
				String stringConexao = "jdbc:mysql://"+servidor+":3306/"+banco+"?&useSSL=false";
				//String stringConexao = "jdbc:mysql://"+servidor+":3306/"+banco+"?&useSSL=false";
				
				conexao = DriverManager.getConnection(stringConexao, usuario, senha);
				
			}
			
		
		public static void Close() throws SQLException {
				conexao = null;
		}
		
		public static void Dispose(Statement stm) throws SQLException {
			stm.close();
			stm = null;
		}
		
		public static void Dispose(PreparedStatement stm) throws SQLException {
			stm.close();
			stm = null;
		}
		
		public static void Dispose(PreparedStatement stm, ResultSet rs) throws SQLException {
			rs.close();
			rs = null;
			Dispose(stm);
		}
		
		public static void Dispose(Statement stm, ResultSet rs) throws SQLException {
			rs.close();
			rs = null;
			Dispose(stm);
		}
		
			
			
}

























