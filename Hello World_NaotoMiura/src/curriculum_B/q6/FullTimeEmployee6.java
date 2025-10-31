package curriculum_B.q6;

public class FullTimeEmployee6 extends AbEmployee6{
	
	public FullTimeEmployee6(String id, String name) {
		
		super(id, name);
		
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		final int NORMAL = 1250;
		int dailyWage;
		if (hoursWorked <= 8) {
			dailyWage = hoursWorked * NORMAL;
		}else {
			dailyWage = 8 * NORMAL + (int)((hoursWorked - 8) * NORMAL * 1.25);
		}
		
		return dailyWage;
	}
	

}
