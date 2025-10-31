package curriculum_B.q1234;

public class PartTimeEmployee extends AbEmployee {
	
	private static final int Hourly_Wage = 1000;
	
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}
	
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * Hourly_Wage;
	}

}
