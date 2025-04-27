package Java;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		
		//uncaught exception
//		int i = 9/0;
//		System.out.println(i);
		
		//Caught exception
		//Thread.sleep(2000);
		
		//1. try-catch block
		//Benefit of exception handling is program will run even after throwing an exception and it tells us from where exception is thrown
		try 
		{
			int i = 9/0; //this code will throw an exception
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("ABC");
		System.out.println("ABC");
		
	}

}
