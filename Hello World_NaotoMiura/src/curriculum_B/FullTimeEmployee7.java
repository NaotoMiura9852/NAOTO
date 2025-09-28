package curriculum_B;

public class FullTimeEmployee7 extends AbEmployee7 {
	
	private static final int rate = 1200;
	
	public FullTimeEmployee7(String name, int hours) {
		
		super(name, hours);
		
	}
	
	@Override
	public int calculateSalary() {
		return hours * rate;
	}

}
