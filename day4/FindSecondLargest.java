package week2.day4;

import java.util.*;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			list1.add(data[i]);
		}
		Collections.sort(list1);
		int size = list1.size();
		
		System.out.println("Second element from the last in the List is : "+list1.get(size-2));
	}

}
