
public abstract class Applience {
	String brand;
	int wattage;
	
	public void turnOn() {System.out.println("Appliance is now on using "+wattage+" watts.");}
	public void turnOff() {System.out.println("Appliance has been turned off.");}
	
	public abstract int compareTo(Applience other);
	public abstract boolean equals(Applience other);
	
	public Applience(String brand, int wattage) {
		this.brand = brand;
		this.wattage = wattage;
	}
}
