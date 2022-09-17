package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {

	@Test
	public void test_carga_frontal() {
		//implementar factory method
		// Lavadora lavadora = new LavadoraCargaFrontal();
		// lavadora.ponerMandos();
		// lavadora.ponerTambor();

		FactoryLavadora factory = new LavadoraCargaFrontalFactoria();
		assertNotNull(factory);

		Lavadora lavadora = factory.crearLavadora();
		assertNotNull(lavadora);

		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		// Lavadora lavadora = new LavadoraCargaSuperior();
		// lavadora.ponerMandos();
		// lavadora.ponerTambor();

		FactoryLavadora factory = new LavadoraCargaSuperiorFactoria();
		assertNotNull(factory);

		Lavadora lavadora = factory.crearLavadora();
		assertNotNull(lavadora);
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
