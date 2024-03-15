package ExceptionalHnadlingDemo;

public class ExpectionDemo {

	//try catch and finally
	
	//Runtime exception
	//-->Arithmeticexception
	
	/*
	 * 
	 * try
	 * {
	 * 
	 * }
	 * catch(Exception e)
	 * {
	 * 
	 * }
	 * finally
	 * {
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		
		try
		{
			int i=10/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
			//ae.printStackTrace();
			
		}
		
		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
		
		
		
		
		

	}

}
