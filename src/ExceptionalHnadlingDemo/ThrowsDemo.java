package ExceptionalHnadlingDemo;

public class ThrowsDemo {
	
	
	void show1()
	{
		System.out.println("show1");
		show2();//method calling
	}
	
	void show2()
	{
		System.out.println("show2");
		try
		{
		show3();
		}
		catch(ArithmeticException ae)
		{
			
		}
	}
	void show3() throws ArithmeticException 
	{
		System.out.println("show3");
		show4();
	}
	
	
	
	void show4()  throws ArithmeticException 
	{
		System.out.println("show4");
		int i=10/0;
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		ThrowsDemo obj=new ThrowsDemo();
		
		obj.show1();
		
	}

}
