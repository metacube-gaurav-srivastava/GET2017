/**
 *
 * Name 		:	LinearSearch
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-17
 * References	:	PF Assignment3 - Exercise 2(a)
 * Description	:	LinearSearch is used to search data in a given 
 * 					input array
 * 					
 */
public class LinearSearch {
	
	/**
	 * @param input	:	input array
	 * @param startindex	:	starting index of array
	 * @param searchdata	:	data to be searched
	 * @return	:	position of the data to be searched 
	 */
	public int linearSearchUsingRecursion(int[] input, int startindex,
			int searchdata) {
		
		//condition if input array has no elements
		if (input.length == 0) {
			throw new IllegalArgumentException();
		} else {
			if (startindex == input.length) {
				return -1;
			} else {
				if (input[startindex] == searchdata) {
					return startindex + 1;
				}
				return linearSearchUsingRecursion(input, startindex + 1,
						searchdata);
			}
		}
	}

	public static void main(String[] args) {
		LinearSearch l = new LinearSearch();
		int[] input = { 23, 5, 22, 9, 10, 55, 77 };
		int r = l.linearSearchUsingRecursion(input, 0, 77);
		System.out.print(r);
	}
}
