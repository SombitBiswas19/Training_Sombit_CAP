package array_basic;

import java.util.Scanner;

public class DuplicatePrime {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] == arr[j] && isPrime(arr[i]))
                    System.out.println(arr[i]);
    }
}

