package br.com.netschool.entity.enuns;

public enum EstadoCivil {
	
	SOL("Solteiro"),
	CAS("Casado"),
	DIV("Divorviado"),
	VIV("Viuvo");
	
	String estadoCivil;
	
    public String getEstadoCivil() {
		return estadoCivil;
	}

	EstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
