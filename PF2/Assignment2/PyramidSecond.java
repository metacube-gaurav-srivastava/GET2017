/**
 * program to print inverse pyramid pattern from 1 to given size
 * 
 * Classname=PyramidSecond
 * 
 * @author Anushtha Gupta
 * @since 2017-07-16
 *
 */
public class PyramidSecond {
	/**
	 * Determine the spaces to be print in a respective row.
	 * 
	 * @params row : total no of rows to be determine.
	 * @params i : index of row.
	 * 
	 * @return String : final string having spaces.
	 */

	String getSpace(int row, int i) {
		
		// throw exception if number of rows or index (i) is zero or a negative number
		if (row <= 0 || i < 0 || i >= row) {
			throw new NumberFormatException();
		}
		char[] space_array = new char[i];

		for (int k = 0; k < i; k++) {
			space_array[k] = ' ';
		}

		// created a string to store spaces.

		String result_space = new String(space_array);
		return result_space;
	}

	/**
	 * Determine the nos to be print in a respective row.
	 * 
	 * @params row : total no of rows to be determine.
	 * @params i : index of row.
	 * 
	 * @return String : final string of no.
	 */

	String getNumber(int row, int i) {
		
		// throw exception if number of rows or index(i) is zero or a negative number
		if (row <= 0 || i < 0 || i >= row) {
			throw new NumberFormatException();
		}
		int j;
		char[] number_array = new char[row - i];
		for (j = 1; j <= row - i; j++) {
			number_array[j - 1] = Integer.toString(j).charAt(0);
		}

		// created a string to store numbers to be displayed in a row.

		String result_number = new String(number_array);
		return result_number;
	}

	/**
	 * Determine the special pattern to be printed.
	 * 
	 * @params row : total no of rows to be determine.
	 * 
	 * @return String [] : final array of string having complete pattern.
	 */

	String[] printWholePyramid(int row) {
		
		// throw exception if number of rows is zero or a negative number
		if (row <= 0) {
			throw new NumberFormatException();
		}
		PyramidSecond p = new PyramidSecond();

		// created an array of string to store a complete pattern.

		String[] final_result = new String[row];

		for (int i = 0; i < row; i++) {
			String result_space, result_number;
			result_space = p.getSpace(row, i);
			result_number = p.getNumber(row, i);

			/*
			 * concatenate space string with number string and store in the
			 * resultant array of string.
			 */

			final_result[i] = result_space.concat(result_number) + "\n";

		}

		return final_result;
	}

	public static void main(String[] args) {
		PyramidSecond pyramid = new PyramidSecond();
		String[] actual = new String[3];
		actual = pyramid.printWholePyramid(3);
		for (int i = 0; i < 3; i++) {
			System.out.print(actual[i]);
			System.out.print("\n");
		}
	}
}
