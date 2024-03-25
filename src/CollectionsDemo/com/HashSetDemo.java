package CollectionsDemo.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String>  oset=new HashSet<>();
		oset.add("API");
		oset.add("Selenium");
		oset.add("Java");
		oset.add("Github");
		oset.add("Jenkins");
		System.out.println(oset);
		System.out.println(oset.size());
		
		System.out.println(oset.contains("Java"));
		System.out.println(oset.contains("Apple"));
		
		System.out.println(oset.remove("API"));
		System.out.println(oset);
		
		for(String oset1:oset)
		{
			System.out.println(oset1);
		}
		
		
		HashSet<Integer>  oset2=new HashSet<>();
		oset2.add(14);
		oset2.add(54);
		oset2.add(22);
		oset2.add(1);
		oset2.add(3);
		for(Integer oset22:oset2)
		{
			System.out.println(oset22);
		}
		
		ArrayList<Integer> olist=new ArrayList<>(oset2);
		
		Collections.sort(olist);
		System.out.println(olist);
		
		
		
		
		
		Set<Character> osetchar=new HashSet<>();
		
		osetchar.add('a');
		osetchar.add('e');
		osetchar.add('i');
		osetchar.add('o');
		osetchar.add('u');
		for(Character osetchar1:osetchar)
		{
			System.out.println(osetchar1);
		}
		
		
		
		LinkedHashSet<Character>  oset3=new LinkedHashSet<>();
		
		oset3.add('a');
		oset3.add('e');
		oset3.add('i');
		oset3.add('o');
		oset3.add('u');
		for(Character oset33:oset3)
		{
			System.out.println(oset33);
		}
		
		//otherway to iterating
	System.out.println("Printoi g values using iterator");
		Iterator<Character> it=oset3.iterator();
		
		
		while(it.hasNext())
		{
				System.out.println(it.next());
			
		}
		
		
		
		

	}

}
