/**
 *
 * Name 		:	GCDCalculation
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-17
 * References	:	PF Assignment3 - Exercise 1(b)
 * Description	:	GCDCalculation is used to calculate the greatest common
 * 					 divisor for given numbers.
 */


public class GCDCalculation {
	
	
	/**
	 * @param firstnumber	:	first input number
	 * @param secondnumber	:	second input number
	 * @return	:	Greatest common divisor of the given two numbers 
	 */
	public int gcd(int firstnumber, int secondnumber) {

		// condition if given numbers are less than zero
		if (firstnumber < 0 || secondnumber < 0) {
			throw new IllegalArgumentException();
		} else {
			if (secondnumber == 0) {
				return firstnumber;
			} else {
				return gcd(secondnumber, (firstnumber % secondnumber));
			}
		}

	}

}
