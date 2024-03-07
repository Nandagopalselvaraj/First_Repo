package PloymorphismConcept.com;

public class MethodOverloadingdemo5 {


	MethodOverloadingdemo5()
	{
		System.out.println("No argument constructor");
	}
	
	MethodOverloadingdemo5(int a)
	{
		System.out.println("One argument constructor");
	}
	
	
	MethodOverloadingdemo5(int a,int b)
	{
		System.out.println("Two argument constructor");
	}
	
	public static void main() {
		
		System.out.println("No argument");
	}
	
	public static void main(int a) {
		
		System.out.println("one argument with int type-->"+ a);
	}
	
	
	public static void main(String s) {
		
		System.out.println("one  argument with string type-->"+ s);
	}
	
	public static void main(String[] args) {
		
		main();
		main(10);
		main("nucot");
		

	}

}
