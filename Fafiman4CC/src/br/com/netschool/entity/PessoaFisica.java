package br.com.netschool.entity;

import java.util.Date;

import br.com.netschool.entity.enuns.TipoPessoa;

public class PessoaFisica extends Pessoa{
	
	

	private String nome;
	private String email;
	private Date nascimento;
	private TipoPessoa tipoPessoa;
	

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
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
	

}
