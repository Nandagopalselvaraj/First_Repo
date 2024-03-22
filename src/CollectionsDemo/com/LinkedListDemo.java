package CollectionsDemo.com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		
		LinkedList<Integer> olist=new LinkedList<Integer>();
		olist.add(1);
		olist.add(2);
		olist.add(3);
		olist.add(4);
		olist.add(5);
		System.out.println(olist);
		
		
		for(Integer olist1:olist)
		{
			System.out.println(olist1);
			
		}
		
		olist.addFirst(0);
		System.out.println(olist);
		olist.addLast(7);
		System.out.println(olist);
		boolean ol=olist.contains(100);
		System.out.println(ol);
		Integer n=olist.getFirst();
		System.out.println(n);
		Integer ln=olist.getLast();
		System.out.println(ln);
		
		
		
		
		
		
		

	}

}
