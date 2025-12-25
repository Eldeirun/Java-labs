public abstract class Vehicle {
	String name;
	int speed;
	
	void move() {System.out.println("Vehicle is moving at speed "+ speed+".");}
	void stop() {System.out.println("Vehicle has stopped.");}
	
	public Vehicle (String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
}
