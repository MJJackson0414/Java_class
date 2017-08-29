package tw.Jackson.Class;

public class Book_Ch3Page29_Ex17 {

	public static void main(String[] args) {
		
		double a=5.000,b=3.00;
		System.out.println("5/3="+(a/b));
		System.out.println("5/3="+(double)(5.0/3.0));
		//要記得括號內會先計算，如果沒有小數點，則會先計算(5/3)-->屬於int，所以答案為1
		//(double)1=1.0
		System.out.println("5/3="+(double)(5/3));//錯誤示範

	}

}
