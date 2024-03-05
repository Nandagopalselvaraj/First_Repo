package ClassesandObjects.com;

public class StudentDemo {

	
	String name;
	int age;
	int usn;
	String address;
	int mobile;
	
	
	StudentDemo(String name,int age,int usn,String address,int contact)
	{
		
		this.name=name;
		this.age=age;
		this.usn=usn;
		this.address=address;
		mobile=contact;
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.usn);
		System.out.println(this.address);
		System.out.println(mobile);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		StudentDemo obj=new StudentDemo("Modi",20,123,"bangalore",2233);
		
		
		

	}

}
