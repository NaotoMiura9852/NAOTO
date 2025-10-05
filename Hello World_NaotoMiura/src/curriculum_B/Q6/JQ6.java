package curriculum_B.Q6;

import java.util.ArrayList;
import java.util.List;

public class JQ6 {
	
	public static void main(String[] args) {
		
		List<Billable> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee6("F001", "山田太郎"));
		employees.add(new FullTimeEmployee6("F002", "佐藤太郎"));
		employees.add(new PartTimeEmployee6("P001", "田中花子"));
		employees.add(new PartTimeEmployee6("P002", "鈴木花子"));
		
		int[] workedHours = {8, 7, 6, 9};
		
		for (int i = 0; i < employees.size(); i++) {
			Billable emp = employees.get(i);
			int cost = emp.costForDay(workedHours[i]);
			System.out.println("社員番号" + (i + 1) + "日給:" + cost + "円");
		}
		
		
	}

}
