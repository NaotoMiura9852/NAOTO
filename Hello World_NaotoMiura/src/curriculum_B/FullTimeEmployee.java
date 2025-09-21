package curriculum_B;

public class FullTimeEmployee extends abEmployee {
	
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
