
public class AddEmployee {

	static String answer;

	public static void add() {

		do {
			System.out.println("Input firstname.");
			String firstName = UserInterface.readText();
			System.out.println("Input lastname.");
			String lastName = UserInterface.readText();
			System.out.println("Input gender: 1. female, 2. male, 3. unknown");
			int gender = UserInterface.readNumber();
			System.out.println("Input birth date.");
			String dateOfBirth = UserInterface.readText();
			System.out.println("Input salary.");
			int salary = UserInterface.readNumber();
			System.out.println("Input company phone. If yes type true else false.");
			boolean companyPhone = UserInterface.readBoolean();
			System.out.println("Input occupation: 1. programmer, 2. technician, 3. administrator");
			int occupation = UserInterface.readNumber();

			switch (occupation) {
			case 1:
				Programmer programmer = new Programmer(firstName, lastName, dateOfBirth, salary, gender, companyPhone);
				MainEMS.employee1.add(programmer);
				break;
			case 2:
				Technician technician = new Technician(firstName, lastName, dateOfBirth, salary, gender, companyPhone);
				MainEMS.employee1.add(technician);
				break;
			case 3:
				Administrator administrator = new Administrator(firstName, lastName, dateOfBirth, salary, gender,
						companyPhone);
				MainEMS.employee1.add(administrator);
				break;
			}

			System.out.println("Employee added!");
			//System.out.println(MainEMS.employee1.toString());
			System.out.println("Do you want to add another employee? (Y/N)");
			answer = UserInterface.readText();

		} while (answer.equalsIgnoreCase("y"));
		
		int num = UserInterface.employeeManagementMenu();
		EmployeeManagement.takeCareOfEmployee(num);
		
	}

}