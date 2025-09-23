package curriculum_B;

public class PartTimeEmployee5 extends AbEmployee5{
	
	public PartTimeEmployee5(String id, String name) {		
		super(id, name);		
		}		
		@Override		
		public int calculateDailyWage(int hoursWorked) {		
		int hourlyRate = 1000;		
		return hoursWorked * hourlyRate;		
		}		

}
