package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_TestAnnotation {
	
	@Test
	public void t1() {

		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		System.out.println("Running Test -> testMethod1");
		Assert.assertEquals(result, 3);

	}

	@Test
	public void a2() {

		SomeClassToTest obj = new SomeClassToTest();
		String result = obj.addStrings("I love", "to code in Java");
		System.out.println("Running Test -> testMethod1");
		Assert.assertEquals(result, "I love to code in Java");

	}
	
	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		sa.assertEquals(result, 2);
		System.out.println("\nLine after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("\nLine after assert 2");
		sa.assertAll();
	}
}
