package br.com.netschool.entity.enuns;

public enum TipoPessoa {
	
	DIR("Diretor"),
	PRO("Professor"),
	FUN("Funconário"),
	Aca("Aluno");
	
	String tipoPessoa;
	
	TipoPessoa(String tipoPessoa){
		this.tipoPessoa = tipoPessoa;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}
	

}
