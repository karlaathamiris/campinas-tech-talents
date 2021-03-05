package tratamentoExcecao;

public class ExemploTryCatch {

	public static void main(String[] args) {
		
		String exemplo = null;
		
		try {
			System.out.println(exemplo.toUpperCase());
		} 
		
		catch (NullPointerException e) {
			System.out.println("Frase teste do catch");
			e.printStackTrace();
			
		}
		
		finally {
			exemplo = "Testando Finally";
			System.out.println(exemplo.toUpperCase());
		}
	}

}
