
public class FullTimeEmployee extends Employee {
	double benefits;
    double hourlyPay = salary / 160;

	double overtimeHours;
	public FullTimeEmployee(String name, String employeeID, double salary, double benefits) {
		super(name, employeeID, salary);
		this.benefits = benefits;
	}
	
	
	public double calculateSalary(){
		return salary+benefits;
	}
	
	public double calculateSalary(double overtimeHours) {
		return salary + (hourlyPay*overtimeHours);
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Full-Time Employee Details");
		System.out.println("Name: "+name );
		System.out.println("ID: "+employeeID);
		System.out.println("Benefits: "+benefits);
		System.out.println("Calculated Total Salary: "+calculateSalary()+"TL");
		if (overtimeHours> 0) {
			System.out.println("Overtime Pay For "+ overtimeHours+" Hours: "+(hourlyPay*overtimeHours));
		}
		System.out.println("Tax Rate: %"+(calculateTax(calculateSalary(overtimeHours)))*100);
		System.out.println("Deduction amount: "+(calculateSalary(overtimeHours)*(calculateTax(calculateSalary(overtimeHours)))));
		System.out.println("Remaining Salary: "+calculateSalary(overtimeHours));
		System.out.println();
		
	
		
	}

	public double getBenefits() {
		return benefits;
	}

	public void setBenefits(double benefits) {
		this.benefits = benefits;
	}
}
