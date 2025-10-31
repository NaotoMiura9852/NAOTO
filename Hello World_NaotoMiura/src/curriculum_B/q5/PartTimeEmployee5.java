package curriculum_B.q5;

public class PartTimeEmployee5 extends AbEmployee5{
	
	public PartTimeEmployee5(String id, String name) {		
		super(id, name);		
		}		
		@Override		
		public int calculateDailyWage(int hoursWorked) {		
		int HOURLY_RATE = 1000;		
		return hoursWorked * HOURLY_RATE;		
		}		

}
