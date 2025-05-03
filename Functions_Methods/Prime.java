public class Prime {

    public static boolean isPrime(int n) {
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int j=3;j<=n;j++){
        if(isPrime(j)){
            System.out.println(j);
        }
        
    }
    }
    public static void main(String[] args) {
        primeInRange(9);
    }
}
