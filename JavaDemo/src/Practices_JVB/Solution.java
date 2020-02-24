package Practices_JVB;

import java.util.HashMap;

public class Solution {
	public int solution(int[] A)
	{
	    java.util.HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(A.length); //O(n) space
	    for (int i : A) // O(N)
	    {
	        if (!map.containsKey(i))
	        {
	            map.put(i, i);
	        }
	    }
	    int smallestPositive = 1;
	    for (int i = 1; i < 1000001; i++) // ~O(N)
	    {
	        if (map.containsKey(i) && map.get(i) <= smallestPositive)
	        {
	            smallestPositive = map.get(i) + 1;
	        }
	    }
	    return smallestPositive;
	}}
