public class TestQ1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 1001, 3000);
        FullTimeEmployee full = new FullTimeEmployee("Bob", 1002, 3500, 500);
        PartTimeEmployee part = new PartTimeEmployee("Carol", 1003, 40, 100);
        System.out.println("- Employee");
        emp.displayEmployeeDetails();
        System.out.println("Salary: " + emp.calculateSalary());
        System.out.println("Salary with bonus: " + emp.calculateSalary(200));
        System.out.println("\n- FullTimeEmployee");
        full.displayEmployeeDetails();
        System.out.println("Salary: " + full.calculateSalary());
        FullTimeEmployee full2 = new FullTimeEmployee("Bob", 1002, 3500, 600);
        System.out.println("Same employee? " + full.isSameEmployee(full2));
        System.out.println("\n- PartTimeEmployee");
        part.displayEmployeeDetails();
        System.out.println("Salary: " + part.calculateSalary());
        int extra = 5;
        part.increaseHours(extra);
        System.out.println("After method, extra = " + extra);
    }
}