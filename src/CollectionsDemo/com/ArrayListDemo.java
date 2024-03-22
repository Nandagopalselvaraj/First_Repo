package CollectionsDemo.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(20);
		al.add("Modi");
		al.add('a');
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println(al);
		
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(50);
		al1.add(40);
		System.out.println(al1);
		System.out.println(al1.size());
		
		for(int i=0;i<al1.size();i++)
		{
				System.out.println(al1.get(i));
		
		
		}	
		
		System.out.println("Using for each loop");
		for(Integer al11:al1)
		{
			System.out.println(al11);
			
		}
		
		al1.add(2,100);
		System.out.println(al1);
		
		System.out.println("Before sorting the list");
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println("After sorting the list");
		System.out.println(al1);
		
		
		ArrayList<String> als=new ArrayList<String>();
		als.add("API");
		als.add("Selenium");
		als.add("Cypress");
		als.add("WebDriverIO");
		als.add("Postman");
		
		System.out.println(als);
		System.out.println(als.size());
		
		System.out.println("Using for each loop");
		for(String als1:als)
		{
			System.out.println(als1);
			
		}
		System.out.println("Before changing the list");
		System.out.println(als);
		als.set(4, "GitHub");
		System.out.println("After changing the list");
		System.out.println(als);
		
		
		
		System.out.println("Before Adding item into the list");
		System.out.println(als);
		als.add(1, "Java");
		System.out.println("After Adding item in to the list");
		System.out.println(als);
		
		
		
		System.out.println("Before sorting the list");
		System.out.println(als);
		Collections.sort(als);
		System.out.println("After sorting the list");
		System.out.println(als);
		
		//Topcasting
		List<Integer> olist=new ArrayList<Integer>();
		
		olist.add(1);
		olist.add(2);
		olist.add(3);
		olist.add(4);
		System.out.println(olist);
		System.out.println(olist.get(2));
		
		
		
		
		
		

	}

}
