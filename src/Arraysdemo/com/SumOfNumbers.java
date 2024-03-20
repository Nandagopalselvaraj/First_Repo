package Arraysdemo.com;

import java.util.Arrays;

public class SumOfNumbers {

	public static void main(String[] args) {
		//literal array
		
		int a[]= {1,2,3,4,5};
		System.out.println(a[4]);
		//System.out.println(a[5]);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			
			sum=sum+a[i];//3
			
		}
		System.out.println(sum);
		
		//second way
		
		/*
		 * 
		 * syntax
		 * 
		 * data_type array_name[]=new data_type[size];
		 * 
		 * 
		 * 
		 */
		
		
		int a1[]=new int[5];
		
		
		System.out.println(a1.length);
		
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		a1[4]=50;
		//a1[5]=60;
		
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Element present at the index is-->"+i+":"+a1[i]);
		}
			
		
		System.out.println(Arrays.toString(a1));
		
		for(int a11:a1)
		{
			System.out.println(a11);
		}
		
		
		
		
		
		
		

	}

}
