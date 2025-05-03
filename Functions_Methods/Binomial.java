public class Binomial {

    public void isPrime(int n) {
        int prime = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 9; j++)
                prime = i + j;
            System.out.println(prime);
        }
    }

    public static void main(String[] args) {
        Binomial b = new Binomial();
        b.isPrime(5);
    }

}
