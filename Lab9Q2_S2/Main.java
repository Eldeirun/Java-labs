public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Truck t1 = new Truck("TruckObject1",20);
		Truck t2 = new Truck("TruckObject2",10);
		
		Motorbike m1 = new Motorbike("MotorbikeObject1",50);
		Motorbike m2 = new Motorbike("MotorbikeObject2",40);
		
		Vehicle[] vehicles = {t1,t2,m1,m2};
		
		vehicles[0].move();
		vehicles[0].stop();
		((Truck)vehicles[0]).honk();
		
		vehicles[1].move();
		vehicles[1].stop();
		((Truck)vehicles[1]).honk();
		
		vehicles[2].move();
		vehicles[2].stop();
		((Motorbike)vehicles[2]).honk();
		
		vehicles[3].move();
		vehicles[3].stop();
		((Motorbike)vehicles[3]).honk();
	}

}
