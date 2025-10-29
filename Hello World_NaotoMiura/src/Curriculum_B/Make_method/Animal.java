package Curriculum_B.Make_method;

public class Animal {
	
	//フィールドを用意
	private String name;
	private double length;
	private int speed;
	
	//setterを用意
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setSpeed(int spped) {
		this.speed = spped;
	}
	
	//getterを用意
	public String getName() {
		return this.name;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	
}
