package br.com.netschool.entity;

public class Assunto {
	
	private Long id;
	private String nome;
	private AssuntoPublicacao assuntoPublicacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public AssuntoPublicacao getAssuntoPublicacao() {
		return assuntoPublicacao;
	}
	public void setAssuntoPublicacao(AssuntoPublicacao assuntoPublicacao) {
		this.assuntoPublicacao = assuntoPublicacao;
	}
	
	

}
