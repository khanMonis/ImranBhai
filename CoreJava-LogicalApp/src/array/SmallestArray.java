package array;

import java.util.Arrays;

public class SmallestArray {

	public static int getSecondSmallest(int[] a){  
		Arrays.sort(a);  
		return a[2];  
		}  
	public static void main(String[] args) {
		int a[]={1,2,5,6,3};  
		System.out.println("Second Smallest: "+getSecondSmallest(a)); 

	}

}
