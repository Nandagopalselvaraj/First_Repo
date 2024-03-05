package ClassesandObjects.com;

public class ConstructorDemo {

	    //1.Constructor name should be always same as class name
		//2.Constructor are called when you create Object 
		//3.Constructor are mainly used to initialize data and objects
		//4.We have two types one is default constructor
		//5.Parameterzised constructor
		//6.Constructor don't have return type
	
	int a;
	String name;

	
	ConstructorDemo()
	{
		System.out.println("default constructor");
	
	}

	ConstructorDemo(int a)
	{
		System.out.println(a);
		this.a=a;
		System.out.println("one parameterizsed constructor");
		System.out.println(this.a);
	
	}
	
	ConstructorDemo(String name)
	{
		this.name=name;
		System.out.println("one string parameterizsed constructor");
		System.out.println(this.name);
	
	}
	
	ConstructorDemo(int a,int b)
	{
		System.out.println("Two parameterizsed constructor");
	
	}
	
	
	ConstructorDemo(int a,int b,int c)
	{
		System.out.println("Three parameterizsed constructor");
	
	}
	
	
	void show()
	{
		int a=20;
		System.out.println(a);
	}
	
	
	
	
	public static void main(String[] args) {
		
		ConstructorDemo obj1=new ConstructorDemo();
		
		
		ConstructorDemo obj2=new ConstructorDemo(10);
		//System.out.println(obj2.a);
		
		
		ConstructorDemo obj3=new ConstructorDemo(10,20);
		
		ConstructorDemo obj4=new ConstructorDemo(10,20,30);
		
		ConstructorDemo obj5=new ConstructorDemo("Modi");
		
		obj1.show();
		obj2.show();
		obj3.show();
		obj4.show();
		obj5.show();
		

	}

}
