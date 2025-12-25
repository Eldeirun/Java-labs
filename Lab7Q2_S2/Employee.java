
public abstract class Employee implements IPayment {
	
	String name;
	String employeeID;
	double salary;
	double taxRate;
	
	public abstract double calculateSalary();
	public abstract void displayEmployeeDetails();
	
	public Employee(String name, String employeeID, double salary) {
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}
	
	public double calculateTax(double salary) {
		if (salary<30000) {
			return 0.1;
			
		}
		else {
			return 0.2;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
