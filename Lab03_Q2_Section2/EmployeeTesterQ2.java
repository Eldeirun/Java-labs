public class EmployeeTesterQ2 {
	public static void main(String[] args) {
		/*
		Tester1
	
		String name = "NVIDIA";
		int code = 64441;
		Company nvidia = new Company(name, code);
		Employee s1 = new Employee(2025, "Ali", nvidia);
		s1.setRate1(70);
		s1.setRate1(120);
		s1.setRate2(50);
		s1.setRate3(90);
		System.out.println(s1);
		s1.displayRates();
		System.out.println();
		Company amd = new Company("AMD", 11001);
		Employee s2 = new Employee(2024, "Zeynep", amd);
		s2.setRate1(100);
		s2.setRate2(70);
		s2.setRate2(-5);
		s2.setRate3(80);
		System.out.println(s2);
		s2.displayRates();
		*/
	
		//Tester 2 below
	
		String name = "NVIDIA";
		int code = 64441;
		double scale = 4.0;
		// New variable named scale.
		Company nvidia = new Company(name, code, scale);
		Employee s1 = new Employee(2025, "Ali", nvidia);
		s1.setRate1(70);
		s1.setRate1(120);
		s1.setRate2(50);
		s1.setRate3(90);
		System.out.println(s1);
		s1.displayRates();
		System.out.println();
		Company amd = new Company("AMD", 12199, 200);
		Employee s2 = new Employee(2024, "Zeynep", amd);
		// Using update rates..
		s2.updateRates(100, 70, 80);
		s2.updateRates(100, -5, 80);
		System.out.println(s2);
		s2.displayRates();
	}

}
