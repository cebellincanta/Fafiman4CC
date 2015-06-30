package br.com.netschool.entity.enuns;

import java.util.ArrayList;
import java.util.List;

import br.com.netschool.entity.PessoaFisica;

public enum TipoPessoa {
	
	DIR("Diretor"),
	PRO("Professor"),
	FUN("Funconário"),
	Aca("Aluno");
	
	private String tipoPessoa;
	
	
	
	TipoPessoa(String tipoPessoa){
		this.tipoPessoa = tipoPessoa;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}
	

}
