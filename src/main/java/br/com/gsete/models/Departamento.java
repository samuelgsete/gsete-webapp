package br.com.gsete.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Departamento {
	
	@JsonProperty(value = "nome", required = true)
	private String nome;
	@JsonProperty(value = "lider", required = true)
	private String lider;
	@JsonProperty(value = "viceLider")
	private String viceLider;
	@JsonProperty(value = "regente", required = true)
	private String regente;
	@JsonProperty(value = "observacoes")
	private String observacoes;
	
	public Departamento() { }
	
	public Departamento(String nome) {
		this.nome = nome;
	}
	
	public Departamento(String nome, String lider, String viceLider, String regente, String observacoes) {
		this.nome = nome;
		this.lider = lider;
		this.viceLider = viceLider;
		this.regente = regente;
		this.observacoes = observacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}

	public String getViceLider() {
		return viceLider;
	}

	public void setViceLider(String viceLider) {
		this.viceLider = viceLider;
	}
	
	public String getRegente() {
		return regente;
	}

	public void setRegente(String regente) {
		this.regente = regente;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Override
	public String toString() {
		return "Departamento [nome=" + nome + ", lider=" + lider + ", viceLider=" + viceLider + ", regente=" + regente
				+ ", observacoes=" + observacoes + "]";
	}
}
