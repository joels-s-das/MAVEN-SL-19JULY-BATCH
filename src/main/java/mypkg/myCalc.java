package mypkg;

public class myCalc {
	int sum(int a, int b) { return a+b; }
	int diff(int a, int b) { return a-b; }
	int mul(int a, int b) { return a*b; }
	int div(int a, int b) { return a/b; }
	int rem(int a, int b) { return a%b; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCalc calc = new myCalc();
		System.out.println("  Sum  is "+ calc.sum(30, 20));
		System.out.println("  Diff  is "+ calc.diff(30, 20));
		System.out.println("  Mul  is "+ calc.mul(30, 20));
		System.out.println("  Div  is "+ calc.div(40, 20));
		System.out.println("  Rem  is "+ calc.rem(40, 20));
	}

}
