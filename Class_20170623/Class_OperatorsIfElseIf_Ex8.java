package tw.Jackson.ClassTest.FlowControl;

public class Class_OperatorsIfElseIf_Ex8 {
	public static void main(String[] args) {
		int month = (int) (Math.random() * 12 + 1);
		int year = 1999;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + " has 31 days. ");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + " has 30 days.");
		} else if (month == 2) {
			// Lab:leap year
			System.out.println(month + " has 28-29 days.");
		} else {
			System.out.println("Error");
		}

		if ((year % 4 == 0 && year%100 !=0)||year%400==0) {
			System.out.println("Fabuary is 29 days in this year");
		} else{
			System.out.println("Fabuary is 28 days in this year");
		}

		

		}
	}

