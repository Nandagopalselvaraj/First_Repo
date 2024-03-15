package EncapsulationConcept.com;

public class EncapsulationDemo {

	
	String name="Modi";
	int account_number=12345;
	private int atmpin=222;
	
	public int getAtmpin() {
		return atmpin;
	}


	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
		System.out.println(this.atmpin);
	}



















	public static void main(String[] args) {
		
		EncapsulationDemo  obj=new EncapsulationDemo();
		System.out.println(obj.name);
		System.out.println(obj.account_number);
		System.out.println(obj.atmpin);
		
		
		String name=obj.name="Nucot";
		System.out.println(name);
		
		int acc=obj.account_number=123;
		System.out.println(acc);
		int atm=obj.atmpin=333;
		System.out.println(atm);
		
		

	}

}
