/*
 * test cases for BinarySearch
 * test cases include checks for base condition, boundary values values or central range inputs.
 */
import org.junit.*;

public class TestBinarySearch {
	BinarySearch binary;

	// instantiate an object
	@Before
	public void start() {
		binary = new BinarySearch();
	}

	// testcase having search value at first position
	@Test
	public void TestInputHavingSearchValueAtFirst() {
		int[] input = { 2, 5, 8, 9, 10, 55, 77 };
		int position = binary.binarySearchUsingRecursion(0, input.length - 1,
				input, 2);
		Assert.assertEquals(1, position);
	}

	// testcase having search value at middle position
	@Test
	public void TestInputHavingSearchValueAtMiddle() {
		int[] input = { 2, 5, 8, 9, 10, 22, 55, 77 };
		int position = binary.binarySearchUsingRecursion(0, input.length - 1,
				input, 10);
		Assert.assertEquals(5, position);
	}

	// testcase in which input array has no search value
	@Test
	public void TestInputNotHavingSearchValue() {
		int[] input = { 2, 5, 8, 9, 10, 55, 77 };
		int position = binary.binarySearchUsingRecursion(0, input.length - 1,
				input, 88);
		Assert.assertEquals(-1, position);
	}

	// testcase in which input array is null
	@Test(expected = IllegalArgumentException.class)
	public void TestNullInput() {
		int[] input = {};
		int position = binary.binarySearchUsingRecursion(0, input.length - 1,
				input, 88);
		Assert.assertEquals(-1, position);
	}

	// testcase having search value at last position
	@Test
	public void TestInputHavingSearchValueAtLast() {
		int[] input = { 2, 5, 8, 9, 10, 55, 77 };
		int position = binary.binarySearchUsingRecursion(0, input.length - 1,
				input, 77);
		Assert.assertEquals(7, position);
	}

}
