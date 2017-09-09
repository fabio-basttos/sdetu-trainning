package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		//printName();
		int numA  =10;
		int numB = 20;
		//addNumbers(5, 10);
		System.out.println("The product of numbers: " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
	}
	
	static void printName() {
		System.out.println("My name is Fabio.");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of numbers: " + numberA + " and " + numberB + " = " + sum);
	}
	
	static int multiplyNumbers(int a, int b) {
		int product = a * b;
		return product;
	}
}
