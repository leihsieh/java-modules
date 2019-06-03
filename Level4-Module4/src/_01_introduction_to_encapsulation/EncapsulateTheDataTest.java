package _01_introduction_to_encapsulation;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {

	@Test
	void test() {
		EncapsulateTheData eTD = new EncapsulateTheData();
		eTD.setItemsReceived(-5);
		assertEquals(0, eTD.getItemsReceived());

		eTD.setDegreesTurned(-60);
		assertEquals(0.0, eTD.getDegreesTurned(), .1);

		eTD.setMemberObj("I'm a String");
		Object o = eTD.getMemberObj();
		assertFalse(o instanceof String);
	}
}
