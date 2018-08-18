package br.com.gsete.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Congregacao {

	@JsonProperty(value = "id", required = true)
	private Integer id;
	@JsonProperty(value = "nome", required = true)
	private String nome;
	@JsonProperty(value = "dirigente", required = true)
	private String dirigente;
	@JsonProperty(value = "departamentos")
	private Set<Departamento> departamentos = new HashSet<>();
	@JsonProperty(value = "endereco", required = true)
	private Endereco endereco;
	@JsonProperty(value = "dataRegistro", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataRegistro;
	@JsonProperty(value = "observacoes")
	private String observaoes;
	
	public Congregacao() { }
	
	public Congregacao(String nome) { this.nome = nome; }
	
	public Congregacao(Integer id, String nome, String dirigente, Set<Departamento> departamentos, Endereco endereco, Date dataRegistro, String observacoes) {
		this.id = id;
		this.nome = nome;
		this.dirigente = dirigente;
		this.departamentos = departamentos;
		this.endereco = endereco;
		this.dataRegistro = dataRegistro;
		this.observaoes = observacoes;
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

	public String getDirigente() {
		return dirigente;
	}

	public void setDirigente(String dirigente) {
		this.dirigente = dirigente;
	}

	public Set<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Set<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getObservaoes() {
		return observaoes;
	}

	public void setObservaoes(String observaoes) {
		this.observaoes = observaoes;
	}

	@Override
	public String toString() {
		return "Congregacao [id=" + id + ", nome=" + nome + ", dirigente=" + dirigente + ", departamentos="
				+ departamentos + ", endereco=" + endereco + ", dataRegistro=" + dataRegistro + ", observaoes="
				+ observaoes + "]";
	}
}
