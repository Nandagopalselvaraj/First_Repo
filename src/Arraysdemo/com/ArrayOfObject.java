package Arraysdemo.com;

import java.util.Arrays;

public class ArrayOfObject {

	public static void main(String[] args) {
		//Object is class in java-->Object is the super class of all the classes
		
		//syntax
	//	Object obj_name[]=new Object[size];



		Object obj[]=new Object[5];
		obj[0]="Nucot";
		obj[1]=12;
		obj[2]="Bangalore";
		obj[3]=1200.00f;
		obj[4]='S';
		
		System.out.println(obj.length);
		for(int i=0;i<obj.length;i++)
		{
			
			System.out.println(obj[i]);
		}
		
		
		System.out.println(Arrays.toString(obj));
		for(Object obj1:obj)
		{
			System.out.println(obj1);
		}

		

	}

}
