package JavaOOP1;

public class Bird 
{
	boolean canFly;
	boolean isPredator;
	
	public static void main(String[] args) 
	{
		Bird eagle = new Bird();
		eagle.canFly=true;
		eagle.isPredator=true;
		
		Bird penguin = new Bird();
		penguin.canFly=false;
		penguin.isPredator=true;
		
		
		Bird sparrow = new Bird();
		sparrow.canFly=true;
		sparrow.isPredator=false;
		
		System.out.println("---Before changing values------");
		System.out.println(eagle.canFly);
		System.out.println(eagle.isPredator);
		
		System.out.println(penguin.canFly);
		System.out.println(penguin.isPredator);
		
		System.out.println(sparrow.canFly);
		System.out.println(sparrow.isPredator);
		
		System.out.println("---After shifting values object reference variables--");
		eagle=penguin;
		penguin=sparrow;
		sparrow=eagle;
		
		System.out.println("---Before changing values------");
		System.out.println(eagle.canFly);
		System.out.println(eagle.isPredator);
		
		System.out.println(penguin.canFly);
		System.out.println(penguin.isPredator);
		
		System.out.println(sparrow.canFly);
		System.out.println(sparrow.isPredator);
		
	}

}
