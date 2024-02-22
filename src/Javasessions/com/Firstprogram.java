package Javasessions.com;

public class Firstprogram {

	
	//Data Types in java:
			//strict types
			
			
			//1.Primitive Data Types
			//2.Non Primitive Data Types
		
			//1.Primitive Data Types---->built in data types 
				//a)-->1.Boolean type: boolean(true/false)
				//b-->2.Numeric type:
										//aa)character type: char
										//bb)Integral: 
											//1:Integer:->byte,short,int,long
											//2.Floating point:-->float,double
			
			
			//2.Non Primitive Data Types
					//String,Array,Interface,Abstract,classes..etc
			
	

	
	//******************************************************//
	
	
	
	
	
	
	public static void main(String[] args) {
	
			System.out.println("Welcome to Nucot");
			
			
			
			//1.Integral: 
			//1:Integer:->
			
			
			//1.byte--->1byte-->8bits
			//size:--1byte=8bits
			//range:-128 to 127
			
			//variable syntax
			//datatype variable_name;
			//byte b;
			System.out.println("This byte data type ");
			byte b;
			byte bb;
			
			//variable init
			//data_type variable_name=value;
			
			byte bbb=12;
			System.out.println(bbb);
			byte bbbb=-128;
			System.out.println(bbbb);
			byte bbbbb=127;
			System.out.println(bbbbb);
			
			System.out.println("******************************************");
			//2.short
			//size-->2bytes-->2*8=16bits
			//range-->-32768 to 32767
			System.out.println("This short data type ");
			short s=15;
			System.out.println(s);
			short ss=-32768;
			System.out.println(ss);
			short sss=32767;
			System.out.println(sss);
			
			System.out.println("******************************************");
			System.out.println("This int data type ");
			
			
			//3.int
			//size-->4bytes-->4*8=32bits
			//range-->-2147483648 to 2147483647
			
			int i=10;
			System.out.println(i);
			
			int ii=-2147483648;
			System.out.println(ii);
			
			
			int iii=2147483647;
			System.out.println(iii);
			
			
		System.out.println("******************************************");
			
			
			//4.long
			//size-->8bytes-->8*8=64bits
			//range-->-9223372036854775808 to 9223372036854775807
			System.out.println("This long data type ");
			long l=12345l;
			System.out.println(l);
			
			long ll=-9223372036854775808l;
			System.out.println(ll);
			
			
			long lll=9223372036854775807l;
			System.out.println(lll);
			
			
			
			//2.Floating point:-->float,double	
			
			//5.float
			//size-->4bytes-->4*8=32bits
			//range-->1.40239846e-45f to 3.40282347e+38f
			System.out.println("****************************** ");
			System.out.println("This float data type ");
			float f=10.00f;
			System.out.println(f);
			float ff=1.40239846e-45f;
			System.out.println(ff);
			float fff=3.40282347e+38f;
			System.out.println(fff);
			//other way to init float value
			float fffff=(float)20.0;
			System.out.println(fffff);
			
			//6.double
			//size-->8bytes-->8*8=64bits
			//range--it will take upto 15 digits
			System.out.println("****************************** ");
			System.out.println("This long data type ");
			
			double d=10.0000000;
			System.out.println(d);
			
			double dd=1222220.0000000;
			System.out.println(dd);
			
			double ddd=1666660.0000000;
			System.out.println(ddd);
			
			
			
			//7.char
			//size-->2bytes-->2*8=16bits
			
			System.out.println("****************************** ");
			System.out.println("This char data type ");
			
			char c='a';
			System.out.println(c);
			char cc='#';
			System.out.println(cc);
			char ccc='0';
			System.out.println(ccc);
			char cccc='A';
			System.out.println(cccc);
			
			//how to find the ascii value
			
			char c1='a';
			System.out.println((byte)c1);
			char cc1='#';
			System.out.println((byte)cc1);
			char ccc1='0';
			System.out.println((byte)ccc1);
			char cccc1='A';
			System.out.println((byte)cccc1);
			
			
			//8..Boolean type: boolean(true/false)
			//1bit
			
			System.out.println("****************************** ");
			System.out.println("This boolean data type ");
			
			
			boolean o=true;
			System.out.println(o);
			
			boolean oo=false;
			System.out.println(oo);
			
			
			
			
			
			
			
			
			
			
			

	}

}
