package tw.Jackson.Class;

import java.util.Scanner;

public class Book_Ch3Page29_Ex22 {

	public static void main(String[] args) {
		Scanner word= new Scanner(System.in);
		System.out.println("請輸入任一一個英文字元");
		
		char ch;
		short order=0;
		ch = word.next().charAt(0);
		
		
		if(ch>=97 && ch<=122){
			order=(short)(ch-97+1);
					System.out.println("您輸入的字母"+ch+"是第"+order+"個英文字母");
		}
		if (ch>=65 && ch<=90){
		    order=(short)(ch-65+1);
		System.out.println("您輸入的字母"+ch+"是第"+order+"個英文字母");
		}
	}

}
