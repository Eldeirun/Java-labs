


public abstract class HeadOfficeEmployee extends Employee {
	String department;
	public abstract void attendMeeting();
	
	public HeadOfficeEmployee(String name, int id, String department) {
		super(name, id);
		this.department = department;
	}
}
