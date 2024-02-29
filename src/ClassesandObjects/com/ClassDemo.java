package ClassesandObjects.com;



//Userdefine(Template or Blueprint) is called class
	//Always the first character of a class-name should be upper case letter
	//syntax
	/*
	 * 
	 * class   class_name
	 * {
	 * 
	 * 			1.variables--(Class variable(global variables),Local variables,final variables,static variables)
	 * 			2.methods-->Normal methods and static methods
	 * 			3.constructor
	 * 			4.static block
	 * 			
	 * 
	 * 			//normal method
	 * 		//void		
	 * datatype method-name()
	 * {
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 		//body-->statements
	 * 
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
	 */
	
	
	
	
 public class ClassDemo {

	
	//1.Variables
	//class variable(global variables) 
	int a=10;
	final int b=20;
	static int c=30;
	
	
	//normal method
	 void show()
	{   //local variables
		int i=10;
		System.out.println("The value of show is --->"+i);
		
	}
	
	 
	 void numbers() 
	 {
		 System.out.println("Numbers from 1-- to n");
		 
		 for(int i=0;i<=10;i++)
		 {
			 System.out.println(i);
		 }
		 
		 
	 }
	 //camel case
	 void evenNumbers() 
	 {
		 System.out.println("Numbers from 1-- to n");
		 
		 for(int i=2;i<=10;i=i+2)
		 {
			 System.out.println(i);
		 }
		 
		 
	 }
	 
	 
	 
	
	public static void main(String[] args) {
	
		//object creation syntax
		
		//classname object_name= new class_name();
		
		ClassDemo obj=new ClassDemo();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
	
		obj.show();
		obj.numbers();
		obj.evenNumbers();
		
		
		
	}

}
