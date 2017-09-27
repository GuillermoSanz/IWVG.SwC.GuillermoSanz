package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.Fraction;

public class FractionTest {

	private Fraction f, f1;

	@Before
	public void before() {
		f = new Fraction(2, 2);
		f1 = new Fraction();
	}

	@Test
	public void testIsEquivalente() {
		assertEquals(1, f.isEquivalente(f1));
		assertEquals(1, f1.isEquivalente(f));
	}

}
