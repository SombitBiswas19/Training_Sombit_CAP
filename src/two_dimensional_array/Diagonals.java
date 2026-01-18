package two_dimensional_array;

import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row elements: ");
        int n = sc.nextInt();
        
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Main Diagonal:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i][i] + " ");

        System.out.println("\nSecondary Diagonal:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i][n - i - 1] + " ");
    }
}

