package haskelos;

public class numcombinatorio {
	
	public static int factorial(int x) {
		if (x <= 1) {
			return x;
		} else {
			return x*factorial(x-1);
		}
	}
	public static int combinar(int x, int y) {
		if (y == x) {
			return y;
		} else {
			return x*combinar(x-1, y);
		}	
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(3));
		System.out.println(combinar(5,3));
	}
}
