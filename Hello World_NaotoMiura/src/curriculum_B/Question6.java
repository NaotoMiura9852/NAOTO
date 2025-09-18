package curriculum_B;

public class Question6 {
	
	public static void main(String[] args) {
		
		//Q1 基本概念
		Employee emp = new Employee();
		
		emp.setName("山田太郎");
		
		emp.work();
		
		
		//Q2クラスとオブジェクト
		emp.setName("佐藤太郎");
		
		emp.setEmployeeId("E001");
		
		emp.showInfo();
		
		
		//Q3 カプセル化
		emp.setEmployeeId("E002");
		emp.setName("田中花子");
		
		System.out.println("社員ID:" + emp.getEmployeeId() + ", 名前:" + emp.getName());
		
	}

}
