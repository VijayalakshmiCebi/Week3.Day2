package week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int arr[] = { 3,2,11,4,6,7 };
		int arr1[] = { 1,2,8,4,9,7 };

		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList1 = new ArrayList<Integer>();

		for (int j = 0; j < arr.length; j++) {
			intList.add(arr[j]);
		}
		for (int k = 0; k < arr1.length; k++) {
			intList1.add(arr1[k]);
		}
		intList.retainAll(intList1);
		System.out.println("unique elements: "+intList);
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}

}
