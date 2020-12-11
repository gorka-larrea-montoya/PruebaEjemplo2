package parte3_1_API_DE_JAVA;

public class DetenerHilos {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; !Thread.interrupted() && i < 1000; i++) {
					System.out.println("Thread t -> " + i);
					try {
						Thread.sleep(420);
						
					}catch (InterruptedException e2) {
						Thread.currentThread().interrupt();
						System.out.println("se ha interrumpido el hilo " + Thread.currentThread().getName() );
					} catch (Exception e) {
						System.out.println("error al hacer la cosa");
					}
				}
				System.out.println("Hilo T terminado");
			}
		});
		t.start(); //CUIDADO CON LA DIFERENCIA ENTRE START Y RUN
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread main -> " + (i));
			try {
				Thread.sleep(420);
			} catch (Exception e) {
				System.out.println("error al hacer la cosa");
			}
		}
		t.interrupt();
		System.out.println("Hilo main finalizado");
	}
}
