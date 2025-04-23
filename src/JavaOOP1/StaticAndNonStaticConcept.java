package JavaOOP1;

public class StaticAndNonStaticConcept 
{
	int age = 10; // non static Global var
	static String model ="Nissan"; // static Global var
	
	public static void main(String[] args) 
	{
		System.out.println("=====Static=========");
		//How to call 'static' method and variable
		// 1. direct calling
		Greet();
		System.out.println(model);
		
		//2. by using className
		StaticAndNonStaticConcept.Greet();
		System.out.println(StaticAndNonStaticConcept.model);
		
		System.out.println("=====Non-Static=========");
		
		//How to call 'non-static' method and variable
		//By using object reference variable
		StaticAndNonStaticConcept obj =  new StaticAndNonStaticConcept();
		System.out.println(obj.age);
		System.out.println(obj.sum());
	}
	
	public int sum()
	{
		int a = 10;
		int b = 20;
		int d = a+b;
		return d;
	}
	
	public static void Greet()
	{
		System.out.println("Welcome!, Namaste and Swagat cha");
	}
}
