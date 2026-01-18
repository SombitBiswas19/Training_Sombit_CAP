package array_basic;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next().charAt(0);

        System.out.println(arr[0]);
        System.out.println(arr[n - 1]);
    }
}

