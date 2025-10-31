package curriculum_B.q6;

public class PartTimeEmployee6 extends AbEmployee6{
	
public PartTimeEmployee6(String id, String name) {
		
		super(id, name);
		
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		int Normal = 1000;
		int dailyWage = hoursWorked * Normal;
		
		return dailyWage;
	}

}
