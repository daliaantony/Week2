package week2.day4;

import java.util.*;

public class MissingElementUsingList {

	public static void main(String[] args) {
		

		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
		}
		for (int i = 0; i < arr.length+1; i++) {
			if (list1.get(i)!=i+1) {
				System.out.println("The missing number is "+(i+1));
				break;
			}
			
		}
	}

}
