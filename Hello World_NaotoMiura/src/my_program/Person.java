package my_program;

public class Person {
	
	//インスタンスフィールドを定義
	//Q1
	String name;
	int age;
	double height;
	//Q4
	double weight;
	
	//Q10
	static int count = 0;
	
	
	//コンストラクタを定義してインスタンスフィールドに値をセット
	//Q2 Q4
	 Person(String name, int age, double height, double weight){
		
		 //Q3
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
		
	}
	 
	 //Q6 Q7
	 double bmi() {
		 return this.weight / (this.height * this.height);
	 }
	 
	 //Q8 Q9
	 void print() {
		 System.out.println("名前は" + this.name + "です");
		 System.out.println("年は" + this.age + "歳です");
		 System.out.printf("BMIは%.2fです。", this.bmi());
	 }
	 
	 
}
