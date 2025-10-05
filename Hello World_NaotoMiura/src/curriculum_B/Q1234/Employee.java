package curriculum_B.Q1234;

public class Employee {
	
	
	//Q1 基本概念
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void work() {
		System.out.println(name + "は働いています。");
	}
	
	
	
	//Q2 クラスとオブジェクト
	private String employeeId;
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeId() {
		return this.employeeId;
	}
	
	public void showInfo() {
		System.out.println("社員ID:" + employeeId + ", 名前:" + name);
	}
	
	
	
	//Q3　カプセル化
	//Q1とQ2で生成済み
    

}
