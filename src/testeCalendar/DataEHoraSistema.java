package testeCalendar;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;



public class DataEHoraSistema {

	public static void main(String[] args) {
		
		
		//A classe Calendar � uma classe abstrata, n�o pode ser instanciada,
		//� necess�rio usar o m�todo est�tico getInstance(),
		Calendar calend = Calendar.getInstance();
		Date data = calend.getTime();
		DateFormat horacompleta = DateFormat.getDateTimeInstance();
		
		int hora = calend.get(Calendar.HOUR_OF_DAY);
		
		if(hora >= 0 && hora < 12){
			System.out.println("Desejo que voc� tenha um belo dia! S�o" + horacompleta);
			
		}else if(hora > 12 && hora < 18){
			System.out.println("Ol�, boa tarde. N�o esque�a de beber �gua" + horacompleta);
		
		}else {
			System.out.println("Boa noite, hora de come�ar a desacelerar :)");
			System.out.println(horacompleta.format(data));
		}
		
		

	}

}
