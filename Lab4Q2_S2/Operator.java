import java.util.*;
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		DVD[] data=new DVD [5];
		int counter=0;
		for (int i=0;i<3;i++) {
		System.out.println("Enter ID number of DVD:");
		int DVD_ID=scan.nextInt();
		System.out.println("Enter DVD name:");
		String name=scan.next();
		System.out.println("Publishing year of DVD:");
		int year=scan.nextInt();
		System.out.println("How many customer bought the DVD:");
		int sell=scan.nextInt();
		data[counter]= new DVD(DVD_ID,name,year,sell);
		counter=counter+1;
		}
		System.out.print("Welcome to Database");
		// add features of question 2.
		
		System.out.println("Function menu:");
		System.out.println("1) Add DVD");
		System.out.println("2) Show knowledge");
		System.out.println("3) Search data from name");
		System.out.println("4) Exit program");
		System.out.println("The selected menu is :");
		int input = scan.nextInt();
		
		while (input!=4) {
			if (input==1) {
				if (counter!=5) {
				    Scanner keyboard = new Scanner(System.in);
					System.out.println("Enter ID number of DVD:");
				    int DVD_ID=scan.nextInt();
					System.out.println("Enter DVD name:");
					String name=scan.nextLine();
					System.out.println("Publishing year of DVD:");
					int year=scan.nextInt();
					System.out.println("How many customer bought the DVD:");
					int sell=keyboard.nextInt();
					data[counter]= new DVD(DVD_ID,name,year,sell);
					counter=counter+1;
				}
				else {
					System.out.print("The storage limit is full. You can not store any additional DVD data");
				}
			}
			else if (input==2) {
				for (int i=0; i<data.length;i++) {
					data[i].showknowledge();
				}
			}
			else if (input==3) {
				System.out.println("Enter name:");
				String search = scan.nextLine();
				boolean found=false;
				for (int i=0; i<data.length;i++) {
					if(data[i].DVD_name.equals(search)) {
						data[i].showknowledge();
						found=true;
					}
					else {
						found=false;
					}
				}
				if (found==false) {
					System.out.println("Data is not found.");
				}
			}
			else if (input==4) {
				
			}
			
		}
	}

}
