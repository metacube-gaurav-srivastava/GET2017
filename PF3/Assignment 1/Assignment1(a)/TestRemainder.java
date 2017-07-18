/*
 * These are the test cases for ComputeRemainder.
 * Test cases include checks for base condition, boundary values values or central range inputs.
 */

import org.junit.*;

public class TestRemainder {
	ComputeRemainder compute;

	// instantiate an object
	@Before
	public void start() {
		compute = new ComputeRemainder();
	}

	// testcase for both correct value
	@Test
	public void TestForBothCorrectValue1() {
		int remainder = compute.rem(100, 3);
		Assert.assertEquals(1, remainder);
	}

	@Test
	public void TestForBothCorrectValue2() {
		int remainder = compute.rem(2, 1);
		Assert.assertEquals(0, remainder);
	}

	// testcase when divisor is equal to zero
	@Test(expected = IllegalArgumentException.class)
	public void TestWhenDivisorIsZero() {
		int remainder = compute.rem(2, 0);
		Assert.assertEquals(-1, remainder);
	}

	// testcase when divident equal to zero
	@Test
	public void TestWhenDividentIsZero() {
		int remainder = compute.rem(0, 2);
		Assert.assertEquals(0, remainder);
	}

	// testecase when divident is less than zero
	@Test(expected = IllegalArgumentException.class)
	public void TestWhenDividentIsLessThanZero() {
		compute.rem(-2, 1);

	}

	// testecase when divisor is less than zero
	@Test(expected = IllegalArgumentException.class)
	public void TestWhenDivisorIsLessThanZero() {
		compute.rem(2, -1);

	}

	// testcase when both arguments are less than zero
	@Test(expected = IllegalArgumentException.class)
	public void TestWhenBothArgumentsLessThanZero() {
		compute.rem(-2, -1);
	}

}
