package br.com.gsete.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="endereco")
public class Endereco extends EntidadeBase{
	
	@Column(name="logradouro", nullable = false)
	@JsonProperty(value = "logradouro", required = true)
	private String logradouro;
	
	@Column(name="numero", nullable = false)
	@JsonProperty(value = "numero", required = true)
	private Integer numero;
	
	@Column(name="cep", nullable = false)
	@JsonProperty(value = "cep", required = true)
	private String cep;
	
	@Column(name="uf", nullable = false)
	@JsonProperty(value = "uf", required = true)
	private String uf;
	
	@Column(name="bairro", nullable = false)
	@JsonProperty(value = "bairro", required = true)
	private String bairro;
	
	@Column(name="municipio", nullable = false)
	@JsonProperty(value = "municipio", required = true)
	private String municipio;
	
	@Column(name="nacionalidade", nullable = true)
	@JsonProperty(value = "nacionalidade")
	private String nacionalidade;
	
	@Column(name="complemento", nullable = true)
	@JsonProperty(value = "complemento")
	private String complemento;
		
	public Endereco() { }
	
	public Endereco(String logradouro, Integer numero, String cep, String uf, String bairro, String municipio, String nacionalidade, String complemento) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.uf = uf;
		this.bairro = bairro;
		this.municipio = municipio;
		this.nacionalidade = nacionalidade;
		this.complemento = complemento;
	}
		
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
		
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cep=" + cep + ", uf=" + uf + ", bairro="
				+ bairro + ", municipio=" + municipio + ", nacionalidade=" + nacionalidade + ", complemento="
				+ complemento + "]";
	}	
}
