/*
 * Positive test cases include checks for correct inputs. 
 */
package Assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMatrixPositiveCases {

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

	// Initializing an object
	@Test
	public void testForPositiveSize() {
		Matrix matrix = new Matrix(2, 1);
	}

	// Testcase for successful addition of elements
	@Test
	public void testAddElements() {
		int k = 0;
		int mat[] = { 2, 3, 8, 7, 6, 5 };
		int mat1[] = { 2, 3, 8, 7, 6, 5 };

		// add elements in first matrix
		for (int i = 0; i < mat_row; i++) {
			for (int j = 0; j < mat_col; j++) {
				Boolean b = matrix.addElements(i, j, mat[k++]);
				assertTrue(b);
			}
		}

		k = 0;
		// add elements in second matrix
		for (int i = 0; i < mat1_row; i++) {
			for (int j = 0; j < mat1_col; j++) {
				Boolean b = matrix1.addElements(i, j, mat[k++]);
				assertTrue(b);
			}
		}
	}

	// for calculating transpose of matrix
	@Test
	public void testTranspose() {
		int k = 0;
		int mat[] = { 2, 3, 8, 7, 6, 5 };
		for (int i = 0; i < mat_row; i++) {
			for (int j = 0; j < mat_col; j++) {
				matrix.addElements(i, j, mat[k++]);
			}
		}
		int expected[][] = { { 2, 8, 6 }, { 3, 7, 5 } };
		Matrix matrix2 = new Matrix();
		// transpose of first matrix
		matrix2 = matrix.transposeMatrix();
		int[][] result = matrix2.showMatrix();
		assertArrayEquals(expected, result);
	}

	// Display elements of matrix
	@Test
	public void testShow() {
		int mat[] = { 2, 3, 8, 7, 6, 5 };
		int matr[][] = { { 2, 3 }, { 8, 7 }, { 6, 5 } };
		int k = 0;
		for (int i = 0; i < mat_row; i++) {
			for (int j = 0; j < mat_col; j++) {
				matrix.addElements(i, j, mat[k++]);
			}
		}

		// Checking showMatrix function is working or not
		assertArrayEquals(matr, matrix.showMatrix());
	}

	// to multiply two matrix
	@Test
	public void testMultiply() {
		int k = 0;
		int mat[] = { 2, 3, 8, 7, 6, 5 };
		int mat1[] = { 1, 1, 1, 1, 1, 1 };

		// add elements in first matrix
		for (int i = 0; i < mat_row; i++) {
			for (int j = 0; j < mat_col; j++) {
				matrix.addElements(i, j, mat[k++]);
			}
		}

		k = 0;
		// add elements in second matrix
		for (int i = 0; i < mat1_row; i++) {
			for (int j = 0; j < mat1_col; j++) {
				matrix1.addElements(i, j, mat1[k++]);
			}
		}
		int exp[][] = { { 5, 5, 5 }, { 15, 15, 15 }, { 11, 11, 11 } };
		Matrix matrix2 = new Matrix(3, 3);

		// Multiplying two matrix
		matrix2 = matrix.multiplyMatrix(matrix1);
		int[][] result = matrix2.showMatrix();
		assertArrayEquals(exp, result);
	}

}
