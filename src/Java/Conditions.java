package Java;

public class Conditions 
{

	public static void main(String[] args) 
	{
		//comparison operators < > <= >= == !=
		
		int a = 20;
		int b = 40;
		
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else 
		{
			System.out.println(b+" is greatest");
		}
		
		
		int e=10;
		int f=20;
		int g=50;
		
		if(e>f & e>g) 
		{
			System.out.println(e + " is greatest");
		}
		else if(f>g) 
		{
			System.out.println(f + " is greatest");
		}
		else 
		{
			System.out.println(g + " is greatest");
		}
	}

}
