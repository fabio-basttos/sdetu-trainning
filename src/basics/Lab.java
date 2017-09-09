package basics;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(sum(10));
		//System.out.println(factorial(4));
		
		int array[] = new int[]{10, 11, 88, 2, 12, 120};
		
		int max = getMax(array);
		System.out.println("Max value: " + max);
		
		int min = getMin(array);
		System.out.println("Min value: " + min);
		
		double avg = avgValue(array);
		System.out.println("Avg value: " + avg);
	}
	
	public static int sum (int n) {
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int factorial (int n1) { 
		if (n1 == 0) {
			return 1;
		}
		
		int fact = 1;
		for (int i = 1; i <= n1; i++) {
			fact *= i;
		}
		
		return fact;
		
	}
	
	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
	
	public static int getMin (int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
						
			}
			
		}
		return minValue;
	}
	
	public static double avgValue (int[] inputArray) {
		int count = 0;
		int sum = 0;
		double avg;
		
		for (int i = 1; i < inputArray.length; i++) {
			sum += inputArray[i];
			count++;
		}
		
		return avg = sum / count;
		
	}	
}
