package week1.day1;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter three numbers: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();

			int largestNumber = findLargest(num1, num2, num3);
			System.out.println("The largest Number is : " + largestNumber);

		}
	}

	public static int findLargest(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		} else if (num2 >= num1 && num2 >= num3) {
			return num2;
		} else {
			return num3;
		}

		// return Math.max(num1, Math.max(num2, num3));
	}

}
