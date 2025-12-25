
public class PartTimeEmployee extends Employee{
    double hourlyRate, hoursWorked;

    public PartTimeEmployee(String name, int employeeID, double hourlyRate, double hoursWorked){
        super(name, employeeID, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        System.out.println(this.getClass().getSimpleName() + " method is invoked");
        return (hourlyRate*hoursWorked);
    }
    
    public void increaseHours(int value){
        System.out.println(this.getClass().getSimpleName() + " method is invoked");
        System.out.println("Inside method, addedHours = "+(value+10));
    }
}