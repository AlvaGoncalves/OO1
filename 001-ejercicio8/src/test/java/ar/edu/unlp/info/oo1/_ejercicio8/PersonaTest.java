package ar.edu.unlp.info.oo1._ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	Usuario james;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario();
		james.setApellido("Glosing");
		james.setNombre("James");
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("Glosing, James", james.getNombreCompleto());
    }
}
