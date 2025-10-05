package curriculum_B.Q7;

public abstract class AbEmployee7 implements Billable7 {
	
	protected String name;
	protected int hours;

	public AbEmployee7(String name, int hours) {
		
		this.name = name;
		this.hours = hours;
		
	}
	
	@Override
	public String getName() {
		return name;
	}
	

}