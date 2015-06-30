package br.com.netschool.entity;

import java.util.ArrayList;
import java.util.List;

public class Publicacao {
	
	private Long id;
	private String codigo;
	private String titulo;
	private Integer pagina;
	private List<Exemplar> exemplars = new ArrayList<Exemplar>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getPagina() {
		return pagina;
	}
	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}
	public List<Exemplar> getExemplars() {
		return exemplars;
	}
	public void setExemplars(List<Exemplar> exemplars) {
		this.exemplars = exemplars;
	}
	

}