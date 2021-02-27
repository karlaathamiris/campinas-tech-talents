package sistemaCarro;

public class Carro {

	String cor;
	String modelo;
	double velocidade_atual;
	
	
	public void liga() {
		System.out.println("O carro está ligado");
	}
	
	public void acelera(double valorAcelera) {
		this.velocidade_atual = valorAcelera;
	}
	
	public int pegaMarcha(){
		if (this.velocidade_atual < 0){
			return -1;
			
		}else if (this.velocidade_atual >= 0 && velocidade_atual < 40){
			return 1;
			
		}else if (this.velocidade_atual >= 40 && velocidade_atual < 80){
			return 2;
			
		}else {
			return 3;
		}	
	}
}
