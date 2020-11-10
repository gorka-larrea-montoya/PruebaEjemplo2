package clase2020_11_10;

public class EjemploRecursividad {
	private static int contador = 0;
	
	public static void f() {
		contador++;
		System.out.println("holas");
		if (contador < 3) {
			f();
		}
		
	}
	public static void contar(int n) {
		System.out.println(n);
		if (n < 3) {
			contar(n+1);
		}
	}
	public static void main(String[] args) {
		//f();
		contar(1);
	}
}
