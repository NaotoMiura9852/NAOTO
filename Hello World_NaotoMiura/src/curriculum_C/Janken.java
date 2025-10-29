package curriculum_C;

import java.util.Scanner;

public class Janken {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		Cpu cpu = new Cpu();
		
		
		boolean playerWin = false;
		
		while(!playerWin) {
			
			System.out.println("グー(0), チョキ(1), パー(2) を入力: ");
			
			int playerHand = scanner.nextInt();
			
			if(playerHand < 0 || playerHand > 2) {
				
				System.out.println("0~2の数字を入力してください");
				continue;
				
			}
			
			player.setHand(playerHand);
			cpu.randomHand();
			
			System.out.println("あなたの手:" + player.getHandName());
			System.out.println("CPUの手:" + cpu.getHandName());
			
			int result = Judge.judge(player.getHand(), cpu.getHand());
			
			if(result == 0) {
			
				System.out.println("あいこ");
			
			} else if (result == 1){
				
				System.out.println("勝ち");
				playerWin = true;
				
			} else {
				
				System.out.println("負け");
				
			}
			
			System.out.println();
			
		}
		
		scanner.close();
		
	}
	
	
	

}
