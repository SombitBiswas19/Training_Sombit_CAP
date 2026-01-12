package methods;

import java.util.Scanner;

public class Decimal2Hexadecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Decimal to Hexadecimal
		System.out.print("Enter a decimal number: ");
		long num = sc.nextLong();
		System.out.println("The hexadecimal result is: " + dec2hex(num));
		// Hexadecimal to Decimal
		System.out.print("Enter a hexadecimal number: ");
		String num1 = sc.next();
		while (!checkhex(num1)) {
			System.out.println("Enter valid hexadecimal number! (0-9, A-F)");
			System.out.print("Enter a hexadecimal number: ");
			num1 = sc.next();
		}
		System.out.println("The decimal result is: " + hex2dec(num1));
	}

	private static long hex2dec(String hex) {
		long sum = 0;
		int power = 0;
		for (int i = hex.length() - 1; i >= 0; i--) {
			char ch = hex.charAt(i);
			int value;
			if (ch >= '0' && ch <= '9')
				value = ch - '0';
			else
				value = ch - 'A' + 10;
			sum += value * pow(16, power);
			power++;
		}
		return sum;
	}

	private static long pow(long base, int n) {
		long ans = 1;
		for (int i = 0; i < n; i++) {
			ans *= base;
		}
		return ans;
	}

	private static boolean checkhex(String num1) {
		for (int i = 0; i < num1.length(); i++) {
			char ch = num1.charAt(i);
			if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))) {
				return false;
			}
		}
		return true;
	}

	private static String dec2hex(long num) {
		String hex = "";
		while (num > 0) {
			long rem = num % 16;
			if (rem < 10)
				hex = rem + hex;
			else
				hex = (char) ('A' + (rem - 10)) + hex;
			num /= 16;
		}
		return hex;
	}

}
