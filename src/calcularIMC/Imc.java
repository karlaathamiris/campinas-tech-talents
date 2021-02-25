package calcularIMC;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		double altura, peso, imc;
		System.out.println("Esse programa vai calcular seu IMC, por favor, forne�a os dados pedidos\n");
		
		System.out.println("Qual sua altura? \nPor favor, digite o valor em metros, usando v�rgula: ");
		altura = sc.nextDouble();
		
		System.out.println("Qual seu peso? \nDigite em kg, tamb�m usando v�rgula, se necess�rio");
		peso = sc.nextDouble();
		
		imc = (peso / (altura * altura));
		System.out.printf("Seu imc � %.2f", imc);
		
		
			if (imc < 18.5){
				System.out.println(" voc� est� abaixo do peso ideal.");
				
			}else if (imc >= 18.5 && imc < 25){
				System.out.println(" voc� est� no seu peso adequado.");
				
			}else if(imc >= 25 && imc < 30){
				System.out.println(" voc� est� sobrepeso.");
				
			}else{
				System.out.println(" voc� est� obeso (a).");
			}
			
		sc.close();
	}

}
