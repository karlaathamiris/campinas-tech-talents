package consumoCombust�vel;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MediaConsumo media = new MediaConsumo();
		
		int escolha;
		
		System.out.println("Nesse programa iremos calcular o consumo m�dio do seu carro");
		
		System.out.println("\tO que voc� deseja fazer?\n\t1- Executar o c�lculo\n\t2- Sair");
		escolha = sc.nextInt();
		
		
		switch (escolha) {
		case 1: 
			media.Consumo();
			break;
			
		case 2:
			System.out.println("Obrigada por usar nossa calculadora");
			break;
		}
		
	sc.close();
		
		

	}

}
