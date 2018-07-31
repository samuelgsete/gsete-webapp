package br.com.gsete.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Membro extends Pessoa {

	@JsonProperty(value = "endereco", required = true)
	private Endereco endereco;
	@JsonProperty(value = "naturalidade", required = true)
	private String naturalidade;
	@JsonProperty(value = "nomePai", required = true)
	private String nomePai;
	@JsonProperty(value = "nomeMae", required = true)
	private String nomeMae;
	@JsonProperty(value = "dataBatismo")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dataBatismo;
	@JsonProperty(value = "dataConversao")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dataConversao;
	@JsonProperty(value = "cargo", required = true)
	private String cargo;
	@JsonProperty(value = "localBatismo")
	private String localBatismo;
	@JsonProperty(value = "congregacao", required = true)
	private String congregacao;
	@JsonProperty(value = "departamento")
	private String departamento;
	@JsonProperty(value = "dataRegistro", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dataRegistro;
	@JsonProperty(value = "observacoes")
	private String observacoes;
	@JsonProperty(value = "status", required = true)
	private String status;
	
	public Membro() { }

	public Membro(String nome) { this.nome = nome; }

	public Membro(Integer id, String nome, String rg, String cpf, String estadoCivil, String sexo, Date dataNascimento, String celular, String telefone, String email, Endereco endereco, String naturalidade, String nomePai, String nomeMae, Date dataBatismo, Date dataConversao, String cargo, String localBatismo, String congregacao, String departamento, Date dataRegistro, String observacoes, String status) {
		super(id, nome, rg, cpf, estadoCivil, sexo, dataNascimento, celular, telefone, email);
		this.endereco = endereco;
		this.naturalidade = naturalidade;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.dataBatismo = dataBatismo;
		this.dataConversao = dataConversao;
		this.cargo = cargo;
		this.localBatismo = localBatismo;
		this.congregacao = congregacao;
		this.departamento = departamento;
		this.dataRegistro = dataRegistro;
		this.observacoes = observacoes;
		this.status = status;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLocalBatismo() {
		return localBatismo;
	}

	public void setLocalBatismo(String localBatismo) {
		this.localBatismo = localBatismo;
	}

	public String getCongregacao() {
		return congregacao;
	}

	public void setCongregacao(String congregacao) {
		this.congregacao = congregacao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
}
