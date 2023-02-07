package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Ingresso;

public class IngressoDAO {

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
		public void cadastrarIngresso(Ingresso ingresso) {
			String create = "insert into Ingresso (preco) values (?)";
			try {

				Connection con = conectar();
				// Preparar a query para a execução no banco de dados
				PreparedStatement pst = con.prepareStatement(create);
				// substituir os paramentos pelo conteudo das variaveis 
				pst.setDouble(1, ingresso.getPreco());
				
				// Executat a query
				pst.executeUpdate();
				// Encerrar a conexao com o banco
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public void selecionarPreco(Ingresso ingresso) {
			String read2 = "select * from Ingresso where id_Ingresso = ?";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(read2);
				pst.setInt(1, ingresso.getId_Ingresso());
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					ingresso.setId_Ingresso(rs.getInt(1));
					ingresso.setPreco(rs.getDouble(2));
				}
				
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
