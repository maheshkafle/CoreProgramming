package JavaOOP2;

public class Sunny extends Car
{
	//Method Overriding - Methods in child and parent class with exact same name with same no. of arguments or input parameters 
	public void start() //Overridden method 
	{
		System.out.println("NISSAN SUNNY start");
	}
	
	public void selfdrive()
	{
		System.out.println("NISSAN SUNNY self driving feature");
	}
}
