
/**
 *
 * Name 		:	ComputeRemainder
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-17
 * References	:	PF Assignment3 - Exercise 1(a)
 * Description	:	ComputeRemainder is used to calculate the remainder
 * 					for given divident and divisor.
 */
public class ComputeRemainder {
	
	/**
	 * @param divident	:	Number to be divided
	 * @param divisor	:	Number with which the divident is to be divided
	 * @return 	:	remainder of the division
	 */
	public int rem(int divident, int divisor) {

		// condition for negative divisor and divident value
		if (divisor <= 0 || divident < 0) {
			throw new IllegalArgumentException();
		} else {

			return ((divident >= divisor) ? (rem(divident
					- divisor, divisor)) : (divident));
		}
	}

	public static void main(String[] args) {
		ComputeRemainder c = new ComputeRemainder();
		int r = c.rem(8, 4);
		System.out.print(r);
	}

}
