package Array;

public class MaxSubArray {
    
    public static void maxSubArray(int n[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {

            for (int j = i; j < n.length; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {

                    sum = sum + n[k];
                    // result = sum;
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.print(max);
    }

    public static void main(String[] args) {
        int n[] = { 1, -2, 6, -1, 3 };
        maxSubArray(n);
    }
}
