package br.com.netschool.entity;

import java.util.Date;

public class Reserva {
	
	private Long id;
	private Date criacao;
	private Date previsao;
	private PessoaFisica pessoaFisica;
	private Exemplar exemplar;
	
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
	public Date getPrevisao() {
		return previsao;
	}
	public void setPrevisao(Date previsao) {
		this.previsao = previsao;
	}
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public Exemplar getExemplar() {
		return exemplar;
	}
	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}
	
	

}
