package curriculum_C;

public class Judge {
	
	public static int judge(int player, int cpu) {
		
		if(player == cpu) return 0;
		else if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) {
			
			return 1;
			
		} else {
			
			return -1;
			
		}
		
	}

}
