package Java;

public class DataTypes 
{	
	//Compiler ignores these symbols // and /**/  when executing the program
	//Single line comments
	/*
	 * Multi line comments
	*/
	
	//main method -> main() -> is the starting/execution point of the program
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
		//primitive data types: int, double, char, boolean
		
		//int -> it can be positive, negative and zero but it can't be decimal
		
		int i = 10;
		//int i = 20; //we can''t write this as this will give Duplicate local variable
		//intead we can reassign value to this variable
		i=20;
		int j=30;
		int k=40;
		int l=50;
		
		//double
		double a = 12.33;
		double b = 10.22;
		double c = 100; //as 100 is 100.00
		
		
		//char -> only single digit value, should be enclosed with single quotes
		char e = 'a';
		char f = '1';
		char g = '0';
		
		//boolean
		boolean b1=1>2;
		boolean c1=false;
		
		System.out.println(b1);
		
		
	}

}
