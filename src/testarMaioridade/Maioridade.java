package testarMaioridade;
import java.util.Scanner;


public class Maioridade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 15;
		
	
		do {
			System.out.println("Voc� n�o tem permiss�o pra entrar, sua idade � " + idade);
			idade++;
						
		}while (idade <= 18);
			System.out.println("Sua entrada foi autorizada, pois voc� tem " + idade + " anos");
		
		ler.close();
	}

}
