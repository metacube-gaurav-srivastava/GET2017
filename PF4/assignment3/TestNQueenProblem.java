package assignment3;

/*
 * testcases for Testing NQueenProblem
 * test cases include checks for base condition, boundary values values or central range inputs.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNQueenProblem {
	NQueensProblem queen;

	// instantiate an object
	@Before
	public void start() {
		queen = new NQueensProblem();

	}

	// Test case when solution is possible
	@Test
	public void possibleSolutionTest() {
		int[][] chessboard = new int[4][4];
		boolean result = queen.findQueenPlace(chessboard, 0, 4);
		Assert.assertEquals(true, result);
	}

	// Test case when solution is not possible
	@Test
	public void notPossibleSolutionTest() {
		int[][] chessboard = new int[3][3];
		boolean result = queen.findQueenPlace(chessboard, 0, 3);
		Assert.assertEquals(false, result);
	}

	// Testcase when board dimension is passed zero
	@Test(expected = IllegalArgumentException.class)
	public void testForZeroBoardDimension() {
		int[][] chessboard = new int[3][3];
		boolean result = queen.findQueenPlace(chessboard, 0, 0);
		Assert.assertEquals(false, result);
	}

	// Testcase when board dimension is passed negative
	@Test(expected = IllegalArgumentException.class)
	public void testForNegativeBoardDimension() {
		int[][] chessboard = new int[3][3];
		boolean result = queen.findQueenPlace(chessboard, 0, -1);
		Assert.assertEquals(false, result);
	}

	// Testcase when column value is passed negative
	@Test(expected = IllegalArgumentException.class)
	public void testForNegativeColumnDimension() {
		int[][] chessboard = new int[3][3];
		boolean result = queen.findQueenPlace(chessboard, -1, 0);
		Assert.assertEquals(false, result);
	}

	// testcase when both column and board dimension are passed negative
	@Test(expected = IllegalArgumentException.class)
	public void testForNegativeColumnAndBoardDimension() {
		int[][] chessboard = new int[3][3];
		boolean result = queen.findQueenPlace(chessboard, -1, -2);
		Assert.assertEquals(false, result);
	}

}
