package br.com.gsete.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Membro {
	
	public static Integer i = -16;
	
	@JsonProperty(value = "id", required = true)
	private Integer id;
	@JsonProperty(value = "nome", required = true)
	private String nome;
	@JsonProperty(value = "rg", required = true)
	private String rg;
	@JsonProperty(value = "cpf", required = true)
	private String cpf;
	@JsonProperty(value = "cargo", required = true)
	private String cargo;
	@JsonProperty(value = "status", required = true)
	private String status;
	@JsonProperty(value = "dataNascimento", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dataNascimento;
	@JsonProperty(value = "dataBatismo", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dataBatismo;
	@JsonProperty(value = "dataConversao", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dataConversao;

	public Membro() {
	}

	public Membro(String nome) {
		this.nome = nome;
	}

	public Membro(String nome, String rg, String cpf, String cargo, String status, Date nascimento, Date dataBatismo, Date dataConversao) {
		this.id = ++Membro.i;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.cargo = cargo;
		this.status = status;
		this.dataNascimento = nascimento;
		this.dataBatismo = dataBatismo;
		this.dataConversao = dataConversao;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Date getDataBatismo() {
		return dataBatismo;
	}

	public void setDataBatismo(Date dataBatismo) {
		this.dataBatismo = dataBatismo;
	}

	public Date getDataConversao() {
		return dataConversao;
	}

	public void setDataConversao(Date dataConversao) {
		this.dataConversao = dataConversao;
	}

	@Override
	public String toString() {
		return "Membro [id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", cargo=" + cargo + ", status="
				+ status + "]";
	}
}
