package tw.Jackson.ClassTest.OperatorsTest;

public class Class_OperatorsTypeCasting_Ex6 {

	public static void main(String[] args) {
		byte a = 1, b = 126, c;
		c = (byte) (a + b);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("a+b=" + c);
	}

}
