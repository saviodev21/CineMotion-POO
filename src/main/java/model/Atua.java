package model;

public class Atua {

	private String papel;
	private String premiacoes;
	private Ator ator;
	private Filme filme;
	private int id_atua;
	
	public Atua(String papel, String premiacoes, Ator ator, Filme filme, int atua) {
		super();
		this.papel = papel;
		this.premiacoes = premiacoes;
		this.ator = ator;
		this.filme = filme;
		this.id_atua = id_atua;
	}
	
	
	public Atua() {
		super();
	}


	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public String getPremiacoes() {
		return premiacoes;
	}
	public void setPremiacoes(String premiacoes) {
		this.premiacoes = premiacoes;
	}
	public Ator getAtor() {
		return ator;
	}
	public void setAtor(Ator ator) {
		this.ator = ator;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}


	public int getId_atua() {
		return id_atua;
	}


	public void setId_atua(int id_atua) {
		this.id_atua = id_atua;
	}
	
	
}
