package mypkg;

public class myCalc {
	int sum(int a, int b) { return a+b; }
	int diff(int a, int b) { return a-b; }
	int mul(int a, int b) { return a*b; }
	int div(int a, int b) { return a/b; }
	int rem(int a, int b) { return a%b; }
	double avg(int a, int b) { return (a+b)/2; }
	double varce(int a, int b) {
        double mean = (a + b) / 2.0;  // ensure floating-point division
        return Math.pow(a - mean, 2) + Math.pow(b - mean, 2);
    }
	double std(int a, int b) {
        double variance = varce(a, b) / 2.0; // divide by n = 2
        return Math.sqrt(variance); // square root of variance
    }
	public void branch() {
		ystem.out.println("Hello from dev branch ");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCalc calc = new myCalc();
		System.out.println("  Sum  is "+ calc.sum(30, 20));
		System.out.println("  Diff  is "+ calc.diff(30, 20));
		System.out.println("  Mul  is "+ calc.mul(30, 20));
		System.out.println("  Div  is "+ calc.div(40, 20));
		System.out.println("  Rem  is "+ calc.rem(40, 20));
		System.out.println("  average  is "+ calc.avg(40, 20));
		System.out.println("  variance  is "+ calc.varce(40, 20));
		System.out.println("Std = " + calc.std(40, 20));
		calc.branch();
	}

}
