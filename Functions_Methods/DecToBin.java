public class DecToBin {
    public static void decToBin(int n){
        int bin=0;
        int LD=0;
        int pow=0;
        while(n!=0){
            LD = n%2;
            bin=bin+(LD*(int)Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        decToBin(21);
    }
}
