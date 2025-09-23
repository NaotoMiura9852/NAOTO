package curriculum_B;

import java.util.ArrayList;
import java.util.List;

public class Employee5 {
	
	public static void main(String[] args) {
		
		List<AbEmployee5> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee5("F001", "山田太郎"));
		employees.add(new FullTimeEmployee5("F002", "佐藤太郎"));
		employees.add(new PartTimeEmployee5("P001", "田中花子"));
		employees.add(new PartTimeEmployee5("P002", "鈴木花子"));
		
		for(AbEmployee5 e : employees) {
			int wage = e.calculateDailyWage(9);
			
			System.out.println(e.name + "の日給:" + wage + "円");
			
		}
		
		
	}

}
