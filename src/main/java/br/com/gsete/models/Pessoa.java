package br.com.gsete.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@MappedSuperclass
public abstract class Pessoa extends EntidadeBase{
	
	@Column(name="nome", nullable=false)
	@JsonProperty(value = "nome", required = true)
	protected String nome;
	
	@Column(name="cpf", nullable = false, unique = true)
	@JsonProperty(value = "cpf", required = true)
	protected String cpf;
	
	@Column(name="rg", nullable=false, unique = true)
	@JsonProperty(value = "rg", required = true)
	protected String rg;
	
	@Column(name="estado_civil", nullable=false)
	@JsonProperty(value = "estadoCivil", required = true)
	protected String estadoCivil;
	
	@Column(name="sexo", nullable=false)
	@JsonProperty(value = "sexo", required = true)
	protected String sexo;
	
	@Column(name="data_nascimento", nullable=false)
	@JsonProperty(value = "dataNascimento", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	protected Date dataNascimento;
	
	@Column(name="celular", nullable=false, unique = true)
	@JsonProperty(value = "celular", required = true)
	protected String celular;
	
	@Column(name="telefone", nullable=true)
	@JsonProperty(value = "telefone")
	protected String telefone;
	
	@Column(name="email", nullable=true, unique = true)
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
		
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", estadoCivil=" + estadoCivil
				+ ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", celular=" + celular + ", telefone="
				+ telefone + ", email=" + email + "]";
	}
}
