package Curriculum_D;

public class Character {
	
	private String name;
	
	private int hp;
	
	private int at;
	
	private int sp;
	
	
	protected Character(String name, int hp, int at, int sp) {
		
		this.setName(name);
		
		this.setHp(hp);
		
		this.setAt(at);
		
		this.setSp(sp);
	}
	
	public boolean isAlive() {
		return getHp() > 0;
		
	}
	
	public void attack(Character opponent) {
		
		opponent.setHp(opponent.getHp() - this.getAt());
		
		if(opponent.getHp() < 0) opponent.setHp(0);
		
		System.out.println(this.getName() + "の攻撃!" + opponent.getName() + "に" + this.getAt() + "のダメージ!");
		
	}
	
	public String getStatus() {
		
		return getName() + "HP:" + getHp() + ", AT:" + getAt() + ", SP:" + getSp();		
		
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAt() {
		return at;
	}

	public void setAt(int at) {
		this.at = at;
	}

}
