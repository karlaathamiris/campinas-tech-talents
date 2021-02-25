package exemploHeranca;
import java.util.Date;


	public class Professor extends EmComum {
		
		int matricula;

		public Professor(String nome, String cpf, Date data_cadast, int matricula) {
			super(nome, cpf, data_cadast);
			this.matricula = matricula;
		}
}
