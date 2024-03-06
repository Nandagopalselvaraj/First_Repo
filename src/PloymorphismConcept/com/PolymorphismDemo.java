package PloymorphismConcept.com;

public class PolymorphismDemo {

	//Polymorphism=-->many+forms
	//Thre are two types of Polymorphism
	//Compile time Polymorphism--->Method Overloading
	//Run Time Polymorphism----Method overriding
	
	
	//Method overloading
	
	//1.Method overloading  will happen in a single class
	//2.Methods name should be same
	
	
	void add(int a,int b)
	{
		int result1=a+b;
		System.out.println(result1);
		
	}
	
	void add(int a,int b,int c)
	{
		int result2=a+b+c;
		System.out.println(result2);
	}
	
	void add(int a,int b,int c,int d)
	{
		int result3=a+b+c+d;
		System.out.println(result3);
	}
	
	void add(int a,int b,int c,int d,int e)
	{
		int result4=a+b+c+d+e;
		System.out.println(result4);
	}
	
	
	
	public static void main(String[] args) {
		
		
		PolymorphismDemo obj=new PolymorphismDemo();
		obj.add(2,3);
		obj.add(2,3,4);
		obj.add(2,3,4,5);
		obj.add(2,3,4,5,6);
		
		
		
		

	}

}
