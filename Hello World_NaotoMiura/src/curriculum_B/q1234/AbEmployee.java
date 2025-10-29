package curriculum_B.q1234;

public abstract class AbEmployee {
	
	private String employeeId;
	
	private String name;
	
	public AbEmployee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	
	public String getEmployeeId() {
		return this.employeeId;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public abstract int calculateDailyWage(int hoursWorked);

}
