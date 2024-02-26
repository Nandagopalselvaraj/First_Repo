package Javasessions.com;

public class IncrementandDecrementDemo {

	public static void main(String[] args) {
		
		//++ and --
		//Post increment ---> a++
		//pre increment	-->	++a
		
		//post decrement-->a--
		//pre decrement--->--a
		
		//Post increment ---> a++
		
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int aa=5;
		int bb=aa++;
		System.out.println(aa);//6
		System.out.println(bb);//5
		
		int aaa=-5;
		int bbb=aaa++;
		System.out.println(aaa);//-4
		System.out.println(bbb);//-5
		
		
		
		System.out.println("Pre increment");
		
		int p=1;
		int q=++p;
		System.out.println(p);//2
		System.out.println(q);//2
		
		
		int pp=5;
		int qq=++pp;
		System.out.println(pp);//6
		System.out.println(qq);//6
		
		
		int ppp=-5;
		int qqq=++ppp;
		System.out.println(ppp);//6
		System.out.println(qqq);//6
		
		
		System.out.println("Post decrement");
		
		
		int d=6;
		int e=d--;
		System.out.println(d);//5
		System.out.println(e);//6
		
		
		int dd=-6;
		int ee=dd--;
		System.out.println(dd);//-7
		System.out.println(ee);//-6
		
		
		System.out.println("Pre decrement");
		
		
		int u=6;
		int v=--u;
		System.out.println(u);//5
		System.out.println(v);//5
		
		
		
		
		
		
		

	}

}
