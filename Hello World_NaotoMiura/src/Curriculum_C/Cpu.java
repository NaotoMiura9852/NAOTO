package Curriculum_C;

import java.util.Random;

public class Cpu {
	
	public int hand;
	private Random rand = new Random();
	
	
	public void randomHand() {
		
		this.hand = rand.nextInt(3);
		
	}
	
	public int getHand() {
		
		return hand;
		
	}
	
	public String getHandName() {
		
		switch(hand) {
		
		case 0: return "グー";
		case 1: return "チョキ";
		case 2: return "パー";
		default: return "不明";
		
		}
		
	}
	

}
