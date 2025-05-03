package Array;

public class ArrayReverse {
    
    public static void main(String[] args) {
        int n[] = {2, 4, 6, 8, 10};
        int first=0, last = n.length-1, temp=0;

        while(first<last){
            temp=n[first];
            n[first]=n[last];
            n[last]=temp;
            first++;
            last--;
        }

        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }

    }
}
