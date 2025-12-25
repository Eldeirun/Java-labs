public class DVD {
	int DVD_ID;
	String DVD_name;
	int year;
	int sell;
	
	public DVD(int DVD_ID, String DVD_name, int year, int sell) {
		this.DVD_ID = DVD_ID;
		this.DVD_name = DVD_name;
		this.year = year;
		this.sell = sell;
	}
	
	public void showknowledge() {
		System.out.println("DVD ID: "+DVD_ID+" DVD name: "+DVD_name+" Publishing year: "+year+" How many customer but the DVD:"+sell);
		System.out.print("Percentage of success: "+(sell/((2025-year)*1000)));
	}
}
