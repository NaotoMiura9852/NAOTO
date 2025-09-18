package curriculum_B;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		
	    //Q1
		helloWorld();
		
		//Q2
		Scanner scn = new Scanner(System.in);
		System.out.println("数値を入力してください:");
		int num = scn.nextInt();
		int dbl = doubleValue(num);
		System.out.println(num + "を2倍すると" + dbl + "です。");
		
		//Q3
		int num1 = 7, num2 = 10;
		System.out.println(num2 + (isEven(num2) ? "は偶数です.": "は奇数です。int"));
		System.out.println(num1 + (isEven(num1) ? "は偶数です.": "は奇数です。int"));
		
		//Q4
		Greeting g = new Greeting();
		g.sayHello();
		
		//Q5
		Animal animal = new Animal();
		animal.Name("ライオン");
		animal.Length(2.1);
		animal.Speed(80);
		
		System.out.println("動物名:" + animal.Name());
		System.out.println("体長:" + animal.Length() + "m");
		System.out.println("速度:" + animal.Speed() + "km/h");
		
		
		scn.close();
	}
	
	
	
	
	
	//Q1
    //メソッドhelloWorldを作成
	public static void helloWorld() {
		System.out.println("Hello World!");
	}
	//mainへ
	
	//Q2
	//メソッドdoubleValueを作成
	public static int doubleValue(int num) {
		return num * 2;
	}
	//mainへ
	
	
	//Q3
	//メソッドisEvenを作成
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	//mainへ

	//Q4はGreeting.javaの方に記述しています
	
	//Q5はAnimal.javaの方に記述しています
}


















