package curriculum_B.q7;

import java.util.ArrayList;
import java.util.List;

public class SalalyCalculator {
	
	public static void main(String[] args) {
		
		List<Billable7> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee7("山田太郎", 9));
		employees.add(new FullTimeEmployee7("佐藤太郎", ６));
		employees.add(new PartTimeEmployee7("田中花子", ７));
		
		SalaryReporter salary = new SalaryReporter();
		salary.report(employees);
		
	}

}
