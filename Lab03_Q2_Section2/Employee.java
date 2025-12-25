public class Employee {
	String name;
	Company c = new Company ("Placeholder", 0000, 1.0);
	double rate1, rate2, rate3, score;
	int year;
	Double score2 = new Double(score);
	Integer yearstring = new Integer(year);

	
	
	public Employee(int year, String name, Company c) {
		this.name = name;
		this.c = c;
		rate1 = 0;
		rate2 = 0;
		rate3 = 0;
		score = 0;
		this.year = year;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getC() {
		return c;
	}

	public void setC(Company c) {
		this.c = c;
	}

	public double getRate1() {
		return rate1;
	}

	public void setRate1(double set1) {
		if (set1>=0 && set1<=100) {
			rate1 = set1;
			score = ((rate1 + rate2 + rate3)/3);

		}
		else {
			System.out.println("Rate1 value has to be between 0-100");
		}
		
	}

	public double getRate2() {
		return rate2;
	}

	public void setRate2(double set2) {
		if (set2>=0 && set2<=100) {
			rate2 = set2;
			score = ((rate1 + rate2 + rate3)/3);

		}
		else {
			System.out.println("Rate2 value has to be between 0-100");
		}
	}

	public double getRate3() {
		return rate3;
	}

	public void setRate3(double set3) {
		if (set3>=0 && set3<=100) {
			rate3 = set3;
			score = ((rate1 + rate2 + rate3)/3);
		}
		else {
			System.out.println("Rate3 value has to be between 0-100");
		}
	}
	
	public void updateRates(double upd1, double upd2, double upd3) {
		if (upd1>=0 && upd1<=100) {
		    rate1 = upd1;
		    score = ((rate1 + rate2 + rate3)/3);
			if (upd2>=0 && upd2<=100) {
			    rate2 = upd2;
		        score = ((rate1 + rate2 + rate3)/3);
				if (upd3>=0 && upd3<=100) {
					rate3 = upd3;
		            score = ((rate1 + rate2 + rate3)/3);
					

					score = ((rate1 + rate2 + rate3)/3);
				}
				else {
					System.out.println("Rate3 value has to be between 0-100");
				}
			}
			else {
				System.out.println("Rate2 value has to be between 0-100");
			}
		}
		else {
			System.out.println("Rate1 value has to be between 0-100");
		}
		
	}

	public double getScore() {
		return (score/(100/c.scale));
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayRates() {
		System.out.print("Rate1: " + rate1);
		System.out.print(" Rate2: " +rate2);
		System.out.print(" Rate3: " +rate3);
		System.out.print(" Score: " +(score/(100/c.scale)));
	}
	
	public String toString() {
		String display = "Name: "+name +" Company: " + c.name + " Employee Number: " + (year+""+c.code)+ " Score: " + (score/(100/c.scale));
		return display;
	}
	
}
