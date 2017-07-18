/**
 *
 * Name 		:	BinarySearch
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-17
 * References	:	PF Assignment3 - Exercise 2(b)
 * Description	:	BinarySearch is used to search given value in a given input array. 
 * 					 
 */


public class BinarySearch {
	
	/**
	 * This function is used to search a value in input array and return position of 
	 * that value 
	 * @param startindex	:	starting index of input array
	 * @param endindex	:	ending index of input array
	 * @param input	:	input array in which elements is to b searched
	 * @param searchvalue	:	elements to be searched in given input array
	 * @return	:	position of searched value
	 */
	public int binarySearchUsingRecursion(int startindex, int endindex,
			int[] input, int searchvalue) {

		// case when input array has no elements
		if (input.length == 0) {
			throw new IllegalArgumentException();
		} else {

			// variable to store index of middle element
			int midindex;
			if (startindex > endindex) {
				return -1;
			}
			midindex = (startindex + endindex) / 2;
			if (input[midindex] == searchvalue) {
				return midindex + 1;
			} else if (input[midindex] < searchvalue) {
				startindex = midindex + 1;
				return binarySearchUsingRecursion(startindex, endindex, input,
						searchvalue);

			} else {
				endindex = midindex - 1;
				return binarySearchUsingRecursion(startindex, endindex, input,
						searchvalue);
			}
		}

	}

	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		int input[] = { 1, 2, 3, 5, 10, 12 };
		int r = b.binarySearchUsingRecursion(0, 5, input, 5);
		System.out.print(r);
	}

}
