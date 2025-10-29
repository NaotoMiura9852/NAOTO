package Curriculum_B.Q7;

public class PartTimeEmployee7 extends AbEmployee7 {
	
private static final int rate = 1000;
	
	public PartTimeEmployee7(String name, int hours) {
		
		super(name, hours);
		
	}
	
	@Override
	public int calculateSalary() {
		return getHours() * rate;
	}

}
