package cucumber.converters;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.Transformer;

public class DateConverter extends Transformer<Date> {

	@Override
	public Date transform(String arg0) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy"); //Instanciando a variavel format do tipo DateFormat
		try {
			Date retorno = format.parse(arg0); //parse pega a string arg0 e caso esteja no formato definido no SimpleDateFormat ele pega a string e converte para um date
			return retorno;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

}
