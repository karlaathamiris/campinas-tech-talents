package exemploHeranca;

import java.util.Date;

public class Aluno extends EmComum {

String disciplina;
	
	public Aluno(String nome, String cpf, Date data_cadast, String disciplina) {
		super(nome, cpf, data_cadast);
		this.disciplina = disciplina;
	}

}
