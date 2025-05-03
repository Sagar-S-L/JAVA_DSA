package LogicBuilding;

public class PrintReverse {
    
    public static void main(String[] args) {
        int n=231101;
        int lastDigit=0;
        while(n>0){
            lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
    }
}
