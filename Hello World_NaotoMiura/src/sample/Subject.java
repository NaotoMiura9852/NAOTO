package sample;

public class Subject {
	public static void main(String[] args) {
		
		//Q1
		//byteNumの初期値設定
		byte byteNum;
		//shortNumの初期値設定
		short shortNum;
		//intNumの初期値設定
		int intNum;
		//longNumの初期値設定
		long longNum;
		//floatNumの初期値設定
		float floatNum;
		//doubleNumの初期値設定
		double doubleNum;
		//letterの初期値設定
		char letter;
		//lettersの初期値設定
		String letters;
		//isBooleanの初期値設定
		boolean isBoolean;
		
		//Q2
		//byteNumに10を代入
		byteNum = 10;
		//shortNumに100を代入
		shortNum = 100;
		//intNumに1000を代入
		intNum = 1000;
		//longNumに10000を代入
		longNum = 10000;
		//floatNumに9.5fを代入
		floatNum = 9.5f;
		//doubleNumに10.5を代入
		doubleNum = 10.5;
		//letterに＂a＂を代入
		letter = 'a';
		//lettersに"ハロー"を代入
		letters = "ハロー";
		//isBooleanにtrueを代入
		isBoolean = true;
		
		//Q3
		//11110を出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		//20を出力
		System.out.println(byteNum * 2);
		//a ハロー trueを出力
		System.out.println(letter);
		System.out.println(letters);
		System.out.println(isBoolean);
		//数字を全て足して出力
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		//小数点以外の数字を全てかけて出力
		System.out.println(byteNum * shortNum * intNum * longNum * (doubleNum - 0.5));
		//10.5割る100をして出力
		System.out.println(doubleNum / shortNum);
		//10引く100をして出力
		System.out.println(byteNum - shortNum);
		
		//Q4
		//String型でname変数を宣言
		String name;
		//nameに山田太郎を代入
		name = "山田太郎";
		//こんにちは、山田太郎さんを表示
		System.out.println("こんにちは、" + name + "さん！");
		
		//Q5
	    //int型でageを宣言
		int age;
		//ageに25を代入
		age = 25;
		//年齢:25歳を表示
		System.out.println("年齢:" + age + "歳");
		
		//Q6
		//int型で変数num1とnum2を宣言し、それぞれに10と5を代入
		int num1 = 10;
		int num2 = 5;
		//num1とnum2を足してsumに代入し、その値を表示
		int sum = num1 + num2;
		System.out.println(sum);
		
		//Q7
		//int型で変数scoreを宣言し、80を代入
		int score = 80;
		//scoreに20を加えて更新
		score = score + 20;
		//最終スコア：100をscoreを用いて表示
		System.out.println("最終スコア:" + score);
		
		//Q8
		//double型で変数priceを宣言し、99.99を代入
		double price = 99.99;
		//priceをint型に変換し、整数価格: 99と表示
		int price1 = (int) price;
		System.out.println("整数価格:" + price1);
		
		//Q9
		//String型でnumStrを宣言し、"123"を代入
		String numStr = "123";
		//numStrをint型に変換し、変換後の値: の後ろにnumStr + 10した結果を表示
		int num = Integer.parseInt(numStr) + 10;
		System.out.println("変換後の値:" + num);
		
		//Q10
		//int型でnum3を宣言し、50を代入
		int num3 = 50;
		//num3をString型に変換し、"得点:50点"の形で表示
		String s = String.valueOf(num3);
		System.out.println("得点:" + s + "点");
		
		//Q11
		//int型の変数a,bを宣言し、そこにそれぞれ10,20を代入する
		int a = 10;
		int b = 20;
		//boolean型の変数resultを宣言し、そこにaがbより小さいかどうかを代入
		boolean result = (a < b);
		System.out.println(result);
		
		//Q12
		//int型で変数xを宣言し、15を代入
		int x = 15;
		//String型の変数s1を宣言し、そこにxが10以上であればOK、そうでなければNGを代入に表示
		String s1 = (x > 10) ? "OK" : "NG";
		System.out.println(s1);
		
		//Q13
		//String型の変数textを宣言し、そこに"私はJavaが好きです。Javaは楽しい！"を代入
		String text = "私はJavaが好きです。Javaは楽しい！";
		//JavaをPythonに変換して表示
		String text1 = text.replace("Java", "Python");
		System.out.println(text1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
