package contaBancaria;

public class Conta {

	String titular;
	int numeroConta;
	double saldo;
	
	public void sacar (double sacar) {
		saldo -= sacar;
		System.out.printf("Saldo atual �: " + saldo + "\n");
	}
	
	public double deposito (double deposito) {
		saldo += deposito;
		System.out.printf("Saldo atual �: " + saldo + "\n");
		return saldo;
	}
}
