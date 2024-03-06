package PloymorphismConcept.com;

public class MethodOverloding2 {

	
	
	public void Square(int number) 
	{
		int square = number * number;
		System.out.println("Method with Integer Argument Called:"+square);
	}
	
	
	public void Square(double number)
	 {
		double square = number * number; 
		System.out.println("Method with double Argument Called:"+square);
	 }
	
	public void Square(long number)
	{ 
		long square = number * number;
		System.out.println("Method with long Argument Called:"+square);
	}


	public static void main(String[] args) {
		
		MethodOverloding2 obj =new MethodOverloding2();
		
		obj.Square(10);
		obj.Square(12.00);
		obj.Square(12000000000l);
		
		
		
		

	}

}
