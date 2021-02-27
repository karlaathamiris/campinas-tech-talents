package usandoIF;

public class LerNumeroSe {

	public static void main(String[] args) {
		final int NUM1 = 10;							
		final int NUM2 = 30;
		final int NUM3 = 50;
		
		int menor = NUM1;
		int maior = NUM3;
		
		if(NUM2 > maior){
			maior = NUM2;
		}
		if(NUM1 > maior){
			maior = NUM1;
		}
		if(NUM2 < menor) {
			menor = NUM2;
		}
		if(NUM3 < menor) {
			menor = NUM3;
		}
		
		System.out.println("O maior número é " + maior + "\nE o menor número é " + menor);	
	
	}
}
