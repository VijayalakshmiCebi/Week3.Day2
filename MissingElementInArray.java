package week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		List<Integer> list1=new ArrayList<Integer>();
		
		for(Integer arr1:arr)
		{
			list1.add(arr1);
		}
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			if(list1.get(i)!=i+1)
			{
				System.out.println("Missing Element:" + (i+1));
				break;
			}
		}
		

	}

}
