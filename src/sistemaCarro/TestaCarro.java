package sistemaCarro;
import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		carro.cor = "preta";
		carro.modelo = "Fiat Toro";
		
		carro.liga();
		
		System.out.println("Quanto você quer acelerar?");
		double acelera = sc.nextDouble();
		carro.velocidade_atual = acelera;
		
		
		System.out.println("O carro " + carro.modelo + " de cor " + carro.cor + " está na marcha " + carro.pegaMarcha());
		
		sc.close();
	}

}
