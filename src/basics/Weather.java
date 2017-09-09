package basics;

public class Weather {

	public static void main(String[] args) {
		
		int temperature = 70;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasent. Wear shorts and T-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler, perhaps wear long-sleeve and jeans");
		}
		else if ((temperature > 50 ) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day.");
		}
		else {
			System.out.println("Bring a sweater");
		}

		System.out.println("Just adding code");
	}

}
