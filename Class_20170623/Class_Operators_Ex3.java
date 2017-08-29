package tw.Jackson.ClassTest.OperatorsTest;

public class Class_Operators_Ex3 {

	public static void main(String[] args) {
		int i=1,j=2,k;
		k=(i++)+(++j);
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		
		int x=1,y=2,z;
//		z=(x++)+(y++);
		z=(++x)+(++y);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}

}
