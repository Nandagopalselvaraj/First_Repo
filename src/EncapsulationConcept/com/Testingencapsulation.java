package EncapsulationConcept.com;

public class Testingencapsulation {

	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.name);
		System.out.println(obj.account_number);
		//System.out.println(obj.atmpin);
		
		
		String name=obj.name="Nucot";
		System.out.println(name);
		
		int acc=obj.account_number=123;
		System.out.println(acc);
		
		//int atm=obj.atmpin=333;
		//System.out.println(atm);
		
		
		
		
		
		
		obj.setAtmpin(666);
		
		obj.getAtmpin();
		
		
		
		
		
		
		
	}

}
