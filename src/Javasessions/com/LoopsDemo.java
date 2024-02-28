package Javasessions.com;

public class LoopsDemo {

	
	//Types of loop
	//While loop
	//do while loop
	//for loop
	//for each loop
	
	
	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		
		//while loop--> minimum number of times while will execute -->0
		/*
		 * syntax
		 * 
		 * while(condition)
		 * {
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 */
		System.out.println("Numbers from 1 to 10");
		
		int i=1;
		
		while(i<=100)
		{
			System.out.println(i);//1,2,3,4 5-----10
			i++;//i+1=2 3 4 5 6----
			
		}
		
		System.out.println("Thanks");
		
		//infinite while  loop 
		/*
		while(true)
		{
			System.out.println("Welcome to nucot");
			
		}
		
		*/
		
		
		
		System.out.println("Even numbers from 2 to 10");
		
		int ii=2;
		while(ii<=10)
		{
			System.out.println(ii);//2 4 6 8 10
			ii=ii+2;
		}
		
		
System.out.println("oddnumbers from 2 to 10");
		
		int iii=1;
		while(iii<=10)
		{
			System.out.println(iii);//1 3 5 7 9
			iii=iii+2;
		}
		
		System.out.println("thanks");
		
		
		

	}

}
