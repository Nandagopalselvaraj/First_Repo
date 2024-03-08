package Inheritanceconcept.com;


class AAAA
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

class BBBB extends AAAA
{
	@Override
	void show()
	{
		System.out.println("This is show in BBBB");
	}
	
	void t1()
	{
		System.out.println("this is t1 in BBBB");
	}
	
	void t2()
	{
		System.out.println("this is t1 in BBBB");
	}
	
	
}
class CCCC extends BBBB
{
	@Override
	void show()
	{
		System.out.println("This is show in CCCC");
	}
	@Override
	void t1()
	{
		System.out.println("this is t1 in CCCC");
	}
	
	void t3()
	{
		System.out.println("this is t3 in CCCC");
	}
	
	void t4()
	{
		System.out.println("this is t1");
	}
	
	
}
class DDDD extends CCCC
{
	@Override
	void show()
	{
		System.out.println("This is show in DDDD");
	}
	
	@Override
	void t3()
	{
		System.out.println("this is t3 in DDDD");
	}
	
	
	void t5()
	{
		System.out.println("this is t5");
	}
	
}


public class MultilevelinhertanceDemo {

	public static void main(String[] args) {
		
		DDDD obj=new DDDD();
		
		obj.show();
		obj.display();
		obj.t1();
		obj.t2();
		obj.t3();
		obj.t4();
		obj.t5();
		
		
		
		
	}

}
