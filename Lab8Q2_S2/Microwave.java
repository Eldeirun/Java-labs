
public class Microwave extends Applience{
	int volume;
	boolean hasGrillMode;
	
	public void turnOn() {System.out.println("Microwave “"+brand+"” is heating using "+wattage+" watts." );}
	public void defrost() {System.out.println("Microwave “"+brand+"” is defrosting food.");}

	public Microwave(String brand, int wattage, int volume, boolean hasGrillMode) {
		super(brand, wattage);
		this.volume = volume;
		this.hasGrillMode = hasGrillMode;
	}
	
	public int compareTo(Applience aother) {
		Microwave other = (Microwave)aother;
		if(other.volume>volume) {return -1;}
		else if (other.volume<volume) {return 1;}
		else {return 0;}
	}
	
	public boolean equals(Applience aother) {
		Microwave other = (Microwave)aother;
		if (other.brand == brand && other.wattage == wattage && other.volume == volume && other.hasGrillMode == hasGrillMode) {return true;}
		else {return false;}
	}
}
