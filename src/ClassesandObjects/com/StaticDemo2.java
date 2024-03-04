package ClassesandObjects.com;

public class StaticDemo2 {

	
	//3.
	static int a=10;
	
	//4.
	static void test()
	{
		System.out.println("Test");
	}
	
	//1.
	static
	{
		System.out.println("Welcome to Nucot");
		System.out.println("Welcome to Nucot");
		System.out.println("Welcome to Nucot");
		System.out.println("Welcome to Nucot");
		System.out.println("Welcome to Nucot");
		System.out.println("Welcome to Nucot");
	}
	
	
	static {
       System.out.println("Lieutenant");
       System.out.println("Captain");
       System.out.println("Major");
    }
    
    static {
    	System.out.println("Colonel");
    	System.out.println("General");
    }
	

	//2.
	public static void main(String[] args) {
		
		test();
		System.out.println(a);
		
		
		

	}

}
