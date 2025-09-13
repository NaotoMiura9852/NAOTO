package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
		//Q1
		//1~10までの数字を一つずつ表示
		for (int num1 = 1; num1 <= 10; num1++) {
			System.out.println(num1);
		}
		
		//Q2
		//2~20までの偶数を一つずつ表示
		for (int num2 = 1; num2 <= 20; num2++) {
			if(num2 % 2 == 0) {
				System.out.println(num2);
			}
		}
		
		//Q3
		//10~1までカウントダウンを表示
		for (int num3 = 10; num3 >= 1; num3--) {
			System.out.println(num3);
		}
		
		//Q4
		//1~100までの合計を表示
		int sum = 0;
		for (int num4 = 1; num4 <= 100; num4++) {
			sum += num4;
		}
		System.out.println(sum);
		
		//Q5
		//for文を使って三角形を出力
		for(int num5 = 1; num5 <= 5; num5++) {
			for(int num6 = 1; num6 <= num5; num6++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Q6
		//1~10までを一つずつ表示
		int count = 1;
		while(count <= 10) {
			System.out.println(count);
			count++;
		}
		
		//Q7
		//2~20までの偶数を一つずつ表示
		int count1 = 1;
		while(count1 <= 10) {
			System.out.println(count1 * 2);
			count1++;
		}
		
		//Q8
		//10~1までのカウントダウン
		int count2 = 10;
		while(count2  >= 1) {
			System.out.println(count2);
			count2--;
		}
		
		//Q9
		//1~100までの合計を表示
		int count3 = 1;
		int sum1 = 0;
		while(count3 <= 100) {
			sum1 += count3;
			count3++;
		}
		System.out.println(sum1);
		
		//Q10
		//Scannerを用意する
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("数値を入力:");
			int num7 = scn.nextInt();
			if(num7 == 0) {
				System.out.println("終了しました");
				break;
			}
		}
		
		//Q11
		//九九の表を作成
		for(int num8 = 1; num8 <= 9; num8++) {
			for(int num9 = 1; num9 <= 9; num9++) {
				if(num8 * num9 < 10) {
					System.out.print("0"+ num8 + "*" + "0" + num9 + "=" + "0" + (num8 * num9));
				}else {
					System.out.print("0"+ num8 + "*" + "0" + num9 + "=" + (num8 * num9));
				}
				
				if(num9 < 9) {
					System.out.print("||");
				}else {
					System.out.println("");
				}
				
			}
		}
		
		//Q12
		//String型で変数を宣言
		String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		//"、"で区切り指定をする
		String[] items = input.split("、");
		//Randomで変数宣言、int型でテレビの残り台数とディスプレイの残り台数を変数宣言する
		Random random = new Random();
		int tvStock = random.nextInt(12);
		int displayStock = 11 - tvStock;
		//for文とswitch文、条件演算子を使用して残り台数を表示
		for(String item : items) {
			switch (item) {
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					int stock = random.nextInt(12);
					System.out.println(item +"の残り台数は" + stock + "台です");
					break;
				case "テレビ":
				case "ディスプレイ":
					System.out.println(item + "の残り台数は" + (item.equals("テレビ") ? tvStock : displayStock) + "台です");
					break;
				default:
					System.out.println("『その他商品』は指定の商品ではありません");
				    break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
