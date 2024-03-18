package ExceptionalHnadlingDemo;

public class MultipleCatchDemo {

	int a;
	
	
	
	
	
	
	public static void main(String[] args) {
		
		MultipleCatchDemo obj=new MultipleCatchDemo();
		obj=null;
		
		try
		{
				int i=5/0;
				obj.a=20;
				//int i=5/0;
		
		}
		catch(NullPointerException np)
		{
			System.out.println("NP is coming");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
		}
		catch(RuntimeException re)
		{
			System.out.println("Any Expection is coming1");
		}
		catch(Exception e)
		{
			System.out.println("Any Expection is coming2");
		}
		
		System.out.println("Thanks");
		
		
		
		
		
		
	}

}
