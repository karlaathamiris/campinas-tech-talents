package herancaGerente;

public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticar(int senha) {
		setSenha(senha);
		
		if(this.senha == super.getSenha()) {
			System.out.println("Acesso Permitido!");
			return true;
		
		}else {
			System.out.println("ERRO: ACESSO NEGADO.");
			return false;
		}
	}

}
