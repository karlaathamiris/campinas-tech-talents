package exemploHeranca;

import java.util.Date;

public class Funcionario extends EmComum {
	
	double salario;
	String cargo;

	public Funcionario(String nome, String cpf, Date data_cadast, String cargo, double salario) {
		super(nome, cpf, data_cadast);
		this.cargo = cargo;
		this.salario = salario;
		
	}
}
