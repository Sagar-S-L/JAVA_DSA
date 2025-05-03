package Array;

public class PrefixMaxSumSubArray {
    public static void prefixMaxsumSubArray(int n[]) {

        int prefixSumArray[] = new int[n.length];
        int prefixSum = 0;
        for (int i = 0; i < n.length; i++) {
            prefixSum = prefixSum + n[i];
            prefixSumArray[i] = prefixSum;
        }

        // for (int j = 0; j < prefixSumArray.length; j++) {
        // System.out.print(prefixSumArray[j]+" ");

        // }

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int j = 0; j < prefixSumArray.length; j++) {

            for (int k = 0; k < prefixSumArray.length; k++) {
                if (j == 0) {
                    if (prefixSumArray[k] > maxSum) {
                        maxSum = prefixSumArray[k];
                    }
                } else {
                    sum = prefixSumArray[k] - prefixSumArray[j];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
                // result = sum;
            }
        }
        System.out.print(maxSum);
    }

    public static void main(String[] args) {
        int n[] = { 2, 3, 6, -1, 3 };
        prefixMaxsumSubArray(n);
    }
}
