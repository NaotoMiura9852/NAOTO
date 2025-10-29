package curriculum_B.q1234;

public class FullTimeEmployee extends AbEmployee {
	
	private static final int hourlyWage = 1200;
	
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return hoursWorked * hourlyWage;
		}else {
			int normalHours = 8; 
			int overHours = hoursWorked - 8;
			return (normalHours * hourlyWage) + (int)(overHours * hourlyWage * 1.25);
		}
	}
	
	

}
