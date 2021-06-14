package testingClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountTest {
	
	@Test
	public void test() {
		TestMethods test = new TestMethods();
		int output = test.getCount("Naveenkrishna");
		assertEquals(2, output);
	}

}
