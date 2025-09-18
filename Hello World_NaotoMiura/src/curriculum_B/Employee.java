package curriculum_B;

public class Employee {
	
	
	//Q1 基本概念
	private String name;
	
	public void Name(String name) {
		this.name = name;
	}
	
	public String Name() {
		return this.name;
	}
	
	public void work() {
		System.out.println(name + "は働いています。");
	}
	
	
	
	//Q2 クラスとオブジェクト
	private String employeeId;
	
	public void EmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String EmployeeId() {
		return this.employeeId;
	}
	
	public void showInfo() {
		System.out.println("社員ID:" + employeeId + ", 名前:" + name);
	}
	
    

}
