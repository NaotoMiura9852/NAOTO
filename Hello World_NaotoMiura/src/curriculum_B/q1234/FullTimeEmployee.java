package curriculum_B.q1234;

public class FullTimeEmployee extends AbEmployee {
	
	private static final int Hourly_Wage = 1200;
	
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return hoursWorked * Hourly_Wage;
		}else {
			int normalHours = 8; 
			int overHours = hoursWorked - 8;
			return (normalHours * Hourly_Wage) + (int)(overHours * Hourly_Wage * 1.25);
		}
	}
	
	

}
