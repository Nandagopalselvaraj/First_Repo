package PloymorphismConcept.com;

public class MethodOverloading4 {

		void print()
		{
			System.out.println("0 Parameter");
		}
		
		void print(int i)
		{
			System.out.println("i:" + i);
		}
		 
		void print(int i, int j) 
		{
			System.out.println("i and j : " + i + " " + j);
		}
		
		double print(double e)
		{
			System.out.println("e: " + e);
			return e*e;
		}
		
	
	

	public static void main(String[] args) {
		MethodOverloading4 obj=new MethodOverloading4();
		
		obj.print();
		obj.print(10);
		obj.print(10,20);
		obj.print(1000.000);

	}

}
