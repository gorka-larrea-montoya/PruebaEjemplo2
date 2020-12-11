package practicas_de_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
	assertEquals(9, Calculadora.elevar(3, 2));
	assertEquals(3, Calculadora.elevar(3, 1));
	assertEquals(1, Calculadora.elevar(5, 0));
	assertEquals(1, Calculadora.elevar(1, 5));
	}

}
