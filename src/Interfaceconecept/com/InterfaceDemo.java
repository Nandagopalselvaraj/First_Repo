package Interfaceconecept.com;

/*
 * interface interface_name
 * {
 * 		only un-implemented methods
 *		ptototype or method declaration
 * 
 * }
 * 
 *100 abstraction
 * 
 * 
 */

public interface  InterfaceDemo
{
	  int a=10;
	  final int b=20;
	  static int c=30;
	  
	abstract void test1();
	abstract void test2();
	abstract void test3();
	
}

class InterfaceDemo2 implements InterfaceDemo
{

	@Override
	public void test1() 
	{
		System.out.println("test1");
	}

	@Override
	public void test2() 
	{
		System.out.println("test2");
		
	}

	@Override
	public void test3()
	{
		System.out.println("test3");
		
	}
		
	
}










