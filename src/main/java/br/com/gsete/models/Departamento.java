package br.com.gsete.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "departamento")
public class Departamento extends EntidadeBase {
	
	@Column(name = "nome", nullable = false, unique = false)
	@JsonProperty(value = "nome", required = true)
	private String nome;
	
	@Column(name = "lider", nullable = false, unique = false)
	@JsonProperty(value = "lider", required = true)
	private String lider;
	
	@Column(name = "vice_lider", nullable = true, unique = false)
	@JsonProperty(value = "viceLider")
	private String viceLider;
	
	@Column(name = "regente", nullable = false, unique = false)
	@JsonProperty(value = "regente", required = true)
	private String regente;
	
	@Column(name = "observacoes", nullable = false, unique = false)
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
