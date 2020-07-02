package model.conexao;
import Controller.ControladoraGeral;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controladora_Conexao extends ControladoraGeral {

	static final String driver = "org.sqlite.JDBC";
	static final String url = "jdbc:sqlite:sqlite/db/Pedidos.db";
	static Connection conexao = null;
	
	public Controladora_Conexao(){
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConexao(){
		if(conexao == null){
			try {
				conexao = DriverManager.getConnection(url);
				conexao.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		return conexao;
	}
	
	public void desconecta(){
		try {
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao = null;
	}
}
