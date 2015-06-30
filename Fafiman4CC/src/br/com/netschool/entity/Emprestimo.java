package br.com.netschool.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
	
	private Long id;
	private Date criacao;
	private Date devolucao;
	private PessoaFisica pessoaFisica;
	private List<Exemplar> exemplars = new ArrayList<Exemplar>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCriacao() {
		return criacao;
	}
	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}
	public Date getDevolucao() {
		return devolucao;
	}
	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public List<Exemplar> getExemplars() {
		return exemplars;
	}
	public void setExemplars(List<Exemplar> exemplars) {
		this.exemplars = exemplars;
	}

}
