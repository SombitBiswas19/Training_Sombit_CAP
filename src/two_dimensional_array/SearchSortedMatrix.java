package two_dimensional_array;

import java.util.Scanner;

public class SearchSortedMatrix {
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

        int key = sc.nextInt();

        int i = 0, j = c - 1;
        boolean found = false;

        while (i < r && j >= 0) {
            if (a[i][j] == key) {
                System.out.println("Found at position (" + i + "," + j + ")");
                found = true;
                break;
            } else if (a[i][j] > key)
                j--;
            else
                i++;
        }

        if (!found)
            System.out.println("Element Not Found");
    }
}

