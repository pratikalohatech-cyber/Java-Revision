package week1.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter First Number: ");
			double firstNum = sc.nextDouble();

			System.out.print("Enter Operator (+, -, *, /, %): ");
			String operatorInput = sc.next();
			if (operatorInput.length() != 1) {
				System.out.println("Error: Operator must be a single character.");
				return;
			}

			System.out.print("Enter Second Number: ");
			double secondNum = sc.nextDouble();

			double result = calculate(firstNum, operatorInput.charAt(0), secondNum);
			System.out.println("Result: " + result);

		} catch (InputMismatchException e) {
			System.out.println("Error: Please enter valid numeric values.");
		} catch (IllegalArgumentException | ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static double calculate(double firstNum, char operator, double secondNum) {
		return switch (operator) {
		case '+' -> firstNum + secondNum;
		case '-' -> firstNum - secondNum;
		case '*' -> firstNum * secondNum;
		case '/' -> {
			if (secondNum == 0) {
				throw new ArithmeticException("Cannot divide by zero.");
			}
			yield firstNum / secondNum;
		}
		case '%' -> {
			if (secondNum == 0) {
				throw new ArithmeticException("Cannot calculate modulo by zero.");
			}
			yield firstNum % secondNum;
		}
		default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
		};
	}
}
