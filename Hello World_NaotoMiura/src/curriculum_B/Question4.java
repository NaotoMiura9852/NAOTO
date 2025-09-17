package curriculum_B;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		
		//Q1
		//int型の配列を作成し、1,2,3,4,5を格納する
		int[] array = { 1, 2, 3, 4, 5 };
		//配列の全要素を順番に表示
		for(int ary: array) {
			System.out.println( ary );
		}
		
		//Q2
		//int型の配列{10,20,30,40,50}を用意する
		int[] array1 = {10, 20, 30, 40, 50};
		//配列を逆順に表示
		for(int ary1 = array1.length - 1; ary1 >= 0; ary1--) {
			System.out.println( ary1 );
		}
		
		//Q3
		//int型の配列{3, 5, 7, 9, 11}を用意する
		int[] array2 = {3, 5, 7, 9, 11};
		//配列の全要素の合計値を計算し、表示
		int sum = 0;
		for (int c = 0; c < array2.length; c++) {
			sum += array2[c];
		}
		System.out.println(sum);
		
		
		//Q4
		//int型の配列{12, 7, 9, 21, 5, 18}を用意する
		int[] array3 = {12, 7, 9, 21, 5, 18};
		//配列の最大値と最小値を求めて表示
		int max = array3[0];
		int min = array3[0];
		for (int d = 1; d < array3.length; d++) {
			if(array3[d] > max) {
				max = array3[d];
			}
			if(array3[d] < min) {
				min = array3[d];
			}
		}
		System.out.println("最大値:" + max + "," + "最小値:" + min);
		
		
		//Q5
		//int型の配列{1, 2, 3, 4, 5}を用意する
		int[] array4 = {1, 2, 3, 4, 5};
		//拡張for文を使用して配列の全ての数字を2倍にして表示
		for (int ary4 :array4) {
			System.out.println( ary4 * 2);
		}
		
		//Q6
		//int型の配列{4, 7, 10, 15, 20}を用意する
		int[] array5 = {4, 7, 10, 15, 20};
		//ユーザーが入力した数字が配列に含まれているかを判定して結果を表示
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください:");
		int e = scanner.nextInt();
		boolean found = false;
		for(int f = 0; f < array5.length; f++) {
			if( e == array5[f]) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println( "結果:" + e + "は配列に含まれています");
		}else {
			System.out.println( "結果:" + e + "は配列に含まれていません");
		}
		
		
		
		//Q7
		//int型の二次元配列{{1, 2}, {3, 4}, {5, 6}}を用意
		int[][] array6 = {{1, 2}, {3, 4}, {5, 6}};
		//配列の全ての要素を表示
		for(int g = 0; g < array6.length; g++) {
			for(int h = 0; h < array6[g].length; h++) {
				System.out.println(array6[g][h]);
			}
		}
		
		//Q8
		//int型で二次元配列{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}を用意する
		int[][] array7 ={{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		//配列の全ての合計値を表示
		int sum1 = 0;
		for(int i = 0; i < array7.length; i++) {
			for(int j = 0; j < array7[i].length; j++) {
				sum1 += array7[i][j];
			}
		}
		System.out.println(sum1);
		
		//Q9
		//二次元配列int[][] array8 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};を用意
		int[][] array8 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		//最大値と最小値を求めて表示
		int max1 = array8[0][0];
		int min1 = array8[0][0];
		for (int k = 0; k < array8.length; k++) {
			for(int l = 0; l < array8[k].length; l++) {
				if(array8[k][l] > max1) {
					max1 = array8[k][l];
				}
				if(array8[k][l] < min1) {
					min1 = array8[k][l];
				}
			}
			
		}
		System.out.println("最大値:" + max1 + "," + "最小値:" + min1);
		
		//10
		//三次元配列int[][][] array9 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};を用意
		int[][][] array9 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		//配列内の全ての要素を表示
		for(int m = 0; m < array9.length; m++) {
			for(int n = 0; n < array9[m].length; n++) {
				for(int o = 0; o < array9[m][n].length; o++) {
					System.out.println(array9[m][n][o]);
				}
			}
		}
		
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
