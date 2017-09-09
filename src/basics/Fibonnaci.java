package basics;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	
	//FIBONACCI METHOD
	public static int fib(int n) {
	
		
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return ( ((fib(n-1)) + (fib(n-2))) );
		
	}
	
	
	//FACTORIAL METHOD
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;	
		}
		
		return fact;
	}

}
