package br.com.gsete.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Endereco {
	
	@JsonProperty(value = "logradouro", required = true)
	public String logradouro;
	@JsonProperty(value = "numero", required = true)
	public Integer numero;
	@JsonProperty(value = "cep", required = true)
	public String cep;
	@JsonProperty(value = "uf", required = true)
	public String uf;
	@JsonProperty(value = "bairro", required = true)
	public String bairro;
	@JsonProperty(value = "municipio", required = true)
	public String municipio;
	@JsonProperty(value = "nacionalidade", required = true)
	public String nacionalidade;
	@JsonProperty(value = "complemento", required = true)
	public String complemento;
	
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
