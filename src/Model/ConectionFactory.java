package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
				
				if(conexao != null) 
					return conexao;
				
				if(sgbd.equalsIgnoreCase("MSSQL"))
					sqlServer();
			
				else if(sgbd.equalsIgnoreCase("MYSQL"))
					MySql();
				
				else
					throw new Exception("Tipo de SGBD invalido, Informe MMSQL ou MySQL");
				
				
				return conexao;
				
			}
			
			private static Connection sqlServer() throws SQLException, Exception{
				String banco = "agenda";
				String usuario = "sa";
				String senha = "321crazy";
				String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
				String servidor = "SILQUEIRAPC\\SQLEXPRESS";
				
				Class.forName(driver);
				
				conexao = DriverManager.getConnection("jdbc:sqlserver://"
				+ servidor + ";databaseName="+ banco, usuario, senha);
				
				return conexao;
			} 
			
			
			private static Connection MySql() throws SQLException, Exception {
				String banco = "agenda";
				String usuario = "root";
				String senha = "321crazy";
				String driver = "com.mysql.jdbc.Driver";
				String servidor = "localhost";
				
				Class.forName(driver);
				conexao = DriverManager.getConnection("jdbc:mysql://"
				+servidor+":3306/"+banco, usuario, senha);
				
				return conexao;
			} 
			
			public static void Dispose(Statement stm) {
				
				
			}
			
	
}

























