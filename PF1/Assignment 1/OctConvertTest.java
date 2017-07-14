import static org.junit.Assert.*;

import org.junit.Test;

public class OctConvertTest {
	// test binary value. 
		@Test
		public void evaluateWrongOctal(){
			OctConvert octcon = new OctConvert();
			int var=Integer.parseInt("0001000");
			 int oct= octcon.convertBinaryToOctal(var);
			 assertEquals(4, oct);
		}
	// test binary value. 
	@Test
	public void evaluateCorrectOctal(){
		OctConvert octcon = new OctConvert();
		int var=Integer.parseInt("000100");
		 int oct= octcon.convertBinaryToOctal(var);
		 assertEquals(4, oct);
	}
	// test string as input.
	@Test
	public void evaluateString(){
		OctConvert octcon = new OctConvert();
		int var=Integer.parseInt("abcd");
		int oct=octcon.convertBinaryToOctal(var);
		assertEquals(65, oct);
	}
	
	// test negative value.
	@Test
	public void evaluateNegativeValue(){
		OctConvert octcon = new OctConvert();
		int var=Integer.parseInt("-1");
		int oct=octcon.convertBinaryToOctal(var);
		assertEquals(65, oct);
	}
	
	// test decimal value.
	@Test
	public void evaluateDecimalValue(){
		OctConvert octcon = new OctConvert();
		int var=Integer.parseInt("12345");
		int oct=octcon.convertBinaryToOctal(var);
		assertEquals(65, oct);
	}
}
