// This code snippet has the solution for the Kadanes Algorithm for all 
// the corner cases including the all negative values

public class Kadanes {
    public static void Kadanes(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        boolean allNegative = true;

        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];

            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
            if (num[i] >= 0) {
                allNegative = false;
            }
        }
        if (allNegative) {
            ms = Integer.MIN_VALUE;
            for (int i = 0; i < num.length; i++) {
                ms = Math.max(ms, num[i]);
            }
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int num[] = { 4, 5, 6, 7, 8, 9 };
        Kadanes(num);
    }
}
