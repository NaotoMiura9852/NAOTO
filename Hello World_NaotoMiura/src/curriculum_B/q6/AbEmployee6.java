package curriculum_B.q6;

public abstract class AbEmployee6 implements Billable{
	
	private String id;
	private String name;
	public AbEmployee6(String id, String name) {
		this.setId(id);
		this.setName(name);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
