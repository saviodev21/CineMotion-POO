package model;

public class Cliente extends Pessoa {

	private String email;
	private String telefone;
	private String cpf;
	private String senha;

	
	
	public Cliente() {
		super();
	}
	
	public Cliente(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	public Cliente(String nome, String idade, String sexo, String email,String telefone ,String cpf , String senha) {
		super(nome, idade, sexo);
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
