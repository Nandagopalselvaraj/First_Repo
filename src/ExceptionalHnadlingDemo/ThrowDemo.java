package ExceptionalHnadlingDemo;

public class ThrowDemo {

	//throw keyword is used to create Customized exception
	
	
	public void validatingAge() throws Exception
	{
		int age=11;
		System.out.println("validatingAge");
		
		if(age<18)
		{
			
			throw new Exception("Not eligible to vote in MP");
			
			
		}
		else
		{
			System.out.println("eligible to vote");
		}

		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		 ThrowDemo obj=new  ThrowDemo();
		 obj.validatingAge();
		
		
		

	}

}
