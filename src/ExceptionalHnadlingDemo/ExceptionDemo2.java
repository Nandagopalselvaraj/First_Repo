package ExceptionalHnadlingDemo;

public class ExceptionDemo2 {
	
	int a;
	

	public static void main(String[] args) {
		
		
		ExceptionDemo2  obj=new ExceptionDemo2();
		obj=null;
		
		System.out.println("Hi");
		try
		{
			int i=6/0;
		}
		catch(RuntimeException re)
		{
			System.out.println("Ae is coming");
		}
		
		System.out.println("thanks");
		
		
		System.out.println("Hi");
		try
		{
			obj.a=10;
		}
		catch(RuntimeException re)
		{
			System.out.println("Ae is coming");
		}
		
		System.out.println("thanks");
		
		

	}

}
