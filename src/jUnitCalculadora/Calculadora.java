package jUnitCalculadora;

public class Calculadora {

	private double n1, n2;
	
	public Calculadora(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double getSoma() {
		double soma = n1 + n2;
		return soma;
	}
	
	public double getSubtracao() {
		double subtracao = n1 - n2;
		return subtracao;
	}
	
	public double getMultiplicacao() {
		double multiplica = n1 * n2;
		return multiplica;
	}
	
	public double getDivisao() {
		double divide = n1 / n2;
		return divide;
	}
}
