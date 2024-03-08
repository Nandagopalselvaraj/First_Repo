package Inheritanceconcept.com;


class AAA
{
	
	public  void t1()
	{
		System.out.println("this is t1 in parent");
	}
	
	public  void t2()
	{
		System.out.println("this is t2 in parent");
	}
	
	
	
}

class BBB extends AAA
{
	@Override
	public  void t1()
	{
		System.out.println("this is t1 in parent");
	}
	
	
	public  void t3()
	{
		System.out.println("this is t2 in parent");
	}
	
	
	
	
}


public class Overrideconcept2 {

	public static void main(String[] args) {
		
		//top casting/upcasting
		//creating child class object by taking parent ref is called topcasting
		
	AAA obj	=new BBB();
		
		obj.t1();
		obj.t2();
		//obj.t3();  not possible
		
		
		
		
		
		

	}

}
