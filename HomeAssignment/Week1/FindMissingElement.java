package HomeAssignment.Week1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,3,2,8,6,7};
		int length = a.length;
		System.out.println("Lenth of the array: " + length);
		Arrays.sort(a);
		int Sum=0;
		int Sum1 =0;
		for (int i= 0;i<length;i++)
		{
			//System.out.println("Array Value after Sort: " + a[i]);
			
			
			Sum=Sum+a[i];
			
		}
		System.out.println("Sum of all the array elements in the list: " + Sum);
			
		for (int j= 1;j<=8;j++)
		{
			//System.out.println("Array Value after Sort: " + a[i]);
			
			
			Sum1=Sum1+j;
			
		}
		System.out.println("Sum of all the array elements within the range of 1 to 8: " + Sum1);
		
		int MissingElement = Sum1-Sum;
		
		System.out.println("Missing Element of an array is: " +MissingElement);
	}
		

}
		
	


