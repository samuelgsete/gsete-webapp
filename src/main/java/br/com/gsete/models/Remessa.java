package br.com.gsete.models;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "remessa")
public class Remessa extends EntidadeBase {

	@Column(name = "descricao", nullable = false, unique = true)
	@JsonProperty(value = "descricao", required = true)
	private String descricao;
	
	@Column(name = "status", nullable = false, unique = false)
	@JsonProperty(value = "status", required = true)
	private String status;
	
	@Column(name = "data_abertura", nullable = false, unique = false)
	@JsonProperty(value = "dataAbertura", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataAbertura;
	
	@Column(name = "data_fechamento", nullable = true, unique = false)
	@JsonProperty(value = "dataFechamento", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataFechamento;
	
	@Column(name = "tamanho", nullable = true, unique = false)
	@JsonProperty(value = "tamanho")
	private Integer tamanho;
	
	public Remessa() { }
	
	public Remessa(String descricao) { this.descricao = descricao; }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
		
	public Date getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        Remessa that = (Remessa) o;
        return Objects.equals(id, that.id);
	}

	@Override
	public String toString() {
		return "Remessa [descricao=" + descricao + ", status=" + status + ", dataAbertura=" + dataAbertura
				+ ", dataFechamento=" + dataFechamento + ", tamanho=" + tamanho + "]";
	}
}
