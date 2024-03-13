package Interfaceconecept.com;

public class interfaceexecution {

	public static void main(String[] args) {
		
		System.out.println("******Chromedriver*****");
		ChromeDriver obj1=new ChromeDriver();
		obj1.click();
		obj1.get();
		obj1.close();
		obj1.test1();
		
		System.out.println("******Firefoxdriver*****");
		
		FirefoxDriver obj2=new FirefoxDriver();
		obj2.click();
		obj2.get();
		obj2.close();
		obj2.test2();
		
		System.out.println("******Safaridriver*****");
		
		SafariDriver obj3=new SafariDriver();
		obj3.click();
		obj3.get();
		obj3.close();
		obj3.test3();
		
		
		
		
		
		
		

	}

}
