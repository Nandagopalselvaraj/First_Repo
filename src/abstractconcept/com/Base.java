package abstractconcept.com;



abstract class Sunstar
{
    abstract void printInfo();
}
 
// Abstraction performed using extends
class Employee extends Sunstar {
    void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}



public class Base {

	public static void main(String[] args) {
		Employee obj =new Employee();
		obj.printInfo();

	}

}
