package two_dimensional_array;

import java.util.Scanner;

public class EqualMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row elements: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column elements: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        boolean equal = true;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] != b[i][j])
                    equal = false;

        System.out.println(equal ? "Equal Matrices" : "Not Equal");
    }
}

