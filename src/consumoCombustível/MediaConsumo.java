package consumoCombustível;
import java.util.Scanner;

public class MediaConsumo {
	Scanner sc = new Scanner(System.in);
	
	double distancia, litros, media;

	public void Consumo() {
		System.out.println("Digite a distância percorrida em km: ");
		distancia = sc.nextDouble();
		
		System.out.println("Digite o consumo do combustível em litros: ");
		litros = sc.nextDouble();
		
		media = distancia / litros;
		
		System.out.println("O consumo médio foi de: " + media + "L/km");
		
	}
	
}
