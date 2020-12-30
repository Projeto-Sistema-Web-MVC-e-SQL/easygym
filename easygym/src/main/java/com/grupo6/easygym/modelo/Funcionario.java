package com.grupo6.easygym.modelo;

public class Funcionario {
	private Integer id;
	private String nome;

	public Funcionario(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Funcionario() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
