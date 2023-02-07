package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Atua;

public class AtuaDAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/CineMotion?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "Luis";
	
	// Metodo de conexao
		private Connection conectar() {
			Connection con = null;
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				return con;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		// Crud create
				public void cadastrarAtuacao(Atua atua) {
					String create = "insert into Atua (papel, premiacoes) values (?,?)";
					try {

						Connection con = conectar();
						// Preparar a query para a execução no banco de dados
						PreparedStatement pst = con.prepareStatement(create);
						// substituir os paramentos pelo conteudo das variaveis javaBeans
						pst.setString(1, atua.getPapel());
						pst.setString(2, atua.getPremiacoes());
					
						// Executat a query
						pst.executeUpdate();
						// Encerrar a conexao com o banco
						con.close();
					} catch (Exception e) {
						System.out.println(e);
					}
				}
}
