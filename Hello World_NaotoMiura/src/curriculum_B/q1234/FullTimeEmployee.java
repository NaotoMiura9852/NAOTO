package curriculum_B.q1234;

public class FullTimeEmployee extends AbEmployee {
	
	private static final int HOURLY_WAGE = 1200;
	
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return hoursWorked * HOURLY_WAGE;
		}else {
			int normalHours = 8; 
			int overHours = hoursWorked - 8;
			return (normalHours * HOURLY_WAGE) + (int)(overHours * HOURLY_WAGE * 1.25);
		}
	}
	
	

}
