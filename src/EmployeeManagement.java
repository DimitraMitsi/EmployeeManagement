
public class EmployeeManagement {

	public static void takeCareOfEmployee(int num) {

		switch (num) {
		case 1:
			AddEmployee.add();
			break;
		case 2:
			DeleteEmployee.deleteEmployee();
			break;
		case 3:
			UpdateEmployee.updateTool();
			break;
		case 0: {
			MainEMS.runMain();
			}
		}
		

	}
}