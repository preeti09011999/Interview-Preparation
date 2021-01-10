import java.util.Arrays;

public class sortRowWise {
    public static void sortRow(int a[][]) {
        for (int i = 0; i < a.length; i++)
            Arrays.sort(a[i]);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int a[][] = { { 9, 8, 7, 1 }, { 7, 3, 0, 2 }, { 9, 5, 3, 2 }, { 6, 3, 1, 2 } };

        sortRow(a);
    }
}
