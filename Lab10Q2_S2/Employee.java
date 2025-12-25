

public class Employee {
	String name;
	int id;
	
	public void work() {System.out.println("Employee "+name+" is working.");}
	public void takeBreak() {System.out.println("Employee "+ name +" is taking a break.");}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

