
public class UpdateEmployee {
	static String answer;

	public static void updateTool() {
		do {
			System.out.println("What information would you like to update?");
			System.out.println();
			System.out.println("1. First name\n2. Lastname\n3. Date of Birth\n4. Salary");
			int caseNumber = UserInterface.readNumber();

			switch (caseNumber) {
			case 1:
				updateFirstname();
				break;
			case 2:
				updateLastName();
				break;
			case 3:
				updateDateOfBirth();
				break;
			case 4:
				updateSalary();

			}
			System.out.println("Do you want to continue updating? (Y/N)");
			answer = UserInterface.readText();
		} while (answer.equalsIgnoreCase("Y"));
		
		int num = UserInterface.employeeManagementMenu();
		EmployeeManagement.takeCareOfEmployee(num);	}

	public static void updateFirstname() {
		System.out.println("Please provide the employee's id number!");
		int idNumber = UserInterface.readNumber();
		
		boolean foundIt = false;
		for (Employee e : MainEMS.employee1) {
			if (e.getId() == (idNumber)) {
				System.out.println("Please provide the employee's new first name.");
				String newFirstName = UserInterface.readText();
				e.setFirstName(newFirstName);
				foundIt = true;
				break;
			}}

			if (foundIt == true)
				System.out.println("Employee information updated!");
			else {
				System.out.println("Invalid id!");
			}
		
	}

	public static void updateLastName() {

		System.out.println("Please provide the employee's id number!");
		int idNumber = UserInterface.readNumber();
		
		boolean foundIt = false;
		for (Employee e : MainEMS.employee1) {
			if (e.getId() == (idNumber)) {
				System.out.println("Please provide the employee's new lastname?");
				String newLastName = UserInterface.readText();
				e.setLastName(newLastName);
				foundIt = true;
				break;
			}

		}

		if (foundIt == true)
			System.out.println("Employee information updated!");
		else {
			System.out.println("Invalid id!");
		}

	}

	public static void updateDateOfBirth() {
		System.out.println("Please provide the employee's id number!");
		int idNumber = UserInterface.readNumber();
		
		boolean foundIt = false;
		for (Employee e : MainEMS.employee1) {
			if (e.getId() == (idNumber)) {
				System.out.println("Please provide the employee's new date of birth?");
				String newDateOfBirth = UserInterface.readText();
				e.setDateOfBirth(newDateOfBirth);
				foundIt = true;
				break;
			}

		}

		if (foundIt == true)
			System.out.println("Employee information updated!");
		else {
			System.out.println("Invalid id!");
		}

	}

	public static void updateSalary() {

		System.out.println("Please provide the employee's id number!");
		int idNumber = UserInterface.readNumber();

		
		boolean foundIt = false;
		for (Employee e : MainEMS.employee1) {
			if (e.getId() == (idNumber)) {
				System.out.println("Please provide the employee's new salary?");
				int newSalary = UserInterface.readNumber();
				e.setSalary(newSalary);
				foundIt = true;
				break;
			}

		}

		if (foundIt == true)
			System.out.println("Employee information updated!");
		else {
			System.out.println("Invalid id!");
		}

	}
}