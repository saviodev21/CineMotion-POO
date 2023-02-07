package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Cliente;
import model.Filme;
import model.Sessao;

public class ClienteDAO extends PessoaDAO {

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
		public void cadastrarCliente(Cliente cliente) {
			String create = "insert into cliente (nome, idade, sexo, email, telefone, cpf, senha) values (?,?,?,?,?,?,?)";
			try {
				// abrir conexao
				Connection con = conectar();
				// Preparar a query para a execução no banco de dados
				PreparedStatement pst = con.prepareStatement(create);
				// substituir os paramentos pelo conteudo das variaveis javaBeans
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getIdade());
				pst.setString(3, cliente.getSexo());
				pst.setString(4, cliente.getEmail());
				pst.setString(5, cliente.getTelefone());
				pst.setString(6, cliente.getCpf());
				pst.setString(7, cliente.getSenha());
				// Executat a query
				pst.executeUpdate();
				// Encerrar a conexao com o banco
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public void login(Cliente cliente) {
			String login = "select * from Cliente where email = ? and senha = ?";
			try {
				// abrir conexao
				Connection con = conectar();
				// Preparar a query para a execução no banco de dados
				PreparedStatement pst = con.prepareStatement(login);
				// substituir os paramentos pelo conteudo das variaveis
				pst.setString(1, cliente.getEmail());
				pst.setString(2, cliente.getSenha());
			
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					cliente.setNome(rs.getString(1));
					cliente.setIdade(rs.getString(2));
					cliente.setSexo(rs.getString(3));
					cliente.setEmail(rs.getString(4));
					cliente.setTelefone(rs.getString(5));
					cliente.setCpf(rs.getString(6));
					cliente.setSenha(rs.getString(7));
				}
				
				// Encerrar a conexao com o banco
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}

		}
		
		public ArrayList<Cliente> selecionarCliente(Cliente cliente) {
			String read2 = "select * from Cliente where email = ?";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(read2);
				pst.setString(1, cliente.getEmail());
				ResultSet rs = pst.executeQuery();
				while(rs.next()) {
					cliente.setNome(rs.getString(1));
					cliente.setIdade(rs.getString(2));
					cliente.setSexo(rs.getString(3));
					cliente.setEmail(rs.getString(4));
					cliente.setTelefone(rs.getString(5));
					cliente.setCpf(rs.getString(6));
					cliente.setSenha(rs.getString(7));
				}
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			return null;
		}
		
		@Override
		public void deletar(String id) {
			String delete = "delete from Cliente where cpf = ? ";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setString(1, id);
				pst.executeUpdate();
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public ArrayList<Cliente> listarCliente() {
			// criando objeto para acessar a classe 
			ArrayList<Cliente> clientes = new ArrayList<>();
			String read = "select * from Cliente";
			try {
				// abrindo conexao com o banco
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(read);
				ResultSet rs = pst.executeQuery();
				// laço abaixo sera executado
				while (rs.next()) {
					// variaveis de apoio que recebem os dados do banco
					String nome = rs.getString(1);
					String idade = rs.getString(2);
					String sexo = rs.getString(3);
					String email = rs.getString(4);
					String telefone = rs.getString(5);
					String cpf = rs.getString(6);
					String senha = rs.getString(7);
					

					// populando o arraylist

					clientes.add(new Cliente(nome, idade, sexo, email, telefone, cpf, senha));
					
				}
				con.close();
				return clientes;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
			
	}
}
