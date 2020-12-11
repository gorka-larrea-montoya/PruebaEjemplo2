package practicas_de_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona p = new Persona("Dana", "Zane", 27);
	@Test
	void testGetNombre() {
		assertEquals("Dana", p.getNombre());
	}
	
	@Test
	void testGetApellido() {
		assertEquals("Zane", p.getApellido());
	}
	@Test
	void testGetNombreCompleto() {
		assertEquals("Zane, Dana", p.getNombreCompleto());
	}
	@Test 
	void testGetEdad() {
		assertEquals(27, p.getEdad());
	}
	@Test
	void testEsMayorDeEdad() {
		assertEquals(true, p.esMayorDeEdad());
		Persona q = new Persona("Chie", "Satonaka", 17);
		assertEquals(false, q.esMayorDeEdad());
		
	}

}
