package package1;

public class student {
	 int roll =1;
     int age;

	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		student ob= new student();
	    ob.roll=1;
		ob.age=50;
		ob.display1();
		ob.display2();
	System.out.println("Student roll no is "+ob.roll);
	System.out.println("Student age is "+ob.age);
	}

}
