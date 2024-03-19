package Arraysdemo.com;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//arrays--->groups of elements having similar type of items
		
		//array declaration 
		
		//syntax
		//data_type variable_name[size];
		
		//int a[5];
		
		
		//array inti 
		
				//syntax
				//data_type variable_name[size]={val1,val2,val3....nval};
				
				//int a[5]={1,2,3,4,5};
		//literal array		
		
		int a[]= {1,2,3,4,5};
		
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		
		//System.out.println(a[6]);//ArrayIndexOutOfBoundsException
		
		System.out.println(a[0]+a[1]);
		
		System.out.println("The length of array is-->"+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		
		System.out.println("Second way to print the values");
		
		System.out.println("With out using for loop"+Arrays.toString(a));
		
		System.out.println("Third way to print the values by using foreach loop");
		
		//syntax of each loop
		
		/*
		 * 
		 * for(data_type newvariable_value:oldvariable_value)
		 * {
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		for(int aa:a)
		{
			
			System.out.println(aa);
			
		}
		
		
		System.out.println("**********************************");
		
		
		String s[]= {"Api","Selenium","Github","Java","Jenkins"};
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s.length);
		System.out.println("Using loop");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("with out Using loop");
		System.out.println(Arrays.toString(s));
		
		System.out.println(" Using for each loop");
		for(String ss:s)
		{
			System.out.println(ss);
		}
		
		
		
		
		
		
		
		
		
		


	}

}
