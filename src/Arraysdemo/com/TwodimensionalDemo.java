package Arraysdemo.com;

public class TwodimensionalDemo {

	public static void main(String[] args) {
	
		
		//syntax
		//data_type array_name[][]=new array_name[2][2];
		
		int a[][]=new int[2][2];
		
		a[0][0]=0;
		a[0][1]=1;
		a[1][0]=2;
		a[1][1]=3;
		
		System.out.println(a[1][0]);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(a[i][j]);
			}
			
			
		}
		
		

	}

}
