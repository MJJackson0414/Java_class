package tw.Jackson.Class;

import java.util.Scanner;

public class Book_Ch3Page29_Ex21 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("(計算兩個數值的總和)");
		System.out.println("\n請先輸入第一個數值");
		int a,b;
		a = num.nextInt();
		System.out.println("輸入第一個數值為:"+a);
		System.out.println("請再輸入第二個數值:");

		b = num.nextInt();
		System.out.println("輸入第二個數值為:"+b);
		System.out.println("兩個數值相加的結果:"+a+"+"+b+"="+(a+b));

	}

}
