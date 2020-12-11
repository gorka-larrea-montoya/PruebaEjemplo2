package parte3_1_API_DE_JAVA;

import java.util.Scanner;

public class EntradasDesdeConsola {

public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)){
		System.out.print("Nombre :"); // cuidado que pone print y no printLN
		String name = sc.nextLine();
		
		System.out.print("Edad :");
		String edad = sc.nextLine();
		
		//Cuidado con String.format
		
		System.out.println(String.format("Te llamas %s y tienes %s anyos", name,edad));
		System.out.println("Te llamas " + name + " y tienes " + edad + " anyos");
	} catch (Exception e) {
		System.out.println("error al leer");
	}
}
}
