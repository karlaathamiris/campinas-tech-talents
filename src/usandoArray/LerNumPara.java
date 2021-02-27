package usandoArray;

public class LerNumPara {

	public static void main(String[] args) {
	final int[] NUMEROS = {12, 57, 60}; 					//uso da lista de inteiros
		
        int maior = NUMEROS[0];
        int menor = NUMEROS[0];

        for (int i = 0; i < NUMEROS.length; i++) { 				//a propriedade .length retorna o tamanho do array

            if(NUMEROS[i] > maior){
                maior = NUMEROS[i];
            }
            if(NUMEROS[i] < menor){
                menor = NUMEROS[i];
            }
       }
        System.out.println("O menor número é " + menor);
        System.out.println("O maior número é " + maior);
	}

}
