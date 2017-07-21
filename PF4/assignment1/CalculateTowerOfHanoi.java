package assignment1;
/**
 * Name			:	CalculateTowerOfHanoi
 * Author		:	Anushtha Gupta
 * Date			:	2017-07-18
 * Reference		:	Assignment 4 - Exercise 1
 * Description		:	This is used to generate all the moves used to transfer given 
 * 					number of disks from source to destination pole 
 */
import java.util.*;

public class CalculateTowerOfHanoi {
	
	
	/**
	 * @param source	:	Source Pole
	 * @param destination	:	Destination Pole 
	 * @param temp		:	Temporary Pole
	 * @param numberOfDisks	:	Total number of disks in the source pole
	 * @return		:	lists of moves for transferring disks from source to destination
	 */
	public List<String> towerOfHanoi(String source, String destination,
			String temp, int numberOfDisks) {
		if (numberOfDisks <= 0) {
			throw new IllegalArgumentException();
		} else {
			/*
			 * stores all the moves used to transfer given number of disks to
			 * destination pole
			 */
			List<String> listWords = new ArrayList<String>();

			// Base condition when one disk is present
			if (numberOfDisks == 1) {
				listWords.add("Move Disk 1 From " + source + " to "
						+ destination);
				return listWords;
			}

			// condition when there are more than one disks.
			else {
				listWords.addAll(towerOfHanoi(source, temp, destination,
						numberOfDisks - 1));
				listWords.add("Move Disk " + numberOfDisks + " From " + source
						+ " to " + destination);
				listWords.addAll(towerOfHanoi(temp, destination, source,
						numberOfDisks - 1));
				return listWords;
			}
		}
	}

	
}
