/*
 * interface having various operations which can be performed by a calculator
 */
package Assignment1;

public interface InterfaceOperations {
	
	//to add two numbers
	public int add(int number1, int number);
	
	//to subtract two numbers
	public int subtract(int number1, int number2);
	
	//to multiply two numbers
	public long multiply(int number1, int number);
	
	//to divide two numbers
	public double divide(int number1, int number2);
	
	//to generate modulus of two numbers
	public int modulas(int number1, int number);
	
	//to calculate squareroot of number
	public double squareRoot(int number);
	
	//to calculate exponent of a number
	public long exponent(int number, int power);
	
	// to clear the screen
	public void clear();
	
	// to evaluate result for given operand and operator
	public Number evaluate(int number1, int number2, char operator);
}
