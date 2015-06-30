package br.com.netschool.entity;

import java.util.Date;

import br.com.netschool.entity.enuns.TipoPublicacao;

public class PrazoDevolucao {
	
	private Long id;
	private String nome;
	private Integer dias;
	private String descricao;
	private Date vigencia;
	private TipoPublicacao tipoPublicacao;
	private Penalidade penalidade;
	
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
	public Integer getDias() {
		return dias;
	}
	public void setDias(Integer dias) {
		this.dias = dias;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getVigencia() {
		return vigencia;
	}
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}
	public TipoPublicacao getTipoPublicacao() {
		return tipoPublicacao;
	}
	public void setTipoPublicacao(TipoPublicacao tipoPublicacao) {
		this.tipoPublicacao = tipoPublicacao;
	}
	
	

}
