
public class PartTimeEmployee extends Employee {
	double hourlyRate, hoursWorked;
	
	public PartTimeEmployee(String name, String employeeID, double salary, double hourlyRate, double hoursWorked) {
		super(name, employeeID, 0);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public double calculateSalary() {
		return hourlyRate*hoursWorked;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Part-Time Employee Details");
		System.out.println("Name: "+name );
		System.out.println("ID: "+employeeID);
		System.out.println("Hourly rate: "+hourlyRate+"TL");
		System.out.println("Hours worked: "+(int)hoursWorked+" hours");
		System.out.println("Calculated Total Salary: "+calculateSalary()+"TL");
		System.out.println("Tax Rate: %"+(calculateTax(calculateSalary()))*100);
		System.out.println("Deduction Amount: "+ (calculateSalary())*(calculateTax(calculateSalary())));
		System.out.println("Remaining Salary: "+ (calculateSalary())*(1-calculateTax(calculateSalary())));
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}
