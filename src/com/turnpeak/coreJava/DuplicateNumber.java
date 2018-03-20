package com.turnpeak.coreJava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * class implementing interface Duplicates
 */
public class DuplicateNumber implements Duplicates
{

	public int getDuplicateNum(final List<Integer> numbers)
	{
		final int highNum = numbers.size() - 1;
		final int total = getSum(numbers);
		final int duplicateNum = total - (highNum * (highNum + 1) / 2);
		System.out.println(duplicateNum);
		return duplicateNum;
	}

	/**
	 * @param numbers
	 * @return integer
	 */
	public int getSum(final List<Integer> numbers)
	{
		int sum = 0;
		for (final int num : numbers)
		{
			sum += num;
		}
		return sum;
	}


	public void getDuplicateChar(final String word)
	{
		final Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		final char[] chrs = word.toCharArray();
		for (final char ch : chrs)
		{
			if (dupMap.containsKey(ch))
			{
				dupMap.put(ch, dupMap.get(ch) + 1);
			}
			else
			{
				dupMap.put(ch, 1);
			}
		}
		final Set<Character> keys = dupMap.keySet();
		for (final Character ch : keys)
		{
			if (dupMap.get(ch) > 1)
			{
				System.out.println(ch + "--->" + dupMap.get(ch));
			}
		}

	}


	public void getDuplicateArrayNum()
	{
		final int[] arr1 =
		{ 1353, 3, 5, 1, 8, 9 };
		final int[] arr2 =
		{ 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int i = 0; i <= arr1.length; i++)
		{
			for (int j = 0; j <= arr2.length; j++)
			{
				if (arr1[i] == arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}

	}

}







