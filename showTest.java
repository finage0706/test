package test;

import org.junit.*;


public class showTest {
	show sh = new show();
	//show2 sh2 = new show2();
	public static int answer;
	
	@Test
	public void testAddition() {
		//fail("Not yet implemented");
		answer = sh.addition(1, 5);
		Assert.assertEquals(6, answer);
		
	}

	@Test
	public void testSubtraction() {
		//fail("Not yet implemented");
		answer = sh.subtraction(7, 6);
		Assert.assertEquals(1, answer);
	}

}
