package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.designpattern.commandpattern.Manufacturer;
import com.designpattern.commandpattern.OrderLinenCloset;
import com.designpattern.commandpattern.OrderUtilityCloset;
import com.designpattern.commandpattern.Wood;

class TestCommandPattern {

	@Test
	void testLinen() {
		Manufacturer manufacturer = new Manufacturer();
		Wood wood = new Wood();
		OrderLinenCloset linen = new OrderLinenCloset(wood);
		
		manufacturer.setProduct(linen);
		assertEquals(true, manufacturer.selectProduct());
	}
	
	@Test
	void testUtility() {
		Manufacturer manufacturer = new Manufacturer();
		Wood wood = new Wood();
		OrderUtilityCloset utility = new OrderUtilityCloset(wood);
		
		manufacturer.setProduct(utility);
		assertEquals(false, manufacturer.selectProduct());
	}

}
