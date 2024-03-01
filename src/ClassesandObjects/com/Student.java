package ClassesandObjects.com;

public class Student {

	//WP
	//create a method -->get StudentMarks
	//pass a parameter:StudentName
	//return the student marks
	
	public int getStudentMarks(String studentName)
	{
		System.out.println("Getting the marks for the student:-->"+studentName);
		
		
		int marks=0;
		
		if(studentName.equals("Akhila"))
		{
			marks=100;
			
			
		}
		else if(studentName.equals("Harsha"))
		{
			marks=95;
			
		}
		else if(studentName.equals("Nanda"))
		{
			marks=85;
			
		}
		else if(studentName.equals("Praveen"))
		{
			marks=75;
			
		}
		else if(studentName.equals("Shaikala"))
		{
			marks=80;
			
		}
		else if(studentName.equals("Pritham"))
		{
			marks=95;
			
		}
		else
		{
			System.out.println("Plz pass the vaild name--->"+studentName);
		}
		
		return marks;
		
		
		
	}
	
	public int getStudentMarks(int studentUSN)
	{
		System.out.println("Getting the marks for the student:-->"+studentUSN);
		
		
		int marks=0;
		
		if(studentUSN==101)
		{
			marks=100;
			
			
		}
		else if(studentUSN==102)
		{
			marks=95;
			
		}
		else if(studentUSN==103)
		{
			marks=85;
			
		}
		else if(studentUSN==104)
		{
			marks=75;
			
		}
		else if(studentUSN==105)
		{
			marks=80;
			
		}
		else if(studentUSN==106)
		{
			marks=95;
			
		}
		else
		{
			System.out.println("Plz pass the vaild name--->"+studentUSN);
		}
		
		return marks;
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Student obj=new Student();
		
	int s1=obj.getStudentMarks("Pritham");
	System.out.println(s1);
	
	
	int s2=obj.getStudentMarks("Praveen");
	System.out.println(s2);
	
	int s3=obj.getStudentMarks("Akhila");
	System.out.println(s3);
	
	int s4=obj.getStudentMarks("abc");
	System.out.println(s4);
	
	//getting marks by usn
	
	int result=obj.getStudentMarks(104);
	System.out.println(result);
	
	
	
	
	
		

	}

}
