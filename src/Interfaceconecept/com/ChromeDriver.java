package Interfaceconecept.com;

public class ChromeDriver implements SearchContext,WebDriverDemo {

	@Override
	public void click() {
		
		System.out.println("click in ChromeDriver");
	}

	@Override
	public void get() {
		
		System.out.println("get in ChromeDriver");
	}

	@Override
	public void close() {
		
		System.out.println("close in ChromeDriver");
		
	}
	
	public void test1() {
		
		System.out.println("Test1 in ChromeDriver");
		
	}

	@Override
	public void findElement() {
		System.out.println("findElement in ChromeDriver");
		
	}
	
	

}
