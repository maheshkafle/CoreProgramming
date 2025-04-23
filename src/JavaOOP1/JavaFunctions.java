package JavaOOP1;

public class JavaFunctions 
{

	public static void main(String[] args) 
	{
		JavaFunctions obj = new JavaFunctions();
		obj.Test();
		System.out.println(obj.QAtest());
		System.out.println(obj.Quote());
		System.out.println(obj.division(100,10));
	}
	
	public void Test() //no input no output
	{
		System.out.println("Inside Test Method");
	}

	public int QAtest() //no input some output
	{
		int a = 10;
		int b = 20;
		int d = a + b;
		return d;
	}
	
	public String Quote() // no input some output
	{
		String txt= "Java is awesome!";
		return txt;
	}
	
	public int division(int a, int b) //some input some output
	{
		int d = a / b;
		return d;
	}
}
