package model;

import java.util.ArrayList;

public class Sessao {

	private String horario;
	private int quantIngVendidos;
	private int quantIngMax;
	private int sala;
	private String data_sessao;
	private int num_sessao;
	private int id_sessao;
	private Cliente cliente;
	private Filme filme;
	private Ingresso ingresso;
	
	public Sessao(String horario, int quantIngVendidos, int quantIngMax, int sala, String data_sessao, int num_sessao, int id_sessao, Cliente cliente, Filme filme, Ingresso ingresso) {
		super();
		this.horario = horario;
		this.quantIngVendidos = quantIngVendidos;
		this.quantIngMax = quantIngMax;
		this.sala = sala;
		this.data_sessao = data_sessao;
		this.num_sessao = num_sessao;
		this.id_sessao = id_sessao;
		this.cliente = cliente;
		this.filme = filme;
		this.ingresso = ingresso;
	}

	
	public Sessao(int sala, int num_sessao, int quantIngMax, String data_sessao, String horario, int id_sessao,
			Filme filme, Ingresso Ingresso) {
		super();
		this.sala = sala;
		this.num_sessao = num_sessao;
		this.quantIngMax = quantIngMax;
		this.data_sessao = data_sessao;
		this.horario = horario;
		this.id_sessao = id_sessao;
		this.filme = filme;
		this.ingresso = ingresso;
	}



//	public Sessao(int sala, int num_sessao, String data_sessao, int quantIngMax, String horario) {
//		super();
//		this.horario = horario;
//		this.quantIngMax = quantIngMax;
//		this.sala = sala;
//		this.data_sessao = data_sessao;
//		this.num_sessao = num_sessao;
//	}



	public Sessao() {
		// TODO Auto-generated constructor stub
	}


	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getQuantIngVendidos() {
		return quantIngVendidos;
	}
	public void setQuantIngVendidos(int quantIngVendidos) {
		this.quantIngVendidos = quantIngVendidos;
	}
	public int getQuantIngMax() {
		return quantIngMax;
	}
	public void setQuantIngMax(int quantIngMax) {
		this.quantIngMax = quantIngMax;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public String getData_sessao() {
		return data_sessao;
	}
	public void setData_sessao(String data_sessao) {
		this.data_sessao = data_sessao;
	}
	public int getNum_sessao() {
		return num_sessao;
	}
	public void setNum_sessao(int num_sessao) {
		this.num_sessao = num_sessao;
	}

	public int getId_sessao() {
		return id_sessao;
	}

	public void setId_sessao(int id_sessao) {
		this.id_sessao = id_sessao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	
	
}
