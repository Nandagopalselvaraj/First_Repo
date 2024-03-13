package Interfaceconecept.com;

public class SafariDriver implements SearchContext,WebDriverDemo {

	@Override
	public void click() {
		
		System.out.println("click in SafariDriver");
		
	}

	@Override
	public void get() {
		
		System.out.println("get in SafariDriver");
	}

	@Override
	public void close() {
		System.out.println("close in SafariDriver");
		
	}
	
	public void test3() {
		
		System.out.println("test3 in SafariDriver");
		
	}

	@Override
	public void findElement() {
		System.out.println("findElement in SafariDriver");
		
	}

}
