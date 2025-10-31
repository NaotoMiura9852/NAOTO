package curriculum_B.q7;

public class FullTimeEmployee7 extends AbEmployee7 {
	
	private static final int RATE = 1200;
	
	public FullTimeEmployee7(String name, int hours) {
		
		super(name, hours);
		
	}
	
	@Override
	public int calculateSalary() {
		return getHours() * RATE;
	}

}
