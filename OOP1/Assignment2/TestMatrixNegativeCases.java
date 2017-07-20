/*
 * Negative test cases include checks for null, zero values or incorrect inputs.
 * These raise exceptions that must be handled. 
 */
package Assignment2;

import java.util.InputMismatchException;

import org.junit.Before;
import org.junit.Test;

public class TestMatrixNegativeCases {
	int mat_row = 3;
	int mat_col = 2;
	int mat1_row = 2;
	int mat1_col = 3;
	Matrix matrix, matrix1;

	// instantiate an object
	@Before
	public void setUp() throws Exception {
		matrix = new Matrix(mat_row, mat_col);
		matrix1 = new Matrix(mat1_row, mat1_col);
	}

	// testcases for negative row value in function addElements
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeRow() {
		Matrix matrix = new Matrix(2, 2);
		Boolean b = matrix.addElements(-1, 0, 10);
	}

	// testcases for negative column value in function addElements
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeColumn() {
		Matrix matrix = new Matrix(2, 2);
		Boolean b = matrix.addElements(0, -2, 10);
	}

	// testcases for negative row and column value in function addElements
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeRowAndColumn() {
		Matrix matrix = new Matrix(2, 2);
		Boolean b = matrix.addElements(-1, -2, 10);
	}

	// testcases for bigger row value in function addElements
	@Test(expected = IllegalArgumentException.class)
	public void testBiggerRowValue() {
		Matrix matrix = new Matrix(2, 2);
		Boolean b = matrix.addElements(20, 0, 10);
	}

	// testcases for bigger column value in function addElements
	@Test(expected = IllegalArgumentException.class)
	public void testBiggerColumnValue() {
		Matrix matrix = new Matrix(2, 2);
		Boolean b = matrix.addElements(0, 20, 10);
	}

	// testcases for bigger row and column value in function addElements
	@Test(expected = IllegalArgumentException.class)
	public void testBothBiggerValue() {
		Matrix matrix = new Matrix(2, 2);
		Boolean b = matrix.addElements(20, 20, 10);
	}

	// testcases for negative row value in object
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeRowValueInObject() {
		Matrix matrix = new Matrix(-1, 2);

	}

	// testcases for negative column value in object
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeColumnValueInObject() {
		Matrix matrix = new Matrix(2, -1);

	}

	// testcases for negative row and column values in object
	@Test(expected = IllegalArgumentException.class)
	public void testBothNegativeValuesInObject() {
		Matrix matrix = new Matrix(-2, -1);

	}

	// testcases for negative row and column values in object
	@Test(expected = InputMismatchException.class)
	public void testMultiplyNegative() {
		Matrix matrix = new Matrix(2, 2);
		Matrix matrix1 = new Matrix(3, 2);
		matrix.multiplyMatrix(matrix1);
	}

	// Display elements of matrix
	@Test(expected = Exception.class)
	public void testForNullObject() {
		matrix = null;
		matrix.showMatrix();
	}

}
