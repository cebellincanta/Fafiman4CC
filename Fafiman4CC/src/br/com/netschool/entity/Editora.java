package br.com.netschool.entity;

import java.util.ArrayList;
import java.util.List;

public class Editora {
	
	private Long id;
	private String nome;
	private List<Publicacao> publicacaos = new ArrayList<Publicacao>();
	
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
	public List<Publicacao> getPublicacaos() {
		return publicacaos;
	}
	public void setPublicacaos(List<Publicacao> publicacaos) {
		this.publicacaos = publicacaos;
	}
	
	

}
