package two_dimensional_array;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row elements: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column elements: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < r; i++) {
            int min = a[i][0];
            int colIndex = 0;

            for (int j = 1; j < c; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    colIndex = j;
                }
            }

            boolean saddle = true;
            for (int k = 0; k < r; k++) {
                if (a[k][colIndex] > min) {
                    saddle = false;
                    break;
                }
            }

            if (saddle) {
                System.out.println("Saddle Point: " + min);
                found = true;
            }
        }

        if (!found)
            System.out.println("No Saddle Point");
    }
}

