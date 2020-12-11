package parte3_1_API_DE_JAVA;

import java.util.regex.*;

public class ExpresionesRegulares {
public static void main(String[] args) {
	 String[] testNombres = {
		        "prueba.txt", "prueba2.jpg", "otro.dat", "pedro.doc", "andoni.txt", "dir", "prueba3."
		    };
	// Significado de la expresión regular:
	 // 1. Empieza por: p
	 // 2. Le siguen cero o más caracteres: .*
	 // 3. Después viene un punto: \. ¡Cuidado! La barra hay que escaparla por eso se pone \\.
	 // 4. Después vienen uno o más caracteres: .+
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
