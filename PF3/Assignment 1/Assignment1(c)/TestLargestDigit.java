/*
 * testcases for CalculateLargestDigit
 * test cases include checks for base condition, boundary values values or central range inputs.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLargestDigit {
	CalculateLargestDigit compute;

	// instantiate an object
	@Before
	public void start() {
		compute = new CalculateLargestDigit();
	}

	// testcase for single digit input value
	@Test
	public void TestForSingleDigitInputValue() {
		int remainder = compute.largestDigit(2);
		Assert.assertEquals(2, remainder);
	}

	// testcase for multiple digit input value
	@Test
	public void TestForMultipleDigitInputValue() {
		int remainder = compute.largestDigit(1257369);
		Assert.assertEquals(9, remainder);
	}

	// testcases for input value with all digit same
	@Test
	public void TestForInputValueWithAllDigitsSame() {
		int remainder = compute.largestDigit(4444);
		Assert.assertEquals(4, remainder);
	}

	// testcases for zero input value
	@Test
	public void TestForZeroInputValue() {
		int remainder = compute.largestDigit(0);
		Assert.assertEquals(0, remainder);
	}

	// testcases for negative input value
	@Test(expected = IllegalArgumentException.class)
	public void TestForNegativeInputValue() {
		compute.largestDigit(-123);
	}
}
