package tw.Jackson.ClassTest.FlowControl;

public class Class_OperatorsNestd_Ex7 {

	public static void main(String[] args) {
		int number = -20;
		System.out.println("number:" + number);

		if (number >= 0) {
			System.out.println("It's positive.");
			if (number % 2 == 0) {
				System.out.println(number + " is even.");
			} else {
				System.out.println(number + " is odd.");
			}
		}

		else {
			System.out.println("It's negative.");
		

		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}
		}

	}

}
