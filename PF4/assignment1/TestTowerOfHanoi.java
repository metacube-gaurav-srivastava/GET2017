/*
 * testcases for Testing TowerOfHanoi
 * test cases include checks for base condition, boundary values values or central range inputs.
 */
package assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestTowerOfHanoi {

	CalculateTowerOfHanoi obj;

	// instantiate an object
	@Before
	public void start() {
		obj = new CalculateTowerOfHanoi();
	}

	// testcase when one disk is given as input
	@Test
	public void testWhenOneDiskGiven() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		output = obj.towerOfHanoi("A", "B", "C", 1);
		expected.add("Move Disk 1 From A to B");
		assertEquals(expected, output);

	}

	// testcase when two disks is given as input
	@Test
	public void testWhenTwoDiskGiven() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		output = obj.towerOfHanoi("A", "B", "C", 2);
		expected.add("Move Disk 1 From A to C");
		expected.add("Move Disk 2 From A to B");
		expected.add("Move Disk 1 From C to B");
		assertEquals(expected, output);

	}

	// testcase when three disks id given as input
	@Test
	public void testWhenThreeDiskGiven() {
		List<String> output = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		output = obj.towerOfHanoi("A", "B", "C", 3);
		expected.add("Move Disk 1 From A to B");
		expected.add("Move Disk 2 From A to C");
		expected.add("Move Disk 1 From B to C");
		expected.add("Move Disk 3 From A to B");
		expected.add("Move Disk 1 From C to A");
		expected.add("Move Disk 2 From C to B");
		expected.add("Move Disk 1 From A to B");
		assertEquals(expected, output);

	}

	// testcase when zero disk is given as input
	@Test(expected = IllegalArgumentException.class)
	public void testWhenNoDiskGiven() {
		List<String> output = new ArrayList<String>();
		output = obj.towerOfHanoi("A", "B", "C", 0);

	}

	// testcase when negative disk is given as input
	@Test(expected = IllegalArgumentException.class)
	public void testWhenNegativeDiskGiven() {
		List<String> output = new ArrayList<String>();
		output = obj.towerOfHanoi("A", "B", "C", -1);

	}

}
