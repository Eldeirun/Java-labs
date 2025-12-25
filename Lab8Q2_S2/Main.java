import java.util.LinkedList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		LinkedList<Applience> appli = new LinkedList<Applience>();
		
		int listcount = 0;
		
		System.out.println("1. Store a new appliance");
		System.out.println("2. Delete the appliance");
		System.out.println("3. Display all appliances");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
		
		int input = keyboard.nextInt();
		
		switch (input) {
			case 1:
				System.out.println("Enter appliance type (1 = Washer, 2 = Microwave): ");
				int input2 = keyboard.nextInt();
				if (input2 == 1) {
					
					System.out.print("Enter brand: ");
					String b = keyboard.nextLine();
					System.out.print("Enter wattage: ");
					int w = keyboard.nextInt();
					System.out.print("Enter capacity: ");
					int c = keyboard.nextInt();
					System.out.print("Enter water usage: ");
					double wu = keyboard.nextDouble();
					System.out.print("Has dryer function? (true/false): ");
					boolean df = keyboard.nextBoolean();
					
					Washer washer = new Washer(b,w,c,wu,df);
					appli.add(washer);
					System.out.println("Appliance added syccessfully.");
					listcount++;
				}
				else if (input2 == 2) {
					System.out.print("Enter brand: ");
					String b = keyboard.nextLine();
					System.out.print("Enter wattage: ");
					int w = keyboard.nextInt();
					System.out.print("Enter volume: ");
					int v = keyboard.nextInt();
					System.out.print("Has grill mode? (true/false): ");
					boolean gm = keyboard.nextBoolean();
					
					Microwave microwave = new Microwave(b,w,v,gm);
					appli.add(microwave);
					System.out.println("Appliance added syccessfully.");
					listcount++;

				}
			
			case 2:
				System.out.println("Enter appliance type (1 = Washer, 2 = Microwave): ");
				int input3 = keyboard.nextInt();
				if (input3 == 1) {
					
					System.out.print("Enter brand: ");
					String b = keyboard.nextLine();
					System.out.print("Enter wattage: ");
					int w = keyboard.nextInt();
					System.out.print("Enter capacity: ");
					int c = keyboard.nextInt();
					System.out.print("Enter water usage: ");
					double wu = keyboard.nextDouble();
					System.out.print("Has dryer function? (true/false): ");
					boolean df = keyboard.nextBoolean();
					
					Washer buffer = new Washer (b,w,c,wu,df);
					
					for (int i=0; i<listcount;i++) {
						if(buffer.equals(appli.get(i))) {
							appli.remove(i);
							System.out.println("Appliance deleted successfully.");
							listcount -=1;
						}
					}
				}
				else if (input3 == 2) {
					System.out.print("Enter brand: ");
					String b = keyboard.nextLine();
					System.out.print("Enter wattage: ");
					int w = keyboard.nextInt();
					System.out.print("Enter volume: ");
					int v = keyboard.nextInt();
					System.out.print("Has grill mode? (true/false): ");
					boolean gm = keyboard.nextBoolean();
					
					Microwave buffer = new Microwave(b,w,v,gm);
					for (int i=0; i<listcount;i++) {
						if(buffer.equals(appli.get(i))) {
							appli.remove(i);
							System.out.println("Appliance deleted successfully.");
							listcount -=1;
						}
					}

		}
			case 3:
				for (int i=0; i<listcount;i++) {
					appli.get(i).toString();
				}
			/*
			case 4:
			    for (int i=1; i<listcount; i++){
			        if (appli.get(i).volume<appli.get(i-1)){
    			        Washer max = appli.get (i-1);
			        }
			        else{
			            Washer max = appli.get(i);
			        }
			    }
			    */
		/*
		appli.add(w);
		appli.add(m);
		
		appli.get(0).turnOn();
		appli.get(1).turnOn();
		((Washer) appli.get(0)).spin();
		((Microwave) appli.get(1)).defrost();
		appli.get(0).turnOff();
		appli.get(1).turnOff();
		*/
	}

}
}
