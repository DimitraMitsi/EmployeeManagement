import java.util.Scanner;

public class UserInterface {

	static Scanner scanner = new Scanner(System.in);
	static String stringChoice;

	public static int mainMenu() {
		System.out.println("Welcome to the Employee Management System.");
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1. Employee Management");
		System.out.println("2. Employee Statistics");
		System.out.println("0. Exit");
		int choice = readNumber();
		return choice;
	}

	public static int employeeManagementMenu() {
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1. Add employee");
		System.out.println("2. Delete employee");
		System.out.println("3. Update employee information");
		System.out.println("0. Return to Main Menu");
		int choice = readNumber();
		return choice;
	}

	public static int employeeStatisticsMenu() {
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1. Calculate average salary");
		System.out.println("2. Return maximum salary in the company");
		System.out.println("3. Return minimum salary in the company");
		System.out.println("4. Calculate total bonus in the company");
		System.out.println("5. Calculate the percentage of women in the company");
		System.out.println("0. Return to Main Menu");
		int choice = readNumber();
		return choice;
	}

	public static int readNumber() {
		int intChoice = scanner.nextInt();
		scanner.nextLine();
		return intChoice;
	}

	public static String readText() {
		stringChoice = scanner.nextLine();
		return stringChoice;
	}

	public static boolean readBoolean() {
		boolean booleanChoice = scanner.nextBoolean();
		scanner.nextLine();
		return booleanChoice;
	}

}
