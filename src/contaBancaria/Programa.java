package contaBancaria;

public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.titular = "Karla Thamiris";
		conta.numeroConta = 8544;
		conta.saldo = 3000;
		
		conta.sacar(1500);
		conta.deposito(800);


	}

}
