package parte3_1_API_DE_JAVA;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FechasYTiempo {
public static void main(String[] args) {
	ZonedDateTime ahorita = ZonedDateTime.now();
	
	DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZ");
	System.out.println("Fecha/hora/zona = " +formateador.format(ahorita));
	
	ZonedDateTime futuro = ahorita.plusDays(20);
	System.out.println("Fecha/hora/zona = " +formateador.format(futuro));
	
	DateTimeFormatter formateaFechas = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate newdate = LocalDate.parse("22-09-2020", formateaFechas);
	System.out.println("fecha parseada "+newdate );
	
	DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	System.out.println(formatter.format(ahorita));
	
	DateTimeFormatter JPNformatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.JAPAN);
	System.out.println(JPNformatter.format(ahorita));

	DateTimeFormatter ITAformatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY);
	System.out.println(ITAformatter.format(ahorita));
}

}
