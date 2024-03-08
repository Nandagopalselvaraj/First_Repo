package PloymorphismConcept.com;

public class Overloadingdemo5 {

	
	
	static void search()
	{
		System.out.println("search");
	}
	
	static void search(String name)
	{
		System.out.println("name");
	}
	
	static void search(String name,int price)
	{
		System.out.println("name and price");
	}
	
	static void search(String name,int price,String brand)
	{
		System.out.println("name price and brand");
	}
	
	static void search(String name,int price,String brand,int rating)
	{
		System.out.println("name,price brand and rating");
	}
	
	
	
	public static void main(String[] args) {
		search();
		
		search("iphone");
		search("iphone",50000);
		search("iphone",50000,"Apple");
		search("iphone",50000,"Apple",5);

	}

}
