package Inheritanceconcept.com;


//parent class

//child class syntax

/*class child_class_name extends parent_class_name
{
	
}
*/

//single level inheritance
class A
{
	
	void test1()
	{
		System.out.println("This is test method in parenet class");
	}
	
	void test2()
	{
		System.out.println("This is test method in parenet class");
	}
	
	
}
class B extends A
{
	
	
	
	void test1()
	{
		System.out.println("This is test method in child class");
	}
		
	void test3()
	{
		System.out.println("This is  child class own method");
	}
	
	
}


public class TestingInheritanceConcept {

	public static void main(String[] args) {
		
		A obj=new A();
		
		obj.test1();
		obj.test2();
		
		System.out.println("*********************************");
		
		B obj1=new B();
		
		obj1.test1();
		obj1.test2();
		obj1.test3();
		
		
		
		

	}

}
