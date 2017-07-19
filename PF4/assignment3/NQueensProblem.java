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
	boolean safeQueenPlace(int chessboard[][], int rownumber, int columnnumber,
			int dimensionofboard) {
		int i, j;
		// check particular board row on left side
		for (i = 0; i < columnnumber; i++) {
			if (chessboard[rownumber][i] == 1)
				return false;
		}
		// Check upper diagonal on left side
		for (i = rownumber, j = columnnumber; i >= 0 & j >= 0; i--, j--) {
			if (chessboard[i][j] == 1)
				return false;
		}
		// Check lower diagonal on left side
		for (i = rownumber, j = columnnumber; j >= 0 & i < dimensionofboard; i++, j--) {
			if (chessboard[i][j] == 1)
				return false;
		}
		return true;
	}

	boolean findQueenPlace(int chessboard[][], int columnnumber,
			int dimensionofboard) {

		// check for illegal arguments passed in function
		if (dimensionofboard <= 0 || columnnumber < 0) {
			throw new IllegalArgumentException("You have passed wrong input");
		} else {
			if (columnnumber >= dimensionofboard) {
				return true;
			}
			for (int rownumber = 0; rownumber < dimensionofboard; rownumber++) {
				if (safeQueenPlace(chessboard, rownumber, columnnumber,
						dimensionofboard)) {

					// placing queen on chessboard.s
					chessboard[rownumber][columnnumber] = 1;

					/* recur to place rest of the queens */
					if (findQueenPlace(chessboard, columnnumber + 1,
							dimensionofboard)) {
						return true;
					}

					// Back tracking
					chessboard[rownumber][columnnumber] = 0;
				}

			}
			return false;
		}
	}

	
}
