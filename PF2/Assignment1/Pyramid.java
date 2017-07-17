/**
 * Create a pyramid pattern of numbers starting from 1 to given size and from
 * size to 1 pattern starts from center with the row_number and number value
 * decreases till 1
 * 
 * Classname = Pyramid
 * 
 * @author Anushtha Gupta
 * @since 2017-07-15
 * **/
public class Pyramid {

	/**
	 * Determine the spaces to be printed in a given row
	 * 
	 * @params row : number of each row.
	 * @params n : number upto which pattern is to be to printed
	 * 
	 * @return String : string having desired number of spaces for that row.
	 */
	public String getSpace(int row, int n) {
		
		// throw exception if number of rows or n is zero or a negative number
		if (n <= 0 | row >= 2 * n | row <= 0)
			throw new NumberFormatException();

		String spacing = "";

		if (row > n)
			row = 2 * n - row;

		for (int row_value = 1; row_value <= (n - row); row_value++) {
			spacing += " ";
		}

		return spacing;
	}

	/**
	 * determine numbers to be printed in a given row
	 * 
	 * @param row
	 *            : number of each row.
	 * @params n : number upto which pattern is to be to printed
	 * 
	 * **/
	public String getNumber(int row, int n) {
		
		// throw exception if number of rows or n is zero or a negative number
		if (n <= 0 | row >= 2 * n | row <= 0)
			throw new NumberFormatException();

		if (row > n)
			row = 2 * n - row;
		;
		String numbering = "";
		for (int row_value = 1; row_value <= row; row_value++) {
			numbering += row_value;
		}
		for (int row_value = row - 1; row_value >= 1; row_value--) {
			numbering += row_value;
		}

		return numbering;
	}

	/**
	 * create pyramid pattern by calling space and number values for each row
	 * iterating over each row to create pyramid
	 * 
	 * @params n : number upto which pattern is to be to printed
	 * 
	 * @return String[] : array of string having pattern
	 * **/
	public String[] printWholePyramid(int n) {
		
		/* throw exception if number upto which pattern is to be printed
		 *  is zero or negative
		 */
		if (n <= 0)
			throw new NumberFormatException();

		String[] pyramid = new String[2 * n - 1];
		int k = 0;
		for (int row_no = 1; row_no < n; row_no++) {
			pyramid[k++] = getSpace(row_no, n) + getNumber(row_no, n) + "\n";
		}
		for (int row_no = n; row_no > 0; row_no--) {
			pyramid[k++] = getSpace(row_no, n) + getNumber(row_no, n) + "\n";
		}
		return pyramid;
	}

	public static void main(String[] args) {
		String[] s = new Pyramid().printWholePyramid(5);
		for (String s1 : s)
			System.out.print(s1);
	}

}
