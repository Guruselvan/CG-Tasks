package taskPolymorphism;

public class School {
	
	public void studDetails(int rollNo) {
		System.out.println("Stud RollNo " + rollNo);
	}
	public void studDetails(String name,String Clz) {
		System.out.println("Stud Name "+ name);
		System.out.println("Stud Rollno "+ Clz);
	}
}
