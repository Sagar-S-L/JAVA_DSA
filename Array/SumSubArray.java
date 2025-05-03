package Array;

public class SumSubArray {
    public static void sumSubArray(int n[]) {
        for (int i = 0; i < n.length; i++) {

            for (int j = i; j < n.length; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {

                    sum = sum + n[k];
                    // result = sum;
                }
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n[] = { 1, -2, 6, -1, 3 };
        sumSubArray(n);
    }
}
