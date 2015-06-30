package br.com.netschool.entity;

import java.util.ArrayList;
import java.util.List;

public class Penalidade {
	
	private Long id;
	private Double valorPorDia;
	private Integer suspensaoPorDia;
	private String nome;
	private String descricao;
    private List<PrazoDevolucao> prazoDevolucaos = new ArrayList<PrazoDevolucao>();
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getValorPorDia() {
		return valorPorDia;
	}
	public void setValorPorDia(Double valorPorDia) {
		this.valorPorDia = valorPorDia;
	}
	public Integer getSuspensaoPorDia() {
		return suspensaoPorDia;
	}
	public void setSuspensaoPorDia(Integer suspensaoPorDia) {
		this.suspensaoPorDia = suspensaoPorDia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<PrazoDevolucao> getPrazoDevolucaos() {
		return prazoDevolucaos;
	}
	public void setPrazoDevolucaos(List<PrazoDevolucao> prazoDevolucaos) {
		this.prazoDevolucaos = prazoDevolucaos;
	}
    
    

}
