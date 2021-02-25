package exemploHeranca;
import java.util.Date;


public class TestaOsDados {
	
	public static void main(String[] args) {
		
		Aluno alun = new Aluno("Karla", "060.713.587-86", new Date(), "Java");
		System.out.println("Esses são os dados do aluno");
		System.out.println("Aluno: " + alun.nome);
		System.out.println("CPF: " + alun.cpf);
		System.out.println("Data ddo cadastro: " + alun.data_cadast);
		System.out.println("Disciplina: " + alun.disciplina);
		
		
		Funcionario func = new Funcionario("Ada Lovelace", "000.000.888-96", new Date(), "diretora", 2578.96);
		System.out.println("\n\nOs dados do funcionário(a):\n");
		System.out.println("Funcionário(a): " + func.nome);
		System.out.println("CPF: " + func.cpf);
		System.out.println("Data do cadastro: " + func.data_cadast);
		System.out.println("Cargo: " + func.cargo);
		System.out.println("Salário de R$" + func.salario);
		
		
		Professor prof = new Professor("Star Lord", "044.160.854-22", new Date(), 257);
		System.out.println("\n\nOs dados do professor são esses: ");
		System.out.println("Professor(a): " + prof.nome);
		System.out.println("CPF: " + prof.cpf);
		System.out.println("Data do cadastro: " + prof.data_cadast);
		System.out.println("Nº de matrícula: " + prof.matricula);
	}

}
