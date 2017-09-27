package es.upm.miw.forge.ecp2;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.User;

public class UserTest {

	private User u;
	
	 @Before
	    public void before() {
	        u = new User(1, "Pepe", "Perez", "Latinez");
	    }
	    
	    @Test
	    public void testSecondFamilyName() {
	        assertEquals("Latinez", u.getSecondFamilyName());
	    }

	    
	    @Test
	    public void testNombreLatino() {
	        assertEquals("Pepe Perez Latinez", u.nombreLatino());
	    }

}
