package curriculum_B;

public class Animal {
	
	//フィールドを用意
	private String name;
	private double length;
	private int speed;
	
	//setterを用意
	public void Name(String name) {
		this.name = name;
	}
	
	public void Length(double length) {
		this.length = length;
	}
	
	public void Speed(int spped) {
		this.speed = spped;
	}
	
	//getterを用意
	public String Name() {
		return this.name;
	}
	
	public double Length() {
		return this.length;
	}
	
	public int Speed() {
		return this.speed;
	}
	
	
}
