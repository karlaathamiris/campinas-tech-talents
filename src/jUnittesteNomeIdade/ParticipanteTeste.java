package jUnittesteNomeIdade;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ParticipanteTeste {

	Participante participante = new Participante();
	
	@Test
	public void testeSetNome() {
		participante.setNome("Karla");
		assertEquals("Karla", participante.getNome());
	}
	
	@Test
	public void testeSetIdade() {
		participante.setIdade(26);
		assertEquals(26, participante.getIdade());
	}
}
