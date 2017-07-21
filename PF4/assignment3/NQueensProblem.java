package assignment3;

package assignment3;

/**
 * Name			:	NQueensProblem
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-18
 * Reference	:	Assignment 4 - Exercise 3
 * Description	:	This is used to generate all possible permutations out of the given string
 */
public class NQueensProblem {
	/**
    	 * @param chessBoard		: 	board on which n queens are to be placed	
    	 * @param rowNumber			:	row number of position where queen is to be placed	
    	 * @param columnNumber		:	row number of position where queen is to be placed
    	 * @param dimensionOfBoard	:	Dimension of board
    	 * @return
    	 */
	boolean safeQueenPlace(int chessBoard[][], int rowNumber, int columnNumber,
			int dimensionofboard) {
		int i, j;
		// check particular board row on left side
		for (i = rowNumber; i >=0 ; i--) {
			if (chessBoard[i][columnNumber] == 1)
				return false;
		}
		// Check upper diagonal on left side
		for (i = rowNumber, j = columnNumber; i >= 0 & j >= 0; i--, j--) {
			if (chessBoard[i][j] == 1)
				return false;
		}
		// Check lower diagonal on left side
		for (i = rowNumber, j = columnNumber; i >= 0 & j < dimensionofboard; i--, j++) {
			if (chessBoard[i][j] == 1)
				return false;
		}
		return true;
	}

	boolean findQueenPlace(int chessBoard[][], int rowNumber,
			int dimensionOfBoard) {

		// check for illegal arguments passed in function
		if (dimensionOfBoard <= 0 || rowNumber < 0) {
			throw new IllegalArgumentException("You have passed wrong input");
		} else {
			if (rowNumber >= dimensionOfBoard) {
				return true;
			}
			for (int columnNumber = 0; columnNumber < dimensionOfBoard; columnNumber++) {
				if (safeQueenPlace(chessBoard, rowNumber, columnNumber,
						dimensionOfBoard)) {

					// placing queen on chessboard.s
					chessBoard[rowNumber][columnNumber] = 1;

					/* recur to place rest of the queens */
					if (findQueenPlace(chessBoard, rowNumber + 1,
							dimensionOfBoard)) {
						return true;
					}

					// Back tracking
					chessBoard[rowNumber][columnNumber] = 0;
				}

			}
			return false;
		}
	}

	
}
