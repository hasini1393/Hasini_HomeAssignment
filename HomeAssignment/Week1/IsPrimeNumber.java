package HomeAssignment.Week1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		int Count=0;
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{	
				Count++;
				}
				
			}
			
			System.out.println("Count is: "+ Count);
			
				if(Count==2)
				{
					System.out.println("Given Nummber "+ num +" is a prime number");
				}
				
				else
				{
					System.out.println("Given Nummber "+ num +" is not a prime number");
				}	
			
			
		}
		else
		{
			System.out.println("Given Nummber "+ num +" is not a prime number");
		}

	}

}
