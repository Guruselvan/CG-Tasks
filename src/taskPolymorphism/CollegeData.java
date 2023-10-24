package taskPolymorphism;
//Method Overloading Pgrm:

public class CollegeData extends School {
	
	public void studInfo(int rollNo,int adNo) {
		System.out.println("Stud RollNo : " + rollNo);
		System.out.println("Stud AdNo : "+ adNo);
	}
	
	public void studInfo(String name) {
		System.out.println("Stud Name : "+name);
	}
	public void studInfo(String city,int pinCode) {
		System.out.println("Stud City : "+city + "Stud Pin : " + pinCode);
	}
	//Method Overriding Execution:
	//Below declare from School class & Override
	public void studDetails(String name) {
		System.out.println("Stud name is "+ name);
	}
	public void studDetails(char i,int roll) {
		System.out.println("stud Start "+ i);
		System.out.println("Stud RollNo "+ roll);
	}
	public static void main(String[]args) {
		CollegeData c= new CollegeData();
		c.studInfo("Leo");
		c.studInfo(07, 19);
		c.studInfo("CDM", 608007);
		//Method Overriding calling
		c.studDetails("Stand");
		c.studDetails('R', 20);
		

	}
}
