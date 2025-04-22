package Java;

public class Loops 
{

	public static void main(String[] args) 
	{
		//Print values from 0 to 9 using while loop
		int i = 0; //initialization
		while(i<10) //conditional
		{
			System.out.println("i value is "+ i);
			i++; //incremental or decremental
		}
		
		
		System.out.println("==========================");
		
		//Print values from 0 to 99 using for loop
		for(int j=0;j<100;j++) //initialization, conditional, incremental
		{
			System.out.println("j value is "+j);
		}
		
		System.out.println("==========================");
		
		//Now requirement is print values from 10 to 1 using while loop
		int m =10;
		while(m>0)
		{
			System.out.println("m value now is "+m);
			m=m-1;
		}
		
		System.out.println("==========================");
		
		//print values from 99 to 9 using for loop
		for(int n=99;  n>=9; n--) 
		{
			System.out.println("n value is "+n);
		}
	}

}
