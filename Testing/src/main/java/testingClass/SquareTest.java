package testingClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {
	
	@Test
	public void test() {
		TestMethods test = new TestMethods();
		int output = test.square(5);
		assertEquals(25, output);
	}
}
