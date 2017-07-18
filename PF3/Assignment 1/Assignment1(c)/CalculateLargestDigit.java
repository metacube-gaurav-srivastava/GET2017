/**
 *
 * Name 		:	CalculateLargestDigit
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-17
 * References	:	PF Assignment3 - Exercise 1(c)
 * Description	:	CalculateLargestDigit is used to calculate the largest digit
 * 					in a given number. 
 */
public class CalculateLargestDigit {
	
	/**
	 * @param firstnumber	:	first input number
	 * @param secondnumber	:	second input number
	 * @return	:	largest digit in that number
	 */
	public int calculateMaximum(int firstnumber, int secondnumber) {
		if (firstnumber >= secondnumber) {
			return firstnumber;
		} else {
			return secondnumber;
		}
	}
	
	
	/**
	 * @param number	:	number in which largest digit has to be found
	 * @return	:	largest digit
	 */
	public int largestDigit(int number) {
		if (number == 0) {
			return 0;
		}

		// condition if number is less than zero
		else if (number < 0) {
			throw new IllegalArgumentException();

		} else {
			int lastnumber = number % 10;
			int otherdigits = number / 10;
			int recursivelastnumber = largestDigit(otherdigits);
			return calculateMaximum(lastnumber, recursivelastnumber);
		}

	}
}
