package Interfaceconecept.com;

public class FirefoxDriver implements SearchContext ,WebDriverDemo{

	@Override
	public void click() {
		
		System.out.println("click in FirefoxDriver");
	}

	@Override
	public void get() {
		
		System.out.println("get in FirefoxDriver");
		
	}

	@Override
	public void close() {
		
		System.out.println("close in FirefoxDriver");
		
	}
	
public void test2() {
		
		System.out.println("test2 FirefoxDriver");
		
	}

@Override
public void findElement() {

	System.out.println("findElement FirefoxDriver");
	
}

}
