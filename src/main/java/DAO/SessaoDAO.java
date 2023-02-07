package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Filme;
import model.Ingresso;
import model.Sessao;


public class SessaoDAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/CineMotion?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "Luis";
	FilmeDAO filmeDao = new FilmeDAO();
	
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
				public void cadastrarSessao(Sessao sessao) {
					String create = "insert into Sessao (horario, quantIngMax, sala, data_sessao, num_sessao) values (?,?,?,?,?)";
					try {

						Connection con = conectar();
						// Preparar a query para a execução no banco de dados
						PreparedStatement pst = con.prepareStatement(create);
						// substituir os paramentos pelo conteudo das variaveis javaBeans
						pst.setString(1, sessao.getHorario());
						pst.setInt(2, sessao.getQuantIngMax());
						pst.setInt(3, sessao.getSala());
						pst.setString(4, sessao.getData_sessao());
						pst.setInt(5, sessao.getNum_sessao());

						
						// Executat a query
						pst.executeUpdate();
						// Encerrar a conexao com o banco
						con.close();
					} catch (Exception e) {
						System.out.println(e);
					}
					
				}
	//Crud read
	public ArrayList<Sessao> listarSessao(){
			//criando objeto para acessar a classe
			ArrayList<Sessao> sessao = new ArrayList<>();
			String read = "select * from Sessao inner join Filme inner join Ingresso where Filme.id_filme = Sessao.id_sessao and Sessao.id_Sessao = Ingresso.id_Ingresso ";
			try {
				//abrindo conexao com o banco 
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(read);
				ResultSet rs = pst.executeQuery();
				// laço abaixo sera executado 
				while(rs.next()) {
					//variaveis de apoio que recebem os dados do banco 
					int sala = rs.getInt(1);
					int num_sessao = rs.getInt(2);
					String data_sessao = rs.getString(3);
					int quantIngMax = rs.getInt(4);
					String horario = rs.getString(5);
					int id_sessao = rs.getInt(8);
					Filme filme = new Filme();
					filme.setTitulo(rs.getString(9));
					filme.setDt_lancamento(rs.getString(10));
					filme.setGenero(rs.getString(11));
					filme.setDuracao(rs.getString(12));
					filme.setDiretor(rs.getString(13));
					filme.setDescricao(rs.getString(14));
					filme.setNome_img(rs.getString(15));
					Ingresso ingresso = new Ingresso();
					ingresso.setPreco(rs.getDouble(17));
					
					sessao.add(new Sessao(sala, num_sessao, quantIngMax, data_sessao, horario, id_sessao, filme, ingresso));
					
				}
				con.close();
				return sessao;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
	
	public ArrayList<Sessao> selecionarSessao(Sessao sessao) {
		String read = "select * from Sessao where id_sessao = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			pst.setInt(1, sessao.getId_sessao());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				sessao.setSala(rs.getInt(1));
				sessao.setNum_sessao(rs.getInt(2)); 
				sessao.setData_sessao(rs.getString(3));
				sessao.setQuantIngMax(rs.getInt(4));
				sessao.setHorario(rs.getString(5));
				sessao.setId_sessao(rs.getInt(8));
				
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public void alterarSessao(Sessao sessao) {
		String create = "update Sessao set sala=?, num_sessao=?, data_sessao=?, quantIngMax =?, horario=? where id_sessao=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setInt(1, sessao.getSala());
			pst.setInt(2, sessao.getNum_sessao());
			pst.setString(3, sessao.getData_sessao());
			pst.setInt(4, sessao.getQuantIngMax());
			pst.setString(5, sessao.getHorario());
			pst.setInt(6, sessao.getId_sessao());
			
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void deletar(Sessao sessao) {
		String delete = "delete from Sessao where id_sessao = ? ";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, sessao.getId_sessao());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
}