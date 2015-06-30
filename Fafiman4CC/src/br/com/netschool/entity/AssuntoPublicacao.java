package br.com.netschool.entity;

import java.util.ArrayList;
import java.util.List;

public class AssuntoPublicacao {
	
	private Long id;
	private List<Publicacao> publicacaos = new ArrayList<Publicacao>();
	private List<AssuntoPublicacao> assuntoPublicacaos = new ArrayList<AssuntoPublicacao>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Publicacao> getPublicacaos() {
		return publicacaos;
	}
	public void setPublicacaos(List<Publicacao> publicacaos) {
		this.publicacaos = publicacaos;
	}
	public List<AssuntoPublicacao> getAssuntoPublicacaos() {
		return assuntoPublicacaos;
	}
	public void setAssuntoPublicacaos(List<AssuntoPublicacao> assuntoPublicacaos) {
		this.assuntoPublicacaos = assuntoPublicacaos;
	}
	

}
