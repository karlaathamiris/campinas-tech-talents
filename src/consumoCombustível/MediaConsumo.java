package consumoCombust�vel;
import java.util.Scanner;

public class MediaConsumo {
	Scanner sc = new Scanner(System.in);
	
	double distancia, litros, media;

	public void Consumo() {
		System.out.println("Digite a dist�ncia percorrida em km: ");
		distancia = sc.nextDouble();
		
		System.out.println("Digite o consumo do combust�vel em litros: ");
		litros = sc.nextDouble();
		
		media = distancia / litros;
		
		System.out.println("O consumo m�dio foi de: " + media + "L/km");
		
	}
	
}
