import org.junit.*;

public class LongestSequenceTest {
	

	@Test
	public void givenTest(){
		LongestSequence find_sequence = new LongestSequence();
		int[] input = {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int[] expected= {1,2,4,5,6,7,8,9};
		int[] actual = find_sequence.longestSequence(input);
				
		Assert.assertArrayEquals(expected, actual);
	}

	//returning last sequence from multiple equal lengths
	@Test
	public void worstCaseTest(){
		LongestSequence find_sequence = new LongestSequence();
		int[] input = {90,89,87,86,85,84,83,8,5,2,1};
		int[] expected= {1};
		int[] actual = find_sequence.longestSequence(input);
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	//assuming complete array is longest_sequence
	@Test
	public void sameElementTest(){
		LongestSequence find_sequence = new LongestSequence();
		int[] input = {5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		int[] expected= {5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		int[] actual = find_sequence.longestSequence(input);
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testingOneElement(){
		LongestSequence find_sequence = new LongestSequence();
		int[] input = {4};
		int[] expected= {4};
		int[] actual = find_sequence.longestSequence(input);
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testingNull(){
		LongestSequence find_sequence = new LongestSequence();
		int[] input = {};
		int[] expected= {};
		int[] actual = find_sequence.longestSequence(input);
		
		Assert.assertArrayEquals(expected, actual);
	}
}
