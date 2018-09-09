package br.com.gsete.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "foto")
public class Foto extends EntidadeBase {
	
	@Column(name = "base64", nullable = true, unique = false, length = 10485760)
	@JsonProperty(value = "base64")
	private String base64;
	
	@Column(name = "nome", nullable = true, unique = false)
	@JsonProperty(value = "nome")
	private String nome;
	
	@Column(name = "tamanho", nullable = true, unique = false)
	@JsonProperty(value = "tamanho")
	private Integer tamanho;
	
	public Foto() { }

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
        Foto that = (Foto) o;
        return Objects.equals(id, that.id);
	}

	@Override
	public String toString() {
		return "Foto [base64=" + base64 + ", nome=" + nome + ", tamanho=" + tamanho + "]";
	}
}
