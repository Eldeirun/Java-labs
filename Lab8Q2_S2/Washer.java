
public class Washer extends Applience{
	int capacity;
	double waterUsage;
	boolean hasDryerFunction;
	
	public void turnOn() {System.out.println("Washer “"+brand+"” is washing using "+wattage+" watts.");}
	public void spin() {System.out.println("Washer “"+brand+"” is spinning clothes.");}

	public Washer(String brand, int wattage, int capacity, double waterUsage, boolean hasDryerFunction) {
		super(brand, wattage);
		this.capacity = capacity;
		this.waterUsage = waterUsage;
		this.hasDryerFunction = hasDryerFunction;
	}
	
	public int compareTo(Applience aother) {
		Washer other = (Washer)aother;
		if (other.capacity>capacity) {return -1;}
		else if (other.capacity<capacity) {return 1;}
		else {return 0;}
	}
	
	public boolean equals(Applience aother) {
		Washer other = (Washer)aother;
		if(other.brand == brand && other.wattage == wattage && other.capacity == capacity && other.waterUsage ==waterUsage && other.hasDryerFunction == hasDryerFunction) {return true;}
		else {return false;}
	}
}
