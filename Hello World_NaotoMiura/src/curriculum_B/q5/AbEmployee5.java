package curriculum_B.q5;

public abstract class AbEmployee5 {
	
	private String id;
	private String name;
	public AbEmployee5(String id, String name) {
	this.setId(id);
	this.setName(name);
	}
	public abstract int calculateDailyWage(int hoursWorked);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
