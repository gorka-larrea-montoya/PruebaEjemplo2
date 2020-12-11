package parte3_1_API_DE_JAVA;

public class Hilos {
public static void main(String[] args) {
	Thread t = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread t -> " + i);
				try {
					Thread.sleep(420);
				} catch (Exception e) {
					System.out.println("error al hacer la cosa");
				}
			}
			System.out.println("Hilo T terminado");
		}
	});
	t.start(); //CUIDADO CON LA DIFERENCIA ENTRE START Y RUN
	for (int i = 0; i < 10; i++) {
		System.out.println("Thread main -> " + (10-i));
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println("error al hacer la cosa");
		}
	}
	
}
}
