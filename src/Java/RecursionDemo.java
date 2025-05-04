package Java;

public class RecursionDemo {
	
	
	//Finding Factorial using Recursion: A function call to itself
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		
		else
			return (n * factorial(n-1));
		
		
	}

	public static void main(String[] args) 
	{
		System.out.println(factorial(4));
		//factorial(4)
		//since 4>0
		//4*factorial(3)
		//4*3*factorial(2)
		//4*3*2*factorial(1)
		//4*3*2*1*factorial(0)
		//4*3*2*1*1 == 24

	}

}
