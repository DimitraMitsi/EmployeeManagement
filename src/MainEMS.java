import java.util.ArrayList;
import java.util.Scanner;

public class MainEMS {

	static ArrayList<Employee> employee1 = new ArrayList<>();

	public static void main(String[] args) {

		/* adding some employees */ employee1.add(new Programmer("Tom", "Boll", "850328", 30000, 2, false)); employee1.add(new Technician("Paul", "Pot", "790728", 200, 3, true));	employee1.add(new Programmer("Pia", "Lim", "900428", 35000, 1, false)); employee1.add(new Administrator("Ann", "Kan", "790328", 40000, 1, true));

		runMain();
		System.out.println("Goodbye!");
	}
		
		public static void runMain(){
		
		boolean loop = true;

		while (loop) {

			int choice = UserInterface.mainMenu();

			switch (choice) {
			case 1:
				int num = UserInterface.employeeManagementMenu();
				EmployeeManagement.takeCareOfEmployee(num);

				break;
			case 2:
				num = UserInterface.employeeStatisticsMenu();
				EmployeeStatistics.employeeStats(num);
				break;
			case 0:
				loop = false;
			}
		}
	
	}
}