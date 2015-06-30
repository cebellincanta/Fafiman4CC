package br.com.netschool.entity;

import java.util.Date;

public class PessoaFisica extends Pessoa{
	
	

	private String nome;
	private String email;
	private Date nascimento;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	

}
