
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager("Manager101",0001,"ManagementOffice");
		RandDEngineer r1 = new RandDEngineer("RandDEngineer102",0002,"Research and Development");
		RandDEngineer r2 = new RandDEngineer("RandDEngineer104",0003,"Research and Development");
		ProductionManagerAssistant pma1 = new ProductionManagerAssistant("ProductionManagerAssistant103",0004);
		ProductionManagerAssistant pma2 = new ProductionManagerAssistant("ProductionManagerAssistant105",0005);

		Employee[][] employees = {
				{m1},
				{r1},
				{pma1},
				{r2},
				{pma2}
		};
		
		((Manager)(employees[0][0])).work();
		employees[0][0].takeBreak();
		((Manager)(employees[0][0])).approveBudget();
		
		System.out.println("-----------------");
		
		((RandDEngineer)(employees[1][0])).work();
		employees[1][0].takeBreak();
		((RandDEngineer)(employees[1][0])).fixError();
		
		System.out.println("-----------------");
		
		((ProductionManagerAssistant)(employees[2][0])).work();
		employees[2][0].takeBreak();
		((ProductionManagerAssistant)(employees[2][0])).manage();
		
		System.out.println("-----------------");
		
		((RandDEngineer)(employees[3][0])).work();
		employees[3][0].takeBreak();
		((RandDEngineer)(employees[3][0])).fixError();
		
		System.out.println("-----------------");
		
		((ProductionManagerAssistant)(employees[4][0])).work();
		employees[4][0].takeBreak();
		((ProductionManagerAssistant)(employees[4][0])).manage();
		
		System.out.println("-----------------");

	}	

}
