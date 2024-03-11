package Inheritanceconcept.com;


class EE
{
	int a;
	
	void show()
	{
		System.out.println("the value of -->"+a);
		
	}
	
	
	
}

class FF extends EE
{
	int a;
	@Override
	void show()
	{
		System.out.println("the value of -->"+a);
		
	}
	
}













public class TestDemo {

	public static void main(String[] args) {
		
		EE obj=new EE();
		obj.a=10;
		obj.show();
		
		FF obj1=new FF();
		obj1.a=20;
		obj1.show();
		
		
		
		
		
		
		
	}

}
