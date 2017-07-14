
import org.junit.Assert;
import org.junit.Test;


public class DuplicateTest {
	//Testcases used assuming input array.
	@Test
	public void successfullyRemovedDuplicates1(){
		 Duplicate du= new Duplicate();
		 int [] input={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		 int [] output= du. removeDuplicate(input);
		 
		 int [] expected={2,5,4,6,3,8,9,0};
		 Assert.assertArrayEquals(expected, output);
		 
	}

	@Test
	public void  successfullyRemovedDuplicates2(){
		 Duplicate du= new Duplicate();
		 int [] input={2,5,6,6,2,8,5,7,3,3,6,5,9,1};
		 int [] output= du. removeDuplicate(input);
		 int [] expected={2,5,6,8,7,3,9,1};
		 Assert.assertArrayEquals(expected, output);
		 
	}
}
