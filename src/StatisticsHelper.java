public class StatisticsHelper {

	public static double averageSalary() {
		double averageSalary;
		double sum = 0;

		for (Employee e : MainEMS.employee1) {
			sum += e.getSalary();
		}
		averageSalary = sum / MainEMS.employee1.size();
		return averageSalary;
	}

	public static int maxSalary() {
		int max = MainEMS.employee1.get(0).getSalary();

		for (Employee e : MainEMS.employee1) {
			if (e.getSalary() > max) {
				max = e.getSalary();
			}
		}
		return max;
	}

	public static int minSalary() {
		int min = MainEMS.employee1.get(0).getSalary();

		for (Employee e : MainEMS.employee1) {
			if (e.getSalary() < min) {
				min = e.getSalary();
			}
		}
		return min;
	}

	public static int totalBonus() {
		int totalBonus = 0;

		for (Employee e : MainEMS.employee1) {
			totalBonus = totalBonus + e.calculateBonus(e.getSalary());
		}
		return totalBonus;
	}
	
	public static int womenPercentage() {
		int womenNum = 0;
		for (Employee e : MainEMS.employee1) {
			if (e.getGender()==1)
				++womenNum;
		}
			double percentage = ((double)womenNum / MainEMS.employee1.size()) * 100;
		return (int) percentage;
	}
	
}
