package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Ator;
import model.Filme;

public class AtorDAO {

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
		public void cadastrarAtor(Ator ator) {
			String create = "insert into Ator (nome, nacionalidade) values (?,?)";
			try {

				Connection con = conectar();
				// Preparar a query para a execução no banco de dados
				PreparedStatement pst = con.prepareStatement(create);
				// substituir os paramentos pelo conteudo das variaveis javaBeans
				pst.setString(1, ator.getNome());
				pst.setString(2, ator.getNacionalidade());
			
				// Executat a query
				pst.executeUpdate();
				// Encerrar a conexao com o banco
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
