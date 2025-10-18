package curriculum_D;

public class main {
	
	public static void main(String[] args) {
		
		Player player = new Player();
		
		Daemon daemon = new Daemon("daemon_status.txt");
		
		
		Battle.start(player, daemon);
		
	}

}
