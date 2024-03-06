package PloymorphismConcept.com;

public class MethodOverloading3 {

	
	//area of a rectangle
	  public float area(float length, float width) 
	  {
	    return (length * width);
	  }

	  // area of a circle
	  public float area(float radius)
	  {
	    return (float) (radius * radius * 3.14);
	  }

	
	public static void main(String[] args) {
		
		MethodOverloading3 obj=new MethodOverloading3();
		float res=obj.area(10.0f, 20.00f);
		System.out.println(res);
		
		float res2=obj.area(10.0f);
		System.out.println(res2);

	}

}
