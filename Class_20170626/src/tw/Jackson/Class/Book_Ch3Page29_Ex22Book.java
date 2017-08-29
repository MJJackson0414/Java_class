package tw.Jackson.Class;

import java.util.Scanner;

public class Book_Ch3Page29_Ex22Book {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch;
		int i=2;
		
		 System.out.print("請輸入一個字元:");
		 ch=scn.next().charAt(0);
		 if(ch>=97 && ch<=122)
		 i=(int)(ch-97+1);
		 else if(ch>=65 && ch<=90)
		 i=(int)(ch-65+1);
		 System.out.println(ch+"為第"+i+"個字母");


	}

}
