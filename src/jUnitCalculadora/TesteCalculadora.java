package jUnitCalculadora;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteCalculadora {
	
	Calculadora calc = new Calculadora(8, 2);
	
	@Test
	public void testeSoma() {
		assertEquals(10, 0, calc.getSoma());
	}
	
	@Test
	public void testeSubtracao() {
		assertEquals(6, 0, calc.getSubtracao());	
	}
	
	@Test
	public void testeMultiplicacao() {
		assertEquals(16, 0, calc.getMultiplicacao());
	}
	
	@Test
	public void testeDivisao() {
		assertEquals(4, 0, calc.getDivisao());
	}
}
