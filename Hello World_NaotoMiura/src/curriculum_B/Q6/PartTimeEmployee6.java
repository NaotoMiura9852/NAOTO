package curriculum_B.Q6;

public class PartTimeEmployee6 extends AbEmployee6{
	
public PartTimeEmployee6(String id, String name) {
		
		super(id, name);
		
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		int normal = 1000;
		int dailyWage = hoursWorked * normal;
		
		return dailyWage;
	}

}
