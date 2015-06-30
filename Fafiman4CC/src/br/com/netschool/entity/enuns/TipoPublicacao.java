package br.com.netschool.entity.enuns;

public enum TipoPublicacao {
	
	ART("Artigo"),
	MON("Monografia"),
	JOR("Jornal"),
	RES("Revista"),
	LIV("Livro");
	
	String tipoPublicacao;
	
	TipoPublicacao(String tipoPublicacao){
		this.tipoPublicacao = tipoPublicacao;
	}

	public String getTipoPublicacao() {
		return tipoPublicacao;
	}
	
	
	

}
