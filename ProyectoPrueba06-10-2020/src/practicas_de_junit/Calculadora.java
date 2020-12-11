package practicas_de_junit;

public class Calculadora {
	public static int elevar(int base, int exp) {
		int contador = 0;
		int total = 1;
			while (contador < exp) {
				total = total * base;
				contador += 1;
			}
		return total;
	}
}