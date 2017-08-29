package tw.Jackson.Class;

//public 
class Book_Ch2Page21_Ex9 {

	public static void main(String[] args) {
		int num;
        num=2;
        System.out.println("I have "+num+" dogs");
        System.out.println("You have "+num+" dogs, too");
	}

}
/*編譯時沒有產生錯誤訊息，執行時的訊息如下：
Main method not public.
其中文意思為main() method並非public類別裡的method。
這是因為main() method如果沒有宣告成public，就不能由外界來呼叫。*/