/*
 * These are the testcases used for GCDCalculation.
 * Test cases include checks for base condition, boundary values values or central range inputs. 
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGCD {
	GCDCalculation calculate;

	// instantiate an object
	@Before
	public void start() {
		calculate = new GCDCalculation();
	}

	// testcase when first number is greater than the other
	@Test
	public void TestWhenFirstNumberGreater() {
		int result = calculate.gcd(2, 1);
		Assert.assertEquals(1, result);
	}

	// testcase when second number is greater than the other
	@Test
	public void TestWhenSecondNumberGreater1() {
		int result = calculate.gcd(12, 18);
		Assert.assertEquals(6, result);
	}

	@Test
	public void TestWhenSecondNumberGreater2() {
		int result = calculate.gcd(100, 3);
		Assert.assertEquals(1, result);
	}

	// testcase when last number is zero
	@Test
	public void TestWhenLastNumberIsZero() {
		int result = calculate.gcd(2, 0);
		Assert.assertEquals(2, result);
	}

	// testcase when first number is zero.
	@Test
	public void TestWhenFirstNumberIsZero() {
		int result = calculate.gcd(0, 2);
		Assert.assertEquals(2, result);
	}

	// testcase when first number is negative.
	@Test(expected = IllegalArgumentException.class)
	public void TestWhenFirstNumberIsNegative() {
		calculate.gcd(-1, 2);
	}

	// testcase when first number is negative.
	@Test(expected = IllegalArgumentException.class)
	public void TestWhenSecondNumberIsNegative() {
		calculate.gcd(1, -2);
	}

	// testcase when both numbers are negative.
	@Test(expected = IllegalArgumentException.class)
	public void TestWhenBothNumbersAreNegative() {
		calculate.gcd(-1, -2);
	}
}
