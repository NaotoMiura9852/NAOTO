package curriculum_D;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Battle {
	
	public static void start(Player player, Daemon daemon) {
		
		Random rand = new Random();
		
		System.out.println("バトル開始");
		
		System.out.println(player.getStatus());
		
		System.out.println(daemon.getStatus());
		
		System.out.println();
		
		
		try (FileWriter log = new FileWriter("battle_log.txt")){
			
			log.write("結果\n");
			
			log.write(player.getStatus() + "\n");
			
			log.write(daemon.getStatus() + "\n\n");
			
			
			Character first, second;
			
			if(player.sp > daemon.sp) {
				
				first = player;
				
				second = daemon;
				
			} else if (player.sp < daemon.sp) {
				
				first = player;
				
				second = daemon;
				
			} else {
				
				if(rand.nextBoolean()) {
					
					first = daemon;
					
					second = player;
					
				} else {
					
					first = daemon;
					
					second = player;
					
				}
				
			}
			
			log.write("先攻は" + first.name + "!\n\n");
			
			System.out.println("先攻は" + first.name + "!\n");
			
			int turn = 1;
			
			while (player.isAlive() && daemon.isAlive()) {
				
				log.write("ターン" + turn + "\n");
				
				
				first.attack(second);
				
				log.write(first.name + "→" + second.name + "に攻撃!\n");
				
				if(!second.isAlive()) break;
				
				
				second.attack(first);
				
				log.write(player.getStatus() + "\n");
				
				log.write(daemon.getStatus() + "\n\n");
				
				turn++;
				
				
			}
			
			log.write("バトル終了\n");
			
			if (player.isAlive()) {
				
				System.out.println(player.name + "の勝利!");
				
				log.write(player.name + "の勝利!\n");
				
			} else {
				
				System.out.println(daemon.name + "の勝利!");
				
				log.write(daemon.name + "の勝利!\n");
				
			}
			
			
			System.out.println("バトル結果をbattle_log.txtに出力しました。");
			
			
		} catch (IOException e) {
			
			System.out.println("エラー" + e.getMessage());
			
		}
		
	}

}
