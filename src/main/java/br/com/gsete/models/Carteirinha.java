package br.com.gsete.models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "carteirinha")
public class Carteirinha extends EntidadeBase {

	@OneToOne
	@JoinColumn(name="membro_id")
	@JsonProperty(value = "membro", required = true)
	private Membro membro;
	
	@Column(name = "status", nullable = true, unique = false)
	@JsonProperty(value = "status")
	private String status;
	
	@Column(name = "emissao", nullable = true, unique = false)
	@JsonProperty(value = "emissao", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date emissao;
	
	public Carteirinha() {	}

	public Membro getMembro() {
		return membro;
	}

	public void setMembro(Membro membro) {
		this.membro = membro;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        Carteirinha that = (Carteirinha) o;
        return Objects.equals(id, that.id);
	}

	@Override
	public String toString() {
		return "Carteirinha [membro=" + membro + ", status=" + status + ", emissao=" + emissao + "]";
	}
}
