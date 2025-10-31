package curriculum_B.q6;

public class FullTimeEmployee6 extends AbEmployee6{
	
	public FullTimeEmployee6(String id, String name) {
		
		super(id, name);
		
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		int Normal = 1250;
		int dailyWage;
		if (hoursWorked <= 8) {
			dailyWage = hoursWorked * Normal;
		}else {
			dailyWage = 8 * Normal + (int)((hoursWorked - 8) * Normal * 1.25);
		}
		
		return dailyWage;
	}
	

}
