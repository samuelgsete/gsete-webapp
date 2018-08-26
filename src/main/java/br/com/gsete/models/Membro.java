package br.com.gsete.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "membro")
public class Membro extends Pessoa {
	
	@OneToOne(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinColumn(name="endereco_id")
	@JsonProperty(value = "endereco", required = true)
	private Endereco endereco;
	
	@Column(name="naturalidade", nullable=true, unique=false)
	@JsonProperty(value = "naturalidade", required = true)
	private String naturalidade;
	
	@Column(name="nome_pai", nullable = false, unique = false)
	@JsonProperty(value = "nomePai", required = true)
	private String nomePai;
	
	@Column(name="nome_mae", nullable = false, unique = false)
	@JsonProperty(value = "nomeMae", required = true)
	private String nomeMae;
	
	@Column(name="data_batismo", nullable = false, unique = false)
	@JsonProperty(value = "dataBatismo")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataBatismo;
	
	@Column(name="data_conversao", nullable = false, unique = false)
	@JsonProperty(value = "dataConversao")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataConversao;
	
	@Column(name="cargo", nullable = true, unique = false)
	@JsonProperty(value = "cargo")
	private String cargo;
	
	@Column(name="local_batismo", nullable = true, unique = false)
	@JsonProperty(value = "localBatismo")
	private String localBatismo;
	
	@Column(name="congregacao", nullable = false, unique = false)
	@JsonProperty(value = "congregacao", required = true)
	private String congregacao;
	
	@Column(name="departamento", nullable = true, unique = false)
	@JsonProperty(value = "departamento")
	private String departamento;
	
	@Column(name="data_registro", nullable = false, unique = false)
	@JsonProperty(value = "dataRegistro", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataRegistro;
	
	@Column(name = "observacoes", nullable = true, unique = false)
	@JsonProperty(value = "observacoes")
	private String observacoes;
		
	public Membro() { }

	public Membro(String nome) { this.nome = nome; }

	public Membro(Long id, String nome, String rg, String cpf, String estadoCivil, String sexo, Date dataNascimento, String celular, String telefone, String email, Endereco endereco, String naturalidade, String nomePai, String nomeMae, Date dataBatismo, Date dataConversao, String cargo, String localBatismo, String congregacao, String departamento, Date dataRegistro, String observacoes) {
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        Membro that = (Membro) o;

        //return Objects.equals(cpf, that.cpf);
        return Objects.equals(id, that.id);
	}   
	
	@Override
	public String toString() {
		return "Membro [endereco=" + endereco + ", naturalidade=" + naturalidade + ", nomePai=" + nomePai + ", nomeMae="
				+ nomeMae + ", dataBatismo=" + dataBatismo + ", dataConversao=" + dataConversao + ", cargo=" + cargo
				+ ", localBatismo=" + localBatismo + ", congregacao=" + congregacao + ", departamento=" + departamento
				+ ", dataRegistro=" + dataRegistro + ", observacoes=" + observacoes + "]";
	}		
}
