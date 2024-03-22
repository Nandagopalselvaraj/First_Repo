package CollectionsDemo.com;

import java.util.ArrayList;

public class ArralistDemo2 {

	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<Character>();
		
		al.add('a');
		al.add('e');
		al.add('i');
		al.add('o');
		al.add('u');
		System.out.println(al.size());
		for(Character al1:al)
		{
			System.out.println(al1);
			
		}
		al.add('b');
		
		System.out.println(al.size());
		
		for(Character al1:al)
		{
			System.out.println(al1);
			
		}
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		al.add(2,'i');
		System.out.println(al);
		al.indexOf('o');
		System.out.println(al.indexOf('o'));
		System.out.println(al.lastIndexOf(al));
		
		ArrayList<Integer> arrayList = new ArrayList<>();

	      // use add() method to add elements in the arrayList
	      arrayList.add(0);
	      arrayList.add(1);
	      arrayList.add(2);
	      arrayList.add(5);
	      arrayList.add(4);
	      arrayList.add(5);
	      arrayList.add(6);
		
	      // let us print last index of 5
	      System.out.println("Last index of 2 = " + arrayList.lastIndexOf(2));
	      
	      System.out.println(  arrayList.contains(5));
	      arrayList.clear();
	      System.out.println(arrayList);
	      
	      
	      
	      
		

	}

}
