package br.com.gsete.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pessoa {
	
	@JsonProperty(value = "id", required = true)
	protected Integer id;
	@JsonProperty(value = "nome", required = true)
	protected String nome;
	@JsonProperty(value = "cpf", required = true)
	protected String cpf;
	@JsonProperty(value = "rg", required = true)
	protected String rg;
	@JsonProperty(value = "estadoCivil", required = true)
	protected String estadoCivil;
	@JsonProperty(value = "sexo", required = true)
	protected String sexo;
	@JsonProperty(value = "dataNascimento", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	protected Date dataNascimento;
	@JsonProperty(value = "celular", required = true)
	protected String celular;
	@JsonProperty(value = "telefone")
	protected String telefone;
	@JsonProperty(value = "email")
	protected String email;
	
	public Pessoa() { }
	
	public Pessoa(Integer id, String nome, String rg, String cpf, String estadoCivil, String sexo, Date dataNascimento, String celular, String telefone, String email) {
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.celular = celular;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
		
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", estadoCivil=" + estadoCivil
				+ ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", celular=" + celular + ", telefone="
				+ telefone + ", email=" + email + "]";
	}
}
