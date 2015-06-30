package br.com.netschool.entity;

import java.util.ArrayList;
import java.util.List;

public class AutorPublicacao {

	private Long id;
	private Publicacao publicacao;
	private List<Autor> autors = new ArrayList<Autor>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Publicacao getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}
	public List<Autor> getAutors() {
		return autors;
	}
	public void setAutors(List<Autor> autors) {
		this.autors = autors;
	}
	
	
}
