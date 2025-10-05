package curriculum_B.Q1234;

public class PartTimeEmployee extends abEmployee {
	
	private static final int hourlyWage = 1000;
	
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * hourlyWage;
	}

}
