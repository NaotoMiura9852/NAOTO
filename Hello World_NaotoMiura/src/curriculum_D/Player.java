package curriculum_D;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character{
	
	public Player() {
		
		super("", 0, 0, 0);
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		
		System.out.println("プレイヤーの名前を入力してください:");
		
		this.name = sc.nextLine();
		
		this.hp = 70 + rand.nextInt(31);
		
		this.at = 10 + rand.nextInt(6);
		
		this.sp = 5 + rand.nextInt(6);
		
		System.out.println(this.getStatus());
	}

}
