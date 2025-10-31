package curriculum_B.q5;

public class FullTimeEmployee5 extends AbEmployee5{
	
	public FullTimeEmployee5(String id, String name) {				
		super(id, name);				
		}				
		@Override				
		public int calculateDailyWage(int hoursWorked) {				
		int HOURLY_RATE = 1250;				
		int overtime = Math.max(0, hoursWorked - 8);				
		int regularHours = hoursWorked - overtime;				
		return (regularHours * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);				
		}				

}
