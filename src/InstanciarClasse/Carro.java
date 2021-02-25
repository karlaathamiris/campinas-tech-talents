package InstanciarClasse;
import java.util.Scanner;


public class Carro implements Motor, Veiculo {

Scanner sc = new Scanner (System.in);
	

	@Override
	public String getNome() {
		System.out.println("Qual o nome do carro?");
		String nome = sc.nextLine();
		
		return nome;
	}

	@Override
	public String getId() {
		System.out.println("Qual o id?");
		String Id = sc.nextLine();
		
		return Id;
	}

	@Override
	public String getModelo() {
		System.out.println("Qual o modelo do carro?");
		String modelo = sc.nextLine();
		
		return modelo;
	}

	@Override
	public String getFabricante() {
		System.out.println("Qual a fabricante?");
		String fabricante = sc.nextLine();
		
		return fabricante;
	}
}
