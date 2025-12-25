

public class Employee{
    String name;
    int employeeID;
    double baseSalary;

    public Employee(String name, int employeeID, double baseSalary){
        this.name = name;
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
    }
    
    public double calculateSalary(){
        System.out.println(this.getClass().getSimpleName() + " method is invoked");
        return baseSalary;
    }

    public double calculateSalary(double bonus){
        System.out.println(this.getClass().getSimpleName() + " method is invoked");
        return (baseSalary+bonus);
    }

    public void displayEmployeeDetails(){
        System.out.println(this.getClass().getSimpleName() + " method is invoked");
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Base Salary: "+baseSalary);
    }

}