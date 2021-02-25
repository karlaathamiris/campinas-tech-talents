package exemploHeranca;
import java.util.Date;

public class EmComum {

	String nome;
	String cpf;
	Date data_cadast = new Date();

	public EmComum(String nome, String cpf, Date data_cadast) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data_cadast = data_cadast;
	}
}
