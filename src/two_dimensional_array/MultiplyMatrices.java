package two_dimensional_array;

import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row elements: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of column elements: ");
        int c1 = sc.nextInt();
        System.out.println("Enter the number of row elements: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of column elements: ");
        int c2= sc.nextInt();

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    mul[i][j] += a[i][k] * b[k][j];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++)
                System.out.print(mul[i][j] + " ");
            System.out.println();
        }
    }
}

