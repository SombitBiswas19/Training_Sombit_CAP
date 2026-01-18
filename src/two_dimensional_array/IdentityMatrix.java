package two_dimensional_array;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the number of column elements: ");
        int c = sc.nextInt();
        int[][] a = new int[n][n];
        boolean flag = true;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                    flag = false;
            }

        System.out.println(flag ? "Identity Matrix" : "Not Identity Matrix");
    }
}

