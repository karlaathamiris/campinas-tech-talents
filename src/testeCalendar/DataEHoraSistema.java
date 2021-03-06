package testeCalendar;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;



public class DataEHoraSistema {

	public static void main(String[] args) {
		
		
		//A classe Calendar é uma classe abstrata, não pode ser instanciada,
		//é necessário usar o método estático getInstance(),
		Calendar calend = Calendar.getInstance();
		Date data = calend.getTime();
		DateFormat horacompleta = DateFormat.getDateTimeInstance();
		
		int hora = calend.get(Calendar.HOUR_OF_DAY);
		
		if(hora >= 0 && hora < 12){
			System.out.println("Desejo que você tenha um belo dia! São" + horacompleta);
			
		}else if(hora > 12 && hora < 18){
			System.out.println("Olá, boa tarde. Não esqueça de beber água" + horacompleta);
		
		}else {
			System.out.println("Boa noite, hora de começar a desacelerar :)");
			System.out.println(horacompleta.format(data));
		}
		
		

	}

}
