package javaBasics;

public class SwitchStatement {

	public static void main(String[] args) {

		int score = 40;

		switch (score) {

		case 100:
		case 95:
		case 90:
			System.out.println("Excellent");
			break;

		case 85:
		case 80:
		case 75:
			System.out.println("Distinction");
			break;

		case 70:
		case 65:
		case 60:
			System.out.println("Good");
			break;

		case 50:
		case 45:
		case 40:
			System.out.println("Okay");
			break;

		case 30:
			System.out.println("Failed");
			break;

		default:
			System.out.println("Grade is not defined");
			break;

		}

	}

}
