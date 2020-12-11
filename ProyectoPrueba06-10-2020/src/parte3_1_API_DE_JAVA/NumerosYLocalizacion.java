package parte3_1_API_DE_JAVA;

import java.text.*;
import java.util.*;

public class NumerosYLocalizacion {
public static void main(String[] args) {
	double d = 1_234_567.89; // Puedes leer numeros extralargos con barras bajas
	DecimalFormat dfLocale = new DecimalFormat();
	NumberFormat nfUS = DecimalFormat.getNumberInstance(Locale.US);
	DecimalFormat dfManual = new DecimalFormat("0");
	DecimalFormat dfManualConDecimales = new DecimalFormat("0.000");
	
	System.out.println( "Formato local: " + dfLocale.format( d ));
	System.out.println( "Formato US: " + nfUS.format( d ));
	System.out.println( "Formato adhoc entero: " + dfManual.format( d )); // este redondea parriba
	System.out.println( "Formato adhoc real: " + dfManualConDecimales.format( d ));

	System.out.println( "Formato a través de " + String.format( "String.format(): #%1$5d# vs. #%2$,12.1f#", 123, d ));
	// QUE COJONES
}
}
