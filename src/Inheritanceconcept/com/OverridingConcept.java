package Inheritanceconcept.com;



class AA
{
	
	void show()
	{
		System.out.println("This is show in parent");
	}
	
	void display()
	{
		System.out.println("This is Display in parent");
	}
	
	
	
}

class BB extends AA
{
	@Override
	void show()
	{
		System.out.println("This is show in child class");
	}
	
	
	void test()
	{
		System.out.println("This is test method in child class");
	}
	
	
	
}



public class OverridingConcept {

	public static void main(String[] args) {
		AA obj=new AA();
		obj.show();
		obj.display();
		//obj.test();
		
		BB obj1=new BB();
		obj1.show();
		obj1.test();
		obj1.display();
		
		
		
		
		
		
		

	}

}
