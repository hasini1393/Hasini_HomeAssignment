package HomeAssignment.Week1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3, 2, 11, 4, 6, 7};
		int b[]= {1, 2, 8, 4, 9, 7};
		
		//Output= 2, 4, 7
		
		int L1=a.length;
		int L2=b.length;
		
		for(int i=0;i<L1;i++)
		{
			for (int j=0;j<L2;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
