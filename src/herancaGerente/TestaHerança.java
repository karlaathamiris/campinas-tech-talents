package herancaGerente;
import java.util.Scanner;

public class TestaHerança {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Gerente gerente = new Gerente();
		
		System.out.println("Digite a senha: ");
		int senha = sc.nextInt();
		sc.nextLine();
		
		if (gerente.autenticar(senha) == true) {
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Insira seu CPF: ");
			String cpf = sc.nextLine();
		
			System.out.print("Digite o valor do salário: ");
			Double salario = sc.nextDouble();
		
			gerente.setNome(nome);
			gerente.setCpf(cpf);
			gerente.setSalario(salario);
			
			System.out.println("Dados cadastrais: ");
			System.out.println("Nome: " + gerente.getNome());
			System.out.println("CPF: " + gerente.getCpf());
			System.out.println("Salário: " + String.format("%.2f", gerente.getSalario()));
			
		}
		sc.close();

	}
}
