package JavaOOP1;

public class JavaFunctions 
{
	//main() -> execution starts from here
	public static void main(String[] args)  //main method is void--never returns any value
	{
		//after creating an object , copy of all non static methods and variables is given to that objects.
		JavaFunctions obj = new JavaFunctions();
		obj.Test();
		System.out.println(obj.QAtest());
		System.out.println(obj.Quote());
		System.out.println(obj.division(100,10));
	}
	
	//non-static methods
	//void->doesn't return any value
	public void Test() //no input no output 
	{
		System.out.println("Inside Test Method");
	}

	//return type-> int
	public int QAtest() //no input some output
	{
		int a = 10;
		int b = 20;
		int d = a + b;
		return d;
	}
	
	//return type -> String
	public String Quote() // no input some output
	{
		String txt= "Java is awesome!";
		return txt;
	}
	
	//return type -> int
	public int division(int a, int b) //some input some output
	{
		int d = a / b;
		return d;
	}
}
