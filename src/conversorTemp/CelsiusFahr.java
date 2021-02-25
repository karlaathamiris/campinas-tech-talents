package conversorTemp;
import java.util.Scanner;


public class CelsiusFahr {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		double celsius, fahre;
		int escolha;
		
		System.out.println("Esse programa converte a temperatura de Celsius para Fahrenheit\n\n"
				+ "\tMenu de comandos:\n\t1- Para converter \n\t2- Para sair");
		escolha = sc.nextInt();
		
		
		switch (escolha) {
		case 1: System.out.println("Por favor insira o valor da temperatura em °C, "
				+ "\nse houver casas decimais, utilize a vírgula: ");
		
				celsius = sc.nextDouble();
	
				fahre = (9 * celsius + 160) / 5;

				System.out.printf("A temperatura inserida, quando convertida pra Fahreinheit é %.2f", fahre, "°F");
				break;
				
		case 2: System.out.println("Obrigada por usar nossa calculadora de conversão");
				break;
				
		default: System.out.println("Valor não reconhecido. Digite 1 ou 2");
		}
		
		sc.close();
	}


}
