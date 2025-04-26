package JavaOOP2;

//Multiple Inheritence achieved only in Interface not in class i.e implementing multiple interface methods
public class USBank implements  HSBC, BrazilBank
{
	//Extended methods from HSBC Interface
	public void debit() 
	{
		System.out.println("Debit Method");
	}
	
	public void credit() 
	{
		System.out.println("Credit Method");
	}
	
	public void transferMoney()
	{
		System.out.println("Transfer Money");
	}
	
	//Own Method
	public void applyloan() 
	{
		System.out.println("Apply loan");
	}


	//Implemented method from BrazilBank Interface
	public void wireTransfer() 
	{	
		System.out.println("Wire transfer directly to bank");
	}
}
