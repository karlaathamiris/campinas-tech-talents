package exemploHashSet;
import java.util.LinkedHashSet;

public class UsandoHashSet {

	public static void main(String[] args) {
		
		//Usando o tipo String para o exemplo
		LinkedHashSet<String> exemploHashSet = new LinkedHashSet<String>();
		
		exemploHashSet.add("Z");
		exemploHashSet.add("PH");
		exemploHashSet.add("LQ");
		exemploHashSet.add("KR");
		exemploHashSet.add("Z");
		exemploHashSet.add("L");
		exemploHashSet.add("F");
		exemploHashSet.add("TR");
		
		System.out.println(exemploHashSet);
		System.out.println("Tamanho: " + exemploHashSet.size());
		
		
		//Agora com inteiro
LinkedHashSet<Integer> exemploHashSetInt = new LinkedHashSet<Integer>();
		
		exemploHashSetInt.add(2);
		exemploHashSetInt.add(16);
		exemploHashSetInt.add(2017);
		exemploHashSetInt.add(2017);
		exemploHashSetInt.add(0);
		exemploHashSetInt.add(2);
		exemploHashSetInt.add(26);
		exemploHashSetInt.add(9);
		
		System.out.println(exemploHashSetInt);
		System.out.println("Tamanho: " + exemploHashSetInt.size());

	}

}
