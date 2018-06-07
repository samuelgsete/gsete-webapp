package br.com.gsete.models;

public class Membro extends EntidadeBase {

	public String nome;
	public String rg;
	public String cpf;
	public String cargo;

	public Membro() {
	}

	public Membro(String nome) {
		this.nome = nome;
	}

	public Membro(String nome, String rg, String cpf, String cargo) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.cargo = cargo;
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
}
