package week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int count;
		/*
		 * for (int i = 0; i < arr.length-1; i++) { count = 0; for (int j = i+1; j <
		 * arr.length; j++) { if(arr[i]==arr[j]) { count= count+1; break;
		 * 
		 * } } if(count>0) { System.out.println(arr[i]); }
		 * 
		 * }
		 */
		Set<Integer> temp = new LinkedHashSet<Integer>();
		for (Integer i : arr) {
			if (!temp.add(i)) {
				System.out.println(i);

			}

		}
	}
}