package Array;

public class SmallestLargest {

    public static int smallestLargest(int n[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest = n[i];
            }
            if(smallest>n[i]){
                smallest = n[i];
            }
        }
        System.out.println("Smaleest value is : " + smallest);
        return largest;
    }
     public static void main(String[] args) {
       int n[] ={3,5,-2,4,8,-3};
       System.out.println("Largest value is : "+ smallestLargest(n));

    }

}
