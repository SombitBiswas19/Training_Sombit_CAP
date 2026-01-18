package two_dimensional_array;

import java.util.Scanner;

public class CountZerosBinaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row elements: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column elements: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int count = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 0)
                    count++;
            }

        System.out.println("Number of zeros = " + count);
    }
}
