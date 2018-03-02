package bibliotecaweb.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class UsuarioTest {
	Usuario usuario;

	@Before
	public void setup() {
		usuario = new Usuario("Pedro da Silva", "201801");
	}

	@Test
	public void deveRetornarNomeUsuario() {
		assertEquals("Pedro da Silva", usuario.getNome());
	}
}
