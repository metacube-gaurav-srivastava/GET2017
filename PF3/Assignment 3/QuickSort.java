/**
 *
 * Name 		:	QuickSort
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-17
 * References	:	PF Assignment3 - Exercise 3
 * Description	:	QuickSort is used to sort a given array in ascending order
 */

public class QuickSort {
	
	/**
	 * @param input	:	input array
	 */
	public void quickSort(int[] input) {
		if (input.length <= 0)
			throw new NegativeArraySizeException();
		quickSort(input, 0, input.length - 1);
	}

	/**
	 * @param input	:	input array
	 * @param startindex	:	starting index of input array
	 * @param endindex	:	ending index of input array
	 */
	public void quickSort(int[] input, int startindex, int endindex) {
		if (startindex < endindex) {
			int partitionpoint = arrayPartition(input, startindex, endindex);
			
			//recursive call to quickSort for both partition 
			quickSort(input, startindex, partitionpoint - 1);
			quickSort(input, partitionpoint, endindex);

		}
	}

	/**
	 * function calculcte the index value from where the array is to be partitiond
	 * @param input	:	input array
	 * @param startindex	:	starting index of input array
	 * @param endindex	:	ending index of input array
	 * @return position of partition point
	 */
	public int arrayPartition(int[] input, int startindex, int endindex) {
		int pivotelement = input[endindex];
		int i = startindex - 1;
		for (int j = startindex; j < endindex; j++) {
			if (input[j] <= pivotelement) {
				i++;
				int temp;
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}
		int temp;
		temp = input[i + 1];
		input[i + 1] = input[endindex];
		input[endindex] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		int[] input = { -1, 2, 10, 2, 30 };
		q.quickSort(input, 0, 4);
		for (int i = 0; i <= 4; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
