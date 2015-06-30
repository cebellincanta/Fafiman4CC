package br.com.netschool.entity;

import java.util.Date;

import br.com.netschool.entity.enuns.TipoPessoa;
import br.com.netschool.entity.enuns.TipoPublicacao;

public class Quantia {
	
	private Long id;
	private Integer quantidade;
	private Date vigencia;
	private TipoPublicacao tipoPublicacao;
	
	private TipoPessoa tipoPessoa;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
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
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
	

}
