
public class DeleteEmployee {

	public static void deleteEmployee() {
		String answer;
		
		do {
		System.out.println("Please provide the employee's id number!");
		int idNumber = UserInterface.readNumber();

		boolean foundIt = false;
		Employee bardia = null;
		for (Employee e : MainEMS.employee1) {
			if (e.getId() == (idNumber)) {
				foundIt = true;
				System.out.println("Are you sure you want to delete? (Y/N)");
				answer = UserInterface.readText();
				if (answer.equalsIgnoreCase("Y")) {
					bardia = e;
					System.out.println("Employee deleted!");
					System.out.println();

				} 
			}
		}
		MainEMS.employee1.remove(bardia);
		if(foundIt == false){
			System.out.println("ID " + idNumber +" not found.");
		}
		System.out.println("Do you want to delete another employee? (Y/N)");
		answer = UserInterface.readText();

	} while (answer.equalsIgnoreCase("y"));
		
		int num = UserInterface.employeeManagementMenu();
		EmployeeManagement.takeCareOfEmployee(num);

}

}

