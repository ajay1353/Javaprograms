package com.turnpeak.ups;

import java.util.List;


/**
 * This is a duplicate interface which has three abstract methods
 */
public interface Duplicates
{
	
	/**
	 * @param numbers
	 * @return integer
	 * method for finding duplicate number in sequential range
	 */
	public int getDuplicateNum(List<Integer> numbers);

	/**
	 * @param word
	 * method for finding duplicate characters in a word
	 */
	public void getDuplicateChar(String word);
	/**
	 * method for finding duplicate numbers in two arrays
	 */
	public void getDuplicateArrayNum();
}
