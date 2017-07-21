/**
 * Name			:	Permutation
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-18
 * Reference		:	Assignment 4 - Exercise 2
 * Description		:	This is used to generate all possible permutations out of the given string
 */
package assignment2;

import java.util.*;

public class GeneratePermutation {
	private List<String> permutatedString;
	/**
	 * Generate permutations of string and return string list
	 * @param inputString	: String to be permuted	
	 * @return	:	List of strings generated after permutation
	 */
	public List<String> generatePermutation(String inputString) {
		if (inputString.length() <= 0) {
			throw new IllegalArgumentException("You have passed a wrong value");
		} else {
			permutatedString = new ArrayList<String>();

			// initially empty permutation string
			generatePermutation("", inputString);

			/*
			 * First converting List into hash set to remove duplicate
			 * permutation and then again converting it into list
			 */
			permutatedString = new ArrayList<String>(new LinkedHashSet<String>(
					permutatedString));
			
			return permutatedString;
		}
	}

	private void generatePermutation(String prefix, String inputString) {
		if (inputString.length() == 0) {
			permutatedString.add(prefix);
		} else {
			for (int i = 0; i < inputString.length(); i++) {
				// it will fix the i character of string and then call the same
				// function for all other character string by converting into
				// string
				generatePermutation(
						prefix + inputString.charAt(i),
						inputString.substring(0, i)
								+ inputString.substring(i + 1,
										inputString.length()));
			}
		}
	}

	
}
