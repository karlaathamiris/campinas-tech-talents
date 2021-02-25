package calcularIMC;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		double altura, peso, imc;
		System.out.println("Esse programa vai calcular seu IMC, por favor, forneça os dados pedidos\n");
		
		System.out.println("Qual sua altura? \nPor favor, digite o valor em metros, usando vírgula: ");
		altura = sc.nextDouble();
		
		System.out.println("Qual seu peso? \nDigite em kg, também usando vírgula, se necessário");
		peso = sc.nextDouble();
		
		imc = (peso / (altura * altura));
		System.out.printf("Seu imc é %.2f", imc);
		
		
			if (imc < 18.5){
				System.out.println(" você está abaixo do peso ideal.");
				
			}else if (imc >= 18.5 && imc < 25){
				System.out.println(" você está no seu peso adequado.");
				
			}else if(imc >= 25 && imc < 30){
				System.out.println(" você está sobrepeso.");
				
			}else{
				System.out.println(" você está obeso (a).");
			}
			
		sc.close();
	}

}
