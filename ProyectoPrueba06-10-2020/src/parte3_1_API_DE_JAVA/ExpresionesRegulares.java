package parte3_1_API_DE_JAVA;

import java.util.regex.*;

public class ExpresionesRegulares {
public static void main(String[] args) {
	 String[] testNombres = {
		        "prueba.txt", "prueba2.jpg", "otro.dat", "pedro.doc", "andoni.txt", "dir", "prueba3."
		    };
	// Significado de la expresi�n regular:
	 // 1. Empieza por: p
	 // 2. Le siguen cero o m�s caracteres: .*
	 // 3. Despu�s viene un punto: \. �Cuidado! La barra hay que escaparla por eso se pone \\.
	 // 4. Despu�s vienen uno o m�s caracteres: .+
	 String regex = "p.*\\..+"; 

	 System.out.println("Patron : " + regex);
	 Pattern patron = Pattern.compile(regex);
	 for (String s : testNombres) {
		 if (patron.matcher(s).matches()){
			System.out.println("Cumple "+ s);
		}else {
			System.out.println("No cumple "+ s);
		}
	 }
}
}
