package ExceptionalHnadlingDemo;

public class FinallyDemo {

	int a;
	
	
	public static void main(String[] args) {
		
		FinallyDemo obj=new FinallyDemo();
		obj=null;
		
	
		try
		{
			int i=20/0;
		}
//		catch(Exception e)
//		{
//			System.out.println("AE is coming");
//		}
		finally
		{
				System.out.println("Always i will exceuteb to close the Db connections");
		}
		
		
		
		

	}

}
