/*
 * test cases check an array whether it is increasing sorted,
 * decreasing sorted or unsorted.
 * */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CheckArrayTest {
	//assuming it is increasing sorted
	@Test
	 public void ArrayTest1()
	{
		CheckArray ca=new CheckArray();	
		int input[]={1,2,68,70};
		int oct=ca.checkSortedArray(input);
		assertEquals("increasing sorted",1, oct);
	}
	//assuming it is unsorted
	@Test
	 public void ArrayTest2()
	{
		CheckArray ca=new CheckArray();	
		int input[]={1,2,3,1,0};
		int oct=ca.checkSortedArray(input);
		assertEquals("unsorted ",0, oct);
	}
	//assuming it is decreasing sorted.
	@Test
	 public void ArrayTest3()
	{
		CheckArray ca=new CheckArray();	
		int input[]={23,21,15,12,10,5,1};
		int oct=ca.checkSortedArray(input);
		assertEquals("decreasing sorted",2, oct);
	}
	
	@Test
	 public void ArrayTest4()
	{
		CheckArray ca=new CheckArray();	
		int input[]={23,21,15,12,10,5,1};
		int oct=ca.checkSortedArray(input);
		assertEquals(1, oct);
	}
	@Test
	 public void ArrayTest5()
	{
		CheckArray ca=new CheckArray();	
		int input[]={23,21,15,20,10,5,1};
		int oct=ca.checkSortedArray(input);
		assertEquals(1, oct);
	}
	@Test
	 public void ArrayTest6()
	{
		CheckArray ca=new CheckArray();	
		int input[]={1,7,2,4,0,12};
		int oct=ca.checkSortedArray(input);
		assertEquals(1, oct);
	}
}
