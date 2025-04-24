package JavaOOP2;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.sum();
		m.sum(10);
		m.sum(10, 20);
	}
	
	//You can't create method inside a method
	//Duplicate method - i.e same method name with same number of arguments are not allowed
	
	//Method overloading - When method name is exact same with different arguments or input parameters within the same class
	public void sum() //0 input parameter
	{
		System.out.println("SUM--Method");
	}
	
	public void sum(int i) //1 input parameter
	{
		System.out.println(i+" is an integer");
	}
	
	public void sum(int i, int j) //2 input parameter
	{
		System.out.println(("total sum is ")+(i + j) );
	}

}
