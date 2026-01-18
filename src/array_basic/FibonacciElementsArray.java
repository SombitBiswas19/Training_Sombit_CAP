package array_basic;
import java.util.Scanner;

public class FibonacciElementsArray {

	public static boolean isFibonacci(int num) {
        if (num < 0) return false;

        int a = 0, b = 1;

        while (a <= num) {
            if (a == num)
                return true;

            int c = a + b;
            a = b;
            b = c;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Fibonacci elements in the array:");
        for (int i = 0; i < n; i++) {
            if (isFibonacci(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }

}
