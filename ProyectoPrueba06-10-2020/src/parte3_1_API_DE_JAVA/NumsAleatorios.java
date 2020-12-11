package parte3_1_API_DE_JAVA;

import java.util.*;

public class NumsAleatorios {
public static void main(String[] args) {
	Random r = new Random();
	System.out.println("Tres enteros aleatorios de 0 a 99");
	System.out.println(r.nextInt(100) + " " + r.nextInt(100) + " " + r.nextInt(100));
	System.out.println("Tres reales ente 0 y 1");
	System.out.println(r.nextDouble() + ", " + r.nextDouble() + ", " + r.nextDouble());
	
	r = new Random(59); // ponemos una semilla para forzar la secuencia
	System.out.println("Tres enteros aleatorios con semilla 15, de 0 a 99:" );
	System.out.println(r.nextInt(100) + ", " + r.nextInt(100) + ", " + r.nextInt(100));
}
}
