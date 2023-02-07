package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Ingresso {

	private double preco;
	private String tipo;
	private int id_Ingresso;
	private int assento;
	
	public Ingresso(double preco, String tipo, int assento) {
		super();
		this.preco = preco;
		this.tipo = tipo;
		this.assento = assento;
	}
	
	
	
	public Ingresso( String tipo) {
		super();
		this.tipo = tipo;
		this.assento = assento;
	}



	public Ingresso() {
		super();
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId_Ingresso() {
		return id_Ingresso;
	}

	public void setId_Ingresso(int id_Ingresso) {
		this.id_Ingresso = id_Ingresso;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}
	

}
