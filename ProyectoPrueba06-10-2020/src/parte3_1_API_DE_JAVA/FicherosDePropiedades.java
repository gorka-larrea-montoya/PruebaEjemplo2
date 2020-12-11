package parte3_1_API_DE_JAVA;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FicherosDePropiedades {
public static void main(String[] args) {
	 try (FileReader reader = new FileReader("ficheros/ejemplo.properties")) {
         // Se crea el objeto y se leen las propiedades del fichero
         Properties properties = new Properties();
         properties.load(reader);

         // Se puede acceder al valor de las propiedades por nombre
         String database = properties.getProperty("database");
         String dataDir = properties.getProperty("datadir");
         String permission = properties.getProperty("permission");

         System.out.println("Database: " + database);
         System.out.println("Datadir: " + dataDir);
         System.out.println("Permission: " + permission);

     } catch (IOException e) {
         System.out.println("No se pudo leer el fichero de propiedades");
     }
}
}
