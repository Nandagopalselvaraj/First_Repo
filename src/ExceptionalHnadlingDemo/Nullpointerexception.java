package ExceptionalHnadlingDemo;

public class Nullpointerexception {

	int a;
	
	

	public static void main(String[] args) {
		
		 Nullpointerexception  obj=new  Nullpointerexception();
		 obj=null;
		 
		 try
		 {
			 System.out.println(obj.a=10);
		 }
		 catch(NullPointerException e)
		 {
			 System.out.println("NP is coming");
			 e.printStackTrace();
			 
		 }
		 
		System.out.println("Thanks");
		
		
		

	}

}
