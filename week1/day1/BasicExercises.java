package week1.day1;

import java.util.Scanner;

public class BasicExercises {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number : ");
			int num = sc.nextInt();

			String classification = classifyNumber(num);
			System.out.println(classification);

			String evenOrOdd = checkEvenOrOdd(num);
			System.out.println(evenOrOdd);

		}
	}

	public static String classifyNumber(int num) {
		if (num == 0) {
			return "Number " + num + " is Zero!";
		} else if (num > 0) {
			return "Number " + num + " is Positive!";
		} else {
			return "Number " + num + " is Negative!";
		}
	}

	public static String checkEvenOrOdd(int num) {
		String parity = (num % 2 == 0) ? "Even!" : "Odd!";
		return "Number " + num + " is " + parity;
	}

}
