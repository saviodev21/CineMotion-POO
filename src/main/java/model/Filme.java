package model;

public class Filme {

	private String titulo;
	private String dt_lancamento;
	private String genero;
	private String duracao;
	private String diretor;
	private String descricao;
	private String nome_img;
	private int id_filme;
	private Ator ator;
	private Atua atua;
	
	
	
	public Filme() {
		super();
	}

	public Filme(String titulo, String dt_lancamento, String genero, String duracao, String diretor, String descricao, String nome_img, int id_filme, Ator ator, Atua atua) {
		super();
		this.titulo = titulo;
		this.dt_lancamento = dt_lancamento;
		this.genero = genero;
		this.duracao = duracao;
		this.diretor = diretor;
		this.descricao = descricao;
		this.nome_img = nome_img;
		this.id_filme = id_filme;
		this.ator = ator;
		this.atua = atua;
	}
	
	
	
	public Filme(String titulo, String dt_lancamento, String genero, String duracao, String diretor, String descricao,
			int id_filme, String nome_img) {
		super();
		this.titulo = titulo;
		this.dt_lancamento = dt_lancamento;
		this.genero = genero;
		this.duracao = duracao;
		this.diretor = diretor;
		this.descricao = descricao;
		this.nome_img = nome_img;
		this.id_filme = id_filme;
	}

	public Filme(String titulo, String nome_img) {
		
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDt_lancamento() {
		return dt_lancamento;
	}
	public void setDt_lancamento(String dt_lancamento) {
		this.dt_lancamento = dt_lancamento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome_img() {
		return nome_img;
	}
	public void setNome_img(String nome_img) {
		this.nome_img = nome_img;
	}

	public int getId_filme() {
		return id_filme;
	}

	public void setId_filme(int id_filme) {
		this.id_filme = id_filme;
	}

	public Ator getAtor() {
		return ator;
	}

	public void setAtor(Ator ator) {
		this.ator = ator;
	}

	public Atua getAtua() {
		return atua;
	}

	public void setAtua(Atua atua) {
		this.atua = atua;
	}
	
	
	
	
	
}
