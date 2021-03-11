package testeBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JDBCExemplo {

	public static void main(String[] args) throws SQLException {

		try {
			Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/exemplo_base_dados", "root", "1234567r");
	        System.out.println("Conectado!");
	        conexao.close();
	        } catch (SQLException s) {
	            System.out.println("Não foi possível conectar ao banco");
	        }
	}

}
