public class BinToDec {
    public static void binToDec(int n){
        int dec=0;
        int LD=0;
        int pow=0;
        while(n!=0){
            LD=n%10;
            dec=dec+(LD*(int)Math.pow(2,pow));
            n=n/10;
            pow++;
        }
        System.out.println(dec);
    }

    public static void main(String[] args) {
        binToDec(11011);
    }
}
