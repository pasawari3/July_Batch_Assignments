package package1;

/*Constructors are same as methods. 
 Their name is also same as class name. 
 Difference is they don't return any value 
 And we don't have to call them */

public class Constructor {
	public Constructor(int t)
	{	this(5,10);
		System.out.println("One parametreized constructrs.....");
	}
	public Constructor(int a, int b)
	{		this();
		System.out.println("Two parametreized constructrs.....");
	}
	public Constructor()
	{
	this(1,2,3);	
	System.out.println("This is default constructor");
	}
		
	public Constructor(int c, int d, int e)
	{	System.out.println("Three parametreized constructrs.....");
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Constructor object = new Constructor(10);
	}
}
