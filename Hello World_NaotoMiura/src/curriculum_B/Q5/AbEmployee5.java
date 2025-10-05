package curriculum_B.Q5;

public abstract class AbEmployee5 {
	
	protected String id;
	protected String name;
	public AbEmployee5(String id, String name) {
	this.id = id;
	this.name = name;
	}
	public abstract int calculateDailyWage(int hoursWorked);

}
