package package1;

public class assignment2 {
	// Assignment ((((10+2)*2)-2)*2)/2)
	public int sum(int a, int b)
        {
		int tot1 =a+b;
		System.out.println("Addition is    ->"+tot1);
		return tot1;		}
	public int sub(int c, int d)
            { int tot2= c-d;
	         System.out.println("Substration    ->"  +tot2);
	         return tot2; }
    public int mult(int mult1, int mult2)
           {   int tot3=mult1*mult2;
               System.out.println("Muliplication  ->"+tot3);
               return tot3; }

    public int div(int d1, int d2)
    {   int tot4=d1/d2;
        System.out.println("Muliplication  ->"+tot4);
        return tot4; }
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
     assignment2 obj = new assignment2();
     int sumtot= obj.sum(10, 2);
     int multtot= obj.mult(sumtot, 2);
     int subtot= obj.sub(multtot,2);
     int multtot1= obj.mult(subtot, 2);
     int divtot= obj.div(multtot1,2);
     
     
	}

}

