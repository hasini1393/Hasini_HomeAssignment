package HomeAssignment.Week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fibonacci series= 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		
		int n1,n2, Sum, Range;
		n1=0;
		n2=1;
		Sum=0;
		Range =8;
		
		System.out.println("Fibonacci Series: "+  n1 +","+ n2);
		
		for(int i=2; i<Range;i++)
		{
			Sum=n1+n2;
			System.out.println(Sum);
			n1=n2;
			n2=Sum;
		}
		

	}

}
