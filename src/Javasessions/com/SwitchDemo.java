package Javasessions.com;

public class SwitchDemo {

	public static void main(String[] args) {
		
		//switch syntax
		/*
		 * switch(expression)
		 * {
		 * 		case 1:
		 * 				statements
		 * 		break;
		 * 
		 * 		case 2:
		 * 				statements
		 * 		break;
		 * 
		 * 		case 3:
		 * 				statements
		 * 		break;
		 * 
		 * 		case 4:
		 * 				statements
		 * 		break;
		 * 
		 * 
		 * 		default:
		 * 					statements
		 * 		break;
		 * 
		 * 
		 * }
		 * 
		 * 
		 */
		
		String browser="ie";
		switch(browser)
		{
		
				case "chrome": 
		
					System.out.println("Launch chrome browser");
					break;
				case "firefox": 
					
					System.out.println("Launch firefox browser");
					break;
				case "ie": 
					
					System.out.println("Launch ie browser");
					break;
				case "safari": 
					
					System.out.println("Launch safari browser");
					break;
		
				case "edge": 
					
					System.out.println("Launch edge browser");
					break;
		
				default:
					System.out.println("Plz correct browser name");
					break;
		
		
		
		
		}
		
			System.out.println("Thanks");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
