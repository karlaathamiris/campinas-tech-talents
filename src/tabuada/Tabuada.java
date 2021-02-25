package tabuada;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	int valor = 0;
	int i, tabuada;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número inteiro e positivo: ");
	valor = sc.nextInt();
	
	
	if(valor > 0){
		System.out.println("\nEssa é a tabuado do " + valor);
		
		for (i= 0; i <= 10; i++) {
			tabuada = valor * i;
			
			System.out.println(valor + " x " + i + " = " + tabuada);
		}
		
		}else{
		System.out.println("\tERRO: VALOR INVÁLIDO");
		}
	
	}
}
