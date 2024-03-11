package abstractconcept.com;

abstract class Subject
{
	int a=10;
	final int b=10;
	static int c=40;
	
	static
	{
		System.out.println("this block will be excute first");
	}
	//constructor
    Subject()
    { 
      System.out.println("Learning Subject"); 
    }
   
    //un-implemented
    abstract void syllabus();
   
    //implemented
      void Learn()
      {
          System.out.println("Preparing Right Now!"+a);
      }
}
 
class IT extends Subject 
{
  void syllabus()
  {
    System.out.println("C , Java , C++");
  }
}



public class Nucot {

	public static void main(String[] args) {
		
		//Subject obj=new Subject();
		
		IT obj=new IT();
		obj.syllabus();
		obj.Learn();
				
	}

}
