package two_dimensional_array;

import java.util.Scanner;

public class Two_D_Array {
	public static void indexofevenelement(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 == 0) {
					System.out.println("Row no " + i + " COlumn no " + j);
				}
			}
		}
	}

	public static int RowWiseSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static int ColumnWiseSum(int[][] arr) {
		int sum = 0;
		int rows = arr.length;
		int cols = arr[0].length;

		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows; i++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements:");
		int[][] a = new int[2][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		indexofevenelement(a);
	}
}
