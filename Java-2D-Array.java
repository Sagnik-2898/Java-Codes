
//Java code for 2d array
import java.util.*;

class Main {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter The Columns: ");
        int cols = sc.nextInt();
        int[][] num = new int[rows][cols];
        // Input purpose code
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        // Printing the Matrix
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Taking Input of the Key Value
        System.out.print("Enter the Number You want to find: ");
        int x = sc.nextInt();

        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                // compare with the key
                if (num[i][j] == x) {
                    System.out.println("Number is found at " + i + "," + j);
                }
                // break;
            }
        }

    }
}
