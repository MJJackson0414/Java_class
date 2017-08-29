package tw.Jackson.ClassTest.FlowControl;

public class Class_IfElsewithDice {

	public static void main(String[] args) {
		int Dicenumber =(int)(Math.random()*6)+1;
		System.out.println("Dicenumber:"+Dicenumber);
		int Myluckynumber =(int)(Math.random()*6)+1;
		System.out.println("Myluckynumber:"+Myluckynumber);
		
		if (Dicenumber<Myluckynumber)
		{System.out.println("You Win!!");}
		else if (Dicenumber==Myluckynumber)
		{System.out.println("Play again");}
		else
		{System.out.println("You lose!!");}

		System.out.println("See you Next Time");
	}

}
