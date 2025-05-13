import java.util.*;

public class JavaInbuiltSort {

    public static void main(String args[]){

        // int n[]= {23,43,5,6,87,21,43};

        Integer n1[]= {23,43,5,6,87,21,43};

        // Arrays.sort(n);
        // Arrays.sort(n,0,3);
        // Arrays.sort(n1,Collections.reverseOrder()); 
        Arrays.sort(n1,1,5,Collections.reverseOrder());
        for(int i=0;i<n1.length;i++){
            System.out.print(n1[i]+" ");
        }
    }
    
}
