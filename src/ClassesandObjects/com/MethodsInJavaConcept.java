package ClassesandObjects.com;

public class MethodsInJavaConcept {
	
	/*
	 * datatype method_name()
	 * {
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	
	//Methods-->class members
	
	
	//1.No return type ,No input
	
	void test()
	{
		System.out.println("Test");
	}
	
	
	//2.Some return type .No input
	
	int test2()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
		
		
	}
	
	//3.Some return type .some input
	
	
	int test3(int a,int b)
	{
		int mul=a*b;
		return mul;
		
	}
	
	//4.No return type .some input
	
	void test4(int c,int d)
	{
		int div=c/d;
		System.out.println(div);
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		MethodsInJavaConcept obj=new MethodsInJavaConcept();
		obj.test();
		int result=obj.test2();
		System.out.println(result);
		int result2=obj.test3(50, 60);
		System.out.println(result2);
		obj.test4(100, 2);
		
		
		
		
		
		
		
		

	}

}
