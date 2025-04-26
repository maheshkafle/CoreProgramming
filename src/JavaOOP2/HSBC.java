package JavaOOP2;

public interface HSBC 
{
	int minimumBalance = 100; //it is static and final in nature
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	//only method prototype - no method body
	//in interface defined vars are by default static in nature and final i.e value cannot be changed
	//no main method in interface
	//we cannot create object of interface
	//Interface is abstract in nature
}
