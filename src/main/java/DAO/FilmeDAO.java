package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Ator;
import model.Atua;
import model.Cliente;
import model.Filme;
import model.Sessao;

public class FilmeDAO {

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
	public void cadastrarFilme(Filme filme) {
		String create = "insert into Filme (titulo, dt_lancamento, genero, duracao, diretor, descricao, nome_img) values (?,?,?,?,?,?,?)";
		try {

			Connection con = conectar();
			// Preparar a query para a execução no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			// substituir os paramentos pelo conteudo das variaveis javaBeans
			pst.setString(1, filme.getTitulo());
			pst.setString(2, filme.getDt_lancamento());
			pst.setString(3, filme.getGenero());
			pst.setString(4, filme.getDuracao());
			pst.setString(5, filme.getDiretor());
			pst.setString(6, filme.getDescricao());
			pst.setString(7, filme.getNome_img());

			// Executat a query
			pst.executeUpdate();
			// Encerrar a conexao com o banco
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Crud read
	public ArrayList<Filme> listarFilme() {
		// criando objeto para acessar a classe 
		ArrayList<Filme> filmes = new ArrayList<>();
		String read = "select * from Filme";
		try {
			// abrindo conexao com o banco
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			// laço abaixo sera executado
			while (rs.next()) {
				// variaveis de apoio que recebem os dados do banco
				String titulo = rs.getString(1);
				String dt_lancamento = rs.getString(2);
				String genero = rs.getString(3);
				String duracao = rs.getString(4);
				String diretor = rs.getString(5);
				String descricao = rs.getString(6);
				String nome_img = rs.getString(7);
				int id_filme = rs.getInt(8);
				

				// populando o arraylist

				filmes.add(new Filme(titulo, dt_lancamento, genero, duracao, diretor, descricao, id_filme, nome_img));
						
			}
			con.close();
			return filmes;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public ArrayList<Filme> selecionarFilme(Filme filme, Ator ator, Atua atua) {
		String read2 = "select * from Filme inner join Ator inner join Atua where Filme.id_filme = ? and Filme.id_filme = Ator.id_ator and Ator.id_ator = atua.id_atua"
				+ "";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, filme.getId_filme());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				filme.setTitulo(rs.getString(1));
				filme.setDt_lancamento(rs.getString(2)); 
				filme.setGenero(rs.getString(3)); 
				filme.setDuracao(rs.getString(4));
				filme.setDiretor(rs.getString(5));
				filme.setDescricao(rs.getString(6));
				filme.setNome_img(rs.getString(7));
				filme.setId_filme(rs.getInt(8));
				ator.setNome(rs.getString(9));
				ator.setNacionalidade(rs.getString(10));
				ator.setId_ator(rs.getInt(11));
				atua.setId_atua(rs.getInt(12));
				atua.setPapel(rs.getString(13));
				atua.setPremiacoes(rs.getString(14));
				
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public void deletar(Filme filme) {
		String delete = "delete from Filme where id_filme = ? ";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, filme.getId_filme());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
