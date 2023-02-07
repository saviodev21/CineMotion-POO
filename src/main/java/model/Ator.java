package model;

public class Ator extends Pessoa {

	private String nacionalidade;
	private int id_ator;
	private Filme filme;
	
	public Ator(String nome, String idade, String sexo, String nacionalidade, int id_ator, Filme filme) {
		super(nome, idade, sexo );
		this.nacionalidade = nacionalidade;
		this.id_ator = id_ator;
		this.filme = filme;
		
	}
	
	
	public Ator() {
		super();
	}


	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getId_ator() {
		return id_ator;
	}

	public void setId_ator(int id_ator) {
		this.id_ator = id_ator;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
	
}
