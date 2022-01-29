package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.designpattern.facadepattern.SalesManagerFacade;

class TestFacadePattern {

	@Test
	void testClosetTypes() {
		SalesManagerFacade slman = new SalesManagerFacade();
		
		assertEquals("Linen", slman.ShowClosetTypes());
	}

	@Test
	void testWoodTypes() {
		SalesManagerFacade slman = new SalesManagerFacade();
		
		assertEquals("Bamboo", slman.ShowWoodTypes());
	}
}
