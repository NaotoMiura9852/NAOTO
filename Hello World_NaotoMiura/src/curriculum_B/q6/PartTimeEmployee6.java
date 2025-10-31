package curriculum_B.q6;

public class PartTimeEmployee6 extends AbEmployee6{
	
public PartTimeEmployee6(String id, String name) {
		
		super(id, name);
		
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		int NORMAL = 1000;
		int dailyWage = hoursWorked * NORMAL;
		
		return dailyWage;
	}

}
