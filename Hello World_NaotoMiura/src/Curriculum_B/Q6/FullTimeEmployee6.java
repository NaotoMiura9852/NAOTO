package Curriculum_B.Q6;

public class FullTimeEmployee6 extends AbEmployee6{
	
	public FullTimeEmployee6(String id, String name) {
		
		super(id, name);
		
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		int normal = 1250;
		int dailyWage;
		if (hoursWorked <= 8) {
			dailyWage = hoursWorked * normal;
		}else {
			dailyWage = 8 * normal + (int)((hoursWorked - 8) * normal * 1.25);
		}
		
		return dailyWage;
	}
	

}
