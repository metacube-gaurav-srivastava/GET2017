import org.junit.*;

public class PyramidSecondTest {

	PyramidSecond pyramid;

	@Before
	public void start() {
		pyramid = new PyramidSecond();
	}

	// testcase to check correct space string
	@Test
	public void correctSpaceTest() {

		String actual, expected;
		actual = pyramid.getSpace(5, 2);
		expected = "  ";
		Assert.assertEquals(expected, actual);
	}

	// testcase to check correct number string
	@Test
	public void correctNumberTest() {
		String actual, expected;
		actual = pyramid.getNumber(6, 2);
		expected = "1234";
		Assert.assertEquals(expected, actual);
	}

	// testcase to check correct pyramid
	@Test
	public void correctPyramidTest() {
		String[] actual = new String[3];
		actual = pyramid.printWholePyramid(3);
		String[] expected = { "123\n", " 12\n", "  1\n" };

		Assert.assertArrayEquals(expected, actual);
	}

	/*
	 * testcase for handling exception for passing total number of rows equal to
	 * zero in getSpace function.
	 */
	@Test(expected = NumberFormatException.class)
	public void testZeroRowInGetSpace() {
		pyramid.getSpace(0, 4);
	}

	/*
	 * testcase for handling exception for passing total number of rows equal to
	 * zero in getNumber function.
	 */
	@Test(expected = NumberFormatException.class)
	public void testZeroRowInGetNumber() {
		pyramid.getNumber(0, 4);

	}

	/*
	 * testcase for handling exception for passing total number of rows equal to
	 * zero in printWholePyramid function.
	 */
	@Test(expected = NumberFormatException.class)
	public void testZeroRowInWholePyramid() {
		pyramid.printWholePyramid(0);

	}

	/*
	 * testcase for handling exception for negative value for row in getSpace
	 * function.
	 */
	@Test(expected = NumberFormatException.class)
	public void testNegative() {
		pyramid.getSpace(-2, 3);

		pyramid.printWholePyramid(-3);
	}

	/*
	 * testcase for handling exception for negative value for index in getSpace
	 * function.
	 */
	@Test(expected = NumberFormatException.class)
	public void testNegativeIndexInGetSpace() {
		pyramid.getSpace(2, -3);
	}

	/*
	 * testcase for handling exception for negative value for row in getNumber
	 * function.
	 */
	@Test(expected = NumberFormatException.class)
	public void testNegativeRowInGetNumber() {
		pyramid.getNumber(-2, 3);
	}

	/*
	 * testcase for handling exception for negative value for index in getNumber
	 * function.
	 */
	@Test(expected = NumberFormatException.class)
	public void testNegativeIndexInGetNumber() {
		pyramid.getNumber(2, -3);
	}

	/*
	 * testcase for handling exception for negative value in printWholePyramid
	 * function.
	 */
	@Test(expected = NumberFormatException.class)
	public void testNegativeNumberInPrintWholePyramid() {
		pyramid.getNumber(2, -3);
	}
}