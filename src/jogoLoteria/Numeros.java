package jogoLoteria;
import java.util.LinkedHashSet;
import java.util.Random;

public class Numeros {

public int qtdJogos;
	
	public int qtdNumeros;	

	public int getQtdJogos() {
		return qtdJogos;
	}

	public void setQtdJogos(int qtdJogos) {
		this.qtdJogos = qtdJogos;
	}

	public int getQtdNumeros() {
		return qtdNumeros;
	}

	public void setQtdNumeros(int qtdNumeros) {
		this.qtdNumeros = qtdNumeros;
	}
	
	public boolean verificacao() {
		if(qtdNumeros >= 6 && qtdNumeros <= 15){			
			return true;
			
		}else{
			System.out.println("\nDigite um número no intervalo válido, de 6 a 15: ");
			return false;
		}
	}
	
	
	public LinkedHashSet<Integer> geradorJogos() {
		LinkedHashSet<Integer> jogo = new LinkedHashSet<Integer>();
		Random rd = new Random();
		
		while(jogo.size() < qtdNumeros) {
			jogo.add(rd.nextInt(60)+1);
		}		
		
		return jogo;
	}
	
}
