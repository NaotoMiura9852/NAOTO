package curriculum_B;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		//Q1
		//int型の変数scoreに75を代入
		int score = 75;
		//scoreが60以上なら"合格です！"と表示
		if (score >= 60) {
			String s1 = "合格です！";
			System.out.println(s1);
		} 
		
		//Q2
		//int型の変数ageに25を代入
		int age1 = 25;
		//ageが20以上30以下なら"適正年齢です。"と表示、それ以外なら"対象外です。"と表示
		String s2 = (age1 >= 20 && age1 <= 30) ? "適正年齢です" : "対象外です";
		System.out.println(s2);
		
		//Q3
		//int型の変数ageに18を代入
		int age2 = 18;
		//ageが20以上なら"成人です"と表示、13以上19以下なら"ティーンエイジャーです"と表示、12以下なら"子供です"と表示
		String s3;
		if (age2 >= 20) {
		    s3 = "成人です";
		}else if(age2 >= 13 && age2 <= 19) {
			s3 = "ティーンエイジャーです";
		}else{
			s3 = "子供です";
		}
		System.out.println(s3);
		
		//Q4
		//int型の変数x,y,zに30,15,50を代入
		int x = 30;
		int y = 15;
		int z = 50;
		//一番大きい数字を判定して表示
		int a = (x > y) ? x : y;
		int b = (a > z) ? a : z;
		System.out.println(b);
		
		//Q5
		//int型の変数numを宣言し、10を代入
		int num = 10;
		//numの値が0より大きければ"正の数です"、numの値が0なら"0です"、numの値が0より小さければ"負の数です"を表示
		String s4;
		if (num > 0) {
			s4 = "正の数です";
		}else if (num == 0) {
			s4 = "0です";
		}else {
			s4 = "負の数です";
		}
		System.out.println(s4);
		
		//Q6
		//int型の変数valueを用意し、5を代入
		int value = 5;
		//valueが偶数なら"偶数です"、valueが奇数なら"奇数です"と表示
		String s5 = (value % 2 == 0) ? "偶数です" : "奇数です";
		System.out.println(s5);
		
		//Q7
		//int型の変数scoreに70を代入
		score = 70;
		//値が90以上なら"優"、70以上なら"良"、50以上なら"可"、50未満なら"不可"を表示
		String s6;
		if (score >= 90) {
			s6 = "優";
		}else if(score >= 70 && score < 90) {
			s6 = "良";
		}else if(score >= 50 && score < 70) {
			s6 = "可";
		}else {
			s6 = "不可";
		}
		System.out.println(s6);
		
		//Q8
		//Scanner関数を宣言
		Scanner scn = new Scanner(System.in);
		//String型の変数inputを宣言
		System.out.println("文字を入力してください:");
		String input = scn.nextLine();
		//入力がnullまたは空文字の時に"入力が無効です"と表示
		if (input.isEmpty()) {
			System.out.println("入力が無効です");
		}else if(input.equals("null")) {
			System.out.println("入力が無効です");
		}else {
			System.out.println(input);
		}
		//Q9
		//int型の変数dayを用意し、５を代入
		int day = 5;
		//dayの値によって曜日を表示
		switch(day) {
			case 1:
				System.out.println("月曜日");
			break;
			case 2:
				System.out.println("火曜日");
			break;
			case 3:
				System.out.println("水曜日");
			break;
			case 4:
				System.out.println("木曜日");
			break;
			case 5:
				System.out.println("金曜日");
			break;
			case 6:
				System.out.println("土曜日");
			break;
			case 7:
				System.out.println("日曜日");
			break;
			default:
				System.out.println("無効な入力です");
			break;	
		}
		
		//Q10
		//int型の変数monthを用意し、８を代入
		int month = 8;
		//monthに応じて季節を表示
		switch (month) {
			case 12,1,2 :
				System.out.println("冬");
			break;
			case 3,4,5 :
				System.out.println("春");
			break;
			case 6,7,8 :
				System.out.println("夏");
			break;
			case 9,10,11 :
				System.out.println("秋");
			break;
			default:
				System.out.println("無効な月です");
			break;
		}
		
		
		scn.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static String scn() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
