public class Motorbike extends Vehicle{
	
	public Motorbike(String name, int speed) {
		super(name, speed);
	}
	
	public void move() {System.out.println("Motorbike "+name+" is driving at speed "+speed+".");}
	public void honk() {System.out.println("Motorbike "+name+" is honking.");}
}
