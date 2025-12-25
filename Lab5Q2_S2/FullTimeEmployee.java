

public class FullTimeEmployee extends Employee{
    double benefits;

    public FullTimeEmployee(String name, int employeeID, double baseSalary, double benefits){
        super(name, employeeID, baseSalary);
        this.benefits = benefits;
    }

    @Override
    public double calculateSalary(){
        System.out.println(this.getClass().getSimpleName() + " method is invoked");
        return (baseSalary+benefits);
    }

    public boolean isSameEmployee(Employee e){
        System.out.println(this.getClass().getSimpleName() + " method is invoked");
        if ((employeeID==e.employeeID)){
            if(name.compareTo(e.name)==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}