
public class EmployeeStatistics {

	public static void employeeStats(int num) {

		switch (num) {
		case 1:
			System.out.println("The average salary is: " + StatisticsHelper.averageSalary()+" SEK");
			break;
		case 2:
			System.out.println("The maximum salary is: " + StatisticsHelper.maxSalary()+" SEK");
			break;
		case 3:
			System.out.println("The minimum salary is: " + StatisticsHelper.minSalary()+" SEK");
			break;
		case 4:
			System.out.println("The total bonus is: " + StatisticsHelper.totalBonus()+" SEK");
			break;
		case 5:
			System.out.println("The percentage of women is: " + StatisticsHelper.womenPercentage()+" %");
			break;
		case 0:
			MainEMS.runMain();
		}
		System.out.println("");
		num = UserInterface.employeeStatisticsMenu();
		EmployeeStatistics.employeeStats(num);

	}

}
