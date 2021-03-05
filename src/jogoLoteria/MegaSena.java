package jogoLoteria;
import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Numeros numeros = new Numeros();
		
		char continuar;
		
		do {
			System.out.println("Olá, quantos jogos da MEGA SENA você quer gerar?");
			numeros.setQtdJogos(sc.nextInt());
		
		do {		
			System.out.println("\nE quantos números você quer em cada jogo?");
			System.out.println("Deve escolher entre 6 e 15");
			numeros.setQtdNumeros(sc.nextInt());			
		
		}while(!numeros.verificacao());	
		
		
		System.out.println("\n-----------------------------------------");
		
		
		for(int i = 0; i < numeros.getQtdJogos(); i++){
			System.out.println("\nO seu " + (i+1) + "° jogo gerado foi:");			
			System.out.println(numeros.geradorJogos());
		
		}
		
		System.out.println("\n\tDeseja gerar novos jogos? (s/n)");
		continuar = sc.next().charAt(0);
		
		}while(continuar == 's');
		
		System.out.println("\nObrigada e boa sorte!");
		
		sc.close();
		
	}
}
