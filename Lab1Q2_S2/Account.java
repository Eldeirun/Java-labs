public class Account {
	double booknumber = 0;
	String name = "";
	long accountnumber = 0;
	
	public Account(double booknumber, String name, long accountnumber) {
		this.booknumber=booknumber;
		this.name=name;
		this.accountnumber=accountnumber;
	}
	
	public double getBooknumber() {
		return booknumber;
	}

	public void setBooknumber(double booknumber) {
		this.booknumber = booknumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	
	
	
	
	
	
	public String toString() {
		String output = "Name: " + name + " , Account number: " + accountnumber + " and remaining book right: "+booknumber;
		return output;
	}

	
	
	
	
	public void changeName(String newName) {
		System.out.println("New name of the "+name+"'s account is: "+newName);
		name = newName;
	}
	
	
	
	public void newBook(int k) {
		if (k>=booknumber) {
			
		}
		
	}
	
	public void chargeFee() {
		booknumber=booknumber-2;
	}
	
	public void takebook(int t) {
		if (booknumber>t){
			newBook(t);
			System.out.println("Remaining book right "+getName()+"'s account: "+(getBooknumber()));

			
		}
		else {
			chargeFee();
			System.out.println(getName()+" can not request as many books as wants.");
		}
	}
	
	
}