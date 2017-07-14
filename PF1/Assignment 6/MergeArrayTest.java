import org.junit.*;
public class MergeArrayTest {
	@Test		
		public void ascendingTest(){
			int[] a = {7,7,7,7};
			int[] b = {2,4,6,9};
			MergeArray mg=new MergeArray();
			int[] expected = {2,4,6,7,7,7,7,9};
			int[] c= new int[a.length+b.length];
			c = mg.join(a, a.length, b, b.length, c);
			Assert.assertArrayEquals(expected, c);
			
		}
	@Test		
	public void descendingTest(){
		int[] a = {6,5,4,3,2,1};
		int[] b = {2,4,6,9};
		MergeArray mg=new MergeArray();
		int[] expected = {1,2,2,3,4,4,5,6,6,9};
		int[] c= new int[a.length+b.length];
		c = mg.join(a, a.length, b, b.length, c);
		Assert.assertArrayEquals(expected, c);
		
	}
	
	@Test		
	public void nullTest(){
		int[] a = {6,5,4,3,2,1};
		int[] b = {};
		MergeArray mg=new MergeArray();
		int[] expected = {6,5,4,3,2,1};
		int[] c= new int[a.length+b.length];
		c = mg.join(a, a.length, b, b.length, c);
		Assert.assertArrayEquals(expected, c);
		
	}

}
