package LogicBuilding;

public class ReverseNumber {

public static void main(String[] args) {
    int rev=0;
    int n=10899;
    int lastDigit = 0;
    while (n!=0) {
        lastDigit = n%10;
        rev = (rev*10) + lastDigit;
        n=n/10;
    }
    System.out.println(rev);
    }
}

