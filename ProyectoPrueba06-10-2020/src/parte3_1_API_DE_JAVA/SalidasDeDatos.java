package parte3_1_API_DE_JAVA;


import java.io.*;

public class SalidasDeDatos {
public static void main(String[] args) {
	
	FileOutputStream fosMalHecho = null;
		try { //esta version requiere que hagas el finally a mano
		fosMalHecho = new FileOutputStream("salida mal hecha.txt");
		fosMalHecho.write('H');
		fosMalHecho.write('O');
		fosMalHecho.write('L');
		fosMalHecho.write('A');
	} catch (FileNotFoundException e) {
		System.out.println("Archivo no encontrado");	
	} catch (IOException e) {
		System.out.println("Problemas al abrir el fichero");
	} finally {
		if (fosMalHecho != null) {
			try {
				fosMalHecho.close();
				System.out.println("hola?");
			} catch (Exception e2) {
				System.out.println("no se ha cerrado bien");
			}
		}
	}	/*Java se encarga de cerrar el
		recurso cuando finaliza el try, y
		lo hace correctamente, tanto si
		ha habido una excepción como
		si no ha habido problemas.*/
	try(FileOutputStream fosBienHecho = new FileOutputStream("salida buena.txt")) {
		fosBienHecho.write('p');
		fosBienHecho.write('i');
		fosBienHecho.write('t');
		fosBienHecho.write('o');
	} catch (FileNotFoundException e) {
		System.out.println("Archivo no encontrado");
	} catch (IOException e ) {
		System.out.println("Error al escribir");
	}
	try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("Salida writer.txt"))){
		bufWriter.write("hola buen dia que tal andamios");
	} catch (IOException e) {
		System.out.println("error al escribir");
	}
}
}
