package curriculum_B.Q7;

import java.util.List;

public class SalaryReporter {
	
	public void report(List<Billable7> employees) {
		for (Billable7 e : employees) {
			System.out.println(e.getName() + "の給料は" + e.calculateSalary() + "円");
		}
	}

}
