package curriculum_B.q7;

public abstract class AbEmployee7 implements Billable7 {
	
	private String name;
	private int hours;

	public AbEmployee7(String name, int hours) {
		
		this.name = name;
		this.setHours(hours);
		
	}
	
	@Override
	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	

}