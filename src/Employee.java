
public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int salary;
	private int gender;
	private int id;
	private boolean companyPhone;
	private int bonus;
	
	static int numberOfEmployees;
	
	public Employee(String firstName, String lastName, String dateOfBirth, int salary, int gender, boolean companyPhone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
		this.gender = gender;
		numberOfEmployees++;
		this.id = numberOfEmployees;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isCompanyPhone() {
		return companyPhone;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public int getGender() {
		return gender;
	}

	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public int getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}
	
	public int getBonus() {
		return bonus;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public abstract int calculateBonus(int salary);

}
	
	
