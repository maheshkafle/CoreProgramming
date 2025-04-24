package JavaOOP2;

public class TestCar 
{
	public static void main(String[] args) 
	{
		
		//static Polymorphism - compile time polymorphism
		Sunny s = new Sunny();
		s.start(); //In Run time preference will be given to child class method then child class method gets executed
		s.stop();
		s.refuel();
		s.selfdrive();
		
		System.out.println("--------");
		Car c = new Car();
		c.start(); 
		c.stop();
		c.refuel();
//		c.selfdrive();  //Parent class object cannot refer child class method
		
		
		System.out.println("-----------");
		
		//Top casting
		Car c1 = new Sunny(); //child class object can be referenced by parent class object reference variable --Hint: small fits into large one
		//This is called dynamic polymorpshim or Run time polymorhism
		s.start(); 
		s.stop();
		s.refuel();
		s.selfdrive();
		
		//Down casting - It is Possible which means casting parent class object to child class object but in Run time we get ClassCastException
		//Hint: Large doesn't fit inside small object
		Sunny s1 = (Sunny) new Car();
		s.start(); //
	}

}
