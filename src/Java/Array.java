package Java;

public class Array 
{

	public static void main(String[] args) 
	{
		
		
		//Advantage: Array can store large no of similar data in one place
		//1 int
		int i[] = new int[4];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=4;
		
		//System.out.println(i[5]); //ArrayIndexOutOfBoundsException trying to excess item which is not present
		
		/*Disadvantages
		 * Size is fixed (Also called as Static Array) - To overcome this problem we use Dynamic Arrays like ArrayList, HashTables etc
		 * Cannot store different data types in single array - To overcome this problem we use Object Array (which can hold different dataTypes)
		*/
		//print all values inside Array using for loop
		for(int m=0; m<i.length;m++) //length or size of Array is calculated using .length 
		{
			System.out.println(i[m]);
		}
		
		//2 char
		char j[]=new char[4];
		j[0]='C';
		j[1]='1';
		j[2]='D';
		j[3]='E';
		
		for(int n=0; n<j.length;n++)
		{
			System.out.println(j[n]);
		}
		
		//3 double
		char t[]=new char[4];
		t[0]='C';
		t[1]='1';
		t[2]='D';
		t[3]='E';
		
		for(int q=0; q<t.length;q++)
		{
			System.out.println(t[q]);
		}
		
		//4 Boolean
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//print all values inside Array using for loop
		for(int o=0; o<b.length;o++)
		{
			System.out.println(b[o]);
		}
		
		//5 String
		String s[]= new String[2];
		s[0]="Mahesh";
		s[1]="ROcks!";
		
		//print all values inside Array using for loop
		for(int p=0; p<s.length;p++)
		{
			System.out.println(s[p]);
		}
		
		//6 Object Array -- Object is a class which is used  to different data type
		Object obj[] = new Object[4];
		obj[0]="Mahesh";
		obj[1]="29";
		obj[2]="0567777540";
		obj[3]="Rampur";
		
		//print all values inside Array using for loop
		for(int r=0; r<obj.length;r++)
		{
			System.out.println(obj[r]);
		}	
		
		System.out.println("========2D Array========");
		//2D Array
		int f[][] = new int[2][3];
		System.out.println(f.length); //total no. of rows in 2D Array
		System.out.println(f[0].length);//total no. of columns in 2D Array
		
		System.out.println("========2D Array========");
		f[0][0]=1;
		f[0][1]=2;
		f[0][2]=3;
		
		f[1][0]=4;
		f[1][1]=5;
		f[1][2]=6;
		
		for(int row=0;row<f.length;row++)
		{
			for(int col=0;col<f[0].length;col++)
			{
				System.out.println(f[row][col]);
			}
		}
		
	}

}
