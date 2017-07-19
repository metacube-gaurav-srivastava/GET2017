/*
 * testcases for testing Permutations
 * test cases include checks for base condition, boundary values values or central range inputs.
 */
package assignment2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestPermutations {
	GeneratePermutation obj;

	// instantiate an object
	@Before
	public void start() {
		obj = new GeneratePermutation();
	}

	// testcase when input string has different letters
	@Test
	public void testStringWithDifferentLetters1() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		output = obj.generatePermutation("ABC");
		String[] s = { "ABC", "ACB", "BAC", "BCA", "CAB", "CBA", };
		expected.addAll(Arrays.asList(s));
		assertEquals(expected, output);

	}

	// testcase when input string has different letters
	@Test
	public void testStringWithDifferentLetters2() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		String[] s = { "ABCD", "ABDC", "ACBD", "ACDB", "ADBC", "ADCB", "BACD",
				"BADC", "BCAD", "BCDA", "BDAC", "BDCA", "CABD", "CADB", "CBAD",
				"CBDA", "CDAB", "CDBA", "DABC", "DACB", "DBAC", "DBCA", "DCAB",
				"DCBA" };
		expected.addAll(Arrays.asList(s));
		output = obj.generatePermutation("ABCD");

		assertEquals(expected, output);

	}

	// testcase when input string has some same letters
	@Test
	public void testStringWithSameLetters() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		String[] s = { "AAC", "ACA", "CAA" };
		expected.addAll(Arrays.asList(s));
		output = obj.generatePermutation("AAC");
		assertEquals(expected, output);

	}

	// testcase when input string has some same letters
	@Test
	public void testStringWithSingleLetter() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		output = obj.generatePermutation("A");
		expected.add("A");
		assertEquals(expected, output);

	}

	// testcase when input string is null
	@Test(expected = IllegalArgumentException.class)
	public void testNullString() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		output = obj.generatePermutation("");
		expected.add("");
		assertEquals(expected, output);

	}

}
