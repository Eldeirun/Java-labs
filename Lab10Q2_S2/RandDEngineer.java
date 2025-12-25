

public class RandDEngineer extends HeadOfficeEmployee {
	public void work() {System.out.println("RandDEngineer "+name+" is designing for the "+department+" department.");}
	public void attendMeeting() {System.out.println("RandDEngineer "+name+" is attending a technical meeting.");}
	public void fixError() {System.out.println("RandDEngineer "+name+" fixed an error.");}
	
	public RandDEngineer(String name, int id, String department) {
		super(name, id, department);
	}
}
