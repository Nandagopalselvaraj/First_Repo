package ClassesandObjects.com;

public class Staticdemo {

	//static variables
	//static method
	//static block
	
	int b=10;
	static int a=10;
	
	void display()
	{
		System.out.println("Display");
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	

	public static void main()
	{
		System.out.println("Static show method");
		//System.out.println(b);//we cannot use normal data
		System.out.println(a);
	}
	
	
	
//JVM-->entry point
	public static void main(String[] args) {
		
		Staticdemo obj=new Staticdemo();
		System.out.println(obj.b);
		obj.display();
		
		//firstway-->variable_name
		//use methodname
		
		System.out.println(a);
		main();
		
		System.out.println("*******Second way of execution**********");
		//Secondway-->ClassName.variable_name
		//use methodname-->ClassName.Method_name
		
		System.out.println(Staticdemo.a);
		
		Staticdemo.main();
		
		
		
		

	}

}
