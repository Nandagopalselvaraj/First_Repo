package ClassesandObjects.com;

class Test
{
	int c=20;
	static int a = 10;
    static int b;
     
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
        //System.out.println(c);//cannot use normal data
        System.out.println(b);
    }
	
	
	
	
    // static method
    static void m1()
    {
        System.out.println("from m1");
        //System.out.println(c);//normal data cannot be used
    }
 
    
    
    public static void main(String[] args)
    {
          // calling m1 without creating
          // any object of class Test
           m1();
           System.out.println("Second way");
        //secondway
           Test.m1();
           
           
           
    }
}