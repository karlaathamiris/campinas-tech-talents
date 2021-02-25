package testarMaioridade;
import java.util.Scanner;


public class Maioridade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 15;
		
	
		do {
			System.out.println("Você não tem permissão pra entrar, sua idade é " + idade);
			idade++;
						
		}while (idade <= 18);
			System.out.println("Sua entrada foi autorizada, pois você tem " + idade + " anos");
		
		ler.close();
	}

}
