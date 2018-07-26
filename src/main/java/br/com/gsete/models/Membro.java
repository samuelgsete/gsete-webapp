package br.com.gsete.models;

public class Membro {
	
	public static Integer i = -16;
	private Integer id;
	private String nome;
	private String rg;
	private String cpf;
	private String cargo;
	private String status;

	public Membro() {
	}

	public Membro(String nome) {
		this.nome = nome;
	}

	public Membro(String nome, String rg, String cpf, String cargo, String status) {
		this.id = ++Membro.i;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.cargo = cargo;
		this.status = status;
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

	@Override
	public String toString() {
		return "Membro [id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", cargo=" + cargo + ", status="
				+ status + "]";
	}
}
