package br.com.gsete.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "congregacao")
public class Congregacao extends EntidadeBase{
	
	@Column(name = "nome", nullable = false, unique = true)
	@JsonProperty(value = "nome", required = true)
	private String nome;
	
	@Column(name = "dirigente", nullable = false, unique = false)
	@JsonProperty(value = "dirigente", required = true)
	private String dirigente;
	
	@OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonProperty(value = "departamentos")
	private Set<Departamento> departamentos = new HashSet<>();
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_endereco"), nullable = false)
	@JsonProperty(value = "endereco", required = true)
	private Endereco endereco;
	
	@Column(name="data_registro", nullable = false, unique = false)
	@JsonProperty(value = "dataRegistro", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataRegistro;
	
	@Column(name = "observacoes", nullable = true, unique = false)
	@JsonProperty(value = "observacoes")
	private String observaoes;
	
	public Congregacao() { }
	
	public Congregacao(String nome) { this.nome = nome; }
	
	public Congregacao(String nome, String dirigente, Set<Departamento> departamentos, Endereco endereco, Date dataRegistro, String observacoes) {
		this.nome = nome;
		this.dirigente = dirigente;
		this.departamentos = departamentos;
		this.endereco = endereco;
		this.dataRegistro = dataRegistro;
		this.observaoes = observacoes;
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
		return "Congregacao [nome=" + nome + ", dirigente=" + dirigente + ", departamentos="
				+ departamentos + ", endereco=" + endereco + ", dataRegistro=" + dataRegistro + ", observaoes="
				+ observaoes + "]";
	}
}
