import org.junit.*;

/*
 * test cases for Linear Search 
 * test cases include checks for base condition, boundary values values or central range inputs.
 */
public class TestLinearSearch {
	LinearSearch linear;

	// instantiate an object
	@Before
	public void start() {
		linear = new LinearSearch();
	}

	@Test
	public void TestInputHavingSearchValue() {
		int[] input = { 23, 5, 22, 9, 10, 55, 77 };
		int position = linear.linearSearchUsingRecursion(input, 0, 77);
		Assert.assertEquals(7, position);
	}

	@Test
	public void TestInputNotHavingSearchValue() {
		int[] input = { 2, 5, 8, 9, 10, 77, 55 };
		int position = linear.linearSearchUsingRecursion(input, 0, 88);
		Assert.assertEquals(-1, position);
	}

	@Test
	public void TestInputHavingSearchValueAtMiddle() {
		int[] input = { 2, 5, 8, 9, 10, 22, 55, 77 };
		int position = linear.linearSearchUsingRecursion(input, 0, 10);
		Assert.assertEquals(5, position);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestNullInput() {
		int[] input = {};
		int position = linear.linearSearchUsingRecursion(input, 0, 88);
		Assert.assertEquals(-1, position);
	}

}
