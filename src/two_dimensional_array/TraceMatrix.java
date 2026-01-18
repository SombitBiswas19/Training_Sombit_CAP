package two_dimensional_array;

import java.util.Scanner;

public class TraceMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row elements: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int sum = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            sum += a[i][i];

        System.out.println("Trace = " + sum);
    }
}

