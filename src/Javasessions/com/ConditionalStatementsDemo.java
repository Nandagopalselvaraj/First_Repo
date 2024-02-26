package Javasessions.com;

public class ConditionalStatementsDemo {

	

	
	public static void main(String[] args) {
		
		int a=2;
		int b=5;
		System.out.println("Which is greatest of two nums");
		
		//syntax
		/*
		 * if(condition)
		 * {
		 * 
		 * 		statements
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 */
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		
		
		System.out.println("Thanks");
		
		
		//if else
		//syntax
		/*
		 * if(condition)
		 * {
		 * 
		 * }
		 * else
		 * {
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		
		int p=15;
		int q=8;
		
		if(p>q)
		{
			System.out.println("p is greater than q");
		}
		else
		{
			System.out.println("q is greater than p");
		}
		
		
		
		
		
		System.out.println("if else statements examples");
		
		
		int num=101;
		if(num<=100)
		{
			System.out.println("calculating your marks");
			if(num>=90)
			{
				System.out.println("Excellent");
				
				if(num==100)
				{
					System.out.println("First rank");
					
				}
			}
			
		
		}
		else
		{
			System.out.println("plz pass correct num");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
