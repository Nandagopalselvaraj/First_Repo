package Javasessions.com;

public class IfesleDemo {

	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=1;
		if(a==b)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		//nested if esle
		/*
		 * 
		 * if(condition)
		 * {
		 * 
		 * }else if(condition)
		 * {
		 * 
		 * }else if(condition)
		 * {
		 * 
		 * }else if(condition)
		 * {
		 * 
		 * }
		 * else
		 * {
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		String browser="safari";
		
		if(browser.equals("chrome"))
		{
			System.out.println("Launch chrome browser");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch firefox browser");
		}
		else if(browser.equals("ie"))
		{
			System.out.println("Launch ie browser");
		}
		else if(browser.equals("safari"))
		{
			System.out.println("Launch safari browser");
		}
		else if(browser.equals("edage"))
		{
			System.out.println("Launch edage browser");
		}
		else
		{
			System.out.println("Plz pass correct browser name");
		}
		
		
		

	}

}
