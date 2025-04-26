package JavaOOP2;

public class TestBank {

	public static void main(String[] args) 
	{
		//Static Polymorphism - Child class object is referred by Child class object reference variable
		USBank b = new USBank();
		b.debit();
		b.credit();
		b.transferMoney();
		b.applyloan();
		b.wireTransfer();
		System.out.println(USBank.minimumBalance);
		
		System.out.println("*************");
		//Dynamic Polymorphism - Child class object is referred by Parent interface object reference variable
		HSBC h= new USBank(); 
		h.debit();
		h.debit();
		h.credit();
		h.transferMoney();
		//h.applyloan(); -- Parent interface object reference variable cannot refer to Child class own method
	}

}
